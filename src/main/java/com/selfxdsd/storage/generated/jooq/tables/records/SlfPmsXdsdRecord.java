/*
 * This file is generated by jOOQ.
 */
package com.selfxdsd.storage.generated.jooq.tables.records;


import com.selfxdsd.storage.generated.jooq.tables.SlfPmsXdsd;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SlfPmsXdsdRecord extends UpdatableRecordImpl<SlfPmsXdsdRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = 1124272310;

    /**
     * Setter for <code>self_xdsd.slf_pms_xdsd.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>self_xdsd.slf_pms_xdsd.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>self_xdsd.slf_pms_xdsd.provider</code>.
     */
    public void setProvider(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>self_xdsd.slf_pms_xdsd.provider</code>.
     */
    public String getProvider() {
        return (String) get(1);
    }

    /**
     * Setter for <code>self_xdsd.slf_pms_xdsd.access_token</code>.
     */
    public void setAccessToken(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>self_xdsd.slf_pms_xdsd.access_token</code>.
     */
    public String getAccessToken() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return SlfPmsXdsd.SLF_PMS_XDSD.ID;
    }

    @Override
    public Field<String> field2() {
        return SlfPmsXdsd.SLF_PMS_XDSD.PROVIDER;
    }

    @Override
    public Field<String> field3() {
        return SlfPmsXdsd.SLF_PMS_XDSD.ACCESS_TOKEN;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getProvider();
    }

    @Override
    public String component3() {
        return getAccessToken();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getProvider();
    }

    @Override
    public String value3() {
        return getAccessToken();
    }

    @Override
    public SlfPmsXdsdRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public SlfPmsXdsdRecord value2(String value) {
        setProvider(value);
        return this;
    }

    @Override
    public SlfPmsXdsdRecord value3(String value) {
        setAccessToken(value);
        return this;
    }

    @Override
    public SlfPmsXdsdRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SlfPmsXdsdRecord
     */
    public SlfPmsXdsdRecord() {
        super(SlfPmsXdsd.SLF_PMS_XDSD);
    }

    /**
     * Create a detached, initialised SlfPmsXdsdRecord
     */
    public SlfPmsXdsdRecord(Integer id, String provider, String accessToken) {
        super(SlfPmsXdsd.SLF_PMS_XDSD);

        set(0, id);
        set(1, provider);
        set(2, accessToken);
    }
}
