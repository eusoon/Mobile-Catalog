package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class AcctTrnInfo extends IFXObject {
	AcctRef acctRef; //Aggregate	Optional	Account Reference Aggregate
	TrnType trnType; //Aggregate	Optional	Transaction Type
	TrnSubType trnSubType; //C-15	Optional	Transaction Sub-Type
	TrnSrc trnSrc; //Open Enum	Optional	Transaction Source	Valid values include: ACH, All, ATM, HomeBank, POS, Teller, VRU		Default Value: All
	PostedDt postedDt; //Date	Optional	Posting Date
	OrigDt origDt; //Date	Optional	Origination Date
	EffDt effDt; //DateTime	Optional	Date transaction is 'as of'.
	TotalCurAmt totalCurAmt; //Aggregate	Optional	Total amount of the transaction in the currency of the account.
	ExchangeRate exchangeRate; //Aggregate	Optional	Exchange Rate
	CompositeCurAmt compositeCurAmt; //Aggregate	Optional	Composite Currency Amount
	Memo memo; //C-255	Optional	Memo
	Name name; //C-40	Optional	Name
	StmtRunningBal stmtRunningBal; //Aggregate	Optional	Statement Running Balance
	ChkNum chkNum; //NC-12	Optional	Check Number
	XferKeys xferKeys; //Aggregate	Optional	Funds Transfer Keys Aggregate
	PmtKeys pmtKeys; //Aggregate	Optional	Payment Keys Aggregate
	AvailDt availDt; //DateTime	Optional	Available Date
	SalesSlipRefNum salesSlipRefNum; //NC-23	Optional	Sales Slip Reference Number
	NetworkTrnData networkTrnData; //Aggregate	Optional	Network Transaction Data
	CounterpartyData counterpartyData; //Aggregate	Optional	Counterparty Data Aggregate
	RefData refData; //Aggregate	Optional	Reference Information
	BillRefText billRefText; //NC-80	Optional	Bill Reference Text
	RemitAdviceRefId remitAdviceRefId; //NC-34	Optional	Remittance Advice Reference Identifier
	CustPayeeInfo custPayeeInfo; //Aggregate	Optional	Customer Payee Information Aggregate
	InvoiceData invoiceData; //Aggregate	Optional	Provides information about invoices.
	CSPRefIdent cSPRefIdent; //NC-36	Optional	Customer Service Provider Reference Identifier
	SPRefIdent sPRefIdent; //NC-36	Optional	Service Provider Reference Identifier
	SPRefIdCorrect sPRefIdCorrect; //Aggregate	Optional	SP Reference Identifier Correction
	CardAddenda cardAddenda[]; //Abstract Aggregate	Optional Repeating	Card Addenda	Valid Aggregates are: AirlineAddenda, LodgingAddenda, VehicleRentalAddenda
	
	public AcctRef getAcctRef() {
		return acctRef;
	}
	public void setAcctRef(AcctRef acctRef) {
		this.acctRef = acctRef;
	}
	public TrnType getTrnType() {
		return trnType;
	}
	public void setTrnType(TrnType trnType) {
		this.trnType = trnType;
	}
	public TrnSubType getTrnSubType() {
		return trnSubType;
	}
	public void setTrnSubType(TrnSubType trnSubType) {
		this.trnSubType = trnSubType;
	}
	public TrnSrc getTrnSrc() {
		return trnSrc;
	}
	public void setTrnSrc(TrnSrc trnSrc) {
		this.trnSrc = trnSrc;
	}
	public PostedDt getPostedDt() {
		return postedDt;
	}
	public void setPostedDt(PostedDt postedDt) {
		this.postedDt = postedDt;
	}
	public OrigDt getOrigDt() {
		return origDt;
	}
	public void setOrigDt(OrigDt origDt) {
		this.origDt = origDt;
	}
	public EffDt getEffDt() {
		return effDt;
	}
	public void setEffDt(EffDt effDt) {
		this.effDt = effDt;
	}
	public TotalCurAmt getTotalCurAmt() {
		return totalCurAmt;
	}
	public void setTotalCurAmt(TotalCurAmt totalCurAmt) {
		this.totalCurAmt = totalCurAmt;
	}
	public ExchangeRate getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(ExchangeRate exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public CompositeCurAmt getCompositeCurAmt() {
		return compositeCurAmt;
	}
	public void setCompositeCurAmt(CompositeCurAmt compositeCurAmt) {
		this.compositeCurAmt = compositeCurAmt;
	}
	public Memo getMemo() {
		return memo;
	}
	public void setMemo(Memo memo) {
		this.memo = memo;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public StmtRunningBal getStmtRunningBal() {
		return stmtRunningBal;
	}
	public void setStmtRunningBal(StmtRunningBal stmtRunningBal) {
		this.stmtRunningBal = stmtRunningBal;
	}
	public ChkNum getChkNum() {
		return chkNum;
	}
	public void setChkNum(ChkNum chkNum) {
		this.chkNum = chkNum;
	}
	public XferKeys getXferKeys() {
		return xferKeys;
	}
	public void setXferKeys(XferKeys xferKeys) {
		this.xferKeys = xferKeys;
	}
	public PmtKeys getPmtKeys() {
		return pmtKeys;
	}
	public void setPmtKeys(PmtKeys pmtKeys) {
		this.pmtKeys = pmtKeys;
	}
	public AvailDt getAvailDt() {
		return availDt;
	}
	public void setAvailDt(AvailDt availDt) {
		this.availDt = availDt;
	}
	public SalesSlipRefNum getSalesSlipRefNum() {
		return salesSlipRefNum;
	}
	public void setSalesSlipRefNum(SalesSlipRefNum salesSlipRefNum) {
		this.salesSlipRefNum = salesSlipRefNum;
	}
	public NetworkTrnData getNetworkTrnData() {
		return networkTrnData;
	}
	public void setNetworkTrnData(NetworkTrnData networkTrnData) {
		this.networkTrnData = networkTrnData;
	}
	public CounterpartyData getCounterpartyData() {
		return counterpartyData;
	}
	public void setCounterpartyData(CounterpartyData counterpartyData) {
		this.counterpartyData = counterpartyData;
	}
	public RefData getRefData() {
		return refData;
	}
	public void setRefData(RefData refData) {
		this.refData = refData;
	}
	public BillRefText getBillRefText() {
		return billRefText;
	}
	public void setBillRefText(BillRefText billRefText) {
		this.billRefText = billRefText;
	}
	public RemitAdviceRefId getRemitAdviceRefId() {
		return remitAdviceRefId;
	}
	public void setRemitAdviceRefId(RemitAdviceRefId remitAdviceRefId) {
		this.remitAdviceRefId = remitAdviceRefId;
	}
	public CustPayeeInfo getCustPayeeInfo() {
		return custPayeeInfo;
	}
	public void setCustPayeeInfo(CustPayeeInfo custPayeeInfo) {
		this.custPayeeInfo = custPayeeInfo;
	}
	public InvoiceData getInvoiceData() {
		return invoiceData;
	}
	public void setInvoiceData(InvoiceData invoiceData) {
		this.invoiceData = invoiceData;
	}
	public CSPRefIdent getcSPRefIdent() {
		return cSPRefIdent;
	}
	public void setcSPRefIdent(CSPRefIdent cSPRefIdent) {
		this.cSPRefIdent = cSPRefIdent;
	}
	public SPRefIdent getsPRefIdent() {
		return sPRefIdent;
	}
	public void setsPRefIdent(SPRefIdent sPRefIdent) {
		this.sPRefIdent = sPRefIdent;
	}
	public SPRefIdCorrect getsPRefIdCorrect() {
		return sPRefIdCorrect;
	}
	public void setsPRefIdCorrect(SPRefIdCorrect sPRefIdCorrect) {
		this.sPRefIdCorrect = sPRefIdCorrect;
	}
	public CardAddenda[] getCardAddenda() {
		return cardAddenda;
	}
	public void setCardAddenda(CardAddenda cardAddenda[]) {
		this.cardAddenda = cardAddenda;
	}

}