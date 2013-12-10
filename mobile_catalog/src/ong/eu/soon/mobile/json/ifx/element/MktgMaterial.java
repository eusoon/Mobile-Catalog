package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class MktgMaterial extends IFXObject {
	protected MktgMaterial(){	
	}
	public final native MktgText getMktgText() /*-{
		return $wnd.cleanObject(mktgText);
	}-*/;
	public final native void setMktgText(MktgText mktgText) /*-{
		this.mktgText = mktgText;
	}-*/;
	public final native MktgImg getMktgImg() /*-{
		return $wnd.cleanObject(mktgImg);
	}-*/;
	public final native void setMktgImg(MktgImg mktgImg) /*-{
		this.mktgImg = mktgImg;
	}-*/;
	public final native MktgURLmMktgURL getMktgURLmMktgURL() /*-{
		return $wnd.cleanObject(mktgURLmMktgURL);
	}-*/;
	public final native void setMktgURLmMktgURL(MktgURLmMktgURL mktgURLmMktgURL) /*-{
		this.mktgURLmMktgURL = mktgURLmMktgURL;
	}-*/;

}