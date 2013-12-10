package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class AirlineCharge extends IFXObject {

	protected AirlineCharge(){	
	}
	
	public final native  AirlineChargeType getAirlineChargeType()/*-{
		return $wnd.cleanObject(this.airlineChargeType);
	}-*/;
	public final native  void setAirlineChargeType(AirlineChargeType airlineChargeType)/*-{
		this.airlineChargeType = airlineChargeType;
	}-*/;
	public final native  CurAmt getCurAmt()/*-{
		return $wnd.cleanObject(this.curAmt);
	}-*/;
	public final native  void setCurAmt(CurAmt curAmt)/*-{
		this.curAmt = curAmt;
	}-*/;

}
