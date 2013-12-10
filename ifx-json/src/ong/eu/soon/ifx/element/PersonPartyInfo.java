package ong.eu.soon.ifx.element;

public class PersonPartyInfo extends PartyInfo {

	PersonData personData;	 //	Aggregate	 Required	 Person Data
	BirthDt birthDt;	 //	Date	 Optional	 Date of Birth
	BirthPlace birthPlace;	 //	C-96	 Optional	 Birth Place
	DeceasedDt deceasedDt;	 //	Date	 Optional	 Deceased Date
	MotherMaidenName motherMaidenName;	 //	C-40	 Optional	 Mother's Maiden Name
	SpouseName spouseName;	 //	C-40	 Optional	 Spouse's Name.
	Employment[] employment;	 //	Aggregate	 Optional Repeating	 Employment
	Gender gender;	 //	Open Enum	 Optional	 GenderValid values include: Female, Male
	MaritalStat maritalStat;	 //	Open Enum	 Optional	 Marital StatusValid values include: Divorced, Married, Single, Widow
	MilitaryRank militaryRank;	 //	C-32	 Optional	 Military Rank
	Dependents dependents;	 //	Long	 Optional	 Dependents
	OEDCode oEDCode;	 //	Open Enum	 Optional	 OED CodeValid values include: Director, Employee, Officer
	OEDInstitution oEDInstitution;	 //	Open Enum	 Optional	 Officer, Employee, Director Institution.Valid values include: AffiliateFinancialInstitution, HoldingCompany, OtherFinancialInstitution, ThisFinancialInstitution, Unknown
	OEDRelationship oEDRelationship;	 //	Open Enum	 Optional	 Officer, Empolyee, Director RelationshipValid values include: Brother, Father, Mother, Parent, Self, Sibling, SisterDefault Value: Self
	OccupationalStat occupationalStat;	 //	Open Enum	 Optional	 Occupational StatusValid values include: Child, Employed, Retired, Self-Employed, Student, Unemployed
	Nationality nationality;	 //	C-40	 Optional	 Nationality
	ImmigrationStat immigrationStat;	 //	Open Enum	 Optional	 Immigration StatusValid values include: Citizen, National, NonResidentAlien, ResidentAlien
	EducationLevel educationLevel;	 //	C-80	 Optional	 Education Level
	HomeOwnership homeOwnership;	 //	Open Enum	 Optional	 Home OwnershipValid values include: Lease, Own, Rent
	HeadofHouseHoldInd headofHouseHoldInd;	 //	Boolean	 Optional	 Head of House Hold Indicator
	
	public PersonData getPersonData() {
		return personData;
	}
	public void setPersonData(PersonData personData) {
		this.personData = personData;
	}
	public BirthDt getBirthDt() {
		return birthDt;
	}
	public void setBirthDt(BirthDt birthDt) {
		this.birthDt = birthDt;
	}
	public BirthPlace getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(BirthPlace birthPlace) {
		this.birthPlace = birthPlace;
	}
	public DeceasedDt getDeceasedDt() {
		return deceasedDt;
	}
	public void setDeceasedDt(DeceasedDt deceasedDt) {
		this.deceasedDt = deceasedDt;
	}
	public MotherMaidenName getMotherMaidenName() {
		return motherMaidenName;
	}
	public void setMotherMaidenName(MotherMaidenName motherMaidenName) {
		this.motherMaidenName = motherMaidenName;
	}
	public SpouseName getSpouseName() {
		return spouseName;
	}
	public void setSpouseName(SpouseName spouseName) {
		this.spouseName = spouseName;
	}
	public Employment[] getEmployment() {
		return employment;
	}
	public void setEmployment(Employment[] employment) {
		this.employment = employment;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public MaritalStat getMaritalStat() {
		return maritalStat;
	}
	public void setMaritalStat(MaritalStat maritalStat) {
		this.maritalStat = maritalStat;
	}
	public MilitaryRank getMilitaryRank() {
		return militaryRank;
	}
	public void setMilitaryRank(MilitaryRank militaryRank) {
		this.militaryRank = militaryRank;
	}
	public Dependents getDependents() {
		return dependents;
	}
	public void setDependents(Dependents dependents) {
		this.dependents = dependents;
	}
	public OEDCode getoEDCode() {
		return oEDCode;
	}
	public void setoEDCode(OEDCode oEDCode) {
		this.oEDCode = oEDCode;
	}
	public OEDInstitution getoEDInstitution() {
		return oEDInstitution;
	}
	public void setoEDInstitution(OEDInstitution oEDInstitution) {
		this.oEDInstitution = oEDInstitution;
	}
	public OEDRelationship getoEDRelationship() {
		return oEDRelationship;
	}
	public void setoEDRelationship(OEDRelationship oEDRelationship) {
		this.oEDRelationship = oEDRelationship;
	}
	public OccupationalStat getOccupationalStat() {
		return occupationalStat;
	}
	public void setOccupationalStat(OccupationalStat occupationalStat) {
		this.occupationalStat = occupationalStat;
	}
	public Nationality getNationality() {
		return nationality;
	}
	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}
	public ImmigrationStat getImmigrationStat() {
		return immigrationStat;
	}
	public void setImmigrationStat(ImmigrationStat immigrationStat) {
		this.immigrationStat = immigrationStat;
	}
	public EducationLevel getEducationLevel() {
		return educationLevel;
	}
	public void setEducationLevel(EducationLevel educationLevel) {
		this.educationLevel = educationLevel;
	}
	public HomeOwnership getHomeOwnership() {
		return homeOwnership;
	}
	public void setHomeOwnership(HomeOwnership homeOwnership) {
		this.homeOwnership = homeOwnership;
	}
	public HeadofHouseHoldInd getHeadofHouseHoldInd() {
		return headofHouseHoldInd;
	}
	public void setHeadofHouseHoldInd(HeadofHouseHoldInd headofHouseHoldInd) {
		this.headofHouseHoldInd = headofHouseHoldInd;
	}
}
