package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class CardInfo extends IFXObject {
	
	protected CardInfo(){
	}
	
	public final native  CardNum getCardNum()/*-{
		return $wnd.cleanObject(this.cardNum);
	}-*/;
	public final native  void setCardNum(CardNum cardNum)/*-{
		this.cardNum = cardNum;
	}-*/;
	public final native  CardEmbossNum getCardEmbossNum()/*-{
		return $wnd.cleanObject(this.cardEmbossNum);
	}-*/;
	public final native  void setCardEmbossNum(CardEmbossNum cardEmbossNum)/*-{
		this.cardEmbossNum = cardEmbossNum;
	}-*/;
	public final native  CardSeqNum getCardSeqNum()/*-{
		return $wnd.cleanObject(this.cardSeqNum);
	}-*/;
	public final native  void setCardSeqNum(CardSeqNum cardSeqNum)/*-{
		this.cardSeqNum = cardSeqNum;
	}-*/;
	public final native  CardType getCardType()/*-{
		return $wnd.cleanObject(this.cardType);
	}-*/;
	public final native  void setCardType(CardType cardType)/*-{
		this.cardType = cardType;
	}-*/;
	public final native  Brand getBrand()/*-{
		return $wnd.cleanObject(this.brand);
	}-*/;
	public final native  void setBrand(Brand brand)/*-{
		this.brand = brand;
	}-*/;
	public final native  CardTechnology getCardTechnology()/*-{
		return $wnd.cleanObject(this.cardTechnology);
	}-*/;
	public final native  void setCardTechnology(CardTechnology cardTechnology)/*-{
		this.cardTechnology = cardTechnology;
	}-*/;
	public final native  IssuerName getIssuerName()/*-{
		return $wnd.cleanObject(this.issuerName);
	}-*/;
	public final native  void setIssuerName(IssuerName issuerName)/*-{
		this.issuerName = issuerName;
	}-*/;
	public final native  FIData getFIData()/*-{
		return $wnd.cleanObject(this.fIData);
	}-*/;
	public final native  void setFIData(FIData fIData)/*-{
		this.fIData = fIData;
	}-*/;
	public final native  AffinityName getAffinityName()/*-{
		return $wnd.cleanObject(this.affinityName);
	}-*/;
	public final native  void setAffinityName(AffinityName affinityName)/*-{
		this.affinityName = affinityName;
	}-*/;
	public final native  ValidFromDt getValidFromDt()/*-{
		return $wnd.cleanObject(this.validFromDt);
	}-*/;
	public final native  void setValidFromDt(ValidFromDt validFromDt)/*-{
		this.validFromDt = validFromDt;
	}-*/;
	public final native  IssueDt getIssueDt()/*-{
		return $wnd.cleanObject(this.issueDt);
	}-*/;
	public final native  void setIssueDt(IssueDt issueDt)/*-{
		this.issueDt = issueDt;
	}-*/;
	public final native  ExpDt getExpDt()/*-{
		return $wnd.cleanObject(this.expDt);
	}-*/;
	public final native  void setExpDt(ExpDt expDt)/*-{
		this.expDt = expDt;
	}-*/;
	public final native  OrigIssueDt getOrigIssueDt()/*-{
		return $wnd.cleanObject(this.origIssueDt);
	}-*/;
	public final native  void setOrigIssueDt(OrigIssueDt origIssueDt)/*-{
		this.origIssueDt = origIssueDt;
	}-*/;
	public final native  NextIssueDt getNextIssueDt()/*-{
		return $wnd.cleanObject(this.nextIssueDt);
	}-*/;
	public final native  void setNextIssueDt(NextIssueDt nextIssueDt)/*-{
		this.nextIssueDt = nextIssueDt;
	}-*/;
	public final native  CardVrfyData getCardVrfyData()/*-{
		return $wnd.cleanObject(this.cardVrfyData);
	}-*/;
	public final native  void setCardVrfyData(CardVrfyData cardVrfyData)/*-{
		this.cardVrfyData = cardVrfyData;
	}-*/;
	public final native  CardCategory getCardCategory()/*-{
		return $wnd.cleanObject(this.cardCategory);
	}-*/;
	public final native  void setCardCategory(CardCategory cardCategory)/*-{
		this.cardCategory = cardCategory;
	}-*/;
	public final native  Name getName()/*-{
		return $wnd.cleanObject(this.name);
	}-*/;
	public final native  void setName(Name name)/*-{
		this.name = name;
	}-*/;
	public final native  SecondaryName getSecondaryName()/*-{
		return $wnd.cleanObject(this.secondaryName);
	}-*/;
	public final native  void setSecondaryName(SecondaryName secondaryName)/*-{
		this.secondaryName = secondaryName;
	}-*/;
	public final native  PostAddr getPostAddr()/*-{
		return $wnd.cleanObject(this.postAddr);
	}-*/;
	public final native  void setPostAddr(PostAddr postAddr)/*-{
		this.postAddr = postAddr;
	}-*/;
	public final native  JsArray<CardTrnLimit> getCardTrnLimit()/*-{
		return $wnd.cleanObject(this.cardTrnLimit);
	}-*/;
	public final native  void setCardTrnLimit(JsArray<CardTrnLimit> cardTrnLimit)/*-{
		this.cardTrnLimit = cardTrnLimit;
	}-*/;
	public final native  AutoReissue getAutoReissue()/*-{
		return $wnd.cleanObject(this.autoReissue);
	}-*/;
	public final native  void setAutoReissue(AutoReissue autoReissue)/*-{
		this.autoReissue = autoReissue;
	}-*/;
	public final native  AutoReplacement getAutoReplacement()/*-{
		return $wnd.cleanObject(this.autoReplacement);
	}-*/;
	public final native  void setAutoReplacement(AutoReplacement autoReplacement)/*-{
		this.autoReplacement = autoReplacement;
	}-*/;
	public final native  ReplacementDt getReplacementDt()/*-{
		return $wnd.cleanObject(this.replacementDt);
	}-*/;
	public final native  void setReplacementDt(ReplacementDt replacementDt)/*-{
		this.replacementDt = replacementDt;
	}-*/;
	public final native  MemberSinceDt getMemberSinceDt()/*-{
		return $wnd.cleanObject(this.memberSinceDt);
	}-*/;
	public final native  void setMemberSinceDt(MemberSinceDt memberSinceDt)/*-{
		this.memberSinceDt = memberSinceDt;
	}-*/;
	public final native  InterchangeServiceCode getInterchangeServiceCode()/*-{
		return $wnd.cleanObject(this.interchangeServiceCode);
	}-*/;
	public final native  void setInterchangeServiceCode(
			InterchangeServiceCode interchangeServiceCode)/*-{
		this.interchangeServiceCode = interchangeServiceCode;
	}-*/;
	public final native  CardPref getCardPref()/*-{
		return $wnd.cleanObject(this.cardPref);
	}-*/;
	public final native  void setCardPref(CardPref cardPref)/*-{
		this.cardPref = cardPref;
	}-*/;
	public final native  CardValidation getCardValidation()/*-{
		return $wnd.cleanObject(this.cardValidation);
	}-*/;
	public final native  void setCardValidation(CardValidation cardValidation)/*-{
		this.cardValidation = cardValidation;
	}-*/;
	public final native  FirstUseDt getFirstUseDt()/*-{
		return $wnd.cleanObject(this.firstUseDt);
	}-*/;
	public final native  void setFirstUseDt(FirstUseDt firstUseDt)/*-{
		this.firstUseDt = firstUseDt;
	}-*/;
	public final native  CaptureDtTm getCaptureDtTm()/*-{
		return $wnd.cleanObject(this.captureDtTm);
	}-*/;
	public final native  void setCaptureDtTm(CaptureDtTm captureDtTm)/*-{
		this.captureDtTm = captureDtTm;
	}-*/;
	public final native  CaptureReason getCaptureReason()/*-{
		return $wnd.cleanObject(this.captureReason);
	}-*/;
	public final native  void setCaptureReason(CaptureReason captureReason)/*-{
		this.captureReason = captureReason;
	}-*/;
	public final native  CaptureTerminal getCaptureTerminal()/*-{
		return $wnd.cleanObject(this.captureTerminal);
	}-*/;
	public final native  void setCaptureTerminal(CaptureTerminal captureTerminal)/*-{
		this.captureTerminal = captureTerminal;
	}-*/;
	public final native  CaptureBank getCaptureBank()/*-{
		return $wnd.cleanObject(this.captureBank);
	}-*/;
	public final native  void setCaptureBank(CaptureBank captureBank)/*-{
		this.captureBank = captureBank;
	}-*/;
	public final native  CaptureLocation getCaptureLocation()/*-{
		return $wnd.cleanObject(this.captureLocation);
	}-*/;
	public final native  void setCaptureLocation(CaptureLocation captureLocation)/*-{
		this.captureLocation = captureLocation;
	}-*/;
	public final native  FraudEffectiveDt getFraudEffectiveDt()/*-{
		return $wnd.cleanObject(this.fraudEffectiveDt);
	}-*/;
	public final native  void setFraudEffectiveDt(FraudEffectiveDt fraudEffectiveDt)/*-{
		this.fraudEffectiveDt = fraudEffectiveDt;
	}-*/;
	public final native  PreviousValidFromDt getPreviousValidFromDt()/*-{
		return $wnd.cleanObject(this.previousValidFromDt);
	}-*/;
	public final native  void setPreviousValidFromDt(PreviousValidFromDt previousValidFromDt)/*-{
		this.previousValidFromDt = previousValidFromDt;
	}-*/;
	public final native  PreviousExpirationDt getPreviousExpirationDt()/*-{
		return $wnd.cleanObject(this.previousExpirationDt);
	}-*/;
	public final native  void setPreviousExpirationDt(PreviousExpirationDt previousExpirationDt)/*-{
		this.previousExpirationDt = previousExpirationDt;
	}-*/;
	public final native  NonReissueRsn getNonReissueRsn()/*-{
		return $wnd.cleanObject(this.nonReissueRsn);
	}-*/;
	public final native  void setNonReissueRsn(NonReissueRsn nonReissueRsn)/*-{
		this.nonReissueRsn = nonReissueRsn;
	}-*/;
	public final native  ActivationInd getActivationInd()/*-{
		return $wnd.cleanObject(this.activationInd);
	}-*/;
	public final native  void setActivationInd(ActivationInd activationInd)/*-{
		this.activationInd = activationInd;
	}-*/;
	public final native  ActivationMeth getActivationMeth()/*-{
		return $wnd.cleanObject(this.activationMeth);
	}-*/;
	public final native  void setActivationMeth(ActivationMeth activationMeth)/*-{
		this.activationMeth = activationMeth;
	}-*/;
	public final native  ActivationDt getActivationDt()/*-{
		return $wnd.cleanObject(this.activationDt);
	}-*/;
	public final native  void setActivationDt(ActivationDt activationDt)/*-{
		this.activationDt = activationDt;
	}-*/;
	public final native  SendtoBranchStDt getSendtoBranchStDt()/*-{
		return $wnd.cleanObject(this.sendtoBranchStDt);
	}-*/;
	public final native  void setSendtoBranchStDt(SendtoBranchStDt sendtoBranchStDt)/*-{
		this.sendtoBranchStDt = sendtoBranchStDt;
	}-*/;
	public final native  SendtoBranchEndDt getSendtoBranchEndDt()/*-{
		return $wnd.cleanObject(this.sendtoBranchEndDt);
	}-*/;
	public final native  void setSendtoBranchEndDt(SendtoBranchEndDt sendtoBranchEndDt)/*-{
		this.sendtoBranchEndDt = sendtoBranchEndDt;
	}-*/;
	public final native  CardBranch getCardBranch()/*-{
		return $wnd.cleanObject(this.cardBranch);
	}-*/;
	public final native  void setCardBranch(CardBranch cardBranch)/*-{
		this.cardBranch = cardBranch;
	}-*/;
	public final native  PreissueExpirationDt getPreissueExpirationDt()/*-{
		return $wnd.cleanObject(this.preissueExpirationDt);
	}-*/;
	public final native  void setPreissueExpirationDt(PreissueExpirationDt preissueExpirationDt)/*-{
		this.preissueExpirationDt = preissueExpirationDt;
	}-*/;
	public final native  MCCLimit getmCCLimit()/*-{
		return $wnd.cleanObject(this.mCCLimit);
	}-*/;
	public final native  void setmCCLimit(MCCLimit mCCLimit)/*-{
		this.mCCLimit = mCCLimit;
	}-*/;
	public final native  LostStolenIncident getLostStolenIncident()/*-{
		return $wnd.cleanObject(this.lostStolenIncident);
	}-*/;
	public final native  void setLostStolenIncident(LostStolenIncident lostStolenIncident)/*-{
		this.lostStolenIncident = lostStolenIncident;
	}-*/;
	public final native  CardOrderRef getCardOrderRef()/*-{
		return $wnd.cleanObject(this.cardOrderRef);
	}-*/;
	public final native  void setCardOrderRef(CardOrderRef cardOrderRef)/*-{
		this.cardOrderRef = cardOrderRef;
	}-*/;
	public final native  CardPeriodData getCardPeriodData()/*-{
		return $wnd.cleanObject(this.cardPeriodData);
	}-*/;
	public final native  void setCardPeriodData(CardPeriodData cardPeriodData)/*-{
		this.cardPeriodData = cardPeriodData;
	}-*/;
	public final native  ExceptionRpt getExceptionRpt()/*-{
		return $wnd.cleanObject(this.exceptionRpt);
	}-*/;
	public final native  void setExceptionRpt(ExceptionRpt exceptionRpt)/*-{
		this.exceptionRpt = exceptionRpt;
	}-*/;
}
