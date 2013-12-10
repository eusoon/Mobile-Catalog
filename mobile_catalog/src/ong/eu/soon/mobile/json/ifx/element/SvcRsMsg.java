package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.service.SvcAdviseRs;
import ong.eu.soon.mobile.json.ifx.service.SvcInqRs;
import ong.eu.soon.mobile.json.ifx.service.SvcStatusInqRs;

public  class SvcRsMsg extends IFXObject {
	protected SvcRsMsg(){	
	}
	public final native  MsgRecDt getMsgRecDt()/*-{
		return $wnd.cleanObject(this.msgRecDt);
	}-*/;
	public final native  void setMsgRecDt(MsgRecDt msgRecDt)/*-{
		this.msgRecDt = msgRecDt;
	}-*/;
	public final native  SvcInqRs getSvcInqRs()/*-{
		return $wnd.cleanObject(this.svcInqRs);
	}-*/;
	public final native  void setSvcInqRs(SvcInqRs svcInqRs)/*-{
		this.svcInqRs = svcInqRs;
	}-*/;
	public final native  SvcAdviseRs getSvcAdviseRs()/*-{
		return $wnd.cleanObject(this.svcAdviseRs);
	}-*/;
	public final native  void setSvcAdviseRs(SvcAdviseRs svcAdviseRs)/*-{
		this.svcAdviseRs = svcAdviseRs;
	}-*/;
	public final native  SvcStatusInqRs getSvcStatusInqRs()/*-{
		return $wnd.cleanObject(this.svcStatusInqRs);
	}-*/;
	public final native  void setSvcStatusInqRs(SvcStatusInqRs svcStatusInqRs)/*-{
		this.svcStatusInqRs = svcStatusInqRs;
	}-*/;

}
