package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public  class AcctTrnStatus extends IFXObject {

	protected AcctTrnStatus(){	
	}
	public final native  JsArray<AcctTrnStatusCode> getAcctTrnStatusCode()/*-{
		return $wnd.cleanObject(this.acctTrnStatusCode);
	}-*/;
	public final native  void setAcctTrnStatusCode(JsArray<AcctTrnStatusCode> acctTrnStatusCode)/*-{
		this.acctTrnStatusCode = acctTrnStatusCode;
	}-*/;
	public final native  StatusDesc getStatusDesc()/*-{
		return $wnd.cleanObject(this.statusDesc);
	}-*/;
	public final native  void setStatusDesc(StatusDesc statusDesc)/*-{
		this.statusDesc = statusDesc;
	}-*/;
	public final native  EffDt getEffDt()/*-{
		return $wnd.cleanObject(this.effDt);
	}-*/;
	public final native  void setEffDt(EffDt effDt)/*-{
		this.effDt = effDt;
	}-*/;
	public final native  StatusModBy getStatusModBy()/*-{
		return $wnd.cleanObject(this.statusModBy);
	}-*/;
	public final native  void setStatusModBy(StatusModBy statusModBy)/*-{
		this.statusModBy = statusModBy;
	}-*/;
}
