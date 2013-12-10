package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class SecuredAcctKeys extends IFXObject {

	SvcIdent svcIdent;	 //	Aggregate	 Optional	 Service Identifier
	//begin-xor	Required
	AcctId acctId;	 //	Identifier	 Required	 Account Identifier
	//begin-block	Optional
	//begin-xor	Optional
	BBAN bBAN;	 //	NC-30	 Required	 Basic Bank Account Identifier
	IBAN iBAN;	 //	NC-34	 Required	 International Bank Account Number
	UPIC uPIC;	 //	NC-17	 Required	 Universal Payment Identification Code
	CLABE cLABE;	 //	C-18	 Required	 CLABE
	CardMagData cardMagData;	 //	Aggregate	 Required	 Card Magnetic Stripe Data
	CardKeys cardKeys;	 //	Aggregate	 Required	 Card Keys Aggregate
	CardChipData cardChipData;	 //	Aggregate	 Required	 Card Chip Data
	AcctIdent acctIdent;	 //	Aggregate	 Required	 Account Identifier Aggregate
	//end-xor
	AcctType acctType;	 //	Aggregate	 Optional	 Account Type
	CurCode curCode;	 //	Aggregate	 Optional	 Currency Code
	FIIdentType fIIdentType;	 //	Open Enum	 Optional	 Financial Institution Identifier TypeValid values include: ABA, CHAPS, CHIPS, FedWire, SortCode, SWIFT
	FIIdent fIIdent;	 //	NC-34	 Optional	 Financial Institution Identifier
	BranchIdent branchIdent;	 //	NC-22	 Optional	 Branch Identifier
	//end-block
	//end-xor
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public AcctId getAcctId() {
		return acctId;
	}
	public void setAcctId(AcctId acctId) {
		this.acctId = acctId;
	}
	public BBAN getbBAN() {
		return bBAN;
	}
	public void setbBAN(BBAN bBAN) {
		this.bBAN = bBAN;
	}
	public IBAN getiBAN() {
		return iBAN;
	}
	public void setiBAN(IBAN iBAN) {
		this.iBAN = iBAN;
	}
	public UPIC getuPIC() {
		return uPIC;
	}
	public void setuPIC(UPIC uPIC) {
		this.uPIC = uPIC;
	}
	public CLABE getcLABE() {
		return cLABE;
	}
	public void setcLABE(CLABE cLABE) {
		this.cLABE = cLABE;
	}
	public CardMagData getCardMagData() {
		return cardMagData;
	}
	public void setCardMagData(CardMagData cardMagData) {
		this.cardMagData = cardMagData;
	}
	public CardKeys getCardKeys() {
		return cardKeys;
	}
	public void setCardKeys(CardKeys cardKeys) {
		this.cardKeys = cardKeys;
	}
	public CardChipData getCardChipData() {
		return cardChipData;
	}
	public void setCardChipData(CardChipData cardChipData) {
		this.cardChipData = cardChipData;
	}
	public AcctIdent getAcctIdent() {
		return acctIdent;
	}
	public void setAcctIdent(AcctIdent acctIdent) {
		this.acctIdent = acctIdent;
	}
	public AcctType getAcctType() {
		return acctType;
	}
	public void setAcctType(AcctType acctType) {
		this.acctType = acctType;
	}
	public CurCode getCurCode() {
		return curCode;
	}
	public void setCurCode(CurCode curCode) {
		this.curCode = curCode;
	}
	public FIIdentType getfIIdentType() {
		return fIIdentType;
	}
	public void setfIIdentType(FIIdentType fIIdentType) {
		this.fIIdentType = fIIdentType;
	}
	public FIIdent getfIIdent() {
		return fIIdent;
	}
	public void setfIIdent(FIIdent fIIdent) {
		this.fIIdent = fIIdent;
	}
	public BranchIdent getBranchIdent() {
		return branchIdent;
	}
	public void setBranchIdent(BranchIdent branchIdent) {
		this.branchIdent = branchIdent;
	}

}
