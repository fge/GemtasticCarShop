/**
 * This class is generated by jOOQ
 */
package com.gemtastic.carshop;

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
public class Public extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = -1710505390;

	/**
	 * The reference instance of <code>public</code>
	 */
	public static final Public PUBLIC = new Public();

	/**
	 * No further instances allowed
	 */
	private Public() {
		super("public");
	}

	@Override
	public final java.util.List<org.jooq.Sequence<?>> getSequences() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getSequences0());
		return result;
	}

	private final java.util.List<org.jooq.Sequence<?>> getSequences0() {
		return java.util.Arrays.<org.jooq.Sequence<?>>asList(
			com.gemtastic.carshop.Sequences.ADDRESS_ID_SEQ,
			com.gemtastic.carshop.Sequences.APPOINTMENTS_ID_SEQ,
			com.gemtastic.carshop.Sequences.CAR_ID_SEQ,
			com.gemtastic.carshop.Sequences.CAR_MODEL_ID_SEQ,
			com.gemtastic.carshop.Sequences.CUSTOMER_ID_SEQ,
			com.gemtastic.carshop.Sequences.EMPLOYEES_ID_SEQ,
			com.gemtastic.carshop.Sequences.MAKE_ID_SEQ,
			com.gemtastic.carshop.Sequences.MALFUNCTION_REPORTS_ID_SEQ);
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			com.gemtastic.carshop.tables.Address.ADDRESS,
			com.gemtastic.carshop.tables.Appointments.APPOINTMENTS,
			com.gemtastic.carshop.tables.Car.CAR,
			com.gemtastic.carshop.tables.CarModel.CAR_MODEL,
			com.gemtastic.carshop.tables.Certification.CERTIFICATION,
			com.gemtastic.carshop.tables.Customer.CUSTOMER,
			com.gemtastic.carshop.tables.Employees.EMPLOYEES,
			com.gemtastic.carshop.tables.Make.MAKE,
			com.gemtastic.carshop.tables.MalfunctionReports.MALFUNCTION_REPORTS,
			com.gemtastic.carshop.tables.Ownership.OWNERSHIP);
	}
}