package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CardInfo extends IFXObject {
	
	CardNum cardNum;	 //	NC-32	 Required	 Card Number
	CardEmbossNum cardEmbossNum;	 //	NC-32	 Optional	 Embossed Card Number
	CardSeqNum cardSeqNum;	 //	NC-3	 Optional	 Card Sequence Number
	CardType cardType;	 //	Open Enum	 Optional	 Card TypeValid values include: ATM, Credit, Debit, Identification, Loyalty, Multifunction, PrepaidDefault Value: Debit
	Brand brand;	 //	Open Enum	 Optional	 Card BrandValid values include: AmEx, CarteBancaire, Discover, JCB, MasterCard, PrivateLabel, VISA
	CardTechnology cardTechnology;	 //	Open Enum	 Optional	 Card TechnologyValid values include: ICCCard, MagStripeCard
	IssuerName issuerName;	 //	C-80	 Optional	 Card Issuer Name
	FIData fIData;	 //	Aggregate	 Optional	 Financial Institution Data Aggregate
	AffinityName affinityName;	 //	C-40	 Optional	 Affinity Name
	ValidFromDt validFromDt;	 //	DateTime	 Optional	 Valid From Date
	IssueDt issueDt;	 //	DateTime	 Optional	 Issue Date
	ExpDt expDt;	 //	DateTime	 Optional	 Expiration Date
	OrigIssueDt origIssueDt;	 //	DateTime	 Optional	 Original Issue Date
	NextIssueDt nextIssueDt;	 //	DateTime	 Optional	 Next Issue Date
	CardVrfyData cardVrfyData;	 //	NC-16	 Optional	 Card Verification Data
	CardCategory cardCategory;	 //	Open Enum	 Optional	 Card CategoryValid values include: Classic, Gold, Platinum
	Name name;	 //	C-40	 Optional	 Name
	SecondaryName secondaryName;	 //	C-40	 Optional	 Secondary Name
	PostAddr postAddr;	 //	Aggregate	 Optional	 Postal Address
	CardTrnLimit[] cardTrnLimit;	 //	Aggregate	 Optional Repeating	 Card Transaction Limit
	AutoReissue autoReissue;	 //	Boolean	 Optional	 Auto Reissue
	AutoReplacement autoReplacement;	 //	Boolean	 Optional	 Auto Replacement
	ReplacementDt replacementDt;	 //	DateTime	 Optional	 Replacement Date
	MemberSinceDt memberSinceDt;	 //	DateTime	 Optional	 Member Since Date
	InterchangeServiceCode interchangeServiceCode;	 //	Open Enum	 Optional	 Interchange Service Code
	CardPref cardPref;	 //	Aggregate	 Optional	 Card Preference
	CardValidation cardValidation;	 //	C-20	 Optional	 Card Validation
	FirstUseDt firstUseDt;	 //	DateTime	 Optional	 First Use Date
	CaptureDtTm captureDtTm;	 //	DateTime	 Optional	 Capture Date Time
	CaptureReason captureReason;	 //	C-20	 Optional	 Capture Reason
	CaptureTerminal captureTerminal;	 //	C-10	 Optional	 Capture Terminal
	CaptureBank captureBank;	 //	C-32	 Optional	 Capture Bank
	CaptureLocation captureLocation;	 //	C-40	 Optional	 Capture Location
	FraudEffectiveDt fraudEffectiveDt;	 //	DateTime	 Optional	 Fraud Effective Date
	PreviousValidFromDt previousValidFromDt;	 //	DateTime	 Optional	 Previous Valid From Date
	PreviousExpirationDt previousExpirationDt;	 //	DateTime	 Optional	 Previous Expiration Date
	NonReissueRsn nonReissueRsn;	 //	Open Enum	 Optional	 Non Reissue ReasonValid values include: Delinquent, Inactive, Overline, Status
	ActivationInd activationInd;	 //	Boolean	 Optional	 Activation Indicator
	ActivationMeth activationMeth;	 //	Open Enum	 Optional	 Activation MethodValid values include: CSR, IVR, Web
	ActivationDt activationDt;	 //	DateTime	 Optional	 Activation Date
	SendtoBranchStDt sendtoBranchStDt;//DateTime	Optional	Send to Branch Start Date
	SendtoBranchEndDt sendtoBranchEndDt;//DateTime	Optional	Send to Branch End Date
	CardBranch cardBranch; //C-32	Optional	Card Branch
	PreissueExpirationDt preissueExpirationDt;//DateTime	Optional	Preissue Expiration Date
	MCCLimit mCCLimit;//C-10	Optional	MCC Limit
	LostStolenIncident lostStolenIncident;//Aggregate	Optional	Lost Stolen Incident
	CardOrderRef cardOrderRef;//Aggregate	Optional	Card Order Reference Aggregate
	CardPeriodData cardPeriodData;//Aggregate	Optional	Card Period Data
	ExceptionRpt exceptionRpt;//Aggregate	Optional	Exception Report Aggregate
	
	public CardNum getCardNum() {
		return cardNum;
	}
	public void setCardNum(CardNum cardNum) {
		this.cardNum = cardNum;
	}
	public CardEmbossNum getCardEmbossNum() {
		return cardEmbossNum;
	}
	public void setCardEmbossNum(CardEmbossNum cardEmbossNum) {
		this.cardEmbossNum = cardEmbossNum;
	}
	public CardSeqNum getCardSeqNum() {
		return cardSeqNum;
	}
	public void setCardSeqNum(CardSeqNum cardSeqNum) {
		this.cardSeqNum = cardSeqNum;
	}
	public CardType getCardType() {
		return cardType;
	}
	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public CardTechnology getCardTechnology() {
		return cardTechnology;
	}
	public void setCardTechnology(CardTechnology cardTechnology) {
		this.cardTechnology = cardTechnology;
	}
	public IssuerName getIssuerName() {
		return issuerName;
	}
	public void setIssuerName(IssuerName issuerName) {
		this.issuerName = issuerName;
	}
	public FIData getfIData() {
		return fIData;
	}
	public void setfIData(FIData fIData) {
		this.fIData = fIData;
	}
	public AffinityName getAffinityName() {
		return affinityName;
	}
	public void setAffinityName(AffinityName affinityName) {
		this.affinityName = affinityName;
	}
	public ValidFromDt getValidFromDt() {
		return validFromDt;
	}
	public void setValidFromDt(ValidFromDt validFromDt) {
		this.validFromDt = validFromDt;
	}
	public IssueDt getIssueDt() {
		return issueDt;
	}
	public void setIssueDt(IssueDt issueDt) {
		this.issueDt = issueDt;
	}
	public ExpDt getExpDt() {
		return expDt;
	}
	public void setExpDt(ExpDt expDt) {
		this.expDt = expDt;
	}
	public OrigIssueDt getOrigIssueDt() {
		return origIssueDt;
	}
	public void setOrigIssueDt(OrigIssueDt origIssueDt) {
		this.origIssueDt = origIssueDt;
	}
	public NextIssueDt getNextIssueDt() {
		return nextIssueDt;
	}
	public void setNextIssueDt(NextIssueDt nextIssueDt) {
		this.nextIssueDt = nextIssueDt;
	}
	public CardVrfyData getCardVrfyData() {
		return cardVrfyData;
	}
	public void setCardVrfyData(CardVrfyData cardVrfyData) {
		this.cardVrfyData = cardVrfyData;
	}
	public CardCategory getCardCategory() {
		return cardCategory;
	}
	public void setCardCategory(CardCategory cardCategory) {
		this.cardCategory = cardCategory;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public SecondaryName getSecondaryName() {
		return secondaryName;
	}
	public void setSecondaryName(SecondaryName secondaryName) {
		this.secondaryName = secondaryName;
	}
	public PostAddr getPostAddr() {
		return postAddr;
	}
	public void setPostAddr(PostAddr postAddr) {
		this.postAddr = postAddr;
	}
	public CardTrnLimit[] getCardTrnLimit() {
		return cardTrnLimit;
	}
	public void setCardTrnLimit(CardTrnLimit[] cardTrnLimit) {
		this.cardTrnLimit = cardTrnLimit;
	}
	public AutoReissue getAutoReissue() {
		return autoReissue;
	}
	public void setAutoReissue(AutoReissue autoReissue) {
		this.autoReissue = autoReissue;
	}
	public AutoReplacement getAutoReplacement() {
		return autoReplacement;
	}
	public void setAutoReplacement(AutoReplacement autoReplacement) {
		this.autoReplacement = autoReplacement;
	}
	public ReplacementDt getReplacementDt() {
		return replacementDt;
	}
	public void setReplacementDt(ReplacementDt replacementDt) {
		this.replacementDt = replacementDt;
	}
	public MemberSinceDt getMemberSinceDt() {
		return memberSinceDt;
	}
	public void setMemberSinceDt(MemberSinceDt memberSinceDt) {
		this.memberSinceDt = memberSinceDt;
	}
	public InterchangeServiceCode getInterchangeServiceCode() {
		return interchangeServiceCode;
	}
	public void setInterchangeServiceCode(
			InterchangeServiceCode interchangeServiceCode) {
		this.interchangeServiceCode = interchangeServiceCode;
	}
	public CardPref getCardPref() {
		return cardPref;
	}
	public void setCardPref(CardPref cardPref) {
		this.cardPref = cardPref;
	}
	public CardValidation getCardValidation() {
		return cardValidation;
	}
	public void setCardValidation(CardValidation cardValidation) {
		this.cardValidation = cardValidation;
	}
	public FirstUseDt getFirstUseDt() {
		return firstUseDt;
	}
	public void setFirstUseDt(FirstUseDt firstUseDt) {
		this.firstUseDt = firstUseDt;
	}
	public CaptureDtTm getCaptureDtTm() {
		return captureDtTm;
	}
	public void setCaptureDtTm(CaptureDtTm captureDtTm) {
		this.captureDtTm = captureDtTm;
	}
	public CaptureReason getCaptureReason() {
		return captureReason;
	}
	public void setCaptureReason(CaptureReason captureReason) {
		this.captureReason = captureReason;
	}
	public CaptureTerminal getCaptureTerminal() {
		return captureTerminal;
	}
	public void setCaptureTerminal(CaptureTerminal captureTerminal) {
		this.captureTerminal = captureTerminal;
	}
	public CaptureBank getCaptureBank() {
		return captureBank;
	}
	public void setCaptureBank(CaptureBank captureBank) {
		this.captureBank = captureBank;
	}
	public CaptureLocation getCaptureLocation() {
		return captureLocation;
	}
	public void setCaptureLocation(CaptureLocation captureLocation) {
		this.captureLocation = captureLocation;
	}
	public FraudEffectiveDt getFraudEffectiveDt() {
		return fraudEffectiveDt;
	}
	public void setFraudEffectiveDt(FraudEffectiveDt fraudEffectiveDt) {
		this.fraudEffectiveDt = fraudEffectiveDt;
	}
	public PreviousValidFromDt getPreviousValidFromDt() {
		return previousValidFromDt;
	}
	public void setPreviousValidFromDt(PreviousValidFromDt previousValidFromDt) {
		this.previousValidFromDt = previousValidFromDt;
	}
	public PreviousExpirationDt getPreviousExpirationDt() {
		return previousExpirationDt;
	}
	public void setPreviousExpirationDt(PreviousExpirationDt previousExpirationDt) {
		this.previousExpirationDt = previousExpirationDt;
	}
	public NonReissueRsn getNonReissueRsn() {
		return nonReissueRsn;
	}
	public void setNonReissueRsn(NonReissueRsn nonReissueRsn) {
		this.nonReissueRsn = nonReissueRsn;
	}
	public ActivationInd getActivationInd() {
		return activationInd;
	}
	public void setActivationInd(ActivationInd activationInd) {
		this.activationInd = activationInd;
	}
	public ActivationMeth getActivationMeth() {
		return activationMeth;
	}
	public void setActivationMeth(ActivationMeth activationMeth) {
		this.activationMeth = activationMeth;
	}
	public ActivationDt getActivationDt() {
		return activationDt;
	}
	public void setActivationDt(ActivationDt activationDt) {
		this.activationDt = activationDt;
	}
	public SendtoBranchStDt getSendtoBranchStDt() {
		return sendtoBranchStDt;
	}
	public void setSendtoBranchStDt(SendtoBranchStDt sendtoBranchStDt) {
		this.sendtoBranchStDt = sendtoBranchStDt;
	}
	public SendtoBranchEndDt getSendtoBranchEndDt() {
		return sendtoBranchEndDt;
	}
	public void setSendtoBranchEndDt(SendtoBranchEndDt sendtoBranchEndDt) {
		this.sendtoBranchEndDt = sendtoBranchEndDt;
	}
	public CardBranch getCardBranch() {
		return cardBranch;
	}
	public void setCardBranch(CardBranch cardBranch) {
		this.cardBranch = cardBranch;
	}
	public PreissueExpirationDt getPreissueExpirationDt() {
		return preissueExpirationDt;
	}
	public void setPreissueExpirationDt(PreissueExpirationDt preissueExpirationDt) {
		this.preissueExpirationDt = preissueExpirationDt;
	}
	public MCCLimit getmCCLimit() {
		return mCCLimit;
	}
	public void setmCCLimit(MCCLimit mCCLimit) {
		this.mCCLimit = mCCLimit;
	}
	public LostStolenIncident getLostStolenIncident() {
		return lostStolenIncident;
	}
	public void setLostStolenIncident(LostStolenIncident lostStolenIncident) {
		this.lostStolenIncident = lostStolenIncident;
	}
	public CardOrderRef getCardOrderRef() {
		return cardOrderRef;
	}
	public void setCardOrderRef(CardOrderRef cardOrderRef) {
		this.cardOrderRef = cardOrderRef;
	}
	public CardPeriodData getCardPeriodData() {
		return cardPeriodData;
	}
	public void setCardPeriodData(CardPeriodData cardPeriodData) {
		this.cardPeriodData = cardPeriodData;
	}
	public ExceptionRpt getExceptionRpt() {
		return exceptionRpt;
	}
	public void setExceptionRpt(ExceptionRpt exceptionRpt) {
		this.exceptionRpt = exceptionRpt;
	}
}
