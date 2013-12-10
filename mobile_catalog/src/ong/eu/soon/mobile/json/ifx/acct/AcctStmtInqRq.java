package ong.eu.soon.mobile.json.ifx.acct;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.AcctStmtSel;
import ong.eu.soon.mobile.json.ifx.element.DocCtrlIn;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.RecCtrlIn;
import ong.eu.soon.mobile.json.ifx.element.RecSelect;
import ong.eu.soon.mobile.json.ifx.element.RqUID;

public class AcctStmtInqRq extends IFXObject {
	
	protected AcctStmtInqRq(){	
	}
	
	public final native RqUID getRqUID() /*-{
		return $wnd.cleanObject(this.rqUID);
	}-*/;
	public final native void setRqUID(RqUID rqUID) /*-{
		this.rqUID = rqUID;
	}-*/;
	public final native MsgRqHdr getMsgRqHdr() /*-{
		return $wnd.cleanObject(this.msgRqHdr);
	}-*/;
	public final native void setMsgRqHdr(MsgRqHdr msgRqHdr) /*-{
		this.msgRqHdr = msgRqHdr;
	}-*/;
	public final native DocCtrlIn getDocCtrlIn() /*-{
		return $wnd.cleanObject(this.docCtrlIn);
	}-*/;
	public final native void setDocCtrlIn(DocCtrlIn docCtrlIn) /*-{
		this.docCtrlIn = docCtrlIn;
	}-*/;
	public final native RecCtrlIn getRecCtrlIn() /*-{
		return $wnd.cleanObject(this.recCtrlIn);
	}-*/;
	public final native void setRecCtrlIn(RecCtrlIn recCtrlIn) /*-{
		this.recCtrlIn = recCtrlIn;
	}-*/;
	public final native AcctStmtSel getAcctStmtSel() /*-{
		return $wnd.cleanObject(this.acctStmtSel);
	}-*/;
	public final native void setAcctStmtSel(AcctStmtSel acctStmtSel) /*-{
		this.acctStmtSel = acctStmtSel;
	}-*/;
	public final native RecSelect getRecSelect() /*-{
		return $wnd.cleanObject(this.recSelect);
	}-*/;
	public final native void setRecSelect(RecSelect recSelect) /*-{
		this.recSelect = recSelect;
	}-*/;

}