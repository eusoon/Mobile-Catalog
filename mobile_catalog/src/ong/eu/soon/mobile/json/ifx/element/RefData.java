package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class RefData extends IFXObject {
	protected RefData(){	
	}
	public final native RefType getRefType() /*-{
		return $wnd.cleanObject(refType);
	}-*/;
	public final native void setRefType(RefType refType) /*-{
		this.refType = refType;
	}-*/;
	public final native RefIdent getRefIdent() /*-{
		return $wnd.cleanObject(refIdent);
	}-*/;
	public final native void setRefIdent(RefIdent refIdent) /*-{
		this.refIdent = refIdent;
	}-*/;
	public final native RefDesc getRefDesc() /*-{
		return $wnd.cleanObject(refDesc);
	}-*/;
	public final native void setRefDesc(RefDesc refDesc) /*-{
		this.refDesc = refDesc;
	}-*/;
}
