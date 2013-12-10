package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class PartyPref extends IFXObject {
	protected PartyPref(){	
	}
	public final native Language getLanguage() /*-{
		return $wnd.cleanObject(language);
	}-*/;
	public final native void setLanguage(Language language) /*-{
		this.language = language;
	}-*/;
	public final native CommunicationMethod getCommunicationMethod() /*-{
		return $wnd.cleanObject(communicationMethod);
	}-*/;
	public final native void setCommunicationMethod(CommunicationMethod communicationMethod) /*-{
		this.communicationMethod = communicationMethod;
	}-*/;
	public final native SolicitCommunicationMeth getSolicitCommunicationMeth() /*-{
		return $wnd.cleanObject(solicitCommunicationMeth);
	}-*/;
	public final native void setSolicitCommunicationMeth(
			SolicitCommunicationMeth solicitCommunicationMeth) /*-{
		this.solicitCommunicationMeth = solicitCommunicationMeth;
	}-*/;
	public final native CurCode getCurCode() /*-{
		return $wnd.cleanObject(curCode);
	}-*/;
	public final native void setCurCode(CurCode curCode) /*-{
		this.curCode = curCode;
	}-*/;
}