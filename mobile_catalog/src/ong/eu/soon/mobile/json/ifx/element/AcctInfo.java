package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public  class AcctInfo extends IFXObject {
	
	protected AcctInfo(){	
	}
	
	public final native  CurCode getCurCode()/*-{
		return $wnd.cleanObject(this.curCode);
	}-*/;
	public final native  void setCurCode(CurCode curCode)/*-{
		this.curCode = curCode;
	}-*/;
	public final native  Desc getDesc()/*-{
		return $wnd.cleanObject(this.desc);
	}-*/;
	public final native  void setDesc(Desc desc)/*-{
		this.desc = desc;
	}-*/;
	public final native  JsArray<AcctIdent> getAcctIdent()/*-{
		return $wnd.cleanObject(this.acctIdent);
	}-*/;
	public final native  void setAcctIdent(JsArray<AcctIdent> acctIdent)/*-{
		this.acctIdent = acctIdent;
	}-*/;
	public final native  BBAN getBBAN()/*-{
		return $wnd.cleanObject(this.bBAN);
	}-*/;
	public final native  void setBBAN(BBAN bBAN)/*-{
		this.bBAN = bBAN;
	}-*/;
	public final native  IBAN getIBAN()/*-{
		return $wnd.cleanObject(this.iBAN);
	}-*/;
	public final native  void setIBAN(IBAN iBAN)/*-{
		this.iBAN = iBAN;
	}-*/;
	public final native  UPIC getUPIC()/*-{
		return $wnd.cleanObject(this.uPIC);
	}-*/;
	public final native  void setUPIC(UPIC uPIC)/*-{
		this.uPIC = uPIC;
	}-*/;
	public final native  CLABE getCLABE()/*-{
		return $wnd.cleanObject(this.cLABE);
	}-*/;
	public final native  void setCLABE(CLABE cLABE)/*-{
		this.cLABE = cLABE;
	}-*/;
	public final native  FIData getFIData()/*-{
		return $wnd.cleanObject(this.fIData);
	}-*/;
	public final native  void setFIData(FIData fIData)/*-{
		this.fIData = fIData;
	}-*/;
	public final native  AcctUse getAcctUse()/*-{
		return $wnd.cleanObject(this.acctUse);
	}-*/;
	public final native  void setAcctUse(AcctUse acctUse)/*-{
		this.acctUse = acctUse;
	}-*/;
	public final native  Term getTerm()/*-{
		return $wnd.cleanObject(this.term);
	}-*/;
	public final native  void setTerm(Term term)/*-{
		this.term = term;
	}-*/;
	public final native  MaturityDt getMaturityDt()/*-{
		return $wnd.cleanObject(this.maturityDt);
	}-*/;
	public final native  void setMaturityDt(MaturityDt maturityDt)/*-{
		this.maturityDt = maturityDt;
	}-*/;
	public final native  JsArray<IntRateData> getIntRateData()/*-{
		return $wnd.cleanObject(this.intRateData);
	}-*/;
	public final native  void setIntRateData(JsArray<IntRateData> intRateData)/*-{
		this.intRateData = intRateData;
	}-*/;
	public final native  TaxWithholding getTaxWithholding()/*-{
		return $wnd.cleanObject(this.taxWithholding);
	}-*/;
	public final native  void setTaxWithholding(TaxWithholding taxWithholding)/*-{
		this.taxWithholding = taxWithholding;
	}-*/;
	public final native  TaxCountry getTaxCountry()/*-{
		return $wnd.cleanObject(this.taxCountry);
	}-*/;
	public final native  void setTaxCountry(TaxCountry taxCountry)/*-{
		this.taxCountry = taxCountry;
	}-*/;
	public final native  TaxProvince getTaxProvince()/*-{
		return $wnd.cleanObject(this.taxProvince);
	}-*/;
	public final native  void setTaxProvince(TaxProvince taxProvince)/*-{
		this.taxProvince = taxProvince;
	}-*/;
	public final native  ProductIdent getProductIdent()/*-{
		return $wnd.cleanObject(this.productIdent);
	}-*/;
	public final native  void setProductIdent(ProductIdent productIdent)/*-{
		this.productIdent = productIdent;
	}-*/;
	public final native  DaysCall getDaysCall()/*-{
		return $wnd.cleanObject(this.daysCall);
	}-*/;
	public final native  void setDaysCall(DaysCall daysCall)/*-{
		this.daysCall = daysCall;
	}-*/;
	public final native  InitialAmount getInitialAmount()/*-{
		return $wnd.cleanObject(this.initialAmount);
	}-*/;
	public final native  void setInitialAmount(InitialAmount initialAmount)/*-{
		this.initialAmount = initialAmount;
	}-*/;
	public final native  AcctType getAcctType()/*-{
		return $wnd.cleanObject(this.acctType);
	}-*/;
	public final native  void setAcctType(AcctType acctType)/*-{
		this.acctType = acctType;
	}-*/;
	public final native String getAcctTaxType()/*-{
		return $wnd.cleanString(this.acctTaxType);
	}-*/;
	public final native  void setAcctTaxType(AcctTaxType acctTaxType)/*-{
		this.acctTaxType = acctTaxType;
	}-*/;
	public final native  AcctTitle getAcctTitle()/*-{
		return $wnd.cleanObject(this.acctTitle);
	}-*/;
	public final native  void setAcctTitle(AcctTitle acctTitle)/*-{
		this.acctTitle = acctTitle;
	}-*/;
	public final native  Memo getMemo()/*-{
		return $wnd.cleanObject(this.memo);
	}-*/;
	public final native  void setMemo(Memo memo)/*-{
		this.memo = memo;
	}-*/;
	public final native  OpenDt getOpenDt()/*-{
		return $wnd.cleanObject(this.openDt);
	}-*/;
	public final native  void setOpenDt(OpenDt openDt)/*-{
		this.openDt = openDt;
	}-*/;
	public final native  ClosedDt getClosedDt()/*-{
		return $wnd.cleanObject(this.closedDt);
	}-*/;
	public final native  void setClosedDt(ClosedDt closedDt)/*-{
		this.closedDt = closedDt;
	}-*/;
	public final native  JsArray<RelationshipMgr> getRelationshipMgr()/*-{
		return $wnd.cleanObject(this.relationshipMgr);
	}-*/;
	public final native  void setRelationshipMgr(JsArray<RelationshipMgr> relationshipMgr)/*-{
		this.relationshipMgr = relationshipMgr;
	}-*/;
	public final native  PostAddr getPostAddr()/*-{
		return $wnd.cleanObject(this.postAddr);
	}-*/;
	public final native  void setPostAddr(PostAddr postAddr)/*-{
		this.postAddr = postAddr;
	}-*/;
	public final native  JsArray<MktgMaterial> getMktgMaterial()/*-{
		return $wnd.cleanObject(this.mktgMaterial);
	}-*/;
	public final native  void setMktgMaterial(JsArray<MktgMaterial> mktgMaterial)/*-{
		this.mktgMaterial = mktgMaterial;
	}-*/;
	public final native  JsArray<AcctBal> getAcctBal()/*-{
		return $wnd.cleanObject(this.acctBal);
	}-*/;
	public final native  void setAcctBal(JsArray<AcctBal> acctBal)/*-{
		this.acctBal = acctBal;
	}-*/;
	public final native  JsArray<AcctPeriodData> getAcctPeriodData()/*-{
		return $wnd.cleanObject(this.acctPeriodData);
	}-*/;
	public final native  void setAcctPeriodData(JsArray<AcctPeriodData> acctPeriodData)/*-{
		this.acctPeriodData = acctPeriodData;
	}-*/;
	public final native  GraceEndDt getGraceEndDt()/*-{
		return $wnd.cleanObject(this.graceEndDt);
	}-*/;
	public final native  void setGraceEndDt(GraceEndDt graceEndDt)/*-{
		this.graceEndDt = graceEndDt;
	}-*/;
	public final native  RemainingPmtCount getRemainingPmtCount()/*-{
		return $wnd.cleanObject(this.remainingPmtCount);
	}-*/;
	public final native  void setRemainingPmtCount(RemainingPmtCount remainingPmtCount)/*-{
		this.remainingPmtCount = remainingPmtCount;
	}-*/;
	public final native  JsArray<AcctTrnLimit> getAcctTrnLimit()/*-{
		return $wnd.cleanObject(this.acctTrnLimit);
	}-*/;
	public final native  void setAcctTrnLimit(JsArray<AcctTrnLimit> acctTrnLimit)/*-{
		this.acctTrnLimit = acctTrnLimit;
	}-*/;
	public final native  JsArray<TaxWithheldData> getTaxWithheldData()/*-{
		return $wnd.cleanObject(this.taxWithheldData);
	}-*/;
	public final native  void setTaxWithheldData(JsArray<TaxWithheldData> taxWithheldData)/*-{
		this.taxWithheldData = taxWithheldData;
	}-*/;
	public final native  DepAcctData getDepAcctData()/*-{
		return $wnd.cleanObject(this.depAcctData);
	}-*/;
	public final native  void setDepAcctData(DepAcctData depAcctData)/*-{
		this.depAcctData = depAcctData;
	}-*/;
	public final native  CreditAcctData getCreditAcctData()/*-{
		return $wnd.cleanObject(this.creditAcctData);
	}-*/;
	public final native  void setCreditAcctData(CreditAcctData creditAcctData)/*-{
		this.creditAcctData = creditAcctData;
	}-*/;
	public final native  JsArray<AcctPricing> getAcctPricing()/*-{
		return $wnd.cleanObject(this.acctPricing);
	}-*/;
	public final native  void setAcctPricing(JsArray<AcctPricing> acctPricing)/*-{
		this.acctPricing = acctPricing;
	}-*/;
	public final native  CorporateAcctData getCorporateAcctData()/*-{
		return $wnd.cleanObject(this.corporateAcctData);
	}-*/;
	public final native  void setCorporateAcctData(CorporateAcctData corporateAcctData)/*-{
		this.corporateAcctData = corporateAcctData;
	}-*/;
	public final native  JsArray<CorrespondDelivery> getCorrespondDelivery()/*-{
		return $wnd.cleanObject(this.correspondDelivery);
	}-*/;
	public final native  void setCorrespondDelivery(JsArray<CorrespondDelivery> correspondDelivery)/*-{
		this.correspondDelivery = correspondDelivery;
	}-*/;
	public final native  JsArray<Segmentation> getSegmentation()/*-{
		return $wnd.cleanObject(this.segmentation);
	}-*/;
	public final native  void setSegmentation(JsArray<Segmentation> segmentation)/*-{
		this.segmentation = segmentation;
	}-*/;
	public final native  AcctApplIdent getAcctApplIdent()/*-{
		return $wnd.cleanObject(this.acctApplIdent);
	}-*/;
	public final native  void setAcctApplIdent(AcctApplIdent acctApplIdent)/*-{
		this.acctApplIdent = acctApplIdent;
	}-*/;
	public final native  CampaignIdent getCampaignIdent()/*-{
		return $wnd.cleanObject(this.campaignIdent);
	}-*/;
	public final native  void setCampaignIdent(CampaignIdent campaignIdent)/*-{
		this.campaignIdent = campaignIdent;
	}-*/;
	public final native  Ownership getOwnership()/*-{
		return $wnd.cleanObject(this.ownership);
	}-*/;
	public final native  void setOwnership(Ownership ownership)/*-{
		this.ownership = ownership;
	}-*/;
	public final native  JsArray<StmtTimeFrame> getStmtTimeFrame()/*-{
		return $wnd.cleanObject(this.stmtTimeFrame);
	}-*/;
	public final native  void setStmtTimeFrame(JsArray<StmtTimeFrame> stmtTimeFrame)/*-{
		this.stmtTimeFrame = stmtTimeFrame;
	}-*/;
	public final native  JsArray<NextStmtData> getNextStmtData()/*-{
		return $wnd.cleanObject(this.nextStmtData);
	}-*/;
	public final native  void setNextStmtData(JsArray<NextStmtData> nextStmtData)/*-{
		this.nextStmtData = nextStmtData;
	}-*/;
}
