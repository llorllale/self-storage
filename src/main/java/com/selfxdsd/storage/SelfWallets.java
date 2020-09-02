/**
 * Copyright (c) 2020, Self XDSD Contributors
 * All rights reserved.
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"),
 * to read the Software only. Permission is hereby NOT GRANTED to use, copy,
 * modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software.
 * <p>
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY,
 * OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT
 * OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package com.selfxdsd.storage;

import com.selfxdsd.api.Project;
import com.selfxdsd.api.Wallet;
import com.selfxdsd.api.Wallets;
import com.selfxdsd.api.storage.Storage;
import com.selfxdsd.core.projects.ProjectWallets;
import org.jooq.Record;
import org.jooq.Result;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.selfxdsd.storage.generated.jooq.Tables.SLF_WALLETS_XDSD;

/**
 * All the Wallets in Self.
 * @author Mihai Andronache (amihaiemil@gmail.com)
 * @version $Id$
 * @since 0.0.21
 * @todo #130:30min Implement the methods of SelfWallets class using
 *  JOOQ and write integration tests for them.
 * @todo #135:30min Once we have other types of Wallet (e.g. StripeWallet),
 *  modify the method walletFromRecord to build the wallet accordingly.
 */
public final class SelfWallets implements Wallets {

    /**
     * Parent Storage.
     */
    private final Storage storage;

    /**
     * Database.
     */
    private final Database database;

    /**
     * Ctor.
     * @param storage Parent Storage.
     * @param database Database.
     */
    public SelfWallets(
        final Storage storage,
        final Database database
    ) {
        this.storage = storage;
        this.database = database;
    }

    @Override
    public Wallet register(
        final Project project,
        final String type,
        final BigDecimal cash,
        final String identifier
    ) {
        throw new UnsupportedOperationException("Not yet implemented.");
    }

    @Override
    public Wallets ofProject(final Project project) {
        final List<Wallet> ofProject = new ArrayList<>();
        final Result<Record> result = this.database
            .jooq()
            .select()
            .from(SLF_WALLETS_XDSD)
            .where(
                SLF_WALLETS_XDSD.REPO_FULLNAME.eq(project.repoFullName()).and(
                    SLF_WALLETS_XDSD.PROVIDER.eq(project.provider())
                )
            ).fetch();
        for(final Record rec : result) {
            ofProject.add(this.walletFromRecord(project, rec));
        }
        return new ProjectWallets(project, ofProject, this.storage);
    }

    @Override
    public Wallet active() {
        throw new UnsupportedOperationException(
            "You cannot get the active Wallet out of all of them. "
            + "Call #ofProject(...) first."
        );
    }

    @Override
    public Wallet activate(final Wallet wallet) {
        throw new UnsupportedOperationException("Not yet implemented.");
    }

    @Override
    public Iterator<Wallet> iterator() {
        throw new UnsupportedOperationException(
            "You cannot iterate over all the wallets. "
            + "Call #ofProject(...) first."
        );
    }

    /**
     * Build a Wallet from a JOOQ record.
     * @param project Project owning the Wallet.
     * @param record Record.
     * @return Wallet.
     */
    private Wallet walletFromRecord(
        final Project project, final Record record
    ) {
        if(record.getValue(SLF_WALLETS_XDSD.TYPE).equals(Wallet.Type.FAKE)) {
            return new Wallet.Missing(
                project,
                BigDecimal.valueOf(
                    record.getValue(SLF_WALLETS_XDSD.CASH).longValue()
                ),
                record.getValue(SLF_WALLETS_XDSD.ACTIVE),
                record.getValue(SLF_WALLETS_XDSD.IDENTIFIER)
            );
        } else {
            throw new UnsupportedOperationException(
                "Only fake wallets are supported so far."
            );
        }
    }
}
