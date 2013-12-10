package ong.eu.soon.security.tokens;

public class RESTCredentials {
	private String requestSalt;
	private String secureHash;

	private RESTCredentials() {
	}

	public RESTCredentials(String requestSalt1, String secureHash1) {
		requestSalt = requestSalt1;
		secureHash = secureHash1;
	}

	public String getRequestSalt() {
		return requestSalt;
	}

	public String getSecureHash() {
		return secureHash;
	}
}
