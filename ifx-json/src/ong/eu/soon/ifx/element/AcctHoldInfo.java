package ong.eu.soon.ifx.element;

public class AcctHoldInfo {
	AcctRef acctRef;//	Aggregate		Required	Account Reference Aggregate
	HoldType holdType;	//Open Enum		Required	Hold Type	Valid values include: Check, Collection, ContingentLiability, CourtOrder, Pledge
	//begin-or Required 
	CurAmt curAmt;//	Aggregate		Optional	The amount of hold to be placed on the account. If sent in an AcctHoldAddRq with a HoldPercent also provided, the CurAmt may be recalculated by the server based on the HoldPercent value.
	//begin-block Optional 
	HoldPercent holdPercent;//Decimal	Required Percentage of secured account balance to be held.
	PercentBalType percentBalType;//Aggregate		Optional	Percentage Balance Type
	//end-block
	//end-or
	SecuredAcctRef securedAcctRef;//	Aggregate		Optional	Secured Account Reference
	HoldReason holdReason;//C-80	Optional Hold Reason
	ExpDt expDt;//DateTime		Optional	Expiration date of the account hold. If sent in an AcctHoldAddRq with a Term also provided, the expiration date may be recalculated by the server based on the Term value.
	Term term;//	Aggregate		Optional	The Term for a deposit or credit account.
	ChkNum chkNum;//	NC-12		Optional	Check Number
	EffDt effDt;//	DateTime		Optional	Effective Date Time
	ReviewFrequency reviewFrequency;//Aggregate	Optional Review Frequency
	LastReviewDt lastReviewDt;//Date		Optional	Last Review Date
	Memo memo;//	C-255		Optional	Memo
	AcctHoldIdent acctHoldIdent;//	NC-36		Optional	Alternate Account Hold Identifier
	public AcctRef getAcctRef() {
		return acctRef;
	}
	public void setAcctRef(AcctRef acctRef) {
		this.acctRef = acctRef;
	}
	public HoldType getHoldType() {
		return holdType;
	}
	public void setHoldType(HoldType holdType) {
		this.holdType = holdType;
	}
	public CurAmt getCurAmt() {
		return curAmt;
	}
	public void setCurAmt(CurAmt curAmt) {
		this.curAmt = curAmt;
	}
	public HoldPercent getHoldPercent() {
		return holdPercent;
	}
	public void setHoldPercent(HoldPercent holdPercent) {
		this.holdPercent = holdPercent;
	}
	public PercentBalType getPercentBalType() {
		return percentBalType;
	}
	public void setPercentBalType(PercentBalType percentBalType) {
		this.percentBalType = percentBalType;
	}
	public SecuredAcctRef getSecuredAcctRef() {
		return securedAcctRef;
	}
	public void setSecuredAcctRef(SecuredAcctRef securedAcctRef) {
		this.securedAcctRef = securedAcctRef;
	}
	public HoldReason getHoldReason() {
		return holdReason;
	}
	public void setHoldReason(HoldReason holdReason) {
		this.holdReason = holdReason;
	}
	public ExpDt getExpDt() {
		return expDt;
	}
	public void setExpDt(ExpDt expDt) {
		this.expDt = expDt;
	}
	public Term getTerm() {
		return term;
	}
	public void setTerm(Term term) {
		this.term = term;
	}
	public ChkNum getChkNum() {
		return chkNum;
	}
	public void setChkNum(ChkNum chkNum) {
		this.chkNum = chkNum;
	}
	public EffDt getEffDt() {
		return effDt;
	}
	public void setEffDt(EffDt effDt) {
		this.effDt = effDt;
	}
	public ReviewFrequency getReviewFrequency() {
		return reviewFrequency;
	}
	public void setReviewFrequency(ReviewFrequency reviewFrequency) {
		this.reviewFrequency = reviewFrequency;
	}
	public LastReviewDt getLastReviewDt() {
		return lastReviewDt;
	}
	public void setLastReviewDt(LastReviewDt lastReviewDt) {
		this.lastReviewDt = lastReviewDt;
	}
	public Memo getMemo() {
		return memo;
	}
	public void setMemo(Memo memo) {
		this.memo = memo;
	}
	public AcctHoldIdent getAcctHoldIdent() {
		return acctHoldIdent;
	}
	public void setAcctHoldIdent(AcctHoldIdent acctHoldIdent) {
		this.acctHoldIdent = acctHoldIdent;
	}

}
