package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class CustPayeeRef extends IFXObject {

	protected CustPayeeRef(){	
	}
	
	public final native  CustPayeeKeys getCustPayeeKeys()/*-{
		return $wnd.cleanObject(this.custPayeeKeys);
	}-*/;
	public final native  void setCustPayeeKeys(CustPayeeKeys custPayeeKeys)/*-{
		this.custPayeeKeys = custPayeeKeys;
	}-*/;
	public final native  CustPayeeRec getCustPayeeRec()/*-{
		return $wnd.cleanObject(this.custPayeeRec);
	}-*/;
	public final native  void setCustPayeeRec(CustPayeeRec custPayeeRec)/*-{
		this.custPayeeRec = custPayeeRec;
	}-*/;
	public final native  CustPayeeInfo getCustPayeeInfo()/*-{
		return $wnd.cleanObject(this.custPayeeInfo);
	}-*/;
	public final native  void setCustPayeeInfo(CustPayeeInfo custPayeeInfo)/*-{
		this.custPayeeInfo = custPayeeInfo;
	}-*/;
}
