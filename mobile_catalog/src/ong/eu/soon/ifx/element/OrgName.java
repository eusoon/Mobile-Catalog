package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class OrgName extends IFXObject {
	Language language;//NC-17	Optional	Language
	//begin -xor
	Name name;//C-40	Optional	Name
	LegalName legalName;//C-96	Optional	Legal Name
	//end -xor
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public LegalName getLegalName() {
		return legalName;
	}
	public void setLegalName(LegalName legalName) {
		this.legalName = legalName;
	}
	
	
}
