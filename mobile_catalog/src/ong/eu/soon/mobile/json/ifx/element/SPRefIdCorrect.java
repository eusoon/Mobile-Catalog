package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class SPRefIdCorrect extends IFXObject {

	protected SPRefIdCorrect(){
	}
	
	public final native  SPRefIdent getsPRefIdent()/*-{
		return $wnd.cleanObject(this.sPRefIdent);
	}-*/;
	public final native  void setsPRefIdent(SPRefIdent sPRefIdent)/*-{
		this.sPRefIdent = sPRefIdent;
	}-*/;
	public final native  CorrectAction getCorrectAction()/*-{
		return $wnd.cleanObject(this.correctAction);
	}-*/;
	public final native  void setCorrectAction(CorrectAction correctAction)/*-{
		this.correctAction = correctAction;
	}-*/;
}