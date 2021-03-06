package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class RemitRef extends IFXObject {
	//begin-xor	Required
	RemitKeys remitKeys;	 //	Aggregate	 Required	 Remittance Keys Aggregate
	RemitRec remitRec;	 //	Aggregate	 Required	 Remittance Record Aggregate
	RemitInfo remitInfo;	 //	Aggregate	 Required	 Remittance Information Aggregate
	//end-xor
	
	public RemitKeys getRemitKeys() {
		return remitKeys;
	}
	public void setRemitKeys(RemitKeys remitKeys) {
		this.remitKeys = remitKeys;
	}
	public RemitRec getRemitRec() {
		return remitRec;
	}
	public void setRemitRec(RemitRec remitRec) {
		this.remitRec = remitRec;
	}
	public RemitInfo getRemitInfo() {
		return remitInfo;
	}
	public void setRemitInfo(RemitInfo remitInfo) {
		this.remitInfo = remitInfo;
	}
}
