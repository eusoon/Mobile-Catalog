package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.element.PartyData;

public class PersonData extends PartyData {
	PersonName PersonName;//Aggregate	Optional Repeating Person Name

	public PersonName getPersonName() {
		return PersonName;
	}

	public void setPersonName(PersonName personName) {
		PersonName = personName;
	}

}
