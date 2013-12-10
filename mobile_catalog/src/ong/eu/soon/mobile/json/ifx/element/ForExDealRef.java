package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class ForExDealRef extends IFXObject {
	
	protected ForExDealRef(){
	}
	
	public final native  ForExDealKeys getForExDealKeys()/*-{
		return $wnd.cleanObject(this.forExDealKeys);
	}-*/;
	public final native  void setForExDealKeys(ForExDealKeys forExDealKeys)/*-{
		this.forExDealKeys = forExDealKeys;
	}-*/;
	public final native  ForExDealRec getForExDealRec()/*-{
		return $wnd.cleanObject(this.forExDealRec);
	}-*/;
	public final native  void setForExDealRec(ForExDealRec forExDealRec)/*-{
		this.forExDealRec = forExDealRec;
	}-*/;
	public final native  ForExDealInfo getForExDealInfo()/*-{
		return $wnd.cleanObject(this.forExDealInfo);
	}-*/;
	public final native  void setForExDealInfo(ForExDealInfo forExDealInfo)/*-{
		this.forExDealInfo = forExDealInfo;
	}-*/;

}
