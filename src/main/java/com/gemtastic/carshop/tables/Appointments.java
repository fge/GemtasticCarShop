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
public class Appointments extends org.jooq.impl.TableImpl<com.gemtastic.carshop.tables.records.AppointmentsRecord> {

	private static final long serialVersionUID = 961178671;

	/**
	 * The reference instance of <code>public.appointments</code>
	 */
	public static final com.gemtastic.carshop.tables.Appointments APPOINTMENTS = new com.gemtastic.carshop.tables.Appointments();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.gemtastic.carshop.tables.records.AppointmentsRecord> getRecordType() {
		return com.gemtastic.carshop.tables.records.AppointmentsRecord.class;
	}

	/**
	 * The column <code>public.appointments.id</code>.
	 */
	public final org.jooq.TableField<com.gemtastic.carshop.tables.records.AppointmentsRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.appointments.scheduled_date</code>.
	 */
	public final org.jooq.TableField<com.gemtastic.carshop.tables.records.AppointmentsRecord, java.sql.Timestamp> SCHEDULED_DATE = createField("scheduled_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

	/**
	 * The column <code>public.appointments.performed_date</code>.
	 */
	public final org.jooq.TableField<com.gemtastic.carshop.tables.records.AppointmentsRecord, java.sql.Timestamp> PERFORMED_DATE = createField("performed_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>public.appointments.type</code>.
	 */
	public final org.jooq.TableField<com.gemtastic.carshop.tables.records.AppointmentsRecord, java.lang.String> TYPE = createField("type", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>public.appointments.comments</code>.
	 */
	public final org.jooq.TableField<com.gemtastic.carshop.tables.records.AppointmentsRecord, java.lang.String> COMMENTS = createField("comments", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>public.appointments.mechanic</code>.
	 */
	public final org.jooq.TableField<com.gemtastic.carshop.tables.records.AppointmentsRecord, java.lang.Integer> MECHANIC = createField("mechanic", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.appointments.car</code>.
	 */
	public final org.jooq.TableField<com.gemtastic.carshop.tables.records.AppointmentsRecord, java.lang.Integer> CAR = createField("car", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.appointments.commissioner</code>.
	 */
	public final org.jooq.TableField<com.gemtastic.carshop.tables.records.AppointmentsRecord, java.lang.Integer> COMMISSIONER = createField("commissioner", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>public.appointments</code> table reference
	 */
	public Appointments() {
		this("appointments", null);
	}

	/**
	 * Create an aliased <code>public.appointments</code> table reference
	 */
	public Appointments(java.lang.String alias) {
		this(alias, com.gemtastic.carshop.tables.Appointments.APPOINTMENTS);
	}

	private Appointments(java.lang.String alias, org.jooq.Table<com.gemtastic.carshop.tables.records.AppointmentsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Appointments(java.lang.String alias, org.jooq.Table<com.gemtastic.carshop.tables.records.AppointmentsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.gemtastic.carshop.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.gemtastic.carshop.tables.records.AppointmentsRecord, java.lang.Integer> getIdentity() {
		return com.gemtastic.carshop.Keys.IDENTITY_APPOINTMENTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.gemtastic.carshop.tables.records.AppointmentsRecord> getPrimaryKey() {
		return com.gemtastic.carshop.Keys.APPOINTMENTS_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.gemtastic.carshop.tables.records.AppointmentsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.gemtastic.carshop.tables.records.AppointmentsRecord>>asList(com.gemtastic.carshop.Keys.APPOINTMENTS_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.gemtastic.carshop.tables.records.AppointmentsRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.gemtastic.carshop.tables.records.AppointmentsRecord, ?>>asList(com.gemtastic.carshop.Keys.APPOINTMENTS__APPOINTMENTS_MECHANIC_FKEY, com.gemtastic.carshop.Keys.APPOINTMENTS__APPOINTMENTS_CAR_FKEY, com.gemtastic.carshop.Keys.APPOINTMENTS__APPOINTMENTS_COMMISSIONER_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.gemtastic.carshop.tables.Appointments as(java.lang.String alias) {
		return new com.gemtastic.carshop.tables.Appointments(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.gemtastic.carshop.tables.Appointments rename(java.lang.String name) {
		return new com.gemtastic.carshop.tables.Appointments(name, null);
	}
}
