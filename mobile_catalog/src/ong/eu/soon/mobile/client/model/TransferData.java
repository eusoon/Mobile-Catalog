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
package ong.eu.soon.mobile.client.model;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Overlay type for Transfer information.
 */
public class TransferData extends JavaScriptObject {
    
    protected TransferData() {        
    }
    
    public final native Transfer getTransfer() /*-{
        return $wnd.cleanObject(this.accountHistoryTransfer);
    }-*/;   
    
    public final native boolean isCanAddContact() /*-{
        return this.canAddRelatedMemberAsContact;
    }-*/;
    
}
