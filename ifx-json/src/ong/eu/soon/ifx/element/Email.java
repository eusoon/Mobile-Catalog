package ong.eu.soon.ifx.element;

public class Email extends Locator {
	EmailType emailType;
	EmailAddr emailAddr;
	public EmailType getEmailType() {
		return emailType;
	}
	public void setEmailType(EmailType emailType) {
		this.emailType = emailType;
	}
	public EmailAddr getEmailAddr() {
		return emailAddr;
	}
	public void setEmailAddr(EmailAddr emailAddr) {
		this.emailAddr = emailAddr;
	}

}