package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class ChkDetail extends IFXObject {
	ManualMicr ManualMicr;//Boolean	Optional ManualMicr. Use this to indicate the MICR has been keyed in manually. True indicates the MICR has been manually keyed.
	FIIdent fIIdent;//NC-34	Optional Bank Identifier. Qualifies account number if known by the customer/client. Usage is expected to be routing and transit number in the US or the equivalent in an international implementation. This is required in USA.
	AcctIdent acctIdent;//Aggregate	Optional Account Identifier Aggregate
	ProcessControl processControl; //C-6	Optional Process Control
	ChkNum chkNum; //NC-12	Optional Check number. Assigned by the Payer or CSP or CPP if payment is by paper check.
	OrigDt origDt;//Date	Optional Check origination date. The date on which the check is originated.
	Name name;//C-40	Optional Name of payer to appear on check (as originator). This can be Paying organization (Payer or Invoice Receiver) or check originator (CSP or CPP).
	PostAddr PostAddr;//Aggregate	ptional Postal address of the Compositeany to appear on check (as originator). This can be Paying Compositeany (Payer or Invoice Receiver) or check originator (CSP or CPP) postal address.
	OrgPhone orgPhone;//Phone Number	Optional Phone number of the organization to appear on check (as originator). This can be Paying organization (Payer or Invoice Receiver) or check originator (CSP or CPP) phone number.
	Memo memo;//C-255		Optional	Text description on the check.
	public ManualMicr getManualMicr() {
		return ManualMicr;
	}

	public void setManualMicr(ManualMicr manualMicr) {
		ManualMicr = manualMicr;
	}

	public FIIdent getFIIdent() {
		return fIIdent;
	}

	public void setFIIdent(FIIdent fIIdent) {
		this.fIIdent = fIIdent;
	}

	public AcctIdent getAcctIdent() {
		return acctIdent;
	}

	public void setAcctIdent(AcctIdent acctIdent) {
		this.acctIdent = acctIdent;
	}

	public ProcessControl getProcessControl() {
		return processControl;
	}

	public void setProcessControl(ProcessControl processControl) {
		this.processControl = processControl;
	}

	public ChkNum getChkNum() {
		return chkNum;
	}

	public void setChkNum(ChkNum chkNum) {
		this.chkNum = chkNum;
	}

	public OrigDt getOrigDt() {
		return origDt;
	}

	public void setOrigDt(OrigDt origDt) {
		this.origDt = origDt;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public PostAddr getPostAddr() {
		return PostAddr;
	}

	public void setPostAddr(PostAddr postAddr) {
		PostAddr = postAddr;
	}

	public OrgPhone getOrgPhone() {
		return orgPhone;
	}

	public void setOrgPhone(OrgPhone orgPhone) {
		this.orgPhone = orgPhone;
	}

	public Memo getMemo() {
		return memo;
	}

	public void setMemo(Memo memo) {
		this.memo = memo;
	}




}
