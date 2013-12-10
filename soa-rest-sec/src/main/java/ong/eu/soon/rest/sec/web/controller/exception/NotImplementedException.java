package ong.eu.soon.rest.sec.web.controller.exception;

public class NotImplementedException extends Exception {
	//
	public NotImplementedException(String msg, Throwable cause) {
		super(msg, cause);

	}

	public NotImplementedException(Throwable cause) {
		super(cause);
	}

	public NotImplementedException(String msg) {
		super(msg);
	}

}
