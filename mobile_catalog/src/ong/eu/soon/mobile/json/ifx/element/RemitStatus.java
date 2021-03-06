package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class RemitStatus extends IFXObject {
	protected RemitStatus(){	
	}
	public final native RemitStatusCode getRemitStatusCode() /*-{
		return $wnd.cleanObject(remitStatusCode);
	}-*/;
	public final native void setRemitStatusCode(RemitStatusCode remitStatusCode) /*-{
		this.remitStatusCode = remitStatusCode;
	}-*/;
	public final native StatusDesc getStatusDesc() /*-{
		return $wnd.cleanObject(statusDesc);
	}-*/;
	public final native void setStatusDesc(StatusDesc statusDesc) /*-{
		this.statusDesc = statusDesc;
	}-*/;
	public final native EffDt getEffDt() /*-{
		return $wnd.cleanObject(effDt);
	}-*/;
	public final native void setEffDt(EffDt effDt) /*-{
		this.effDt = effDt;
	}-*/;
	public final native StatusModBy getStatusModBy() /*-{
		return $wnd.cleanObject(statusModBy);
	}-*/;
	public final native void setStatusModBy(StatusModBy statusModBy) /*-{
		this.statusModBy = statusModBy;
	}-*/;
	public final native Memo getMemo() /*-{
		return $wnd.cleanObject(memo);
	}-*/;
	public final native void setMemo(Memo memo) /*-{
		this.memo = memo;
	}-*/;
}