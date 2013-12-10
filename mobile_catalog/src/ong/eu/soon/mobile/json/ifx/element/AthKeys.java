package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class AthKeys extends IFXObject {

	protected AthKeys(){	
	}
	
	public final native  SvcIdent getSvcIdent()/*-{
		return $wnd.cleanObject(this.svcIdent);
	}-*/;
	public final native  void setSvcIdent(SvcIdent svcIdent)/*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native  AthId getAthId()/*-{
		return $wnd.cleanObject(this.athId);
	}-*/;
	public final native  void setAthId(AthId athId)/*-{
		this.athId = athId;
	}-*/;
}
