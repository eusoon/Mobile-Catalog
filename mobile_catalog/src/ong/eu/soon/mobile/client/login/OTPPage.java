package ong.eu.soon.mobile.client.login;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ong.eu.soon.mobile.client.InfoproMobile;
import ong.eu.soon.mobile.client.LoggedUser;
import ong.eu.soon.mobile.client.Navigation;
import ong.eu.soon.mobile.client.Notification;
import ong.eu.soon.mobile.client.model.InitialData;
import ong.eu.soon.mobile.client.model.OTP;
import ong.eu.soon.mobile.client.services.AccessService;
import ong.eu.soon.mobile.client.ui.Icon;
import ong.eu.soon.mobile.client.ui.Page;
import ong.eu.soon.mobile.client.ui.panels.SquarePanel;
import ong.eu.soon.mobile.client.ui.widgets.IconLabel;
import ong.eu.soon.mobile.client.ui.widgets.LabelField;
import ong.eu.soon.mobile.client.ui.widgets.PasswordField;
import ong.eu.soon.mobile.client.utils.BaseAsyncCallback;
import ong.eu.soon.mobile.client.utils.PageAction;
import ong.eu.soon.mobile.client.utils.PageActionAsync;
import ong.eu.soon.mobile.client.utils.Storage;
import ong.eu.soon.mobile.client.utils.StringHelper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Widget;


public class OTPPage extends Page {
	
	private AccessService accessService = GWT.create(AccessService.class);
	private PasswordField otp;
	private PageAction    otpAction;  
	private LabelField    otpLabel;
	
	@Override
	public String getHeading() {
		return messages.otpHeading();
	}
	 @Override
	public boolean isDisplayMenu() {
	    return false;
	}  

	@Override
	public Widget initialize() {
		SquarePanel container = new SquarePanel(); 
        container.addStyleName("login");
     // Secure login message
        IconLabel otpMessage = new IconLabel(messages.secureLogin(), Icon.LOGIN.image());
        otpMessage.addStyleName("login-icon-label");
        otpMessage.addTextStyleName("login-icon-label-text");        
        container.add(otpMessage);
        
        otpLabel = new LabelField(messages.otpHeading());
        otpLabel.setStyleName("login-label");
        container.add(otpLabel);
        otp = new PasswordField(messages.typeYourOTPHere());                         
        container.add(otp); 
     // If otp session has expired, display a message
        if(LoggedUser.get().isOTPExpired()) {
            Notification.get().information(messages.otpExpired());
        } 
        return container;
	}
	 @Override
	    public List<PageAction> getPageActions() {
	        List<PageAction> actions = new ArrayList<PageAction>();                
	        
	        if(LoggedUser.get().isOTPExpired()) {
	            actions.add(getNewOTPAction());
	        }  
	        
	        // Add otp action
	        actions.add(getOTPAction());
	       
	        return actions;
	    }
	  /**
	     * Returns otp page action
	     */
	    private PageAction getOTPAction() {
	       otpAction = new PageAction() {        
	            @Override
	            public void run() {
	                // Validate input
	                if(validate()) {                
	                	LoggedUser.get().OTPAuthenticated(otp.getValue());
	                	Navigation.get().loadServiceProviderPage();
	                }
	            } 
	          
	            @Override
	            public String getLabel() {               
	                return messages.otpHeading();
	            }
	        }; 
	        return otpAction;
	    }
	 /**
	     * Returns new otp page action
	     */
	    private PageAction getNewOTPAction() {
	    	 otpAction = new PageActionAsync<OTP>() { 
	            @Override
	            public void runAsync(BaseAsyncCallback<OTP> callback) {
	            	
	                // Reset otp form
	                otp.clear();
//	                otp.setReadOnly(false);
	                otpLabel.setVisible(false);
	                accessService.newOTP(callback);

	            }
	            @Override
	            protected void onCallbackSuccess(OTP otp) {
	               LoggedUser.get().setOTP(otp.getOTPValue());
	               InfoproMobile.get().getMainLayout().addActions(Arrays.asList(otpAction), true);
	            }
	            @Override
	            public String getLabel() {
	                return messages.newOTP();
	            }    
	        };
	        return otpAction;
	    }
	/*
	 * Client side input validation
     */
    private boolean validate() {
        // Hide previous notifications
        Notification.get().hide();
        
        // Validate principal and password
        if(StringHelper.isEmpty(otp.getValue()))  {
            Notification.get().error(messages.otpFieldsCannotBeEmpty());
            return false;
        }

        return true;
    }
}
