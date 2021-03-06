package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class ClientApp extends IFXObject {
	Org org;	 //	Identifier	 Required	 Organization. This identifies the client application manufacturer.
	Name name;	 //	C-40	 Required	 Client Application Name.
	Version version;	 //	NC-12	 Required	 Client Application Version.
	
	public Org getOrg() {
		return org;
	}
	public void setOrg(Org org) {
		this.org = org;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public Version getVersion() {
		return version;
	}
	public void setVersion(Version version) {
		this.version = version;
	}
}
