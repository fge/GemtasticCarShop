/**
 * This class is generated by jOOQ
 */
package com.gemtastic.carshop.db.tables.records;

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
public class MalfunctionReportsRecord extends org.jooq.impl.UpdatableRecordImpl<com.gemtastic.carshop.db.tables.records.MalfunctionReportsRecord> implements org.jooq.Record4<java.lang.Integer, java.lang.String, java.sql.Date, java.lang.Integer> {

	private static final long serialVersionUID = 835411566;

	/**
	 * Setter for <code>public.malfunction_reports.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.malfunction_reports.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.malfunction_reports.message</code>.
	 */
	public void setMessage(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.malfunction_reports.message</code>.
	 */
	public java.lang.String getMessage() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.malfunction_reports.report_date</code>.
	 */
	public void setReportDate(java.sql.Date value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.malfunction_reports.report_date</code>.
	 */
	public java.sql.Date getReportDate() {
		return (java.sql.Date) getValue(2);
	}

	/**
	 * Setter for <code>public.malfunction_reports.car</code>.
	 */
	public void setCar(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.malfunction_reports.car</code>.
	 */
	public java.lang.Integer getCar() {
		return (java.lang.Integer) getValue(3);
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
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.String, java.sql.Date, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.String, java.sql.Date, java.lang.Integer> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.gemtastic.carshop.db.tables.MalfunctionReports.MALFUNCTION_REPORTS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.gemtastic.carshop.db.tables.MalfunctionReports.MALFUNCTION_REPORTS.MESSAGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date> field3() {
		return com.gemtastic.carshop.db.tables.MalfunctionReports.MALFUNCTION_REPORTS.REPORT_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return com.gemtastic.carshop.db.tables.MalfunctionReports.MALFUNCTION_REPORTS.CAR;
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
	public java.lang.String value2() {
		return getMessage();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Date value3() {
		return getReportDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getCar();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MalfunctionReportsRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MalfunctionReportsRecord value2(java.lang.String value) {
		setMessage(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MalfunctionReportsRecord value3(java.sql.Date value) {
		setReportDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MalfunctionReportsRecord value4(java.lang.Integer value) {
		setCar(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MalfunctionReportsRecord values(java.lang.Integer value1, java.lang.String value2, java.sql.Date value3, java.lang.Integer value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached MalfunctionReportsRecord
	 */
	public MalfunctionReportsRecord() {
		super(com.gemtastic.carshop.db.tables.MalfunctionReports.MALFUNCTION_REPORTS);
	}

	/**
	 * Create a detached, initialised MalfunctionReportsRecord
	 */
	public MalfunctionReportsRecord(java.lang.Integer id, java.lang.String message, java.sql.Date reportDate, java.lang.Integer car) {
		super(com.gemtastic.carshop.db.tables.MalfunctionReports.MALFUNCTION_REPORTS);

		setValue(0, id);
		setValue(1, message);
		setValue(2, reportDate);
		setValue(3, car);
	}
}