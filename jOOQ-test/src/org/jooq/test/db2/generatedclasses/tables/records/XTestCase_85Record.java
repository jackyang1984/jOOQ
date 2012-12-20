/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class XTestCase_85Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.db2.generatedclasses.tables.records.XTestCase_85Record> implements org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = -1524546898;

	/**
	 * Setter for <code>LUKAS.X_TEST_CASE_85.ID</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.db2.generatedclasses.tables.XTestCase_85.ID, value);
	}

	/**
	 * Getter for <code>LUKAS.X_TEST_CASE_85.ID</code>. 
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.db2.generatedclasses.tables.XTestCase_85.ID);
	}

	/**
	 * Setter for <code>LUKAS.X_TEST_CASE_85.X_UNUSED_ID</code>. 
	 */
	public void setXUnusedId(java.lang.Integer value) {
		setValue(org.jooq.test.db2.generatedclasses.tables.XTestCase_85.X_UNUSED_ID, value);
	}

	/**
	 * Getter for <code>LUKAS.X_TEST_CASE_85.X_UNUSED_ID</code>. 
	 */
	public java.lang.Integer getXUnusedId() {
		return getValue(org.jooq.test.db2.generatedclasses.tables.XTestCase_85.X_UNUSED_ID);
	}

	/**
	 * Setter for <code>LUKAS.X_TEST_CASE_85.X_UNUSED_NAME</code>. 
	 */
	public void setXUnusedName(java.lang.String value) {
		setValue(org.jooq.test.db2.generatedclasses.tables.XTestCase_85.X_UNUSED_NAME, value);
	}

	/**
	 * Getter for <code>LUKAS.X_TEST_CASE_85.X_UNUSED_NAME</code>. 
	 */
	public java.lang.String getXUnusedName() {
		return getValue(org.jooq.test.db2.generatedclasses.tables.XTestCase_85.X_UNUSED_NAME);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	/**
	 * Fetch a <code>LUKAS.X_UNUSED</code> referenced by this <code>LUKAS.X_TEST_CASE_85</code>
	 */
	public org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord fetchXUnused() {
		return create()
			.selectFrom(org.jooq.test.db2.generatedclasses.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.db2.generatedclasses.tables.XUnused.ID.equal(getValue(org.jooq.test.db2.generatedclasses.tables.XTestCase_85.X_UNUSED_ID)))
			.and(org.jooq.test.db2.generatedclasses.tables.XUnused.NAME.equal(getValue(org.jooq.test.db2.generatedclasses.tables.XTestCase_85.X_UNUSED_NAME)))
			.fetchOne();
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.String> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.String> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.db2.generatedclasses.tables.XTestCase_85.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.db2.generatedclasses.tables.XTestCase_85.X_UNUSED_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.test.db2.generatedclasses.tables.XTestCase_85.X_UNUSED_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getXUnusedId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getXUnusedName();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached XTestCase_85Record
	 */
	public XTestCase_85Record() {
		super(org.jooq.test.db2.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85);
	}
}
