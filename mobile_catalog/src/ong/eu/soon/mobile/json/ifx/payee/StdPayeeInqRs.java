package ong.eu.soon.mobile.json.ifx.payee;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.DocCtrlOut;
import ong.eu.soon.mobile.json.ifx.element.MsgRsHdr;
import ong.eu.soon.mobile.json.ifx.element.RecCtrlOut;
import ong.eu.soon.mobile.json.ifx.element.RqUID;
import ong.eu.soon.mobile.json.ifx.element.Status;
import ong.eu.soon.mobile.json.ifx.element.StdPayeeRec;

import com.google.gwt.core.client.JsArray;


public class StdPayeeInqRs extends IFXObject {
	protected StdPayeeInqRs(){	
	}
	public final native Status getStatus() /*-{
		return $wnd.cleanObject(status);
	}-*/;
	public final native void setStatus(Status status) /*-{
		this.status = status;
	}-*/;
	public final native RqUID getRqUID() /*-{
		return $wnd.cleanObject(rqUID);
	}-*/;
	public final native void setRqUID(RqUID rqUID) /*-{
		this.rqUID = rqUID;
	}-*/;
	public final native MsgRsHdr getMsgRsHdr() /*-{
		return $wnd.cleanObject(msgRsHdr);
	}-*/;
	public final native void setMsgRsHdr(MsgRsHdr msgRsHdr) /*-{
		this.msgRsHdr = msgRsHdr;
	}-*/;
	public final native DocCtrlOut getDocCtrlOut() /*-{
		return $wnd.cleanObject(docCtrlOut);
	}-*/;
	public final native void setDocCtrlOut(DocCtrlOut docCtrlOut) /*-{
		this.docCtrlOut = docCtrlOut;
	}-*/;
	public final native RecCtrlOut getRecCtrlOut() /*-{
		return $wnd.cleanObject(recCtrlOut);
	}-*/;
	public final native void setRecCtrlOut(RecCtrlOut recCtrlOut) /*-{
		this.recCtrlOut = recCtrlOut;
	}-*/;
	public final native JsArray<StdPayeeRec> getStdPayeeRec() /*-{
		return $wnd.cleanObject(stdPayeeRec);
	}-*/;
	public final native void setStdPayeeRec(JsArray<StdPayeeRec> stdPayeeRec) /*-{
		this.stdPayeeRec = stdPayeeRec;
	}-*/;

}