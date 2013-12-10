package ong.eu.soon.rest.sec.web.common;

public final class UriMappingConstants {

	public static final String USERS = "users";
	public static final String PRIVILEGES = "privileges";
	public static final String ROLES = "roles";
	public static final String SERVICES = "services";
	public static final String STORES = "stores";
	public static final String SERVICE_PROVIDERS = "serviceproviders";
	public static final String MOBILE_SERVICES = "mobileservices";
	public static final String ACCOUNTS = "rest/accounts";
	public static final String CONTACTS = "rest/contacts";
	public static final String BILLS = "rest/bills";
	// discoverability

	public static final class Singural {

		public static final String USER = "user";
		public static final String PRIVILEGE = "privilege";
		public static final String ROLE = "role";
		public static final String SERVICE = "service";
		public static final String STORE = "store";
		public static final String SERVICE_PROVIDER = "serviceprovider";
		public static final String MOBILE_SERVICE = "mobileservice";

	}

	public static final String AUTHENTICATION = "authentication";
	public static final String REST = "rest";
	public static final String IFX = "ifx";
	public static final String ACCESS = "rest/access";
	public static final String PAYMENTS = "rest/payments";
	public static final String TRANSFERS = "rest/transfers";
	public static final String KERBEROS = "kerberos";
	private UriMappingConstants() {
		throw new AssertionError();
	}

	// API

}
