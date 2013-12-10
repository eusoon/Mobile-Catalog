package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.MsgRecDt;
import ong.eu.soon.mobile.json.ifx.transfer.XferAddRs;
import ong.eu.soon.mobile.json.ifx.transfer.XferAdviseRs;
import ong.eu.soon.mobile.json.ifx.transfer.XferCanRs;
import ong.eu.soon.mobile.json.ifx.transfer.XferInqRs;
import ong.eu.soon.mobile.json.ifx.transfer.XferModRs;
import ong.eu.soon.mobile.json.ifx.transfer.XferRevRs;
import ong.eu.soon.mobile.json.ifx.transfer.XferStatusModRs;

public class XferRsMsg extends IFXObject {
	protected XferRsMsg(){	
	}
	public final native MsgRecDt getMsgRecDt() /*-{
		return $wnd.cleanObject(MsgRecDt);
	}-*/;
	public final native void setMsgRecDt(MsgRecDt msgRecDt) /*-{
		MsgRecDt = msgRecDt;
	}-*/;
	public final native XferAddRs getXferAddRs() /*-{
		return $wnd.cleanObject(xferAddRs);
	}-*/;
	public final native void setXferAddRs(XferAddRs xferAddRs) /*-{
		this.xferAddRs = xferAddRs;
	}-*/;
	public final native XferModRs getXferModRs() /*-{
		return $wnd.cleanObject(xferModRs);
	}-*/;
	public final native void setXferModRs(XferModRs xferModRs) /*-{
		this.xferModRs = xferModRs;
	}-*/;
	public final native XferCanRs getXferCanRs() /*-{
		return $wnd.cleanObject(xferCanRs);
	}-*/;
	public final native void setXferCanRs(XferCanRs xferCanRs) /*-{
		this.xferCanRs = xferCanRs;
	}-*/;
	public final native XferRevRs getXferRevRs() /*-{
		return $wnd.cleanObject(xferRevRs);
	}-*/;
	public final native void setXferRevRs(XferRevRs xferRevRs) /*-{
		this.xferRevRs = xferRevRs;
	}-*/;
	public final native XferInqRs getXferInqRs() /*-{
		return $wnd.cleanObject(xferInqRs);
	}-*/;
	public final native void setXferInqRs(XferInqRs xferInqRs) /*-{
		this.xferInqRs = xferInqRs;
	}-*/;
	public final native XferAdviseRs getXferAdviseRs() /*-{
		return $wnd.cleanObject(xferAdviseRs);
	}-*/;
	public final native void setXferAdviseRs(XferAdviseRs xferAdviseRs) /*-{
		this.xferAdviseRs = xferAdviseRs;
	}-*/;
	public final native XferStatusModRs getXferStatusModRs() /*-{
		return $wnd.cleanObject(xferStatusModRs);
	}-*/;
	public final native void setXferStatusModRs(XferStatusModRs xferStatusModRs) /*-{
		this.xferStatusModRs = xferStatusModRs;
	}-*/;

}