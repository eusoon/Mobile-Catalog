package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class RemitDetail extends IFXObject {
	protected RemitDetail(){	
	}
	public final native UltimateCreditorData getUltimateCreditorData() /*-{
		return $wnd.cleanObject(ultimateCreditorData);
	}-*/;
	public final native void setUltimateCreditorData(UltimateCreditorData ultimateCreditorData) /*-{
		this.ultimateCreditorData = ultimateCreditorData;
	}-*/;
	public final native UltimateDebtorData getUltimateDebtorData() /*-{
		return $wnd.cleanObject(ultimateDebtorData);
	}-*/;
	public final native void setUltimateDebtorData(UltimateDebtorData ultimateDebtorData) /*-{
		this.ultimateDebtorData = ultimateDebtorData;
	}-*/;
	public final native CurAmt getCurAmt() /*-{
		return $wnd.cleanObject(curAmt);
	}-*/;
	public final native void setCurAmt(CurAmt curAmt) /*-{
		this.curAmt = curAmt;
	}-*/;
	public final native JsArray<PmtSummAmt> getPmtSummAmt() /*-{
		return $wnd.cleanObject(pmtSummAmt);
	}-*/;
	public final native void setPmtSummAmt(JsArray<PmtSummAmt> pmtSummAmt) /*-{
		this.pmtSummAmt = pmtSummAmt;
	}-*/;
	public final native JsArray<RefData> getRefData() /*-{
		return $wnd.cleanObject(refData);
	}-*/;
	public final native void setRefData(JsArray<RefData> refData) /*-{
		this.refData = refData;
	}-*/;
	public final native BillRefText getBillRefText() /*-{
		return $wnd.cleanObject(billRefText);
	}-*/;
	public final native void setBillRefText(BillRefText billRefText) /*-{
		this.billRefText = billRefText;
	}-*/;
	public final native BillRef getBillRef() /*-{
		return $wnd.cleanObject(billRef);
	}-*/;
	public final native void setBillRef(BillRef billRef) /*-{
		this.billRef = billRef;
	}-*/;
	public final native JsArray<InvoiceData> getInvoiceData() /*-{
		return $wnd.cleanObject(invoiceData);
	}-*/;
	public final native void setInvoiceData(JsArray<InvoiceData> invoiceData) /*-{
		this.invoiceData = invoiceData;
	}-*/;
	public final native Memo getMemo() /*-{
		return $wnd.cleanObject(memo);
	}-*/;
	public final native void setMemo(Memo memo) /*-{
		this.memo = memo;
	}-*/;
}
