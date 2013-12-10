package ong.eu.soon.ifx.element;

public class AcctKeys extends BaseKeys {
	SvcIdent svcIdent; //Aggregate	Optional Service Identifier

	AcctId acctId;//Identifier	Required Account Identifier

	BBAN bBAN;//	NC-30	Required Basic Bank Account Identifier

	IBAN iBAN; //NC-34	Required International Bank Account Number

	UPIC uPIC;//NC-17	Required Universal Payment Identification Code
	CLABE cLABE; //C-18	Required CLABE

	CardMagData cardMagData; //Aggregate	Required Card Magnetic Stripe Data

	CardKeys cardKeys;//Aggregate	Required Card Keys Aggregate

	CardChipData cardChipData; //Aggregate	Required Card Chip Data

	AcctIdent acctIdent;//Aggregate	Required Account Identifier Aggregate

	AcctType acctType;//Aggregate	Optional Account Type

	CurCode curCode;//Aggregate	Optional Currency Code

	FIIdentType fIIdentType;//	Open Enum	Optional Financial Institution Identifier Type Valid values include: ABA, CHAPS, CHIPS, FedWire, SortCode, SWIFT
	FIIdent fIIdent;//NC-34	Optional Financial Institution Identifier
	BranchIdent branchIdent; //NC-22	Optional Branch Identifier

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
	public BBAN getBBAN() {
		return bBAN;
	}
	public void setBBAN(BBAN bBAN) {
		this.bBAN = bBAN;
	}
	public IBAN getIBAN() {
		return iBAN;
	}
	public void setIBAN(IBAN iBAN) {
		this.iBAN = iBAN;
	}
	public UPIC getUPIC() {
		return uPIC;
	}
	public void setUPIC(UPIC uPIC) {
		this.uPIC = uPIC;
	}
	public CLABE getCLABE() {
		return cLABE;
	}
	public void setCLABE(CLABE cLABE) {
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
	public FIIdentType getFIIdentType() {
		return fIIdentType;
	}
	public void setFIIdentType(FIIdentType fIIdentType) {
		this.fIIdentType = fIIdentType;
	}
	public FIIdent getFIIdent() {
		return fIIdent;
	}
	public void setFIIdent(FIIdent fIIdent) {
		this.fIIdent = fIIdent;
	}
	public BranchIdent getBranchIdent() {
		return branchIdent;
	}
	public void setBranchIdent(BranchIdent branchIdent) {
		this.branchIdent = branchIdent;
	}
}
