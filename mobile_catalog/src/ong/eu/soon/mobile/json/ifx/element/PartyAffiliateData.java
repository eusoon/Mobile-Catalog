package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class PartyAffiliateData extends IFXObject {
	protected PartyAffiliateData(){	
	}
	public final native OrgName getOrgName() /*-{
		return $wnd.cleanObject(orgName);
	}-*/;
	public final native void setOrgName(OrgName orgName) /*-{
		this.orgName = orgName;
	}-*/;
	public final native SocialAffiliatIdent getSocialAffiliatIdent() /*-{
		return $wnd.cleanObject(socialAffiliatIdent);
	}-*/;
	public final native void setSocialAffiliatIdent(SocialAffiliatIdent socialAffiliatIdent) /*-{
		this.socialAffiliatIdent = socialAffiliatIdent;
	}-*/;
	public final native SocialOrgType getSocialOrgType() /*-{
		return $wnd.cleanObject(socialOrgType);
	}-*/;
	public final native void setSocialOrgType(SocialOrgType socialOrgType) /*-{
		this.socialOrgType = socialOrgType;
	}-*/;
	public final native PositionHeld getPositionHeld() /*-{
		return $wnd.cleanObject(positionHeld);
	}-*/;
	public final native void setPositionHeld(PositionHeld positionHeld) /*-{
		this.positionHeld = positionHeld;
	}-*/;
	public final native RelEstablishedDt getRelEstablishedDt() /*-{
		return $wnd.cleanObject(relEstablishedDt);
	}-*/;
	public final native void setRelEstablishedDt(RelEstablishedDt relEstablishedDt) /*-{
		this.relEstablishedDt = relEstablishedDt;
	}-*/;
	
}