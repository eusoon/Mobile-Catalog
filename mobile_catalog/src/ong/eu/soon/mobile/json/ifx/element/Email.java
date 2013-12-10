package ong.eu.soon.mobile.json.ifx.element;

public class Email extends Locator {

	protected Email(){
	}
	
	public final native  EmailType getEmailType()/*-{
		return $wnd.cleanObject(this.emailType);
	}-*/;
	public final native  void setEmailType(EmailType emailType)/*-{
		this.emailType = emailType;
	}-*/;
	public final native  EmailAddr getEmailAddr()/*-{
		return $wnd.cleanObject(this.emailAddr);
	}-*/;
	public final native  void setEmailAddr(EmailAddr emailAddr)/*-{
		this.emailAddr = emailAddr;
	}-*/;
}
