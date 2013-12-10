package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class OrgName extends IFXObject {
	protected OrgName(){	
	}
	public final native Language getLanguage() /*-{
		return $wnd.cleanObject(language);
	}-*/;
	public final native void setLanguage(Language language) /*-{
		this.language = language;
	}-*/;
	public final native Name getName() /*-{
		return $wnd.cleanObject(name);
	}-*/;
	public final native void setName(Name name) /*-{
		this.name = name;
	}-*/;
	public final native LegalName getLegalName() /*-{
		return $wnd.cleanObject(legalName);
	}-*/;
	public final native void setLegalName(LegalName legalName) /*-{
		this.legalName = legalName;
	}-*/;
}