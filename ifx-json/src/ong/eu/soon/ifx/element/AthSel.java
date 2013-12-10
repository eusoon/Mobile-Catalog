package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class AthSel extends IFXObject {

	//begin-xor	Required Repeating
	AthKeys[] athKeys;	 //	Aggregate	 Required	 Authorization Keys Aggregate
	//begin-block	Required
	AcctKeys[] acctKeys;	 //	Aggregate	 Optional	 Account Keys Aggregate
	DtRange[] dtRange;	 //	Aggregate	 Optional	 Date Range
	AthType[] athType;	 //	Open Enum	 Optional	 Authorization TypeValid values include: PreAuthorization, Cash, CashReversal, CreditVoucher, CreditVoucher Reversal, Load, Payment, Purchase, PurchaseReversal, Reload, TransferFrom, TransferTo
	CurAmtRange[] curAmtRange;	 //	Aggregate	 Optional	 Currency Amount Range
	//end-block
	//end-xor
	
	public AthKeys[] getAthKeys() {
		return athKeys;
	}
	public void setAthKeys(AthKeys[] athKeys) {
		this.athKeys = athKeys;
	}
	public AcctKeys[] getAcctKeys() {
		return acctKeys;
	}
	public void setAcctKeys(AcctKeys[] acctKeys) {
		this.acctKeys = acctKeys;
	}
	public DtRange[] getDtRange() {
		return dtRange;
	}
	public void setDtRange(DtRange[] dtRange) {
		this.dtRange = dtRange;
	}
	public AthType[] getAthType() {
		return athType;
	}
	public void setAthType(AthType[] athType) {
		this.athType = athType;
	}
	public CurAmtRange[] getCurAmtRange() {
		return curAmtRange;
	}
	public void setCurAmtRange(CurAmtRange[] curAmtRange) {
		this.curAmtRange = curAmtRange;
	}
	
}
