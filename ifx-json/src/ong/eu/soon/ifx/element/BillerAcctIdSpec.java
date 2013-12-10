package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class BillerAcctIdSpec extends IFXObject {

	AcctFormat acctFormat;	 //	NC-1024	 Optional	 Account Format.Regular expression describing the account number format. The definition and behavior of "Regular Expression" is per IEEE Std 1003.2-1992 (POSIX.2). General definition may be found at http://www.ciser.cornell.edu/info/regex.html
	AcctMask[] acctMask;	 //	NC-32	 Optional Repeating	 Account Mask.String describing the edit mask to identify a valid billing account number for that biller. The client uses the account edit mask to assist the user in entering the account number.
	AcctHelpMsg acctHelpMsg;	 //	C-unbound	 Optional	 Account Help Message.Human-readable message that the client may display to assist the customer in entering his or her account number.
	AcctRestrictMsg acctRestrictMsg;	 //	C-1024	 Optional	 Account Restriction Message.Human-readable description of any restrictions on who may sign up with this biller. Enforcement of any restrictions is by the biller or the biller's agent during the . Other service providers are only responsible for communicating this information.
	AcctValidateURL acctValidateURL;	 //	URL	 Optional	 URL for Account Validation.URL for validation. The client application may use this to validate the customer's account number.
	public AcctFormat getAcctFormat() {
		return acctFormat;
	}
	public void setAcctFormat(AcctFormat acctFormat) {
		this.acctFormat = acctFormat;
	}
	public AcctMask[] getAcctMask() {
		return acctMask;
	}
	public void setAcctMask(AcctMask[] acctMask) {
		this.acctMask = acctMask;
	}
	public AcctHelpMsg getAcctHelpMsg() {
		return acctHelpMsg;
	}
	public void setAcctHelpMsg(AcctHelpMsg acctHelpMsg) {
		this.acctHelpMsg = acctHelpMsg;
	}
	public AcctRestrictMsg getAcctRestrictMsg() {
		return acctRestrictMsg;
	}
	public void setAcctRestrictMsg(AcctRestrictMsg acctRestrictMsg) {
		this.acctRestrictMsg = acctRestrictMsg;
	}
	public AcctValidateURL getAcctValidateURL() {
		return acctValidateURL;
	}
	public void setAcctValidateURL(AcctValidateURL acctValidateURL) {
		this.acctValidateURL = acctValidateURL;
	}
	
}