package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class CardUpdateRec extends IFXObject {
	
	protected CardUpdateRec(){
	}
	
	public final native  SvcIdent getSvcIdent()/*-{
		return $wnd.cleanObject(this.svcIdent);
	}-*/;
	public final native  void setSvcIdent(SvcIdent svcIdent)/*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native  CardUpdateId getCardUpdateId()/*-{
		return $wnd.cleanObject(this.cardUpdateId);
	}-*/;
	public final native  void setCardUpdateId(CardUpdateId cardUpdateId)/*-{
		this.cardUpdateId = cardUpdateId;
	}-*/;
	public final native  CardUpdateInfo getCardUpdateInfo()/*-{
		return $wnd.cleanObject(this.cardUpdateInfo);
	}-*/;
	public final native  void setCardUpdateInfo(CardUpdateInfo cardUpdateInfo)/*-{
		this.cardUpdateInfo = cardUpdateInfo;
	}-*/;
	public final native  CardUpdateEnvr getCardUpdateEnvr()/*-{
		return $wnd.cleanObject(this.cardUpdateEnvr);
	}-*/;
	public final native  void setCardUpdateEnvr(CardUpdateEnvr cardUpdateEnvr)/*-{
		this.cardUpdateEnvr = cardUpdateEnvr;
	}-*/;
	public final native  CardUpdateStatus getCardUpdateStatus()/*-{
		return $wnd.cleanObject(this.cardUpdateStatus);
	}-*/;
	public final native  void setCardUpdateStatus(CardUpdateStatus cardUpdateStatus)/*-{
		this.cardUpdateStatus = cardUpdateStatus;
	}-*/;	
}
