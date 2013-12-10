package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class OrgCatIdent extends IFXObject {
	//begin Aggregate
	OrgCatIdentSource orgCatIdentSource;	 //	Open Enum	 Optional	 Organization Category Identifier Source
	OrgCatIdentValue orgCatIdentValue;	 //	Open Enum	 Optional	 Organization Category Identifier Value
	//end Aggregate
	
	public OrgCatIdentSource getOrgCatIdentSource() {
		return orgCatIdentSource;
	}
	public void setOrgCatIdentSource(OrgCatIdentSource orgCatIdentSource) {
		this.orgCatIdentSource = orgCatIdentSource;
	}
	public OrgCatIdentValue getOrgCatIdentValue() {
		return orgCatIdentValue;
	}
	public void setOrgCatIdentValue(OrgCatIdentValue orgCatIdentValue) {
		this.orgCatIdentValue = orgCatIdentValue;
	}
}
