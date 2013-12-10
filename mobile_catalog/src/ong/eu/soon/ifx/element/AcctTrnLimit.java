package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class AcctTrnLimit extends IFXObject {
	TrnType TrnType; //Aggregate	Required Transaction Type
	TrnSubType trnSubType; //C-15	Optional Transaction Sub-Type
	AcctTrnUse acctTrnUse; //Open Enum Optional Account Transaction Us Valid values include: All, Destination, Source
	TrnSrc[] trnSrc;	//Open Enum	Optional Repeating Transaction Source Valid values include: ACH, All, ATM, HomeBank, POS, Teller, VRU Default Value: All
	LimitType[] limitType; //Open Enum	 Optional Repeating Limit Type Valid values include: DailyMax, DailyMin, Max, Min, MonthlyMax, MonthlyMin, WeeklyMax, WeeklyMin Default Value: Max
	
	LimitAmount limitAmt; //Aggregate	Optional Limit Amount

	LimitCount limitCount; //Long	Optional Limit Count

	public TrnType getTrnType() {
		return TrnType;
	}

	public void setTrnType(TrnType trnType) {
		TrnType = trnType;
	}

	public TrnSubType getTrnSubType() {
		return trnSubType;
	}

	public void setTrnSubType(TrnSubType trnSubType) {
		this.trnSubType = trnSubType;
	}

	public AcctTrnUse getAcctTrnUse() {
		return acctTrnUse;
	}

	public void setAcctTrnUse(AcctTrnUse acctTrnUse) {
		this.acctTrnUse = acctTrnUse;
	}

	public TrnSrc[] getTrnSrc() {
		return trnSrc;
	}

	public void setTrnSrc(TrnSrc[] trnSrc) {
		this.trnSrc = trnSrc;
	}

	public LimitType[] getLimitType() {
		return limitType;
	}

	public void setLimitType(LimitType[] limitType) {
		this.limitType = limitType;
	}

	public LimitAmount getLimitAmt() {
		return limitAmt;
	}

	public void setLimitAmt(LimitAmount limitAmt) {
		this.limitAmt = limitAmt;
	}

	public LimitCount getLimitCount() {
		return limitCount;
	}

	public void setLimitCount(LimitCount limitCount) {
		this.limitCount = limitCount;
	}

}
