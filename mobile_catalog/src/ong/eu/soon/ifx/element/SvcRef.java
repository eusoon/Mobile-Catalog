package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class SvcRef extends IFXObject {
	SvcKeys svcKeys;//Aggregate	Required Service Keys Aggregate
	SvcRec svcRec;//Aggregate	Required Service Record
	SvcInfo svcInfo;//Aggregate	Required Service Information Aggregate
	public SvcKeys getSvcKeys() {
		return svcKeys;
	}
	public void setSvcKeys(SvcKeys svcKeys) {
		this.svcKeys = svcKeys;
	}
	public SvcRec getSvcRec() {
		return svcRec;
	}
	public void setSvcRec(SvcRec svcRec) {
		this.svcRec = svcRec;
	}
	public SvcInfo getSvcInfo() {
		return svcInfo;
	}
	public void setSvcInfo(SvcInfo svcInfo) {
		this.svcInfo = svcInfo;
	}
}
