package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class BillerRec extends IFXObject {

	SvcIdent svcIdent;	 //	Aggregate	 Optional	 Service Identifier
	BillerId billerId;	 //	Identifier	 Required	 Biller Identifier
	BillerInfo billerInfo;	 //	Aggregate	 Required	 Biller Information Aggregate
	BillerEnvr billerEnvr;	 //	Aggregate	 Optional	 Biller Environment Aggregate
	BillerStatus billerStatus;	 //	Aggregate	 Required	 Biller Status Aggregate
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public BillerId getBillerId() {
		return billerId;
	}
	public void setBillerId(BillerId billerId) {
		this.billerId = billerId;
	}
	public BillerInfo getBillerInfo() {
		return billerInfo;
	}
	public void setBillerInfo(BillerInfo billerInfo) {
		this.billerInfo = billerInfo;
	}
	public BillerEnvr getBillerEnvr() {
		return billerEnvr;
	}
	public void setBillerEnvr(BillerEnvr billerEnvr) {
		this.billerEnvr = billerEnvr;
	}
	public BillerStatus getBillerStatus() {
		return billerStatus;
	}
	public void setBillerStatus(BillerStatus billerStatus) {
		this.billerStatus = billerStatus;
	}
	
}
