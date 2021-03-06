package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.acct.AcctTrnAdviseRq;
import ong.eu.soon.ifx.acct.AcctTrnInqRq;
import ong.eu.soon.ifx.basetypes.IFXObject;

public class AcctTrnRqMsg extends IFXObject {

	//begin-xor	Required
	AcctTrnInqRq acctTrnInqRq;	 //	Aggregate	 Required	 Account Transaction Inquiry Message
	AcctTrnAdviseRq acctTrnAdviseRq;	 //	Aggregate	 Required	 Account Transaction Advise Message
	RevRqUID revRqUID;	 //	UUID	 Required	 Reversal Request Unique ID
	//end-xor
	
	public AcctTrnInqRq getAcctTrnInqRq() {
		return acctTrnInqRq;
	}
	public void setAcctTrnInqRq(AcctTrnInqRq acctTrnInqRq) {
		this.acctTrnInqRq = acctTrnInqRq;
	}
	public AcctTrnAdviseRq getAcctTrnAdviseRq() {
		return acctTrnAdviseRq;
	}
	public void setAcctTrnAdviseRq(AcctTrnAdviseRq acctTrnAdviseRq) {
		this.acctTrnAdviseRq = acctTrnAdviseRq;
	}
	public RevRqUID getRevRqUID() {
		return revRqUID;
	}
	public void setRevRqUID(RevRqUID revRqUID) {
		this.revRqUID = revRqUID;
	}
	
}
