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
package ong.eu.soon.mobile.client.contacts;

import java.util.Arrays;
import java.util.List;

import ong.eu.soon.ifx.element.RecSelect;
import ong.eu.soon.ifx.payee.CustPayeeInqRq;
import ong.eu.soon.mobile.client.IFX;
import ong.eu.soon.mobile.client.LoggedUser;
import ong.eu.soon.mobile.client.Navigation;
import ong.eu.soon.mobile.client.Notification;
import ong.eu.soon.mobile.client.Notification.NotificationLayout;
import ong.eu.soon.mobile.client.callback.CustPayeeInqRsCallbackWrapper;
import ong.eu.soon.mobile.client.model.Contact;
import ong.eu.soon.mobile.client.model.Parameters;
import ong.eu.soon.mobile.client.services.ContactService;
import ong.eu.soon.mobile.client.ui.Icon;
import ong.eu.soon.mobile.client.ui.Page;
import ong.eu.soon.mobile.client.ui.PageAnchor;
import ong.eu.soon.mobile.client.ui.widgets.SimpleDataList;
import ong.eu.soon.mobile.client.ui.widgets.UserRow;
import ong.eu.soon.mobile.client.utils.PageAction;
import ong.eu.soon.mobile.client.utils.ParameterKey;
import ong.eu.soon.mobile.json.ifx.payee.CustPayeeInqRs;

import com.google.gwt.cell.client.Cell.Context;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Widget;

/**
 * A {@link Page} used to display contacts. 
 */
public class ContactsPage extends Page {

    private ContactService contactService = GWT.create(ContactService.class);
  
    @Override
    public String getHeading() {
        return messages.contactsHeading();
    }

    @Override
    public boolean hasCustomScroll() {     
        return true;
    }
    
    @Override
    public Widget initialize() {
        
        // List pages uses fixed notification layout
        Notification.get().setLayout(NotificationLayout.FIXED);
        
        SimpleDataList<Contact> dataList = new SimpleDataList<Contact>() {
            
            @Override
            protected Widget onRender(Context context, Contact data) {                
                
                // Value can be null
                if (data == null) {
                  return null;
                }
                
                // Create row widget
                UserRow row = new UserRow();
                row.setImage(Icon.CONTACT.image());
                row.setHeading(data.getMember().getUsername());
                row.setSub(data.getMember().getName());               
                
                return row;
            }

            @Override
            protected void onSearchData(final AsyncCallback<JsArray<Contact>> callback) {
                // Fetch contacts
               // contactService.list(callback);
            	final LoggedUser loggerUser=LoggedUser.get();
                final Parameters params=new Parameters();
                CustPayeeInqRq custPayeeInqRq=new CustPayeeInqRq();

            	custPayeeInqRq.setRqUID(IFX.getRqUID("PAYEE"));
            	custPayeeInqRq.setMsgRqHdr(IFX.getMsgRqHdr(loggerUser,"custPayeeInq"));
            	
            	RecSelect[] recSelect=new RecSelect[2];
            	recSelect[0].setString("$.custPayeeRec.custPayeeStatus[?(@.custPayeeStatusCode='Active')]");
            	recSelect[1].setString("$.custPayeeRec.custPayeeEnvr.partyKeys.loginIdent[?(@.loginName='"+loggerUser.getPrincipal()+"')]");
				custPayeeInqRq.setRecSelect(recSelect);
				params.add("custPayeeInqRq", custPayeeInqRq);
                new CustPayeeInqRsCallbackWrapper(){

					@Override
					protected void onSuccess(JsArray<Contact> result) {
						callback.onSuccess(result);		
					}

					@Override
					protected void onFailure(Throwable throwable) {
						callback.onFailure(throwable);
					}

					@Override
					protected void onCall(AsyncCallback<CustPayeeInqRs> callback) {
						//Fetch contacts
						 contactService.list(params, callback);
					}	
                }.call();
            }
            
            @Override
            protected void onRowSelected(Contact value) {   
                // Go to contact details page
                navigateTo(value.getMember().getId());
            }          
        };

        return dataList;
    }
        
    /**
     * Navigates to contact details sending according parameters     
     */
    protected void navigateTo(Long memberId) {
        Parameters params = new Parameters();
        params.add(ParameterKey.ID, memberId);   
        Navigation.get().go(PageAnchor.CONTACT_DETAILS, params);    
    }
    
    @Override
    public List<PageAction> getPageActions() {
        return Arrays.asList(getSearchAction());
    }

    /**
     * Returns search action
     */
    private PageAction getSearchAction() {
        return new PageAction() {
            @Override
            public void run() {
                Navigation.get().go(PageAnchor.USER_SEARCH);
            }
            @Override
            public String getLabel() {
                return messages.addNewContact();
            }            
        };
    }
    
}
