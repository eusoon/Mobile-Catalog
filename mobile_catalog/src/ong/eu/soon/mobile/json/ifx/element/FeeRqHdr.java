package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class FeeRqHdr extends IFXObject {

	protected FeeRqHdr(){
	}
	
	public final native  DebitRef getDebitRef()/*-{
		return $wnd.cleanObject(this.debitRef);
	}-*/;
	public final native  void setDebitRef(DebitRef debitRef)/*-{
		this.debitRef = debitRef;
	}-*/;
	public final native  CreditRef getCreditRef()/*-{
		return $wnd.cleanObject(this.creditRef);
	}-*/;
	public final native  void setCreditRef(CreditRef creditRef)/*-{
		this.creditRef = creditRef;
	}-*/;
	public final native  AcctKeys getAcctKeys()/*-{
		return $wnd.cleanObject(this.acctKeys);
	}-*/;
	public final native  void setAcctKeys(AcctKeys acctKeys)/*-{
		this.acctKeys = acctKeys;
	}-*/;
	public final native  ChargeRegulation getChargeRegulation()/*-{
		return $wnd.cleanObject(this.chargeRegulation);
	}-*/;
	public final native  void setChargeRegulation(ChargeRegulation chargeRegulation)/*-{
		this.chargeRegulation = chargeRegulation;
	}-*/;
}
