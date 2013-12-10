package ong.eu.soon.mobile.json.ifx.element;

public class SecTokenICC extends SecToken {

	protected SecTokenICC(){	
	}
	
	public final native AppPan getAppPan() /*-{
		return $wnd.cleanObject(appPan);
	}-*/;
	public final native void setAppPan(AppPan appPan) /*-{
		this.appPan = appPan;
	}-*/;
	public final native AppPanSeq getAppPanSeq() /*-{
		return $wnd.cleanObject(appPanSeq);
	}-*/;
	public final native void setAppPanSeq(AppPanSeq appPanSeq) /*-{
		this.appPanSeq = appPanSeq;
	}-*/;
	public final native AppIdent getAppIdent() /*-{
		return $wnd.cleanObject(appIdent);
	}-*/;
	public final native void setAppIdent(AppIdent appIdent) /*-{
		this.appIdent = appIdent;
	}-*/;
	public final native PINBlock getpINBlock() /*-{
		return $wnd.cleanObject(pINBlock);
	}-*/;
	public final native void setpINBlock(PINBlock pINBlock) /*-{
		this.pINBlock = pINBlock;
	}-*/;

}