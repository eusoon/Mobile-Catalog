package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.BinData;
import ong.eu.soon.mobile.json.ifx.element.BinLength;
import ong.eu.soon.mobile.json.ifx.element.ContentType;

public class StmtImg extends IFXObject {
	protected StmtImg(){	
	}
	public final native ContentType getContentType() /*-{
		return $wnd.cleanObject(contentType);
	}-*/;
	public final native void setContentType(ContentType contentType) /*-{
		this.contentType = contentType;
	}-*/;
	public final native BinLength getBinLength() /*-{
		return $wnd.cleanObject(binLength);
	}-*/;
	public final native void setBinLength(BinLength binLength) /*-{
		this.binLength = binLength;
	}-*/;
	public final native BinData getBinData() /*-{
		return $wnd.cleanObject(binData);
	}-*/;
	public final native void setBinData(BinData binData) /*-{
		this.binData = binData;
	}-*/;	
}