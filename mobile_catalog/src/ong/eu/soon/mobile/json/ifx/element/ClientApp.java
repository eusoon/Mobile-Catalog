package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class ClientApp extends IFXObject {

	protected ClientApp(){
	}
	
	public final native  Org getOrg()/*-{
		return $wnd.cleanObject(this.org);
	}-*/;
	public final native  void setOrg(Org org)/*-{
		this.org = org;
	}-*/;
	public final native  Name getName()/*-{
		return $wnd.cleanObject(this.name);
	}-*/;
	public final native  void setName(Name name)/*-{
		this.name = name;
	}-*/;
	public final native  Version getVersion()/*-{
		return $wnd.cleanObject(this.version);
	}-*/;
	public final native  void setVersion(Version version)/*-{
		this.version = version;
	}-*/;
}
