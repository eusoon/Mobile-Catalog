package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PmtRef extends IFXObject {
	//begin-xor	Required
	PmtKeys pmtKeys;	 //	Aggregate	 Required	 Payment Keys Aggregate
	PmtRec pmtRec;	 //	Aggregate	 Required	 Payment Record Aggregate
	PmtInfo pmtInfo;	 //	Aggregate	 Required	 Payment Information Aggregate
	//end-xor
	
	public PmtKeys getPmtKeys() {
		return pmtKeys;
	}
	public void setPmtKeys(PmtKeys pmtKeys) {
		this.pmtKeys = pmtKeys;
	}
	public PmtRec getPmtRec() {
		return pmtRec;
	}
	public void setPmtRec(PmtRec pmtRec) {
		this.pmtRec = pmtRec;
	}
	public PmtInfo getPmtInfo() {
		return pmtInfo;
	}
	public void setPmtInfo(PmtInfo pmtInfo) {
		this.pmtInfo = pmtInfo;
	}
}
