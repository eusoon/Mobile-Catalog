package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class SvcStatus extends IFXObject {
	protected SvcStatus(){	
	}
	public final native  SvcStatusCode getSvcStatusCode()/*-{
		return $wnd.cleanObject(this.svcStatusCode);
	}-*/;
	public final native  void setSvcStatusCode(SvcStatusCode svcStatusCode)/*-{
		this.svcStatusCode = svcStatusCode;
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
