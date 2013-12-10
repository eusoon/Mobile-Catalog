package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.payee.StdPayeeInqRq;

public class StdPayeeRqMsg extends IFXObject {
	protected StdPayeeRqMsg(){	
	}
	public final native StdPayeeInqRq getStdPayeeInqRq() /*-{
		return $wnd.cleanObject(stdPayeeInqRq);
	}-*/;
	public final native void setStdPayeeInqRq(StdPayeeInqRq stdPayeeInqRq) /*-{
		this.stdPayeeInqRq = stdPayeeInqRq;
	}-*/;
	public final native RevRqUID getRevRqUID() /*-{
		return $wnd.cleanObject(revRqUID);
	}-*/;
	public final native void setRevRqUID(RevRqUID revRqUID) /*-{
		this.revRqUID = revRqUID;
	}-*/;
}