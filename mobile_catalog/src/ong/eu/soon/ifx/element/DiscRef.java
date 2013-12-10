package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class DiscRef extends IFXObject {
	DiscKeys DiscKeys;//Aggregate	Required Disclosure Keys Aggregate
	DiscRec DiscRec;//Aggregate	Required Disclosure Record Aggregate
	DiscInfo DiscInfo;//Aggregate	Required Disclosure Information Aggregate
	public DiscKeys getDiscKeys() {
		return DiscKeys;
	}
	public void setDiscKeys(DiscKeys discKeys) {
		DiscKeys = discKeys;
	}
	public DiscRec getDiscRec() {
		return DiscRec;
	}
	public void setDiscRec(DiscRec discRec) {
		DiscRec = discRec;
	}
	public DiscInfo getDiscInfo() {
		return DiscInfo;
	}
	public void setDiscInfo(DiscInfo discInfo) {
		DiscInfo = discInfo;
	}
}
