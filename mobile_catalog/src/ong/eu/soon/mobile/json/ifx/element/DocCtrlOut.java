package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class DocCtrlOut extends IFXObject {

	protected DocCtrlOut(){
	}
	
	public final native  SentPageCount getSentPageCount()/*-{
		return $wnd.cleanObject(this.sentPageCount);
	}-*/;

	public final native  void setSentPageCount(SentPageCount sentPageCount)/*-{
		this.sentPageCount = sentPageCount;
	}-*/;	
}