/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.flyway.ddl.db.h2.tables.records;


import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.example.flyway.ddl.db.h2.tables.Book;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.0-SNAPSHOT"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BookRecord extends UpdatableRecordImpl<BookRecord> implements Record3<Integer, Integer, String> {

    private static final long serialVersionUID = 789103786;

    /**
     * Setter for <code>FLYWAY_TEST.BOOK.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>FLYWAY_TEST.BOOK.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>FLYWAY_TEST.BOOK.AUTHOR_ID</code>.
     */
    public void setAuthorId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>FLYWAY_TEST.BOOK.AUTHOR_ID</code>.
     */
    public Integer getAuthorId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>FLYWAY_TEST.BOOK.TITLE</code>.
     */
    public void setTitle(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>FLYWAY_TEST.BOOK.TITLE</code>.
     */
    public String getTitle() {
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
    public Row3<Integer, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Integer, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Book.BOOK.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Book.BOOK.AUTHOR_ID;
    }

    @Override
    public Field<String> field3() {
        return Book.BOOK.TITLE;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getAuthorId();
    }

    @Override
    public String component3() {
        return getTitle();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getAuthorId();
    }

    @Override
    public String value3() {
        return getTitle();
    }

    @Override
    public BookRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public BookRecord value2(Integer value) {
        setAuthorId(value);
        return this;
    }

    @Override
    public BookRecord value3(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public BookRecord values(Integer value1, Integer value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BookRecord
     */
    public BookRecord() {
        super(Book.BOOK);
    }

    /**
     * Create a detached, initialised BookRecord
     */
    public BookRecord(Integer id, Integer authorId, String title) {
        super(Book.BOOK);

        set(0, id);
        set(1, authorId);
        set(2, title);
    }
}
