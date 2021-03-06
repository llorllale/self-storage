/*
 * This file is generated by jOOQ.
 */
package com.selfxdsd.storage.generated.jooq.tables.records;


import com.selfxdsd.storage.generated.jooq.tables.SlfContractsXdsd;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SlfContractsXdsdRecord extends UpdatableRecordImpl<SlfContractsXdsdRecord> implements Record5<String, String, String, String, Long> {

    private static final long serialVersionUID = 414808053;

    /**
     * Setter for <code>self_xdsd.slf_contracts_xdsd.repo_fullname</code>.
     */
    public void setRepoFullname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>self_xdsd.slf_contracts_xdsd.repo_fullname</code>.
     */
    public String getRepoFullname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>self_xdsd.slf_contracts_xdsd.username</code>.
     */
    public void setUsername(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>self_xdsd.slf_contracts_xdsd.username</code>.
     */
    public String getUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>self_xdsd.slf_contracts_xdsd.provider</code>.
     */
    public void setProvider(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>self_xdsd.slf_contracts_xdsd.provider</code>.
     */
    public String getProvider() {
        return (String) get(2);
    }

    /**
     * Setter for <code>self_xdsd.slf_contracts_xdsd.role</code>.
     */
    public void setRole(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>self_xdsd.slf_contracts_xdsd.role</code>.
     */
    public String getRole() {
        return (String) get(3);
    }

    /**
     * Setter for <code>self_xdsd.slf_contracts_xdsd.hourly_rate</code>.
     */
    public void setHourlyRate(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>self_xdsd.slf_contracts_xdsd.hourly_rate</code>.
     */
    public Long getHourlyRate() {
        return (Long) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record4<String, String, String, String> key() {
        return (Record4) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, String, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, String, String, String, Long> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return SlfContractsXdsd.SLF_CONTRACTS_XDSD.REPO_FULLNAME;
    }

    @Override
    public Field<String> field2() {
        return SlfContractsXdsd.SLF_CONTRACTS_XDSD.USERNAME;
    }

    @Override
    public Field<String> field3() {
        return SlfContractsXdsd.SLF_CONTRACTS_XDSD.PROVIDER;
    }

    @Override
    public Field<String> field4() {
        return SlfContractsXdsd.SLF_CONTRACTS_XDSD.ROLE;
    }

    @Override
    public Field<Long> field5() {
        return SlfContractsXdsd.SLF_CONTRACTS_XDSD.HOURLY_RATE;
    }

    @Override
    public String component1() {
        return getRepoFullname();
    }

    @Override
    public String component2() {
        return getUsername();
    }

    @Override
    public String component3() {
        return getProvider();
    }

    @Override
    public String component4() {
        return getRole();
    }

    @Override
    public Long component5() {
        return getHourlyRate();
    }

    @Override
    public String value1() {
        return getRepoFullname();
    }

    @Override
    public String value2() {
        return getUsername();
    }

    @Override
    public String value3() {
        return getProvider();
    }

    @Override
    public String value4() {
        return getRole();
    }

    @Override
    public Long value5() {
        return getHourlyRate();
    }

    @Override
    public SlfContractsXdsdRecord value1(String value) {
        setRepoFullname(value);
        return this;
    }

    @Override
    public SlfContractsXdsdRecord value2(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public SlfContractsXdsdRecord value3(String value) {
        setProvider(value);
        return this;
    }

    @Override
    public SlfContractsXdsdRecord value4(String value) {
        setRole(value);
        return this;
    }

    @Override
    public SlfContractsXdsdRecord value5(Long value) {
        setHourlyRate(value);
        return this;
    }

    @Override
    public SlfContractsXdsdRecord values(String value1, String value2, String value3, String value4, Long value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SlfContractsXdsdRecord
     */
    public SlfContractsXdsdRecord() {
        super(SlfContractsXdsd.SLF_CONTRACTS_XDSD);
    }

    /**
     * Create a detached, initialised SlfContractsXdsdRecord
     */
    public SlfContractsXdsdRecord(String repoFullname, String username, String provider, String role, Long hourlyRate) {
        super(SlfContractsXdsd.SLF_CONTRACTS_XDSD);

        set(0, repoFullname);
        set(1, username);
        set(2, provider);
        set(3, role);
        set(4, hourlyRate);
    }
}
