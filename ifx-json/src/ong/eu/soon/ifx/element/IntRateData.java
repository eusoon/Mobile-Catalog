package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class IntRateData extends IFXObject {

	IntRateCategory intRateCategory; //C-80	 Optional Interest Rate Category
	Desc desc;                       //C-80	Optional Description
	BasedOnCode basedOnCode;         //Open Enum Optional Source of Interest Rate Valid values include: InternalIndex, LIBOR, Prime
	BasedOnValue basedOnValue;		 //Decimal	Optional Value of BasedOnCode
	AccrualFrequency accrualFrequency; //Aggregate 	Optional Frequency at which interest is accrued.
	AccrualMethod accrualMethod; 	//C-80	Optional Method used to calculate interest accrual.
	DailyAccrual dailyAccrual; 		//Open Enum	Optional Indicates how 'daily' is determined. Valid values include: Actual365, Actual366, Standard360
	CapFrequency capFrequency; //Aggregate	 Optional Frequency at which interest is capitalized.
	IntRateType intRateType;	//Open Enum	Optional Used to indicate the type of interest rate. Valid values include: Adjustable, Fixed, Simple, SplitFloat
	CompoundInd compoundInd;	//Boolean	Optional Indicates if interest is compounded.
	EffDt effDt;				//DateTime	Optional                                         Effective Date Time
	ExpDt ExpDt;				//DateTime	Optional Expiration Date
	TierAmtType tierAmtType;	//C-80	Optional Identifies the type of amount used in the tier.
	public IntRateCategory getIntRateCategory() {
		return intRateCategory;
	}
	public void setIntRateCategory(IntRateCategory intRateCategory) {
		this.intRateCategory = intRateCategory;
	}
	public Desc getDesc() {
		return desc;
	}
	public void setDesc(Desc desc) {
		this.desc = desc;
	}
	public BasedOnCode getBasedOnCode() {
		return basedOnCode;
	}
	public void setBasedOnCode(BasedOnCode basedOnCode) {
		this.basedOnCode = basedOnCode;
	}
	public BasedOnValue getBasedOnValue() {
		return basedOnValue;
	}
	public void setBasedOnValue(BasedOnValue basedOnValue) {
		this.basedOnValue = basedOnValue;
	}
	public AccrualFrequency getAccrualFrequency() {
		return accrualFrequency;
	}
	public void setAccrualFrequency(AccrualFrequency accrualFrequency) {
		this.accrualFrequency = accrualFrequency;
	}
	public AccrualMethod getAccrualMethod() {
		return accrualMethod;
	}
	public void setAccrualMethod(AccrualMethod accrualMethod) {
		this.accrualMethod = accrualMethod;
	}
	public DailyAccrual getDailyAccrual() {
		return dailyAccrual;
	}
	public void setDailyAccrual(DailyAccrual dailyAccrual) {
		this.dailyAccrual = dailyAccrual;
	}
	public CapFrequency getCapFrequency() {
		return capFrequency;
	}
	public void setCapFrequency(CapFrequency capFrequency) {
		this.capFrequency = capFrequency;
	}
	public IntRateType getIntRateType() {
		return intRateType;
	}
	public void setIntRateType(IntRateType intRateType) {
		this.intRateType = intRateType;
	}
	public CompoundInd getCompoundInd() {
		return compoundInd;
	}
	public void setCompoundInd(CompoundInd compoundInd) {
		this.compoundInd = compoundInd;
	}
	public EffDt getEffDt() {
		return effDt;
	}
	public void setEffDt(EffDt effDt) {
		this.effDt = effDt;
	}
	public ExpDt getExpDt() {
		return ExpDt;
	}
	public void setExpDt(ExpDt expDt) {
		ExpDt = expDt;
	}
	public TierAmtType getTierAmtType() {
		return tierAmtType;
	}
	public void setTierAmtType(TierAmtType tierAmtType) {
		this.tierAmtType = tierAmtType;
	}


}