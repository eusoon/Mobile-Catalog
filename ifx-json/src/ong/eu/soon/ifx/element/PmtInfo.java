package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PmtInfo extends IFXObject {

	CurAmt curAmt; //Aggregate	Optional	Total funding from debit account.	The details of payment amounts are in the PaymentCreditDetail(s). If this is not present, the amount to be debited from the funding account is assumed to be the sum of PaymentCreditDetail amounts
	CPPData cPPData; //Aggregate	Optional	Consumer Payment Provider. This is equivalent to the InitiatingParty in the ISO20022 model.
	DebtorData debtorData; //Aggregate	Required	Party that owns the account to be debited.
	PmtInstruction pmtInstruction; //Aggregate	Required	Provides information on the mechanics of processing the payment.
	//begin-xor	Required	 
	PrcDt prcDt; //Date	Required	Payment Processing Date. The customer enters this date as the original requested processing date, not corrected for holidays and non-processing days. May be modified by the customer.
	DueDt dueDt; //Date	Required	Payment Due Date. The customer enters this date to represent the date the payment is due to arrive at the payee/creditor. May be modified by the customer.
	//end-xor
	ExpediteInd expediteInd; //Boolean	Optional	If set to True, the payment must be executed immediately, and not at end of day. Subject to support at the server.
	RecurPmtKeys recurPmtKeys; //Aggregate	Optional	This is a reference to a RecurPmt model object if this instance was created from a recurring model.
	PmtCreditDetail[] pmtCreditDetail; //Aggregate	Required Repeating	Information related to the credit side of the payment. At least one occurrence is required. Multiple occurrences can be supplied for cases where a single payment (debit) has multiple associated credits,
	public CurAmt getCurAmt() {
		return curAmt;
	}
	public void setCurAmt(CurAmt curAmt) {
		this.curAmt = curAmt;
	}
	public CPPData getcPPData() {
		return cPPData;
	}
	public void setcPPData(CPPData cPPData) {
		this.cPPData = cPPData;
	}
	public DebtorData getDebtorData() {
		return debtorData;
	}
	public void setDebtorData(DebtorData debtorData) {
		this.debtorData = debtorData;
	}
	public PmtInstruction getPmtInstruction() {
		return pmtInstruction;
	}
	public void setPmtInstruction(PmtInstruction pmtInstruction) {
		this.pmtInstruction = pmtInstruction;
	}
	public PrcDt getPrcDt() {
		return prcDt;
	}
	public void setPrcDt(PrcDt prcDt) {
		this.prcDt = prcDt;
	}
	public DueDt getDueDt() {
		return dueDt;
	}
	public void setDueDt(DueDt dueDt) {
		this.dueDt = dueDt;
	}
	public ExpediteInd getExpediteInd() {
		return expediteInd;
	}
	public void setExpediteInd(ExpediteInd expediteInd) {
		this.expediteInd = expediteInd;
	}
	public RecurPmtKeys getRecurPmtKeys() {
		return recurPmtKeys;
	}
	public void setRecurPmtKeys(RecurPmtKeys recurPmtKeys) {
		this.recurPmtKeys = recurPmtKeys;
	}
	public PmtCreditDetail[] getPmtCreditDetail() {
		return pmtCreditDetail;
	}
	public void setPmtCreditDetail(PmtCreditDetail[] pmtCreditDetail) {
		this.pmtCreditDetail = pmtCreditDetail;
	}
	
}