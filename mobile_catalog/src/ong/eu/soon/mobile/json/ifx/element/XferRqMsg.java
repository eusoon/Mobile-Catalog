package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.transfer.XferAddRq;
import ong.eu.soon.mobile.json.ifx.transfer.XferAdviseRq;
import ong.eu.soon.mobile.json.ifx.transfer.XferAudRq;
import ong.eu.soon.mobile.json.ifx.transfer.XferCanRq;
import ong.eu.soon.mobile.json.ifx.transfer.XferInqRq;
import ong.eu.soon.mobile.json.ifx.transfer.XferModRq;
import ong.eu.soon.mobile.json.ifx.transfer.XferStatusModRq;
import ong.eu.soon.mobile.json.ifx.transfer.XferSyncRq;

public class XferRqMsg extends IFXObject {

	protected XferRqMsg(){	
	}
	public final native  XferAddRq getXferAddRq()/*-{
		return $wnd.cleanObject(this.xferAddRq);
	}-*/;
	public final native  void setXferAddRq(XferAddRq xferAddRq)/*-{
		this.xferAddRq = xferAddRq;
	}-*/;
	public final native  XferModRq getXferModRq()/*-{
		return $wnd.cleanObject(this.xferModRq);
	}-*/;
	public final native  void setXferModRq(XferModRq xferModRq)/*-{
		this.xferModRq = xferModRq;
	}-*/;
	public final native  XferCanRq getXferCanRq()/*-{
		return $wnd.cleanObject(this.xferCanRq);
	}-*/;
	public final native  void setXferCanRq(XferCanRq xferCanRq)/*-{
		this.xferCanRq = xferCanRq;
	}-*/;
	public final native  XferInqRq getXferInqRq()/*-{
		return $wnd.cleanObject(this.xferInqRq);
	}-*/;
	public final native  void setXferInqRq(XferInqRq xferInqRq)/*-{
		this.xferInqRq = xferInqRq;
	}-*/;
	public final native  XferAdviseRq getXferAdviseRq()/*-{
		return $wnd.cleanObject(this.xferAdviseRq);
	}-*/;
	public final native  void setXferAdviseRq(XferAdviseRq xferAdviseRq)/*-{
		this.xferAdviseRq = xferAdviseRq;
	}-*/;
	public final native  XferAudRq getXferAudRq()/*-{
		return $wnd.cleanObject(this.xferAudRq);
	}-*/;
	public final native  void setXferAudRq(XferAudRq xferAudRq)/*-{
		this.xferAudRq = xferAudRq;
	}-*/;
	public final native  XferSyncRq getXferSyncRq()/*-{
		return $wnd.cleanObject(this.xferSyncRq);
	}-*/;
	public final native  void setXferSyncRq(XferSyncRq xferSyncRq)/*-{
		this.xferSyncRq = xferSyncRq;
	}-*/;
	public final native  XferStatusModRq getXferStatusModRq()/*-{
		return $wnd.cleanObject(this.xferStatusModRq);
	}-*/;
	public final native  void setXferStatusModRq(XferStatusModRq xferStatusModRq)/*-{
		this.xferStatusModRq = xferStatusModRq;
	}-*/;
	public final native  RevRqUID getRevRqUID()/*-{
		return $wnd.cleanObject(this.revRqUID);
	}-*/;
	public final native  void setRevRqUID(RevRqUID revRqUID)/*-{
		this.revRqUID = revRqUID;
	}-*/;
}
