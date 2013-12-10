package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.element.PartyData;

public class PersonData extends PartyData {
	protected PersonData(){	
	}
	public final native PersonName getPersonName() /*-{
		return $wnd.cleanObject(PersonName);
	}-*/;

	public final native void setPersonName(PersonName personName) /*-{
		PersonName = personName;
	}-*/;

}