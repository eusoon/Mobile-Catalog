package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class OrgCategoryCode extends IFXObject {
	//begin-or	Required Repeating
	MCC[] mCC;	 //	C-4	 Optional	 Merchant Category Code
	NAICS[] nAICS;	 //	C-6	 Optional	 North American Industry Classification System
	SIC[] sIC;	 //	C-4	 Optional	 Standard Industry Classification
	OrgCatIdent[] orgCatIdent;	 //	Aggregate	 Optional	 Organization Category Identifier
	//end-or
	
	public MCC[] getmCC() {
		return mCC;
	}
	public void setmCC(MCC[] mCC) {
		this.mCC = mCC;
	}
	public NAICS[] getnAICS() {
		return nAICS;
	}
	public void setnAICS(NAICS[] nAICS) {
		this.nAICS = nAICS;
	}
	public SIC[] getsIC() {
		return sIC;
	}
	public void setsIC(SIC[] sIC) {
		this.sIC = sIC;
	}
	public OrgCatIdent[] getOrgCatIdent() {
		return orgCatIdent;
	}
	public void setOrgCatIdent(OrgCatIdent[] orgCatIdent) {
		this.orgCatIdent = orgCatIdent;
	}
}
