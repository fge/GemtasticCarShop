/**
 * This class is generated by jOOQ
 */
package com.gemtastic.carshop;

/**
 * Convenience access to all sequences in public
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.3"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

	/**
	 * The sequence <code>public.address_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> ADDRESS_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("address_id_seq", com.gemtastic.carshop.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.appointments_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> APPOINTMENTS_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("appointments_id_seq", com.gemtastic.carshop.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.car_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> CAR_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("car_id_seq", com.gemtastic.carshop.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.car_model_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> CAR_MODEL_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("car_model_id_seq", com.gemtastic.carshop.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.customer_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> CUSTOMER_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("customer_id_seq", com.gemtastic.carshop.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.employees_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> EMPLOYEES_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("employees_id_seq", com.gemtastic.carshop.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.make_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> MAKE_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("make_id_seq", com.gemtastic.carshop.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.malfunction_reports_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> MALFUNCTION_REPORTS_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("malfunction_reports_id_seq", com.gemtastic.carshop.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}
