package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PartyAffiliateData extends IFXObject {
	OrgName orgName;	 //	Aggregate	 Required	 Organization Name
	SocialAffiliatIdent socialAffiliatIdent;	 //	NC-36	 Optional	 Social Affiliate Identifier
	SocialOrgType socialOrgType;	 //	C-40	 Optional	 Social Organization Type
	PositionHeld positionHeld;	 //	C-40	 Optional	 Position Held
	RelEstablishedDt relEstablishedDt;	 //	Date	 Optional	 Relationship Established Date
	
	public OrgName getOrgName() {
		return orgName;
	}
	public void setOrgName(OrgName orgName) {
		this.orgName = orgName;
	}
	public SocialAffiliatIdent getSocialAffiliatIdent() {
		return socialAffiliatIdent;
	}
	public void setSocialAffiliatIdent(SocialAffiliatIdent socialAffiliatIdent) {
		this.socialAffiliatIdent = socialAffiliatIdent;
	}
	public SocialOrgType getSocialOrgType() {
		return socialOrgType;
	}
	public void setSocialOrgType(SocialOrgType socialOrgType) {
		this.socialOrgType = socialOrgType;
	}
	public PositionHeld getPositionHeld() {
		return positionHeld;
	}
	public void setPositionHeld(PositionHeld positionHeld) {
		this.positionHeld = positionHeld;
	}
	public RelEstablishedDt getRelEstablishedDt() {
		return relEstablishedDt;
	}
	public void setRelEstablishedDt(RelEstablishedDt relEstablishedDt) {
		this.relEstablishedDt = relEstablishedDt;
	}
	
}
