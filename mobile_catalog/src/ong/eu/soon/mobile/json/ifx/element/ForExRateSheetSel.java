package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class ForExRateSheetSel extends IFXObject {

	protected ForExRateSheetSel(){
	}
	
	public final native  ForExRateSheetKeys getForExRateSheetKeys()/*-{
		return $wnd.cleanObject(this.forExRateSheetKeys);
	}-*/;

	public final native  void setForExRateSheetKeys(ForExRateSheetKeys forExRateSheetKeys)/*-{
		this.forExRateSheetKeys = forExRateSheetKeys;
	}-*/;

}
