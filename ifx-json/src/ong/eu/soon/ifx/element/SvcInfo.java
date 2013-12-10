package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class SvcInfo extends IFXObject {
	SvcName SvcName;//C-32	Required Service Name. Must be unique in the Service Provider.
	Version Version;//NC-12	Optional The version of the object or item.
	PrcSched PrcSched;//Aggregate	Required Processing Schedule
	MsgSupt[] MsgSupt;//C-64	Required Repeating Messages Supported Element
	OperSupt[] OperSupt;//C-64	Optional Repeating The name of an Operation supported in a particular service.
	DiscRef[] discRef;//Aggregate	Optional Repeating Disclosure Reference Aggregate
	SvcStatusDt svcStatusDt;//DateTime	Required Service Status Date
	public SvcName getSvcName() {
		return SvcName;
	}
	public void setSvcName(SvcName svcName) {
		SvcName = svcName;
	}
	public Version getVersion() {
		return Version;
	}
	public void setVersion(Version version) {
		Version = version;
	}
	public PrcSched getPrcSched() {
		return PrcSched;
	}
	public void setPrcSched(PrcSched prcSched) {
		PrcSched = prcSched;
	}
	public MsgSupt[] getMsgSupt() {
		return MsgSupt;
	}
	public void setMsgSupt(MsgSupt[] msgSupt) {
		MsgSupt = msgSupt;
	}
	public OperSupt[] getOperSupt() {
		return OperSupt;
	}
	public void setOperSupt(OperSupt[] operSupt) {
		OperSupt = operSupt;
	}
	public DiscRef[] getDiscRef() {
		return discRef;
	}
	public void setDiscRef(DiscRef[] discRef) {
		this.discRef = discRef;
	}
	public SvcStatusDt getSvcStatusDt() {
		return svcStatusDt;
	}
	public void setSvcStatusDt(SvcStatusDt svcStatusDt) {
		this.svcStatusDt = svcStatusDt;
	}

}