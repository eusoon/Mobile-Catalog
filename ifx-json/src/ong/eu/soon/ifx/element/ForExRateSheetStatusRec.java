package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class ForExRateSheetStatusRec extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	ForExRateSheetId forExRateSheetId; //Identifier	Required	Foreign Exchange Rate Sheet Identifier
	ForExRateSheetStatus forExRateSheetStatus; //Aggregate	Required	Foreign Exchange Rate Sheet Status
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public ForExRateSheetId getForExRateSheetId() {
		return forExRateSheetId;
	}
	public void setForExRateSheetId(ForExRateSheetId forExRateSheetId) {
		this.forExRateSheetId = forExRateSheetId;
	}
	public ForExRateSheetStatus getForExRateSheetStatus() {
		return forExRateSheetStatus;
	}
	public void setForExRateSheetStatus(ForExRateSheetStatus forExRateSheetStatus) {
		this.forExRateSheetStatus = forExRateSheetStatus;
	}

}