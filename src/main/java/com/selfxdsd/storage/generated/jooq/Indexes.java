/*
 * This file is generated by jOOQ.
 */
package com.selfxdsd.storage.generated.jooq;


import com.selfxdsd.storage.generated.jooq.tables.SlfContractsXdsd;
import com.selfxdsd.storage.generated.jooq.tables.SlfProjectsXdsd;
import com.selfxdsd.storage.generated.jooq.tables.SlfTasksXdsd;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>self_xdsd</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index SLF_CONTRACTS_XDSD_ASSIGNEEIDX = Indexes0.SLF_CONTRACTS_XDSD_ASSIGNEEIDX;
    public static final Index SLF_CONTRACTS_XDSD_CONTRIBUTOR_IDS = Indexes0.SLF_CONTRACTS_XDSD_CONTRIBUTOR_IDS;
    public static final Index SLF_CONTRACTS_XDSD_PROJECT_IDX = Indexes0.SLF_CONTRACTS_XDSD_PROJECT_IDX;
    public static final Index SLF_PROJECTS_XDSD_OWNER_IDX = Indexes0.SLF_PROJECTS_XDSD_OWNER_IDX;
    public static final Index SLF_PROJECTS_XDSD_PM_IDX = Indexes0.SLF_PROJECTS_XDSD_PM_IDX;
    public static final Index SLF_PROJECTS_XDSD_PROJECT_IDX = Indexes0.SLF_PROJECTS_XDSD_PROJECT_IDX;
    public static final Index SLF_TASKS_XDSD_ASSIGNED_CONTRACT_IDX = Indexes0.SLF_TASKS_XDSD_ASSIGNED_CONTRACT_IDX;
    public static final Index SLF_TASKS_XDSD_ASSIGNEE_IDX = Indexes0.SLF_TASKS_XDSD_ASSIGNEE_IDX;
    public static final Index SLF_TASKS_XDSD_CONTRACT_IDX = Indexes0.SLF_TASKS_XDSD_CONTRACT_IDX;
    public static final Index SLF_TASKS_XDSD_PARENT_PROJECT_IDX = Indexes0.SLF_TASKS_XDSD_PARENT_PROJECT_IDX;
    public static final Index SLF_TASKS_XDSD_PROJECT_IDX = Indexes0.SLF_TASKS_XDSD_PROJECT_IDX;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index SLF_CONTRACTS_XDSD_ASSIGNEEIDX = Internal.createIndex("assigneeidx", SlfContractsXdsd.SLF_CONTRACTS_XDSD, new OrderField[] { SlfContractsXdsd.SLF_CONTRACTS_XDSD.REPO_FULLNAME, SlfContractsXdsd.SLF_CONTRACTS_XDSD.PROVIDER, SlfContractsXdsd.SLF_CONTRACTS_XDSD.ROLE, SlfContractsXdsd.SLF_CONTRACTS_XDSD.USERNAME }, false);
        public static Index SLF_CONTRACTS_XDSD_CONTRIBUTOR_IDS = Internal.createIndex("contributor_ids", SlfContractsXdsd.SLF_CONTRACTS_XDSD, new OrderField[] { SlfContractsXdsd.SLF_CONTRACTS_XDSD.USERNAME, SlfContractsXdsd.SLF_CONTRACTS_XDSD.PROVIDER }, false);
        public static Index SLF_CONTRACTS_XDSD_PROJECT_IDX = Internal.createIndex("project_idx", SlfContractsXdsd.SLF_CONTRACTS_XDSD, new OrderField[] { SlfContractsXdsd.SLF_CONTRACTS_XDSD.REPO_FULLNAME }, false);
        public static Index SLF_PROJECTS_XDSD_OWNER_IDX = Internal.createIndex("owner_idx", SlfProjectsXdsd.SLF_PROJECTS_XDSD, new OrderField[] { SlfProjectsXdsd.SLF_PROJECTS_XDSD.USERNAME, SlfProjectsXdsd.SLF_PROJECTS_XDSD.PROVIDER }, false);
        public static Index SLF_PROJECTS_XDSD_PM_IDX = Internal.createIndex("pm_idx", SlfProjectsXdsd.SLF_PROJECTS_XDSD, new OrderField[] { SlfProjectsXdsd.SLF_PROJECTS_XDSD.PMID }, false);
        public static Index SLF_PROJECTS_XDSD_PROJECT_IDX = Internal.createIndex("project_idx", SlfProjectsXdsd.SLF_PROJECTS_XDSD, new OrderField[] { SlfProjectsXdsd.SLF_PROJECTS_XDSD.PROVIDER, SlfProjectsXdsd.SLF_PROJECTS_XDSD.REPO_FULLNAME }, false);
        public static Index SLF_TASKS_XDSD_ASSIGNED_CONTRACT_IDX = Internal.createIndex("assigned_contract_idx", SlfTasksXdsd.SLF_TASKS_XDSD, new OrderField[] { SlfTasksXdsd.SLF_TASKS_XDSD.REPO_FULLNAME, SlfTasksXdsd.SLF_TASKS_XDSD.USERNAME, SlfTasksXdsd.SLF_TASKS_XDSD.ROLE, SlfTasksXdsd.SLF_TASKS_XDSD.PROVIDER }, false);
        public static Index SLF_TASKS_XDSD_ASSIGNEE_IDX = Internal.createIndex("assignee_idx", SlfTasksXdsd.SLF_TASKS_XDSD, new OrderField[] { SlfTasksXdsd.SLF_TASKS_XDSD.REPO_FULLNAME, SlfTasksXdsd.SLF_TASKS_XDSD.PROVIDER, SlfTasksXdsd.SLF_TASKS_XDSD.ROLE, SlfTasksXdsd.SLF_TASKS_XDSD.USERNAME }, false);
        public static Index SLF_TASKS_XDSD_CONTRACT_IDX = Internal.createIndex("contract_idx", SlfTasksXdsd.SLF_TASKS_XDSD, new OrderField[] { SlfTasksXdsd.SLF_TASKS_XDSD.REPO_FULLNAME, SlfTasksXdsd.SLF_TASKS_XDSD.USERNAME, SlfTasksXdsd.SLF_TASKS_XDSD.ROLE, SlfTasksXdsd.SLF_TASKS_XDSD.PROVIDER }, false);
        public static Index SLF_TASKS_XDSD_PARENT_PROJECT_IDX = Internal.createIndex("parent_project_idx", SlfTasksXdsd.SLF_TASKS_XDSD, new OrderField[] { SlfTasksXdsd.SLF_TASKS_XDSD.REPO_FULLNAME, SlfTasksXdsd.SLF_TASKS_XDSD.PROVIDER }, false);
        public static Index SLF_TASKS_XDSD_PROJECT_IDX = Internal.createIndex("project_idx", SlfTasksXdsd.SLF_TASKS_XDSD, new OrderField[] { SlfTasksXdsd.SLF_TASKS_XDSD.REPO_FULLNAME, SlfTasksXdsd.SLF_TASKS_XDSD.PROVIDER }, false);
    }
}
