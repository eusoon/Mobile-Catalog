package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class CreditBureauSummary extends IFXObject {

	protected CreditBureauSummary(){	
	}
	
	public final native  CreditBureau getCreditBureau()/*-{
		return $wnd.cleanObject(this.creditBureau);
	}-*/;
	public final native  void setCreditBureau(CreditBureau creditBureau)/*-{
		this.creditBureau = creditBureau;
	}-*/;
	public final native  BureauScore getBureauScore()/*-{
		return $wnd.cleanObject(this.bureauScore);
	}-*/;
	public final native  void setBureauScore(BureauScore bureauScore)/*-{
		this.bureauScore = bureauScore;
	}-*/;
	public final native  ReportRequestDt getReportRequestDt()/*-{
		return $wnd.cleanObject(this.reportRequestDt);
	}-*/;
	public final native  void setReportRequestDt(ReportRequestDt reportRequestDt)/*-{
		this.reportRequestDt = reportRequestDt;
	}-*/;
	public final native  ScoreModel getScoreModel()/*-{
		return $wnd.cleanObject(this.scoreModel);
	}-*/;
	public final native  void setScoreModel(ScoreModel scoreModel)/*-{
		this.scoreModel = scoreModel;
	}-*/;
	public final native  UpDt getUpDt()/*-{
		return $wnd.cleanObject(this.upDt);
	}-*/;
	public final native  void setUpDt(UpDt upDt)/*-{
		this.upDt = upDt;
	}-*/;	
}
