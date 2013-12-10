package ong.eu.soon.mobile.client.transfer;

import java.util.Arrays;
import java.util.List;

import ong.eu.soon.mobile.client.LoggedUser;
import ong.eu.soon.mobile.client.Navigation;
import ong.eu.soon.mobile.client.Notification;
import ong.eu.soon.mobile.client.model.Parameters;
import ong.eu.soon.mobile.client.ui.Icon;
import ong.eu.soon.mobile.client.ui.Page;
import ong.eu.soon.mobile.client.ui.PageAnchor;
import ong.eu.soon.mobile.client.ui.panels.SquarePanel;
import ong.eu.soon.mobile.client.ui.widgets.IconButton;
import ong.eu.soon.mobile.client.ui.widgets.LabelField;
import ong.eu.soon.mobile.client.ui.widgets.TextField;
import ong.eu.soon.mobile.client.utils.PageAction;
import ong.eu.soon.mobile.client.utils.ParameterKey;
import ong.eu.soon.mobile.client.utils.StringHelper;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Widget;


public class TransfersPage extends Page {

	private TextField username;
	
	@Override
	public String getHeading() {
		 return messages.paymentsHeading();
	}

	@Override
	public Widget initialize() {
SquarePanel container = new SquarePanel();
        
        boolean canMakeSystemPayments = LoggedUser.get().getInitialData().canMakeSystemPayments();
        boolean canMakeMemberPayments = LoggedUser.get().getInitialData().canMakeMemberPayments();        
        
        LabelField receiver = new LabelField(messages.makePayment());
        receiver.addStyleName("payment-label-field");
        
        IconButton selectSystem = new IconButton(messages.toSystemAccount(), Icon.SYSTEM.image(), true);
        selectSystem.addClickHandler(getSelectSystemAccountHandler());
        selectSystem.setVisible(canMakeSystemPayments);              
        
        IconButton selectContact = new IconButton(messages.toMyContact(), Icon.CONTACT_SELECT.image(), true);
        selectContact.addClickHandler(getSelectContactHandler());
        selectContact.setVisible(canMakeMemberPayments);
        
        username = new TextField(messages.orTypeUserNameHere());
        username.setVisible(canMakeMemberPayments);                
        
        container.add(receiver);
        container.add(selectSystem);
        container.add(selectContact);
        container.add(username);
        
        if(!canMakeSystemPayments && !canMakeMemberPayments) {
            container.setVisible(false);
            Notification.get().information(messages.cannotMakePayments());
        }    
        
        return container;
	}
	@Override
    public List<PageAction> getPageActions() {
        boolean canMakeMemberPayments = LoggedUser.get().getInitialData().canMakeMemberPayments();        
        if(canMakeMemberPayments) {
            return Arrays.asList(getNextAction());
        }
        return null;
    }
   
    /**
     * Returns next's page action
     */
    private PageAction getNextAction() {
        return new PageAction() {
            @Override
            public void run() {
                // Go to users page
                Parameters params = null;
                if(StringHelper.isNotEmpty(username.getValue())) {
                    params = new Parameters();
                    params.add(ParameterKey.KEYWORDS, username.getValue());
                }
                Navigation.get().go(PageAnchor.USER_SELECT, params);  
            }
            @Override
            public String getLabel() {
                return messages.next();
            }            
        };
    }
    
    /**
     * Returns select contact button's click handler
     */
    private ClickHandler getSelectContactHandler() {
        return new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                Navigation.get().go(PageAnchor.CONTACT_SELECT);
            }            
        };
    }
    
    /**
     * Returns select system account button's click handler
     */
    private ClickHandler getSelectSystemAccountHandler() {
        return new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                Parameters params = new Parameters();
                params.add(ParameterKey.IS_SYSTEM_ACCOUNT, true);   
                Navigation.get().goNoHistory(PageAnchor.FUND_TRANSFER, params);    
            }                
        };
    }
}
