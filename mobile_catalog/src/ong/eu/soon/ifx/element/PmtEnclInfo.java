package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PmtEnclInfo extends IFXObject {

	PmtEnclType pmtEnclType;	 //	Open Enum	 Required	 The type of the Payment Enclosed transaction.Defined Values:UnverifiedCashDeposit, VerifiedCashDeposit, UnverifiedCheckDeposit, VerifiedCheckDeposit, EnvelopeDeposit, MultiDeposit
	PmtEnclPayeeInfo pmtEnclPayeeInfo;	 //	Aggregate	 Optional	 Payment Enclosed Payee Information Aggregate.This aggregate is required if the is other than "EnvelopeDeposit".
	CreditMediaItem[] creditMediaItem;	 //	Aggregate	 Optional Repeating	 Credit Media Item aggregate. This aggregate contains details pertaining to the individual items in the enclosed payment (e.g. check, cash).
	CompositeCurAmt[] compositeCurAmt;	 //	Aggregate	 Required Repeating	 The amounts of the Payment Enclosed transaction and any appropriate fees.
	Category category;	 //	C-40	 Optional	 Payment Category. The payment category selected by the customer.
	//begin-xor	Optional
	PrcDt prcDt;	 //	Date	 Required	 Payment Processing Date. The customer enters this date as the original requested processing date, not corrected for holidays and non-processing days. May be modified by the customer.
	DueDt dueDt;	 //	Date	 Required	 Payment Due Date. The customer enters this date to represent the date the payment is due to arrive at the payee. May be modified by the customer.
	//end-xor
	
	public PmtEnclType getPmtEnclType() {
		return pmtEnclType;
	}
	public void setPmtEnclType(PmtEnclType pmtEnclType) {
		this.pmtEnclType = pmtEnclType;
	}
	public PmtEnclPayeeInfo getPmtEnclPayeeInfo() {
		return pmtEnclPayeeInfo;
	}
	public void setPmtEnclPayeeInfo(PmtEnclPayeeInfo pmtEnclPayeeInfo) {
		this.pmtEnclPayeeInfo = pmtEnclPayeeInfo;
	}
	public CreditMediaItem[] getCreditMediaItem() {
		return creditMediaItem;
	}
	public void setCreditMediaItem(CreditMediaItem[] creditMediaItem) {
		this.creditMediaItem = creditMediaItem;
	}
	public CompositeCurAmt[] getCompositeCurAmt() {
		return compositeCurAmt;
	}
	public void setCompositeCurAmt(CompositeCurAmt[] compositeCurAmt) {
		this.compositeCurAmt = compositeCurAmt;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
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

}
