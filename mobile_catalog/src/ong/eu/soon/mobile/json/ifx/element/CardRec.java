package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class CardRec extends IFXObject {

	protected CardRec(){
	}
	
	public final native  SvcIdent getSvcIdent()/*-{
		return $wnd.cleanObject(this.svcIdent);
	}-*/;
	public final native  void setSvcIdent(SvcIdent svcIdent)/*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native  CardId getCardId()/*-{
		return $wnd.cleanObject(this.cardId);
	}-*/;
	public final native  void setCardId(CardId cardId)/*-{
		this.cardId = cardId;
	}-*/;
	public final native  CardInfo getCardInfo()/*-{
		return $wnd.cleanObject(this.cardInfo);
	}-*/;
	public final native  void setCardInfo(CardInfo cardInfo)/*-{
		this.cardInfo = cardInfo;
	}-*/;
	public final native  CardEnvr getCardEnvr()/*-{
		return $wnd.cleanObject(this.cardEnvr);
	}-*/;
	public final native  void setCardEnvr(CardEnvr cardEnvr)/*-{
		this.cardEnvr = cardEnvr;
	}-*/;
	public final native  CardAuth getCardAuth()/*-{
		return $wnd.cleanObject(this.cardAuth);
	}-*/;
	public final native  void setCardAuth(CardAuth cardAuth)/*-{
		this.cardAuth = cardAuth;
	}-*/;
	public final native  CardStatus getCardStatus()/*-{
		return $wnd.cleanObject(this.cardStatus);
	}-*/;
	public final native  void setCardStatus(CardStatus cardStatus)/*-{
		this.cardStatus = cardStatus;
	}-*/;
}
