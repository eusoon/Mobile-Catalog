package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.payment.PmtBatchAddRq;
import ong.eu.soon.ifx.payment.PmtBatchCanRq;

public class PmtBatchRqMsg extends IFXObject {

	//begin-xor	Required
	PmtBatchAddRq pmtBatchAddRq;	 //	Aggregate	 Required	 Payment Batch Add Request
	PmtBatchCanRq pmtBatchCanRq;	 //	Aggregate	 Required	 Payment Batch Cancel Request
	RevRqUID revRqUID;	 //	UUID	 Optional	 Reversal Request Unique ID
	//end-xor
	public PmtBatchAddRq getPmtBatchAddRq() {
		return pmtBatchAddRq;
	}
	public void setPmtBatchAddRq(PmtBatchAddRq pmtBatchAddRq) {
		this.pmtBatchAddRq = pmtBatchAddRq;
	}
	public PmtBatchCanRq getPmtBatchCanRq() {
		return pmtBatchCanRq;
	}
	public void setPmtBatchCanRq(PmtBatchCanRq pmtBatchCanRq) {
		this.pmtBatchCanRq = pmtBatchCanRq;
	}
	public RevRqUID getRevRqUID() {
		return revRqUID;
	}
	public void setRevRqUID(RevRqUID revRqUID) {
		this.revRqUID = revRqUID;
	}
		
}
