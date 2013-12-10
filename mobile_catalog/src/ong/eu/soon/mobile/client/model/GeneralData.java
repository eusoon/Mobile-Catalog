/*
   This file is part of Cyclos.

   Cyclos is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 2 of the License, or
   (at your option) any later version.

   Cyclos is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with Cyclos; if not, write to the Free Software
   Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA

 */
package ong.eu.soon.mobile.client.model;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * Overlay type for general data.
 * 
 * @author luis
 */
public class GeneralData extends JavaScriptObject {

    protected GeneralData() {
    }

    public final native String getWelcomeMessage() /*-{
        return $wnd.cleanString(this.welcomeMessage);
    }-*/;
    
    public final native String getApplicationName() /*-{
        return $wnd.cleanString(this.applicationName);
    }-*/;

    public final native CredentialType getCredentialType() /*-{
        return @ong.eu.soon.mobile.client.model.CredentialType::valueOf(Ljava/lang/String;)(this.credentialType);
    }-*/;

    public final native String getApplicationVersion() /*-{
        return $wnd.cleanString(this.applicationVersion);
    }-*/;

    public final native CustomField getPrincipalCustomField() /*-{
        return $wnd.cleanObject(this.principalCustomField);
    }-*/;

    public final native PrincipalType getPrincipalType() /*-{
        return @ong.eu.soon.mobile.client.model.PrincipalType::valueOf(Ljava/lang/String;)(this.principalType);
    }-*/;
    
    public final native JsArray<Image> getImages() /*-{
        return $wnd.cleanObject(this.images);
    }-*/;
    public final native String getPublicExponent() /*-{
    	return $wnd.cleanString(this.publicExponent);
	}-*/; 
    public final native String getSecretKey() /*-{
	    return $wnd.cleanString(this.secretKey);
	}-*/; 
    public final native String getModulus() /*-{
    	return $wnd.cleanString(this.modulus);
	}-*/;
    public final native String getKeySerial() /*-{
		return $wnd.cleanString(this.keySerial);
	}-*/;

	public final native String getAuthenticationMode() /*-{
		return $wnd.cleanString(this.authenticationMode);
	}-*/;

	public final native String getServicePrincipalName()  /*-{
		return $wnd.cleanString(this.servicePrincipalName);
	}-*/;

}
