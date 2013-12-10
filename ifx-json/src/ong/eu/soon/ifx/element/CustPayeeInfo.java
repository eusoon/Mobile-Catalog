package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CustPayeeInfo extends IFXObject {

	Name name; //C-40	Optional	Payee Name. Initially assigned by the customer when the Payee is added. May be modified by the client. Should contain Biller Name <BillerName> in the case of a Biller. For more information, see the above table. Does not affect the behavior of interbank transfer payments, but recommended usage is destination account name for interbank transfer payees.
	Nickname nickname; //C-40	Optional	Payee Nickname. Optionally assigned by the customer. Server always echoes it in immediate response if received in a request. Pay provider may indicate support for longer-term storage of nicknames in the Service Profile. May be modified by the client.
	//begin-xor	Required
	StdPayeeRef stdPayeeRef; //Aggregate	Required	Standard Payee Reference Aggregate
	FSPayee fSPayee; //Aggregate	Required	Fully-Specified Payee Aggregate.
	XferPayee xferPayee; //Aggregate	Required	Transfer Payee Aggregate.
	//end-xor
	PayerAcctNum payerAcctNum; //C-32	Optional	Payer Account Number
	PayeeAcctNum payeeAcctNum; //C-32	Optional	Payee Account Number
	DfltPmtData dfltPmtData; //Aggregate	Optional	Default Payment Information Aggregate. Used to add default payment information when adding a new payee. This would not be included when paying a bill unless the user was also adding a new payee at the same time.
	LastPmtCurAmt lastPmtCurAmt; //Aggregate	Optional	Last Payment Amount
	LastPmtDt lastPmtDt; //Date	Optional	Last Payment Date

	
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public Nickname getNickname() {
		return nickname;
	}
	public void setNickname(Nickname nickname) {
		this.nickname = nickname;
	}
	public StdPayeeRef getStdPayeeRef() {
		return stdPayeeRef;
	}
	public void setStdPayeeRef(StdPayeeRef stdPayeeRef) {
		this.stdPayeeRef = stdPayeeRef;
	}
	public FSPayee getFSPayee() {
		return fSPayee;
	}
	public void setFSPayee(FSPayee fSPayee) {
		this.fSPayee = fSPayee;
	}
	public XferPayee getXferPayee() {
		return xferPayee;
	}
	public void setXferPayee(XferPayee xferPayee) {
		this.xferPayee = xferPayee;
	}
	public PayerAcctNum getPayerAcctNum() {
		return payerAcctNum;
	}
	public void setPayerAcctNum(PayerAcctNum payerAcctNum) {
		this.payerAcctNum = payerAcctNum;
	}
	public PayeeAcctNum getPayeeAcctNum() {
		return payeeAcctNum;
	}
	public void setPayeeAcctNum(PayeeAcctNum payeeAcctNum) {
		this.payeeAcctNum = payeeAcctNum;
	}
	public DfltPmtData getDfltPmtData() {
		return dfltPmtData;
	}
	public void setDfltPmtData(DfltPmtData dfltPmtData) {
		this.dfltPmtData = dfltPmtData;
	}
	public LastPmtCurAmt getLastPmtCurAmt() {
		return lastPmtCurAmt;
	}
	public void setLastPmtCurAmt(LastPmtCurAmt lastPmtCurAmt) {
		this.lastPmtCurAmt = lastPmtCurAmt;
	}
	public LastPmtDt getLastPmtDt() {
		return lastPmtDt;
	}
	public void setLastPmtDt(LastPmtDt lastPmtDt) {
		this.lastPmtDt = lastPmtDt;
	}
}