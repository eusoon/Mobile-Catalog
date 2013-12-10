                                                                                                                           package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class RentalCharge extends IFXObject {
	protected RentalCharge(){	
	}
	public final native RentalChargeType getRentalChargeType() /*-{
		return $wnd.cleanObject(rentalChargeType);
	}-*/;
	public final native void setRentalChargeType(RentalChargeType rentalChargeType) /*-{
		this.rentalChargeType = rentalChargeType;
	}-*/;
	public final native CurAmt getCurAmt() /*-{
		return $wnd.cleanObject(curAmt);
	}-*/;
	public final native void setCurAmt(CurAmt curAmt) /*-{
		this.curAmt = curAmt;
	}-*/;

}