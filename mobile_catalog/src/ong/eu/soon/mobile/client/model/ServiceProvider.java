package ong.eu.soon.mobile.client.model;

public class ServiceProvider extends Entity{
	
	protected ServiceProvider(){
	}
	 public final native String getServiceProviderName() /*-{
     return $wnd.cleanString(this.serviceProviderName);
 }-*/;
}
