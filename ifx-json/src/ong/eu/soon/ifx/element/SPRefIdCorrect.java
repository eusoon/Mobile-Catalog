package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class SPRefIdCorrect extends IFXObject {
 
	SPRefIdent sPRefIdent; //NC-36	Required	Old Message Identifier. This is the <SPRefId> of the transaction that is being replaced or deleted.
	CorrectAction correctAction; //Closed Enum	Required	Correction Action.
	
	public SPRefIdent getsPRefIdent() {
		return sPRefIdent;
	}
	public void setsPRefIdent(SPRefIdent sPRefIdent) {
		this.sPRefIdent = sPRefIdent;
	}
	public CorrectAction getCorrectAction() {
		return correctAction;
	}
	public void setCorrectAction(CorrectAction correctAction) {
		this.correctAction = correctAction;
	}
}