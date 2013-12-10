package ong.eu.soon.mobile.json.ifx.element;

import com.google.gwt.core.client.JsArray;

public class PersonPartyInfo extends PartyInfo {
	protected PersonPartyInfo(){	
	}
	public final native PersonData getPersonData() /*-{
		return $wnd.cleanObject(personData);
	}-*/;
	public final native void setPersonData(PersonData personData) /*-{
		this.personData = personData;
	}-*/;
	public final native BirthDt getBirthDt() /*-{
		return $wnd.cleanObject(birthDt);
	}-*/;
	public final native void setBirthDt(BirthDt birthDt) /*-{
		this.birthDt = birthDt;
	}-*/;
	public final native BirthPlace getBirthPlace() /*-{
		return $wnd.cleanObject(birthPlace);
	}-*/;
	public final native void setBirthPlace(BirthPlace birthPlace) /*-{
		this.birthPlace = birthPlace;
	}-*/;
	public final native DeceasedDt getDeceasedDt() /*-{
		return $wnd.cleanObject(deceasedDt);
	}-*/;
	public final native void setDeceasedDt(DeceasedDt deceasedDt) /*-{
		this.deceasedDt = deceasedDt;
	}-*/;
	public final native MotherMaidenName getMotherMaidenName() /*-{
		return $wnd.cleanObject(motherMaidenName);
	}-*/;
	public final native void setMotherMaidenName(MotherMaidenName motherMaidenName) /*-{
		this.motherMaidenName = motherMaidenName;
	}-*/;
	public final native SpouseName getSpouseName() /*-{
		return $wnd.cleanObject(spouseName);
	}-*/;
	public final native void setSpouseName(SpouseName spouseName) /*-{
		this.spouseName = spouseName;
	}-*/;
	public final native JsArray<Employment> getEmployment() /*-{
		return $wnd.cleanObject(employment);
	}-*/;
	public final native void setEmployment(JsArray<Employment> employment) /*-{
		this.employment = employment;
	}-*/;
	public final native Gender getGender() /*-{
		return $wnd.cleanObject(gender);
	}-*/;
	public final native void setGender(Gender gender) /*-{
		this.gender = gender;
	}-*/;
	public final native MaritalStat getMaritalStat() /*-{
		return $wnd.cleanObject(maritalStat);
	}-*/;
	public final native void setMaritalStat(MaritalStat maritalStat) /*-{
		this.maritalStat = maritalStat;
	}-*/;
	public final native MilitaryRank getMilitaryRank() /*-{
		return $wnd.cleanObject(militaryRank);
	}-*/;
	public final native void setMilitaryRank(MilitaryRank militaryRank) /*-{
		this.militaryRank = militaryRank;
	}-*/;
	public final native Dependents getDependents() /*-{
		return $wnd.cleanObject(dependents);
	}-*/;
	public final native void setDependents(Dependents dependents) /*-{
		this.dependents = dependents;
	}-*/;
	public final native OEDCode getoEDCode() /*-{
		return $wnd.cleanObject(oEDCode);
	}-*/;
	public final native void setoEDCode(OEDCode oEDCode) /*-{
		this.oEDCode = oEDCode;
	}-*/;
	public final native OEDInstitution getoEDInstitution() /*-{
		return $wnd.cleanObject(oEDInstitution);
	}-*/;
	public final native void setoEDInstitution(OEDInstitution oEDInstitution) /*-{
		this.oEDInstitution = oEDInstitution;
	}-*/;
	public final native OEDRelationship getoEDRelationship() /*-{
		return $wnd.cleanObject(oEDRelationship);
	}-*/;
	public final native void setoEDRelationship(OEDRelationship oEDRelationship) /*-{
		this.oEDRelationship = oEDRelationship;
	}-*/;
	public final native OccupationalStat getOccupationalStat() /*-{
		return $wnd.cleanObject(occupationalStat);
	}-*/;
	public final native void setOccupationalStat(OccupationalStat occupationalStat) /*-{
		this.occupationalStat = occupationalStat;
	}-*/;
	public final native Nationality getNationality() /*-{
		return $wnd.cleanObject(nationality);
	}-*/;
	public final native void setNationality(Nationality nationality) /*-{
		this.nationality = nationality;
	}-*/;
	public final native ImmigrationStat getImmigrationStat() /*-{
		return $wnd.cleanObject(immigrationStat);
	}-*/;
	public final native void setImmigrationStat(ImmigrationStat immigrationStat) /*-{
		this.immigrationStat = immigrationStat;
	}-*/;
	public final native EducationLevel getEducationLevel() /*-{
		return $wnd.cleanObject(educationLevel);
	}-*/;
	public final native void setEducationLevel(EducationLevel educationLevel) /*-{
		this.educationLevel = educationLevel;
	}-*/;
	public final native HomeOwnership getHomeOwnership() /*-{
		return $wnd.cleanObject(homeOwnership);
	}-*/;
	public final native void setHomeOwnership(HomeOwnership homeOwnership) /*-{
		this.homeOwnership = homeOwnership;
	}-*/;
	public final native HeadofHouseHoldInd getHeadofHouseHoldInd() /*-{
		return $wnd.cleanObject(headofHouseHoldInd);
	}-*/;
	public final native void setHeadofHouseHoldInd(HeadofHouseHoldInd headofHouseHoldInd) /*-{
		this.headofHouseHoldInd = headofHouseHoldInd;
	}-*/;
}
