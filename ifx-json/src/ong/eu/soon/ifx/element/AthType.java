package ong.eu.soon.ifx.element;

public enum AthType {
	PreAuthorization("PreAuthorization"), 
	Cash("Cash"), 
	CashReversal("CashReversal"), 
	CreditVoucher("CreditVoucher"), 
	CreditVoucherReversal("CreditVoucher Reversal"), 
	Load("Load"), 
	Payment("Payment"), 
	Purchase("Purchase"), 
	PurchaseReversal("PurchaseReversal"), 
	Reload("Reload"), 
	TransferFrom("TransferFrom"), 
	TransferTo("TransferTo");
	
	String value;
	
	private AthType(String value){
		this.value=value;
	}
	
}
