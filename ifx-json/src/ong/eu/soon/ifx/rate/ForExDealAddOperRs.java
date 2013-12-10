package ong.eu.soon.ifx.rate;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.OperRsHdr;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.Status;

public class ForExDealAddOperRs extends IFXObject {
	
	Status status; //Aggregate	Optional	Response Status
	RqUID rqUID; //UUID	Required	Request Identifier
	OperRsHdr operRsHdr; //Aggregate	Optional	Operation Response Header
	//begin-block	Optional
	ForExDealAddOperRs[] forExDealAddOperRs; //Aggregate	Required Repeating	ForExDealAddOper Response
	//end-block
	
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public RqUID getRqUID() {
		return rqUID;
	}
	public void setRqUID(RqUID rqUID) {
		this.rqUID = rqUID;
	}
	public OperRsHdr getOperRsHdr() {
		return operRsHdr;
	}
	public void setOperRsHdr(OperRsHdr operRsHdr) {
		this.operRsHdr = operRsHdr;
	}
	public ForExDealAddOperRs[] getForExDealAddOperRs() {
		return forExDealAddOperRs;
	}
	public void setForExDealAddOperRs(ForExDealAddOperRs[] forExDealAddOperRs) {
		this.forExDealAddOperRs = forExDealAddOperRs;
	}
	
}
