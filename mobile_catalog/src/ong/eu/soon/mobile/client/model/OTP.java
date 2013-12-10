package ong.eu.soon.mobile.client.model;

public class OTP extends Entity{
	
	 protected OTP() {
	 }
	 public final native String getOTPValue() /*-{
 			return $wnd.cleanString(this.otpValue);
	}-*/;
}
