package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class FeeChargeAlloc extends IFXObject {

	protected FeeChargeAlloc(){
	}
	
	public final native  ChargeRegulation getChargeRegulation()/*-{
		return $wnd.cleanObject(this.chargeRegulation);
	}-*/;
	public final native  void setChargeRegulation(ChargeRegulation chargeRegulation)/*-{
		this.chargeRegulation = chargeRegulation;
	}-*/;
	public final native  Fee getFee()/*-{
		return $wnd.cleanObject(this.fee);
	}-*/;
	public final native  void setFee(Fee fee)/*-{
		this.fee = fee;
	}-*/;
	public final native  AcctKeys getAcctKeys()/*-{
		return $wnd.cleanObject(this.acctKeys);
	}-*/;
	public final native  void setAcctKeys(AcctKeys acctKeys)/*-{
		this.acctKeys = acctKeys;
	}-*/;
		
}
