package ong.eu.soon.mobile.client.model;


import ong.eu.soon.mobile.client.model.ServiceProvider;

import com.google.gwt.core.client.JavaScriptObject;

public class ServiceProviderData extends JavaScriptObject {
	protected ServiceProviderData() {       
    }
    
    public final native ServiceProvider getServiceProvider() /*-{
        return $wnd.cleanObject(this.serviceProvider);
    }-*/;
    
    public final native ServiceProviderStatus getStatus() /*-{
        return $wnd.cleanObject(this.status);
    }-*/;
}
