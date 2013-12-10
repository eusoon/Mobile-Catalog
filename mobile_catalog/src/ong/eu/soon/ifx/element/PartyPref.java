package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PartyPref extends IFXObject {
	Language language;
	CommunicationMethod communicationMethod;
	SolicitCommunicationMeth solicitCommunicationMeth;
	CurCode curCode;
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public CommunicationMethod getCommunicationMethod() {
		return communicationMethod;
	}
	public void setCommunicationMethod(CommunicationMethod communicationMethod) {
		this.communicationMethod = communicationMethod;
	}
	public SolicitCommunicationMeth getSolicitCommunicationMeth() {
		return solicitCommunicationMeth;
	}
	public void setSolicitCommunicationMeth(
			SolicitCommunicationMeth solicitCommunicationMeth) {
		this.solicitCommunicationMeth = solicitCommunicationMeth;
	}
	public CurCode getCurCode() {
		return curCode;
	}
	public void setCurCode(CurCode curCode) {
		this.curCode = curCode;
	}
}
