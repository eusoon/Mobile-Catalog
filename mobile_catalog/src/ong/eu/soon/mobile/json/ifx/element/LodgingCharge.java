package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.CurAmt;
import ong.eu.soon.mobile.json.ifx.element.LodgingChargeType;
import ong.eu.soon.mobile.json.ifx.element.LodgingNights;

public class LodgingCharge extends IFXObject {
	protected LodgingCharge(){	
	}
	
	public final native  LodgingChargeType getLodgingChargeType()/*-{
		return $wnd.cleanObject(this.lodgingChargeType);
	}-*/;
	public final native  void setLodgingChargeType(LodgingChargeType lodgingChargeType)/*-{
		this.lodgingChargeType = lodgingChargeType;
	}-*/;
	public final native  CurAmt getCurAmt()/*-{
		return $wnd.cleanObject(this.curAmt);
	}-*/;
	public final native  void setCurAmt(CurAmt curAmt)/*-{
		this.curAmt = curAmt;
	}-*/;
	public final native  LodgingNights getLodgingNights()/*-{
		return $wnd.cleanObject(this.lodgingNights);
	}-*/;
	public final native  void setLodgingNights(LodgingNights lodgingNights)/*-{
		this.lodgingNights = lodgingNights;
	}-*/;
}
