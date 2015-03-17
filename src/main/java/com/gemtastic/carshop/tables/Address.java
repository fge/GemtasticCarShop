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
public class Address extends org.jooq.impl.TableImpl<com.gemtastic.carshop.tables.records.AddressRecord> {

	private static final long serialVersionUID = -392087430;

	/**
	 * The reference instance of <code>public.address</code>
	 */
	public static final com.gemtastic.carshop.tables.Address ADDRESS = new com.gemtastic.carshop.tables.Address();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.gemtastic.carshop.tables.records.AddressRecord> getRecordType() {
		return com.gemtastic.carshop.tables.records.AddressRecord.class;
	}

	/**
	 * The column <code>public.address.id</code>.
	 */
	public final org.jooq.TableField<com.gemtastic.carshop.tables.records.AddressRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.address.co</code>.
	 */
	public final org.jooq.TableField<com.gemtastic.carshop.tables.records.AddressRecord, java.lang.String> CO = createField("co", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>public.address.street</code>.
	 */
	public final org.jooq.TableField<com.gemtastic.carshop.tables.records.AddressRecord, java.lang.String> STREET = createField("street", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>public.address.zip</code>.
	 */
	public final org.jooq.TableField<com.gemtastic.carshop.tables.records.AddressRecord, java.lang.Integer> ZIP = createField("zip", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.address.city</code>.
	 */
	public final org.jooq.TableField<com.gemtastic.carshop.tables.records.AddressRecord, java.lang.String> CITY = createField("city", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * Create a <code>public.address</code> table reference
	 */
	public Address() {
		this("address", null);
	}

	/**
	 * Create an aliased <code>public.address</code> table reference
	 */
	public Address(java.lang.String alias) {
		this(alias, com.gemtastic.carshop.tables.Address.ADDRESS);
	}

	private Address(java.lang.String alias, org.jooq.Table<com.gemtastic.carshop.tables.records.AddressRecord> aliased) {
		this(alias, aliased, null);
	}

	private Address(java.lang.String alias, org.jooq.Table<com.gemtastic.carshop.tables.records.AddressRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.gemtastic.carshop.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.gemtastic.carshop.tables.records.AddressRecord, java.lang.Integer> getIdentity() {
		return com.gemtastic.carshop.Keys.IDENTITY_ADDRESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.gemtastic.carshop.tables.records.AddressRecord> getPrimaryKey() {
		return com.gemtastic.carshop.Keys.ADDRESS_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.gemtastic.carshop.tables.records.AddressRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.gemtastic.carshop.tables.records.AddressRecord>>asList(com.gemtastic.carshop.Keys.ADDRESS_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.gemtastic.carshop.tables.Address as(java.lang.String alias) {
		return new com.gemtastic.carshop.tables.Address(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.gemtastic.carshop.tables.Address rename(java.lang.String name) {
		return new com.gemtastic.carshop.tables.Address(name, null);
	}
}
