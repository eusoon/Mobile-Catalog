package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PersonName extends IFXObject {
	Language language;//NC-17	Optional Language
	FullName fullName;//C-96	Required Full Name
	FamilyName[] familyName;//C-40	Optional Repeating Family Name
	GivenName[] givenName;//C-40	Optional Repeating Given Name
	MiddleName[] middleName;//C-40	Optional Repeating Middle Name
	NamePrefix[] namePrefix;//C-8	Optional Repeating Person Name Prefix
	NameSuffix[] nameSuffix;//C-40	Optional Repeating Name Suffix
	MaternalName[] maternalName;//C-40	Optional Repeating Maternal Name
	PaternalName[] paternalName;//C-40	Optional Repeating Paternal Name
	MarriedName[] marriedName;//C-40	Optional Repeating Married Name
	PreferredName preferredName;//C-96	Optional Preferred Name
	LegalNameInd legalNameInd;//Boolean	Optional Legal Name Indicator
	PriorNameInd priorNameInd;//Boolean	Optional Prior Name Indicator
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public FullName getFullName() {
		return fullName;
	}
	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}
	public FamilyName[] getFamilyName() {
		return familyName;
	}
	public void setFamilyName(FamilyName[] familyName) {
		this.familyName = familyName;
	}
	public GivenName[] getGivenName() {
		return givenName;
	}
	public void setGivenName(GivenName[] givenName) {
		this.givenName = givenName;
	}
	public MiddleName[] getMiddleName() {
		return middleName;
	}
	public void setMiddleName(MiddleName[] middleName) {
		this.middleName = middleName;
	}
	public NamePrefix[] getNamePrefix() {
		return namePrefix;
	}
	public void setNamePrefix(NamePrefix[] namePrefix) {
		this.namePrefix = namePrefix;
	}
	public NameSuffix[] getNameSuffix() {
		return nameSuffix;
	}
	public void setNameSuffix(NameSuffix[] nameSuffix) {
		this.nameSuffix = nameSuffix;
	}
	public MaternalName[] getMaternalName() {
		return maternalName;
	}
	public void setMaternalName(MaternalName[] maternalName) {
		this.maternalName = maternalName;
	}
	public PaternalName[] getPaternalName() {
		return paternalName;
	}
	public void setPaternalName(PaternalName[] paternalName) {
		this.paternalName = paternalName;
	}
	public MarriedName[] getMarriedName() {
		return marriedName;
	}
	public void setMarriedName(MarriedName[] marriedName) {
		this.marriedName = marriedName;
	}
	public PreferredName getPreferredName() {
		return preferredName;
	}
	public void setPreferredName(PreferredName preferredName) {
		this.preferredName = preferredName;
	}
	public LegalNameInd getLegalNameInd() {
		return legalNameInd;
	}
	public void setLegalNameInd(LegalNameInd legalNameInd) {
		this.legalNameInd = legalNameInd;
	}
	public PriorNameInd getPriorNameInd() {
		return priorNameInd;
	}
	public void setPriorNameInd(PriorNameInd priorNameInd) {
		this.priorNameInd = priorNameInd;
	}
	

}
