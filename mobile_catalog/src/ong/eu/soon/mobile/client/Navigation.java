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
package ong.eu.soon.mobile.client;

import ong.eu.soon.mobile.client.accounts.AccountDetailsPage;
import ong.eu.soon.mobile.client.accounts.AccountsPage;
import ong.eu.soon.mobile.client.accounts.TransactionDetailsPage;
import ong.eu.soon.mobile.client.configuration.ConfigurationPage;
import ong.eu.soon.mobile.client.contacts.ContactDetailsPage;
import ong.eu.soon.mobile.client.contacts.ContactSelectPage;
import ong.eu.soon.mobile.client.contacts.ContactsPage;
import ong.eu.soon.mobile.client.help.HelpPage;
import ong.eu.soon.mobile.client.loadgeneraldata.LoadGeneralDataPage;
import ong.eu.soon.mobile.client.login.LoginPage;
import ong.eu.soon.mobile.client.login.OTPPage;
import ong.eu.soon.mobile.client.model.AppState;
import ong.eu.soon.mobile.client.model.Parameters;
import ong.eu.soon.mobile.client.payments.MakePaymentPage;
import ong.eu.soon.mobile.client.payments.PaymentDetailsPage;
import ong.eu.soon.mobile.client.payments.PaymentPreviewPage;
import ong.eu.soon.mobile.client.payments.PaymentsPage;
import ong.eu.soon.mobile.client.serviceprovider.ServiceProvidersPage;
import ong.eu.soon.mobile.client.serviceprovider.ServicesPage;
import ong.eu.soon.mobile.client.svc.SvcPage;
import ong.eu.soon.mobile.client.transfer.FundTransferPage;
import ong.eu.soon.mobile.client.transfer.TransferPreviewPage;
import ong.eu.soon.mobile.client.transfer.TransfersPage;
import ong.eu.soon.mobile.client.ui.Page;
import ong.eu.soon.mobile.client.ui.PageAnchor;
import ong.eu.soon.mobile.client.ui.widgets.LogoutDialog;
import ong.eu.soon.mobile.client.users.UserDetailsPage;
import ong.eu.soon.mobile.client.users.UserSearchPage;
import ong.eu.soon.mobile.client.users.UserSelectPage;
import ong.eu.soon.mobile.client.users.UsersPage;
import ong.eu.soon.mobile.client.utils.ParameterKey;
import ong.eu.soon.mobile.client.utils.StringHelper;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;

/**
 * Manages the history events, instantiating corresponding components according to them.
 * 
 * @author luis
 */
public class Navigation {

    public static final String PARAMETERS_SEPARATOR = "!";
    private static Navigation  INSTANCE;
    private boolean exitOnHistoryChange = false;

    /**
     * Returns the HistoryManager instance
     */
    public static Navigation get() {
        if (INSTANCE == null) {
            INSTANCE = new Navigation();
            History.addValueChangeHandler(new ValueChangeHandler<String>() {
                @Override
                public void onValueChange(ValueChangeEvent<String> event) {  
                    INSTANCE.handle(event.getValue());
                }
            });           
        }
        // Reset exitOnHistoryChange if user attempts to navigate
        INSTANCE.exitOnHistoryChange = false;
        return INSTANCE;
    }
 
    /**
     * Navigates to the given page
     */
    public void go(PageAnchor anchor) {
        go(anchor, null);
    }
    
    /**
     * Navigates to the given page without history
     * and without checks
     */
    public void goNoHistory(PageAnchor anchor) {        
        goNoHistory(anchor, null);
    }
    
    /**
     * Navigates to the given page with the given parameters, without history
     * and without checks
     */
    public void goNoHistory(PageAnchor anchor, Parameters parameters) {
        Page page = resolvePage(anchor);
        page.setPageAnchor(anchor);
        if(parameters != null) {
            page.setParameters(parameters);
        }
        go(page);
    }

    /**
     * Navigates to the given page with custom parameters
     */
    public void go(PageAnchor anchor, Parameters parameters) {
        if(anchor != null) {
            String newToken = anchor.toToken(parameters);
            goToken(newToken);
        }
    }
    
    /**
     * Go to a page using it's token
     */
    public void goToken(String token) {
        String currentToken = History.getToken();        
        if (StringHelper.isNotEmpty(currentToken) && currentToken.equals(token)) {
            // State has not changed
            History.fireCurrentHistoryState();
        } else {
            History.newItem(token);
        }
    }

    /**
     * Loads the initial page
     */
    public void loadInitialPage() {
        PageAnchor anchor = getInitialPageAnchor();
        go(anchor);
    }

    /**
     * Returns the initial page token, that is, the one used when no page is specified
     */
    private PageAnchor getInitialPageAnchor() {
        return getInitialPageAnchor(InfoproMobile.get().getAppState());
    }

    /**
     * Returns the initial page token, that is, the one used when no page is specified
     */
    private PageAnchor getInitialPageAnchor(AppState appStatus) {
        switch (appStatus) {
            case SERVER_NOT_CONFIGURED:
                // The server root URL is not configured - go to the configuration page.
                return PageAnchor.CONFIGURATION;
            default:
				break;
        }
        if (LoggedUser.get().isLoggedIn()) {
            // There is a logged user - go to the accounts.
            return PageAnchor.ACCOUNTS;
        }
        // No logged user - go to login page.
        return PageAnchor.LOGIN;
    }
    public  PageAnchor getServicePageAnchor() {
    	 if (LoggedUser.get().isOTPAuthenticated()) {
    		 return PageAnchor.SERVICES;
    	 }
    	 // Not yet authenticated with OTP
    	 return PageAnchor.OTP;
    }
    /**
     * Handles a History token change
     */
    private void handle(String token) {               
        
        // Check an empty token or if exit application is set
        if(StringHelper.isEmpty(token) || exitOnHistoryChange) {
            // If it is empty exit application
            InfoproMobile.get().getPhoneGap().exitApp();
            return;
        }
        
        // Check if we have parameters
        int separatorPosition = token.indexOf(PARAMETERS_SEPARATOR);

        // Get the page token
        String pageToken = separatorPosition < 0 ? token : token.substring(0, separatorPosition);
        
        // Get the page parameters
        String pageParams = separatorPosition < 0 ? null : token.substring(separatorPosition + PARAMETERS_SEPARATOR.length());
        
        PageAnchor pageAnchor = null;
        Parameters parameters = null;
        try {
            // Find the page anchor
            pageAnchor = PageAnchor.valueOf(pageToken.toUpperCase());

            // Parse the parameters
            if (StringHelper.isNotEmpty(pageParams)) {
                parameters = Parameters.parse(pageParams);
            }
        } catch (Exception e) {
            // When there is an error handling the history token, just use the initial anchor and no parameters
            pageAnchor = getInitialPageAnchor();
        }                  
        
        Page page = resolvePage(pageAnchor);
        
        // If no valid page return
        if(page == null) {
            return;
        }
        
        // Check if the new page is not the same as current page
        Page currentPage = InfoproMobile.get().getMainLayout().getCurrentPage();
        if(currentPage != null && page.getPageAnchor() == currentPage.getPageAnchor() && !isAlwaysNavigable(pageAnchor)) {
            return;
        }

        // Check if page is Login
        if(pageAnchor == PageAnchor.LOGIN) {
            if(LoggedUser.get().isLoggedIn()) {
                // Display logout confirmation prompt
                LogoutDialog logoutDialog = new LogoutDialog();
                logoutDialog.display();
                return;
            }
        }
                
        // Check if page is accessible
        if(isPageAllowed(page)) {
            // Prepare the page
            page.setParameters(parameters);
        } else {
            // Go to allowed page
            AppState status = InfoproMobile.get().getAppState();   
            page = resolvePage(getInitialPageAnchor(status));
        }                
        
        go(page);
    }
    
    /**
     * Check if the given page is allowed to be accessed with the current application status     
     */
    private boolean isPageAllowed(Page page) {
        AppState appStatus = InfoproMobile.get().getAppState();                  
                       
        switch (page.getPageAnchor()) {
            // To access configuration's page server must not be configured or user must not be logged in
            case CONFIGURATION:
                return appStatus == AppState.SERVER_NOT_CONFIGURED || !LoggedUser.get().isLoggedIn();   
            // Help page always can be accessed
            case HELP:
                return true;
            default:
            	break;
        }
        
        // To access a ready state page user must be logged in
        if(page.getMinimumAppState() == AppState.READY) {
            return LoggedUser.get().isLoggedIn();
        }
        
        // Any other page can be accessed if page status matches application status
        return page.getMinimumAppState().matches(appStatus);
    }

    /**
     * Maps the given token into a page
     */
    private Page resolvePage(PageAnchor anchor) {        
        Page page = null;
        Parameters parameters=new Parameters();
        switch (anchor) {
            case ACCOUNTS:
                page = new AccountsPage();
                break;
            case ACCOUNT_DETAILS:
                page = new AccountDetailsPage();
                break;
            case CONFIGURATION:
                page = new ConfigurationPage();
                break;
            case CONTACTS:
                page = new ContactsPage();
                break;
            case CONTACT_DETAILS:
                page = new ContactDetailsPage();
                break;         
            case CONTACT_SELECT:
                page = new ContactSelectPage();
                break;
            case FUND_TRANSFER:
            	page=new FundTransferPage();
    			parameters.add(ParameterKey.IS_SWIFT_TRANSFER, "False");
    			page.setParameters(parameters);
            	break;
            case HELP:
                page = new HelpPage();
                break;
           case LOAD_GENERAL_DATA:
                page = new LoadGeneralDataPage();
                break;
            case LOGIN:
                page = new LoginPage();
                break;   
            case MAKE_PAYMENT:
                page = new MakePaymentPage();
                break;
            case OTP:
                page = new OTPPage();
                break;  
            case PAYMENTS:
                page = new PaymentsPage();
                break;
            case PAYMENT_DETAILS:
                page = new PaymentDetailsPage();
                break;
            case PAYMENT_PREVIEW:
                page = new PaymentPreviewPage();
                break;
            case SWIFT_TRANSFER:
            	page=new FundTransferPage();
            	parameters=new Parameters();
    			parameters.add(ParameterKey.IS_SWIFT_TRANSFER, "True");
    			page.setParameters(parameters);
            	break;
            case TRANSACTION_DETAILS:
                page = new TransactionDetailsPage();
                break;
            case TRANSFERS:
                page = new TransfersPage();
			parameters=new Parameters();
			parameters.add(ParameterKey.IS_SYSTEM_ACCOUNT, "True");
			page.setParameters(parameters);
                break;
            case TRANSFERS_OWN_ACCOUNT:
                page = new TransfersPage();
			parameters=new Parameters();
			parameters.add(ParameterKey.IS_SYSTEM_ACCOUNT, "False");
			page.setParameters(parameters);
                break;
            case TRANSFER_PREVIEW:
                page = new TransferPreviewPage();
                break;
            case USERS:
                page = new UsersPage();
                break;
            case USER_DETAILS:
                page = new UserDetailsPage();
                break;
            case USER_SELECT:
                page = new UserSelectPage();
                break;
            case USER_SEARCH:
                page = new UserSearchPage();
                break;
            case SERVICE_PROVIDER:
            	page=new ServiceProvidersPage();
            	break;
            case SERVICES:
            	page=new SvcPage();
            	break;
		default:
			break;
        }      
        page.setPageAnchor(anchor);
        return page;
    }
    
    /**
     * Exits the application on the next history change
     */
    public void exitOnHistoryChange() {
        exitOnHistoryChange = true;
    }

    /**
     * Returns whether navigation always should work for the actual page
     */
    private boolean isAlwaysNavigable(PageAnchor anchor) {
        if(anchor != null) {
            switch(anchor) {
                case HELP:
                    return true;
			default:
				break;
            }
        }
        return false;
    }
    
    /**
     * Go to the given page and checks session before continue 
     */
    private void go(Page page) {
        AppState status = InfoproMobile.get().getAppState();
        // If a session exists check timeout
        if(status == AppState.READY) {            
            // User is active, reset timeout
            LoggedUser.get().initSessionTimeout();
            LoggedUser.get().initOTPTimeout();
        }        
        InfoproMobile.get().getMainLayout().show(page);
    }

	public void loadServiceProviderPage() {
		PageAnchor anchor = getServiceProviderPageAnchor();
        go(anchor);
		
	}

	private PageAnchor getServiceProviderPageAnchor() {
		return PageAnchor.SERVICE_PROVIDER ;
	}
   
}