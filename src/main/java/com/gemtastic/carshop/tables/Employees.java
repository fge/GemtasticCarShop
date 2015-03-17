/**
 * This class is generated by jOOQ
 */
package com.gemtastic.carshop.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.3"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Employees extends org.jooq.impl.TableImpl<com.gemtastic.carshop.tables.records.EmployeesRecord> {

	private static final long serialVersionUID = 1087727054;

	/**
	 * The reference instance of <code>public.employees</code>
	 */
	public static final com.gemtastic.carshop.tables.Employees EMPLOYEES = new com.gemtastic.carshop.tables.Employees();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.gemtastic.carshop.tables.records.EmployeesRecord> getRecordType() {
		return com.gemtastic.carshop.tables.records.EmployeesRecord.class;
	}

	/**
	 * The column <code>public.employees.id</code>.
	 */
	public final org.jooq.TableField<com.gemtastic.carshop.tables.records.EmployeesRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.employees.phone</code>.
	 */
	public final org.jooq.TableField<com.gemtastic.carshop.tables.records.EmployeesRecord, java.lang.String> PHONE = createField("phone", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>public.employees.email</code>.
	 */
	public final org.jooq.TableField<com.gemtastic.carshop.tables.records.EmployeesRecord, java.lang.String> EMAIL = createField("email", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>public.employees.username</code>.
	 */
	public final org.jooq.TableField<com.gemtastic.carshop.tables.records.EmployeesRecord, java.lang.String> USERNAME = createField("username", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>public.employees.password</code>.
	 */
	public final org.jooq.TableField<com.gemtastic.carshop.tables.records.EmployeesRecord, java.lang.String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * Create a <code>public.employees</code> table reference
	 */
	public Employees() {
		this("employees", null);
	}

	/**
	 * Create an aliased <code>public.employees</code> table reference
	 */
	public Employees(java.lang.String alias) {
		this(alias, com.gemtastic.carshop.tables.Employees.EMPLOYEES);
	}

	private Employees(java.lang.String alias, org.jooq.Table<com.gemtastic.carshop.tables.records.EmployeesRecord> aliased) {
		this(alias, aliased, null);
	}

	private Employees(java.lang.String alias, org.jooq.Table<com.gemtastic.carshop.tables.records.EmployeesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.gemtastic.carshop.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.gemtastic.carshop.tables.records.EmployeesRecord, java.lang.Integer> getIdentity() {
		return com.gemtastic.carshop.Keys.IDENTITY_EMPLOYEES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.gemtastic.carshop.tables.records.EmployeesRecord> getPrimaryKey() {
		return com.gemtastic.carshop.Keys.EMPLOYEES_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.gemtastic.carshop.tables.records.EmployeesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.gemtastic.carshop.tables.records.EmployeesRecord>>asList(com.gemtastic.carshop.Keys.EMPLOYEES_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.gemtastic.carshop.tables.Employees as(java.lang.String alias) {
		return new com.gemtastic.carshop.tables.Employees(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.gemtastic.carshop.tables.Employees rename(java.lang.String name) {
		return new com.gemtastic.carshop.tables.Employees(name, null);
	}
}
