package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PmtInstruction extends IFXObject {

	PmtMethod pmtMethod; //Open Enum	Optional	Payment Method	Valid values include: ACH, BookEntry, CHAPS, Check, CHIPS, Concentrator, CreditNetwork, DebitNetwork, Draft, Electronic, ePay, FedNet, OutsourcedCheck, RPS, SWIFT
	//begin-xor	Required	 
	FromAcctRef fromAcctRef; //Aggregate	Required	From Account Reference
	SettlementIdent settlementIdent; //C-20	Required	Settlement Identification
	//end-xor
	Memo memo; //C-255	Optional	Memo
	CountryCode countryCode; //Aggregate	Optional	Country. Country of the payment system in which the payment is processed.
	PmtFormat pmtFormat; //Open Enum	Optional	Payment format. Payment format for the specified payment method above. For example, in ACH electronic transfer, the format can be CTX, CCD, CCDPlus, PPD, etc.
	RefData[] refData; //Aggregate	Optional Repeating	Reference information associated with payment information.
	IntermediaryAcct[] intermediaryAcct; //Aggregate	Optional Repeating	Intermediary account. Used to identify accounts for intermediary banks that route the payment.
	FeeChargeAlloc feeChargeAlloc; //Aggregate	Optional	Bank Fee Charge Allocation. Used to communicate the fee charges on the payment by the CPP. This specifies who and how the fee is being distributed between the Payer and the Payee.
	public PmtMethod getPmtMethod() {
		return pmtMethod;
	}
	public void setPmtMethod(PmtMethod pmtMethod) {
		this.pmtMethod = pmtMethod;
	}
	public FromAcctRef getFromAcctRef() {
		return fromAcctRef;
	}
	public void setFromAcctRef(FromAcctRef fromAcctRef) {
		this.fromAcctRef = fromAcctRef;
	}
	public SettlementIdent getSettlementIdent() {
		return settlementIdent;
	}
	public void setSettlementIdent(SettlementIdent settlementIdent) {
		this.settlementIdent = settlementIdent;
	}
	public Memo getMemo() {
		return memo;
	}
	public void setMemo(Memo memo) {
		this.memo = memo;
	}
	public CountryCode getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(CountryCode countryCode) {
		this.countryCode = countryCode;
	}
	public PmtFormat getPmtFormat() {
		return pmtFormat;
	}
	public void setPmtFormat(PmtFormat pmtFormat) {
		this.pmtFormat = pmtFormat;
	}
	public RefData[] getRefData() {
		return refData;
	}
	public void setRefData(RefData[] refData) {
		this.refData = refData;
	}
	public IntermediaryAcct[] getIntermediaryAcct() {
		return intermediaryAcct;
	}
	public void setIntermediaryAcct(IntermediaryAcct[] intermediaryAcct) {
		this.intermediaryAcct = intermediaryAcct;
	}
	public FeeChargeAlloc getFeeChargeAlloc() {
		return feeChargeAlloc;
	}
	public void setFeeChargeAlloc(FeeChargeAlloc feeChargeAlloc) {
		this.feeChargeAlloc = feeChargeAlloc;
	}
	
}
