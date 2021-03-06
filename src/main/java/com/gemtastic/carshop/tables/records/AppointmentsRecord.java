/**
 * This class is generated by jOOQ
 */
package com.gemtastic.carshop.tables.records;

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
public class AppointmentsRecord extends org.jooq.impl.UpdatableRecordImpl<com.gemtastic.carshop.tables.records.AppointmentsRecord> implements org.jooq.Record8<java.lang.Integer, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = -2076474245;

	/**
	 * Setter for <code>public.appointments.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.appointments.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.appointments.scheduled_date</code>.
	 */
	public void setScheduledDate(java.sql.Timestamp value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.appointments.scheduled_date</code>.
	 */
	public java.sql.Timestamp getScheduledDate() {
		return (java.sql.Timestamp) getValue(1);
	}

	/**
	 * Setter for <code>public.appointments.performed_date</code>.
	 */
	public void setPerformedDate(java.sql.Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.appointments.performed_date</code>.
	 */
	public java.sql.Timestamp getPerformedDate() {
		return (java.sql.Timestamp) getValue(2);
	}

	/**
	 * Setter for <code>public.appointments.type</code>.
	 */
	public void setType(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.appointments.type</code>.
	 */
	public java.lang.String getType() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>public.appointments.comments</code>.
	 */
	public void setComments(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.appointments.comments</code>.
	 */
	public java.lang.String getComments() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>public.appointments.mechanic</code>.
	 */
	public void setMechanic(java.lang.Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.appointments.mechanic</code>.
	 */
	public java.lang.Integer getMechanic() {
		return (java.lang.Integer) getValue(5);
	}

	/**
	 * Setter for <code>public.appointments.car</code>.
	 */
	public void setCar(java.lang.Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.appointments.car</code>.
	 */
	public java.lang.Integer getCar() {
		return (java.lang.Integer) getValue(6);
	}

	/**
	 * Setter for <code>public.appointments.commissioner</code>.
	 */
	public void setCommissioner(java.lang.Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>public.appointments.commissioner</code>.
	 */
	public java.lang.Integer getCommissioner() {
		return (java.lang.Integer) getValue(7);
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
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Integer, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Integer, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.gemtastic.carshop.tables.Appointments.APPOINTMENTS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field2() {
		return com.gemtastic.carshop.tables.Appointments.APPOINTMENTS.SCHEDULED_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field3() {
		return com.gemtastic.carshop.tables.Appointments.APPOINTMENTS.PERFORMED_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.gemtastic.carshop.tables.Appointments.APPOINTMENTS.TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.gemtastic.carshop.tables.Appointments.APPOINTMENTS.COMMENTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return com.gemtastic.carshop.tables.Appointments.APPOINTMENTS.MECHANIC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return com.gemtastic.carshop.tables.Appointments.APPOINTMENTS.CAR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field8() {
		return com.gemtastic.carshop.tables.Appointments.APPOINTMENTS.COMMISSIONER;
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
	public java.sql.Timestamp value2() {
		return getScheduledDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value3() {
		return getPerformedDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getComments();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getMechanic();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getCar();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value8() {
		return getCommissioner();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AppointmentsRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AppointmentsRecord value2(java.sql.Timestamp value) {
		setScheduledDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AppointmentsRecord value3(java.sql.Timestamp value) {
		setPerformedDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AppointmentsRecord value4(java.lang.String value) {
		setType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AppointmentsRecord value5(java.lang.String value) {
		setComments(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AppointmentsRecord value6(java.lang.Integer value) {
		setMechanic(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AppointmentsRecord value7(java.lang.Integer value) {
		setCar(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AppointmentsRecord value8(java.lang.Integer value) {
		setCommissioner(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AppointmentsRecord values(java.lang.Integer value1, java.sql.Timestamp value2, java.sql.Timestamp value3, java.lang.String value4, java.lang.String value5, java.lang.Integer value6, java.lang.Integer value7, java.lang.Integer value8) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AppointmentsRecord
	 */
	public AppointmentsRecord() {
		super(com.gemtastic.carshop.tables.Appointments.APPOINTMENTS);
	}

	/**
	 * Create a detached, initialised AppointmentsRecord
	 */
	public AppointmentsRecord(java.lang.Integer id, java.sql.Timestamp scheduledDate, java.sql.Timestamp performedDate, java.lang.String type, java.lang.String comments, java.lang.Integer mechanic, java.lang.Integer car, java.lang.Integer commissioner) {
		super(com.gemtastic.carshop.tables.Appointments.APPOINTMENTS);

		setValue(0, id);
		setValue(1, scheduledDate);
		setValue(2, performedDate);
		setValue(3, type);
		setValue(4, comments);
		setValue(5, mechanic);
		setValue(6, car);
		setValue(7, commissioner);
	}
}
