package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class AcctHoldKeys extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	//begin-xor	Required
	AcctHoldId acctHoldId; //Identifier	Required	Account Hold Identifier
	//begin-block	Required
	AcctKeys acctKeys; //Aggregate	Required	Account Keys Aggregate
	HoldType holdType; //Open Enum	Optional	Hold Type	Valid values include: Check, Collection, ContingentLiability, CourtOrder, Pledge
	AcctHoldIdent acctHoldIdent; //NC-36	Optional	Alternate Account Hold Identifier
	SecuredAcctKeys securedAcctKeys; //Aggregate	Optional	Secured Account Keys
	EffDt effDt; //DateTime	Optional	Effective Date Time
	ChkNum chkNum; //NC-12	Optional	Check Number
	//end-block
	//end-xor
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public AcctHoldId getAcctHoldId() {
		return acctHoldId;
	}
	public void setAcctHoldId(AcctHoldId acctHoldId) {
		this.acctHoldId = acctHoldId;
	}
	public AcctKeys getAcctKeys() {
		return acctKeys;
	}
	public void setAcctKeys(AcctKeys acctKeys) {
		this.acctKeys = acctKeys;
	}
	public HoldType getHoldType() {
		return holdType;
	}
	public void setHoldType(HoldType holdType) {
		this.holdType = holdType;
	}
	public AcctHoldIdent getAcctHoldIdent() {
		return acctHoldIdent;
	}
	public void setAcctHoldIdent(AcctHoldIdent acctHoldIdent) {
		this.acctHoldIdent = acctHoldIdent;
	}
	public SecuredAcctKeys getSecuredAcctKeys() {
		return securedAcctKeys;
	}
	public void setSecuredAcctKeys(SecuredAcctKeys securedAcctKeys) {
		this.securedAcctKeys = securedAcctKeys;
	}
	public EffDt getEffDt() {
		return effDt;
	}
	public void setEffDt(EffDt effDt) {
		this.effDt = effDt;
	}
	public ChkNum getChkNum() {
		return chkNum;
	}
	public void setChkNum(ChkNum chkNum) {
		this.chkNum = chkNum;
	}

}
