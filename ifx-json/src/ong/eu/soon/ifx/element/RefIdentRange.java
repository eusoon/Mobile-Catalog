package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class RefIdentRange extends IFXObject {

	RefIdentStart refIdentStart; //NC-36	Optional	Reference Identifier Starting Value
	RefIdentEnd refIdentEnd; //NC-36	Optional	Reference Identifier Ending Value
	
	public RefIdentStart getRefIdentStart() {
		return refIdentStart;
	}
	public void setRefIdentStart(RefIdentStart refIdentStart) {
		this.refIdentStart = refIdentStart;
	}
	public RefIdentEnd getRefIdentEnd() {
		return refIdentEnd;
	}
	public void setRefIdentEnd(RefIdentEnd refIdentEnd) {
		this.refIdentEnd = refIdentEnd;
	}
	
}