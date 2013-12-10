package ong.eu.soon.rest.sec.model;

import ong.eu.soon.rest.sec.model.dto.User;

public class AuthenticationResponse {
	public static int SUCCESS_CODE = 200;
	public static int FAILURE_CODE = 404;
	public static String TIME_FORMAT = "yyyyMMddHHmmsss";

	private int statusCode;
	private String serverTimeStamp;
	private User user;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode1) {
		statusCode = statusCode1;
	}

	public String getServerTimeStamp() {
		return serverTimeStamp;
	}

	public void setServerTimeStamp(String serverTimeStamp1) {
		serverTimeStamp = serverTimeStamp1;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user1) {
		user = user1;
	}
}
