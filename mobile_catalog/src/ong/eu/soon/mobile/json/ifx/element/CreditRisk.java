package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public   class CreditRisk extends IFXObject {
	
	protected CreditRisk(){	
	}
	
	public final native  RiskCategory getRiskCategory()/*-{
		return $wnd.cleanObject(this.riskCategory);
	}-*/;
	public final native  void setRiskCategory(RiskCategory riskCategory)/*-{
		this.riskCategory = riskCategory;
	}-*/;
	public final native  InternalScore getInternalScore()/*-{
		return $wnd.cleanObject(this.internalScore);
	}-*/;
	public final native  void setInternalScore(InternalScore internalScore)/*-{
		this.internalScore = internalScore;
	}-*/;
	public final native  ScoreGeneratedDt getScoreGeneratedDt()/*-{
		return $wnd.cleanObject(this.scoreGeneratedDt);
	}-*/;
	public final native  void setScoreGeneratedDt(ScoreGeneratedDt scoreGeneratedDt)/*-{
		this.scoreGeneratedDt = scoreGeneratedDt;
	}-*/;
	public final native  JsArray<CreditBureauSummary> getCreditBureauSummary()/*-{
		return $wnd.cleanObject(this.creditBureauSummary);
	}-*/;
	public final native  void setCreditBureauSummary(JsArray<CreditBureauSummary> creditBureauSummary)/*-{
		this.creditBureauSummary = creditBureauSummary;
	}-*/;
}
