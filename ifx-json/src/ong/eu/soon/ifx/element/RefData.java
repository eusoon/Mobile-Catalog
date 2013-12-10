package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class RefData extends IFXObject {
	RefType refType;
	RefIdent refIdent;
	RefDesc refDesc;
	public RefType getRefType() {
		return refType;
	}
	public void setRefType(RefType refType) {
		this.refType = refType;
	}
	public RefIdent getRefIdent() {
		return refIdent;
	}
	public void setRefIdent(RefIdent refIdent) {
		this.refIdent = refIdent;
	}
	public RefDesc getRefDesc() {
		return refDesc;
	}
	public void setRefDesc(RefDesc refDesc) {
		this.refDesc = refDesc;
	}




}
