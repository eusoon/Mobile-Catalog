package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class ChkNumRange extends IFXObject {

	//begin-or	Required
	ChkNumStart chkNumStart; //NC-12	Required	Selection Low Check Number.
	ChkNumEnd chkNumEnd; //NC-12	Required	Selection High Check Number.
	//end-or
	
	public ChkNumStart getChkNumStart() {
		return chkNumStart;
	}
	public void setChkNumStart(ChkNumStart chkNumStart) {
		this.chkNumStart = chkNumStart;
	}
	public ChkNumEnd getChkNumEnd() {
		return chkNumEnd;
	}
	public void setChkNumEnd(ChkNumEnd chkNumEnd) {
		this.chkNumEnd = chkNumEnd;
	}

}
