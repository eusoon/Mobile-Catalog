package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class AcctIdent extends IFXObject {

	AcctIdentType acctIdentType;//Open Enum	Optional Account Identifier Type Valid values include: AcctNum, ConvertedAcctNum, RewardsPgmMemberId

	AcctIdentValue acctIdentValue;//NC-36	Optional Account Identifier Value
	

	public AcctIdentType getAcctIdentType() {
		return acctIdentType;
	}
	public void setAcctIdentType(AcctIdentType acctIdentType) {
		this.acctIdentType = acctIdentType;
	}
	public AcctIdentValue getAcctIdentValue() {
		return acctIdentValue;
	}
	public void setAcctIdentValue(AcctIdentValue acctIdentValue) {
		this.acctIdentValue = acctIdentValue;
	}



}