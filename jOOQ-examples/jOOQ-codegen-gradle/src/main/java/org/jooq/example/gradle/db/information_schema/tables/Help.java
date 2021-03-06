/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.5.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Help extends org.jooq.impl.TableImpl<org.jooq.example.gradle.db.information_schema.tables.records.HelpRecord> {

	private static final long serialVersionUID = -558061983;

	/**
	 * The singleton instance of <code>INFORMATION_SCHEMA.HELP</code>
	 */
	public static final org.jooq.example.gradle.db.information_schema.tables.Help HELP = new org.jooq.example.gradle.db.information_schema.tables.Help();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.example.gradle.db.information_schema.tables.records.HelpRecord> getRecordType() {
		return org.jooq.example.gradle.db.information_schema.tables.records.HelpRecord.class;
	}

	/**
	 * The column <code>INFORMATION_SCHEMA.HELP.ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.HelpRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.HELP.SECTION</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.HelpRecord, java.lang.String> SECTION = createField("SECTION", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.HELP.TOPIC</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.HelpRecord, java.lang.String> TOPIC = createField("TOPIC", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.HELP.SYNTAX</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.HelpRecord, java.lang.String> SYNTAX = createField("SYNTAX", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.HELP.TEXT</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.HelpRecord, java.lang.String> TEXT = createField("TEXT", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * Create a <code>INFORMATION_SCHEMA.HELP</code> table reference
	 */
	public Help() {
		this("HELP", null);
	}

	/**
	 * Create an aliased <code>INFORMATION_SCHEMA.HELP</code> table reference
	 */
	public Help(java.lang.String alias) {
		this(alias, org.jooq.example.gradle.db.information_schema.tables.Help.HELP);
	}

	private Help(java.lang.String alias, org.jooq.Table<org.jooq.example.gradle.db.information_schema.tables.records.HelpRecord> aliased) {
		this(alias, aliased, null);
	}

	private Help(java.lang.String alias, org.jooq.Table<org.jooq.example.gradle.db.information_schema.tables.records.HelpRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.example.gradle.db.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.example.gradle.db.information_schema.tables.Help as(java.lang.String alias) {
		return new org.jooq.example.gradle.db.information_schema.tables.Help(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.example.gradle.db.information_schema.tables.Help rename(java.lang.String name) {
		return new org.jooq.example.gradle.db.information_schema.tables.Help(name, null);
	}
}
