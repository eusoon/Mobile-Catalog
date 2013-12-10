package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class DiscIdent extends IFXObject{

	protected DiscIdent(){
	}
	
	public final native  DiscName getDiscName()/*-{
		return $wnd.cleanObject(this.discName);
	}-*/;
	public final native  void setDiscName(DiscName discName)/*-{
		this.discName = discName;
	}-*/;
	public final native  Version getVersion()/*-{
		return $wnd.cleanObject(this.version);
	}-*/;
	public final native  void setVersion(Version version)/*-{
		this.version = version;
	}-*/;
}
