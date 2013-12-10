package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class IndustIdent extends IFXObject {

	Org org; //Identifier	Required	Organization. Identifies the organization assigning numbers to different industries.	
	//"SIC" identifies Standard Industrial Codes
	//"NAICS" identifies North American Industrial Code System.
	IndustNum industNum; //NC-6	Required	Number identifying the industry.

	public Org getOrg() {
		return org;
	}

	public void setOrg(Org org) {
		this.org = org;
	}

	public IndustNum getIndustNum() {
		return industNum;
	}

	public void setIndustNum(IndustNum industNum) {
		this.industNum = industNum;
	}
}
