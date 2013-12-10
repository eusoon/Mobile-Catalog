package ong.eu.soon.mobile.client.model;

public class Svc extends Entity{

	protected Svc(){
		
	}
	public final native String getSvcName() /*-{
		return $wnd.cleanString(this.svcName);
	}-*/;
	public final native String getSvcType()/*-{
		return $wnd.cleanString(this.svcType);
	}-*/;
}
