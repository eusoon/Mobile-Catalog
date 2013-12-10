package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class ForExDealStatusRec extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	ForExDealId forExDealId; //Identifier	Required	Foreign Exchange Deal Identifier
	ForExDealStatus forExDealStatus; //Aggregate	Required	Foreign Exchange Deal Status
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public ForExDealId getForExDealId() {
		return forExDealId;
	}
	public void setForExDealId(ForExDealId forExDealId) {
		this.forExDealId = forExDealId;
	}
	public ForExDealStatus getForExDealStatus() {
		return forExDealStatus;
	}
	public void setForExDealStatus(ForExDealStatus forExDealStatus) {
		this.forExDealStatus = forExDealStatus;
	}

}