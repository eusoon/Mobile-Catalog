package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class ForExDealRec extends IFXObject {
	SvcIdent svcIdent;//Aggregate	Optional Service Identifier
	ForExDealId forExDealId;//Identifier	Required Foreign Exchange Deal Identifier
	ForExDealInfo forExDealInfo;//Aggregate	Required Foreign Exchange Deal Information
	ForExDealEnvr forExDealEnvr;//Aggregate	Optional Foreign Exchange Deal Environment
	ForExDealStatus forExDealStatus;//Aggregate	Required Foreign Exchange Deal Status
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
	public ForExDealInfo getForExDealInfo() {
		return forExDealInfo;
	}
	public void setForExDealInfo(ForExDealInfo forExDealInfo) {
		this.forExDealInfo = forExDealInfo;
	}
	public ForExDealEnvr getForExDealEnvr() {
		return forExDealEnvr;
	}
	public void setForExDealEnvr(ForExDealEnvr forExDealEnvr) {
		this.forExDealEnvr = forExDealEnvr;
	}
	public ForExDealStatus getForExDealStatus() {
		return forExDealStatus;
	}
	public void setForExDealStatus(ForExDealStatus forExDealStatus) {
		this.forExDealStatus = forExDealStatus;
	}

}
