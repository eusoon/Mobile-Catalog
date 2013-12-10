package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class BillRec extends IFXObject {

	protected BillRec(){	
	}
	
	public final native  SvcIdent getSvcIdent()/*-{
		return $wnd.cleanObject(this.svcIdent);
	}-*/;
	public final native  void setSvcIdent(SvcIdent svcIdent)/*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native  BillId getBillId()/*-{
		return $wnd.cleanObject(this.billId);
	}-*/;
	public final native  void setBillId(BillId billId)/*-{
		this.billId = billId;
	}-*/;
	public final native  BillInfo getBillInfo()/*-{
		return $wnd.cleanObject(this.billInfo);
	}-*/;
	public final native  void setBillInfo(BillInfo billInfo)/*-{
		this.billInfo = billInfo;
	}-*/;
	public final native  BillEnvr getBillEnvr()/*-{
		return $wnd.cleanObject(this.billEnvr);
	}-*/;
	public final native  void setBillEnvr(BillEnvr billEnvr)/*-{
		this.billEnvr = billEnvr;
	}-*/;
	public final native  BillStatus getBillStatus()/*-{
		return $wnd.cleanObject(this.billStatus);
	}-*/;
	public final native  void setBillStatus(BillStatus billStatus)/*-{
		this.billStatus = billStatus;
	}-*/;
}
