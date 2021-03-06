package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public  class BillInfo extends IFXObject {
	
	protected BillInfo(){	
	}
	
	public final native  BillType getBillType()/*-{
		return $wnd.cleanObject(this.billType);
	}-*/;
	public final native  void setBillType(BillType billType)/*-{
		this.billType = billType;
	}-*/;
	public final native  PartyRef getPartyRef()/*-{
		return $wnd.cleanObject(this.partyRef);
	}-*/;
	public final native  void setPartyRef(PartyRef partyRef)/*-{
		this.partyRef = partyRef;
	}-*/;
	public final native  Memo getMemo()/*-{
		return $wnd.cleanObject(this.memo);
	}-*/;
	public final native  void setMemo(Memo memo)/*-{
		this.memo = memo;
	}-*/;
	public final native  JsArray<BillSummAmt> getBillSummAmt()/*-{
		return $wnd.cleanObject(this.billSummAmt);
	}-*/;
	public final native  void setBillSummAmt(JsArray<BillSummAmt> billSummAmt)/*-{
		this.billSummAmt = billSummAmt;
	}-*/;
	public final native  DueDt getDueDt()/*-{
		return $wnd.cleanObject(this.dueDt);
	}-*/;
	public final native  void setDueDt(DueDt dueDt)/*-{
		this.dueDt = dueDt;
	}-*/;
	public final native  BillInvoiceDt getBillInvoiceDt()/*-{
		return $wnd.cleanObject(this.billInvoiceDt);
	}-*/;
	public final native  void setBillInvoiceDt(BillInvoiceDt billInvoiceDt)/*-{
		this.billInvoiceDt = billInvoiceDt;
	}-*/;
	public final native  OpenDt getOpenDt()/*-{
		return $wnd.cleanObject(this.openDt);
	}-*/;
	public final native  void setOpenDt(OpenDt openDt)/*-{
		this.openDt = openDt;
	}-*/;
	public final native  CloseDt getCloseDt()/*-{
		return $wnd.cleanObject(this.closeDt);
	}-*/;
	public final native  void setCloseDt(CloseDt closeDt)/*-{
		this.closeDt = closeDt;
	}-*/;
	public final native  JsArray<PmtOptions> getPmtOptions()/*-{
		return $wnd.cleanObject(this.pmtOptions);
	}-*/;
	public final native  void setPmtOptions(JsArray<PmtOptions> pmtOptions)/*-{
		this.pmtOptions = pmtOptions;
	}-*/;
	public final native  NotifyReqd getNotifyReqd()/*-{
		return $wnd.cleanObject(this.notifyReqd);
	}-*/;
	public final native  void setNotifyReqd(NotifyReqd notifyReqd)/*-{
		this.notifyReqd = notifyReqd;
	}-*/;
	public final native  ViewDtlPref getViewDtlPref()/*-{
		return $wnd.cleanObject(this.viewDtlPref);
	}-*/;
	public final native  void setViewDtlPref(ViewDtlPref viewDtlPref)/*-{
		this.viewDtlPref = viewDtlPref;
	}-*/;
	public final native  BillStmtData getBillStmtData()/*-{
		return $wnd.cleanObject(this.billStmtData);
	}-*/;
	public final native  void setBillStmtData(BillStmtData billStmtData)/*-{
		this.billStmtData = billStmtData;
	}-*/;
	public final native  BillRefText getBillRefText()/*-{
		return $wnd.cleanObject(this.billRefText);
	}-*/;
	public final native  void setBillRefText(BillRefText billRefText)/*-{
		this.billRefText = billRefText;
	}-*/;
	public final native BillerInfo getBillerInfo()/*-{
		return $wnd.cleanObject(this.billRefText);
	}-*/;


}
