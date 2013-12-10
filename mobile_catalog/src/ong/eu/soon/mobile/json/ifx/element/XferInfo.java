package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class XferInfo extends IFXObject{
	protected XferInfo(){	
	}
	public final native FromAcctRef getFromAcctRef() /*-{
		return $wnd.cleanObject(fromAcctRef);
	}-*/;
	public final native void setFromAcctRef(FromAcctRef fromAcctRef) /*-{
		this.fromAcctRef = fromAcctRef;
	}-*/;
	public final native ToAcctRef getToAcctRef() /*-{
		return $wnd.cleanObject(toAcctRef);
	}-*/;
	public final native void setToAcctRef(ToAcctRef toAcctRef) /*-{
		this.toAcctRef = toAcctRef;
	}-*/;
	public final native CurAmt getCurAmt() /*-{
		return $wnd.cleanObject(curAmt);
	}-*/;
	public final native void setCurAmt(CurAmt curAmt) /*-{
		this.curAmt = curAmt;
	}-*/;
	public final native DueDt getDueDt() /*-{
		return $wnd.cleanObject(dueDt);
	}-*/;
	public final native void setDueDt(DueDt dueDt) /*-{
		this.dueDt = dueDt;
	}-*/;
	public final native Category getCategory() /*-{
		return $wnd.cleanObject(category);
	}-*/;
	public final native void setCategory(Category category) /*-{
		this.category = category;
	}-*/;
	public final native ExpediteInd getExpediteInd() /*-{
		return $wnd.cleanObject(expediteInd);
	}-*/;
	public final native void setExpediteInd(ExpediteInd expediteInd) /*-{
		this.expediteInd = expediteInd;
	}-*/;
	public final native RecurXferKeys getRecurXferKeys() /*-{
		return $wnd.cleanObject(recurXferKeys);
	}-*/;
	public final native void setRecurXferKeys(RecurXferKeys recurXferKeys) /*-{
		this.recurXferKeys = recurXferKeys;
	}-*/;
	public final native ForExDealRef getForExDealRef() /*-{
		return $wnd.cleanObject(forExDealRef);
	}-*/;
	public final native void setForExDealRef(ForExDealRef forExDealRef) /*-{
		this.forExDealRef = forExDealRef;
	}-*/;
	public final native JsArray<RefData> getRefData() /*-{
		return $wnd.cleanObject(refData);
	}-*/;
	public final native void setRefData(JsArray<RefData> refData) /*-{
		this.refData = refData;
	}-*/;
}
