package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class BillRec extends IFXObject {

	SvcIdent svcIdent;	 //	Aggregate	 Optional	 Service Identifier
	BillId billId;	 //	Identifier	 Required	 Bill Identifier
	BillInfo billInfo;	 //	Aggregate	 Required	 Bill Information Aggregate
	BillEnvr billEnvr;	 //	Aggregate	 Optional	 Bill Environment Aggregate
	BillStatus billStatus;	 //	Aggregate	 Required	 Bill Status Aggregate
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public BillId getBillId() {
		return billId;
	}
	public void setBillId(BillId billId) {
		this.billId = billId;
	}
	public BillInfo getBillInfo() {
		return billInfo;
	}
	public void setBillInfo(BillInfo billInfo) {
		this.billInfo = billInfo;
	}
	public BillEnvr getBillEnvr() {
		return billEnvr;
	}
	public void setBillEnvr(BillEnvr billEnvr) {
		this.billEnvr = billEnvr;
	}
	public BillStatus getBillStatus() {
		return billStatus;
	}
	public void setBillStatus(BillStatus billStatus) {
		this.billStatus = billStatus;
	}
}
