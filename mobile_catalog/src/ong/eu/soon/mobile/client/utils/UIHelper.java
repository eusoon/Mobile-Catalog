/*
    This file is part of Cyclos (www.cyclos.org).
    A project of the Social Trade Organisation (www.socialtrade.org).

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
package ong.eu.soon.mobile.client.utils;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;

/**
 * Helper class for UI widgets 
 */
public class UIHelper {
    
    /**
     * Sets the field place holder attribute
     */
    public static void setPlaceHolder(String placeholder, Element element) {
        if(placeholder != null && !placeholder.isEmpty()) {
            DOM.setElementProperty(element, "placeholder", placeholder);
        }
    }
    
    /**
     * Returns if the device supports complex UI
     */
    public static native boolean supportsComplexUI() /*-{
        return $wnd.supportsComplexUI();
    }-*/;

}
