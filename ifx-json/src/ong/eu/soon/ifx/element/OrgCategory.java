package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class OrgCategory extends IFXObject {
	OrgCategoryCode orgCategoryCode;	 //	Aggregate	 Required	 Organization Category Code
	Desc desc;	 //	C-80	 Optional	 Description
	
	public OrgCategoryCode getOrgCategoryCode() {
		return orgCategoryCode;
	}
	public void setOrgCategoryCode(OrgCategoryCode orgCategoryCode) {
		this.orgCategoryCode = orgCategoryCode;
	}
	public Desc getDesc() {
		return desc;
	}
	public void setDesc(Desc desc) {
		this.desc = desc;
	}
}
