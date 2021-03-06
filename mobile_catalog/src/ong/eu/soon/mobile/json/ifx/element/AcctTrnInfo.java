package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class AcctTrnInfo extends IFXObject {
	
	protected AcctTrnInfo(){	
	}
	public final native  AcctRef getAcctRef()/*-{
		return $wnd.cleanObject(this.acctRef);
	}-*/;
	public final native  void setAcctRef(AcctRef acctRef)/*-{
		this.acctRef = acctRef;
	}-*/;
	public final native  TrnType getTrnType()/*-{
		return $wnd.cleanObject(this.trnType);
	}-*/;
	public final native  void setTrnType(TrnType trnType)/*-{
		this.trnType = trnType;
	}-*/;
	public final native  TrnSubType getTrnSubType()/*-{
		return $wnd.cleanObject(this.trnSubType);
	}-*/;
	public final native  void setTrnSubType(TrnSubType trnSubType)/*-{
		this.trnSubType = trnSubType;
	}-*/;
	public final native  TrnSrc getTrnSrc()/*-{
		return $wnd.cleanObject(this.trnSrc);
	}-*/;
	public final native  void setTrnSrc(TrnSrc trnSrc)/*-{
		this.trnSrc = trnSrc;
	}-*/;
	public final native  PostedDt getPostedDt()/*-{
		return $wnd.cleanObject(this.postedDt);
	}-*/;
	public final native  void setPostedDt(PostedDt postedDt)/*-{
		this.postedDt = postedDt;
	}-*/;
	public final native  OrigDt getOrigDt()/*-{
		return $wnd.cleanObject(this.origDt);
	}-*/;
	public final native  void setOrigDt(OrigDt origDt)/*-{
		this.origDt = origDt;
	}-*/;
	public final native  EffDt getEffDt()/*-{
		return $wnd.cleanObject(this.effDt);
	}-*/;
	public final native  void setEffDt(EffDt effDt)/*-{
		this.effDt = effDt;
	}-*/;
	public final native  TotalCurAmt getTotalCurAmt()/*-{
		return $wnd.cleanObject(this.totalCurAmt);
	}-*/;
	public final native  void setTotalCurAmt(TotalCurAmt totalCurAmt)/*-{
		this.totalCurAmt = totalCurAmt;
	}-*/;
	public final native  ExchangeRate getExchangeRate()/*-{
		return $wnd.cleanObject(this.exchangeRate);
	}-*/;
	public final native  void setExchangeRate(ExchangeRate exchangeRate)/*-{
		this.exchangeRate = exchangeRate;
	}-*/;
	public final native  CompositeCurAmt getCompositeCurAmt()/*-{
		return $wnd.cleanObject(this.compositeCurAmt);
	}-*/;
	public final native  void setCompositeCurAmt(CompositeCurAmt compositeCurAmt)/*-{
		this.compositeCurAmt = compositeCurAmt;
	}-*/;
	public final native  Memo getMemo()/*-{
		return $wnd.cleanObject(this.memo);
	}-*/;
	public final native  void setMemo(Memo memo)/*-{
		this.memo = memo;
	}-*/;
	public final native  Name getName()/*-{
		return $wnd.cleanObject(this.name);
	}-*/;
	public final native  void setName(Name name)/*-{
		this.name = name;
	}-*/;
	public final native  StmtRunningBal getStmtRunningBal()/*-{
		return $wnd.cleanObject(this.stmtRunningBal);
	}-*/;
	public final native  void setStmtRunningBal(StmtRunningBal stmtRunningBal)/*-{
		this.stmtRunningBal = stmtRunningBal;
	}-*/;
	public final native  ChkNum getChkNum()/*-{
		return $wnd.cleanObject(this.chkNum);
	}-*/;
	public final native  void setChkNum(ChkNum chkNum)/*-{
		this.chkNum = chkNum;
	}-*/;
	public final native  XferKeys getXferKeys()/*-{
		return $wnd.cleanObject(this.xferKeys);
	}-*/;
	public final native  void setXferKeys(XferKeys xferKeys)/*-{
		this.xferKeys = xferKeys;
	}-*/;
	public final native  PmtKeys getPmtKeys()/*-{
		return $wnd.cleanObject(this.pmtKeys);
	}-*/;
	public final native  void setPmtKeys(PmtKeys pmtKeys)/*-{
		this.pmtKeys = pmtKeys;
	}-*/;
	public final native  AvailDt getAvailDt()/*-{
		return $wnd.cleanObject(this.availDt);
	}-*/;
	public final native  void setAvailDt(AvailDt availDt)/*-{
		this.availDt = availDt;
	}-*/;
	public final native  SalesSlipRefNum getSalesSlipRefNum()/*-{
		return $wnd.cleanObject(this.salesSlipRefNum);
	}-*/;
	public final native  void setSalesSlipRefNum(SalesSlipRefNum salesSlipRefNum)/*-{
		this.salesSlipRefNum = salesSlipRefNum;
	}-*/;
	public final native  NetworkTrnData getNetworkTrnData()/*-{
		return $wnd.cleanObject(this.networkTrnData);
	}-*/;
	public final native  void setNetworkTrnData(NetworkTrnData networkTrnData)/*-{
		this.networkTrnData = networkTrnData;
	}-*/;
	public final native  CounterpartyData getCounterpartyData()/*-{
		return $wnd.cleanObject(this.counterpartyData);
	}-*/;
	public final native  void setCounterpartyData(CounterpartyData counterpartyData)/*-{
		this.counterpartyData = counterpartyData;
	}-*/;
	public final native  RefData getRefData()/*-{
		return $wnd.cleanObject(this.refData);
	}-*/;
	public final native  void setRefData(RefData refData)/*-{
		this.refData = refData;
	}-*/;
	public final native  BillRefText getBillRefText()/*-{
		return $wnd.cleanObject(this.billRefText);
	}-*/;
	public final native  void setBillRefText(BillRefText billRefText)/*-{
		this.billRefText = billRefText;
	}-*/;
	public final native  RemitAdviceRefId getRemitAdviceRefId()/*-{
		return $wnd.cleanObject(this.remitAdviceRefIdz);
	}-*/;
	public final native  void setRemitAdviceRefId(RemitAdviceRefId remitAdviceRefId)/*-{
		this.remitAdviceRefId = remitAdviceRefId;
	}-*/;
	public final native  CustPayeeInfo getCustPayeeInfo()/*-{
		return $wnd.cleanObject(this.custPayeeInfo);
	}-*/;
	public final native  void setCustPayeeInfo(CustPayeeInfo custPayeeInfo)/*-{
		this.custPayeeInfo = custPayeeInfo;
	}-*/;
	public final native  InvoiceData getInvoiceData()/*-{
		return $wnd.cleanObject(this.invoiceData);
	}-*/;
	public final native  void setInvoiceData(InvoiceData invoiceData)/*-{
		this.invoiceData = invoiceData;
	}-*/;
	public final native  CSPRefIdent getcSPRefIdent()/*-{
		return $wnd.cleanObject(this.cSPRefIdent);
	}-*/;
	public final native  void setcSPRefIdent(CSPRefIdent cSPRefIdent)/*-{
		this.cSPRefIdent = cSPRefIdent;
	}-*/;
	public final native  SPRefIdent getsPRefIdent()/*-{
		return $wnd.cleanObject(this.sPRefIdent);
	}-*/;
	public final native  void setsPRefIdent(SPRefIdent sPRefIdent)/*-{
		this.sPRefIdent = sPRefIdent;
	}-*/;
	public final native  SPRefIdCorrect getsPRefIdCorrect()/*-{
		return $wnd.cleanObject(this.sPRefIdCorrect);
	}-*/;
	public final native  void setsPRefIdCorrect(SPRefIdCorrect sPRefIdCorrect)/*-{
		this.sPRefIdCorrect = sPRefIdCorrect;
	}-*/;
	public final native  JsArray<CardAddenda> getCardAddenda()/*-{
		return $wnd.cleanObject(this.cardAddenda);
	}-*/;
	public final native  void setCardAddenda(JsArray<CardAddenda> cardAddenda)/*-{
		this.cardAddenda = cardAddenda;
	}-*/;

}
