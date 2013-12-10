package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class DebitInfo extends IFXObject {
	DebitType debitType;//Open Enum	Optional The type of the debit transaction. Defined Values: CashWithdrawal, StampDispense, TicketDispense, ValueCouponDispense, CreditCardAdvance, CardVerification, TransactionFee, MerchandisePurchase, MerchandisePurchaseCashBack.
	CompositeCurAmt[] compositeCurAmt;//Aggregate	Required Repeating The amounts of the debit transaction and appropriate fees.
	AcctRef acctRef;//Aggregate	Optional Account Reference Aggregate
	AthKeys athKeys;//Aggregate	Optional Debit Authorization Identifier. Assigned by the server at the time the Debit Authorization is first added. This is used to relate a debit to a previously authorized debit authorization object
	TrnRqUID trnRqUID;//UUID	Optional Transaction RqUID. If this debit is used as a fee for a transaction (e.g. fee for a balance inquiry) then this element will contain the RqUID of the transaction (e.g. the balance inquiry). If this debit is used as a cash withdrawal for a deposit transaction such as deposit with cash back then this element will contain the RqUID of credit message/deposit transaction.
	ClientChgCode clientChgCode;//Open Enum	Optional Client Change Code. This indicates the reason why a Debit was for a different amount from the original authorization for the debit. Defined Values: None, ConsumerCancelled, TerminalExceptionAmountKnown, TerminalExceptionAmountUnknown, ConsumerExceptionAmountKnown, ConsumerExceptionAmountUnknown, PurchaseAdjustment, ConsumerDeclined, ConsumerTimeout
	public DebitType getDebitType() {
		return debitType;
	}
	public void setDebitType(DebitType debitType) {
		this.debitType = debitType;
	}
	public CompositeCurAmt[] getCompositeCurAmt() {
		return compositeCurAmt;
	}
	public void setCompositeCurAmt(CompositeCurAmt[] compositeCurAmt) {
		this.compositeCurAmt = compositeCurAmt;
	}
	public AcctRef getAcctRef() {
		return acctRef;
	}
	public void setAcctRef(AcctRef acctRef) {
		this.acctRef = acctRef;
	}
	public AthKeys getAthKeys() {
		return athKeys;
	}
	public void setAthKeys(AthKeys athKeys) {
		this.athKeys = athKeys;
	}
	public TrnRqUID getTrnRqUID() {
		return trnRqUID;
	}
	public void setTrnRqUID(TrnRqUID trnRqUID) {
		this.trnRqUID = trnRqUID;
	}
	public ClientChgCode getClientChgCode() {
		return clientChgCode;
	}
	public void setClientChgCode(ClientChgCode clientChgCode) {
		this.clientChgCode = clientChgCode;
	}
}
