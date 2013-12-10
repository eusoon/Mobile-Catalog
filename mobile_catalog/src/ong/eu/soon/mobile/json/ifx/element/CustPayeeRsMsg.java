package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.payee.*;

public class CustPayeeRsMsg extends IFXObject {

	protected CustPayeeRsMsg(){	
	}
	
	public final native  MsgRecDt getMsgRecDt()/*-{
		return $wnd.cleanObject(this.msgRecDt);
	}-*/;
	public final native  void setMsgRecDt(MsgRecDt msgRecDt)/*-{
		this.msgRecDt = msgRecDt;
	}-*/;
	public final native  CustPayeeAddRs getCustPayeeAddRs()/*-{
		return $wnd.cleanObject(this.custPayeeAddRs);
	}-*/;
	public final native  void setCustPayeeAddRs(CustPayeeAddRs custPayeeAddRs)/*-{
		this.custPayeeAddRs = custPayeeAddRs;
	}-*/;
	public final native  CustPayeeModRs getCustPayeeModRs()/*-{
		return $wnd.cleanObject(this.custPayeeModRs);
	}-*/;
	public final native  void setCustPayeeModRs(CustPayeeModRs custPayeeModRs)/*-{
		this.custPayeeModRs = custPayeeModRs;
	}-*/;
	public final native  CustPayeeDelRs getCustPayeeDelRs()/*-{
		return $wnd.cleanObject(this.custPayeeDelRs);
	}-*/;
	public final native  void setCustPayeeDelRs(CustPayeeDelRs custPayeeDelRs)/*-{
		this.custPayeeDelRs = custPayeeDelRs;
	}-*/;
	public final native  CustPayeeInqRs getCustPayeeInqRs()/*-{
		return $wnd.cleanObject(this.custPayeeInqRs);
	}-*/;
	public final native  void setCustPayeeInqRs(CustPayeeInqRs custPayeeInqRs)/*-{
		this.custPayeeInqRs = custPayeeInqRs;
	}-*/;
}
