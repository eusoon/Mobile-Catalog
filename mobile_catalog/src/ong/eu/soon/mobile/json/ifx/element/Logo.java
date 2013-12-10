package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class Logo extends IFXObject {
	protected Logo(){	
	}
	
	public final native  ContentType getContentType()/*-{
		return $wnd.cleanObject(contentType);
	}-*/;
	public final native  void setContentType(ContentType contentType)/*-{
		this.contentType = contentType;
	}-*/;
	public final native  BinLength getBinLength()/*-{
		return $wnd.cleanObject(binLength);
	}-*/;
	public final native  void setBinLength(BinLength binLength)/*-{
		this.binLength = binLength;
	}-*/;
	public final native  BinData getBinData()/*-{
		return $wnd.cleanObject(binData);
	}-*/;
	public final native  void setBinData(BinData binData)/*-{
		this.binData = binData;
	}-*/;

}
