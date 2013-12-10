package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CorporateAcctData extends IFXObject {

	CorpAcctType corpAcctType;//Open Enum	Optional Corporate Account Type Valid values include: Corporate , Family
	CorpAcctRelType corpAcctRelType;//Open Enum	Optional Corporate Account Relationship Type Valid values include: Child, Parent
	ParentAcctKeys parentAcctKeys; //Aggregate	OptionalThe parent account in a corporate relationship.
	RollBalance rollBalance;//Open Enum	OptionalRoll Balance Valid values include: FullStmtBal, None, PaymentDue Default Value: None
	CorpStmtDetail corpStmtDetail;//Open Enum	Optional	Corporate Statement Detail Valid values include: Both, Child, Parent Default Value: Child
	CorpCreditLimitInd corpCreditLimitInd;//Boolean	Optional Corporate Credit Limit Indicator
	MaxCreditLimitPct maxCreditLimitPct;//Decimal	Optional Maximum Credit Limit Percent
	CorpFinLiab corpFinLiab;//Open Enum	Optional Corporate Financial Liability Valid values include: Both, Child, Parent Default Value: Child
	EmbossCorpNameInd embossCorpNameInd;//Boolean	Optional Emboss Corporate Name Indicator
	public CorpAcctType getCorpAcctType() {
		return corpAcctType;
	}
	public void setCorpAcctType(CorpAcctType corpAcctType) {
		this.corpAcctType = corpAcctType;
	}
	public CorpAcctRelType getCorpAcctRelType() {
		return corpAcctRelType;
	}
	public void setCorpAcctRelType(CorpAcctRelType corpAcctRelType) {
		this.corpAcctRelType = corpAcctRelType;
	}
	public ParentAcctKeys getParentAcctKeys() {
		return parentAcctKeys;
	}
	public void setParentAcctKeys(ParentAcctKeys parentAcctKeys) {
		this.parentAcctKeys = parentAcctKeys;
	}
	public RollBalance getRollBalance() {
		return rollBalance;
	}
	public void setRollBalance(RollBalance rollBalance) {
		this.rollBalance = rollBalance;
	}
	public CorpStmtDetail getCorpStmtDetail() {
		return corpStmtDetail;
	}
	public void setCorpStmtDetail(CorpStmtDetail corpStmtDetail) {
		this.corpStmtDetail = corpStmtDetail;
	}
	public CorpCreditLimitInd getCorpCreditLimitInd() {
		return corpCreditLimitInd;
	}
	public void setCorpCreditLimitInd(CorpCreditLimitInd corpCreditLimitInd) {
		this.corpCreditLimitInd = corpCreditLimitInd;
	}
	public MaxCreditLimitPct getMaxCreditLimitPct() {
		return maxCreditLimitPct;
	}
	public void setMaxCreditLimitPct(MaxCreditLimitPct maxCreditLimitPct) {
		this.maxCreditLimitPct = maxCreditLimitPct;
	}
	public CorpFinLiab getCorpFinLiab() {
		return corpFinLiab;
	}
	public void setCorpFinLiab(CorpFinLiab corpFinLiab) {
		this.corpFinLiab = corpFinLiab;
	}
	public EmbossCorpNameInd getEmbossCorpNameInd() {
		return embossCorpNameInd;
	}
	public void setEmbossCorpNameInd(EmbossCorpNameInd embossCorpNameInd) {
		this.embossCorpNameInd = embossCorpNameInd;
	}

}
