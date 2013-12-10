package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CreditRisk extends IFXObject {
	//begin Aggregate
	RiskCategory riskCategory;	 //	C-40	 Optional	 Risk Category
	InternalScore internalScore;	 //	Long	 Optional	 Internal Score
	ScoreGeneratedDt scoreGeneratedDt;	 //	Date	 Optional	 Score Generated Date
	CreditBureauSummary[] creditBureauSummary;	 //	Aggregate	 Optional Repeating	 Credit Bureau Summary
	public RiskCategory getRiskCategory() {
		return riskCategory;
	}
	public void setRiskCategory(RiskCategory riskCategory) {
		this.riskCategory = riskCategory;
	}
	public InternalScore getInternalScore() {
		return internalScore;
	}
	public void setInternalScore(InternalScore internalScore) {
		this.internalScore = internalScore;
	}
	public ScoreGeneratedDt getScoreGeneratedDt() {
		return scoreGeneratedDt;
	}
	public void setScoreGeneratedDt(ScoreGeneratedDt scoreGeneratedDt) {
		this.scoreGeneratedDt = scoreGeneratedDt;
	}
	public CreditBureauSummary[] getCreditBureauSummary() {
		return creditBureauSummary;
	}
	public void setCreditBureauSummary(CreditBureauSummary[] creditBureauSummary) {
		this.creditBureauSummary = creditBureauSummary;
	}

	
}
