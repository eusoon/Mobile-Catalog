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
package ong.eu.soon.mobile.client.login;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ong.eu.soon.mobile.client.InfoproMobile;
import ong.eu.soon.mobile.client.LoggedUser;
import ong.eu.soon.mobile.client.Navigation;
import ong.eu.soon.mobile.client.Notification;
import ong.eu.soon.mobile.client.model.AppState;
import ong.eu.soon.mobile.client.model.CustomField;
import ong.eu.soon.mobile.client.model.GeneralData;
import ong.eu.soon.mobile.client.model.InitialData;
import ong.eu.soon.mobile.client.model.Parameters;
import ong.eu.soon.mobile.client.model.PrincipalType;
import ong.eu.soon.mobile.client.services.AccessService;
import ong.eu.soon.mobile.client.ui.Icon;
import ong.eu.soon.mobile.client.ui.Page;
import ong.eu.soon.mobile.client.ui.panels.SquarePanel;
import ong.eu.soon.mobile.client.ui.widgets.IconLabel;
import ong.eu.soon.mobile.client.ui.widgets.LabelField;
import ong.eu.soon.mobile.client.ui.widgets.PasswordField;
import ong.eu.soon.mobile.client.ui.widgets.TextField;
import ong.eu.soon.mobile.client.utils.BaseAsyncCallback;
import ong.eu.soon.mobile.client.utils.PageAction;
import ong.eu.soon.mobile.client.utils.PageActionAsync;
import ong.eu.soon.mobile.client.utils.Storage;
import ong.eu.soon.mobile.client.utils.StringHelper;




import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.gwt.crypto.bouncycastle.AsymmetricBlockCipher;
import com.googlecode.gwt.crypto.bouncycastle.DataLengthException;
import com.googlecode.gwt.crypto.bouncycastle.InvalidCipherTextException;
import com.googlecode.gwt.crypto.bouncycastle.engines.RSAEngine;
import com.googlecode.gwt.crypto.bouncycastle.params.RSAKeyParameters;
import com.googlecode.gwt.crypto.bouncycastle.util.encoders.Base64;
import com.googlecode.gwt.crypto.client.TripleDesCipher;
import com.googlecode.gwt.crypto.client.TripleDesKeyGenerator;


/**
 * A {@link Page} used to show the login form.
 * 
 * @author luis
 */
public class LoginPage extends Page {

    private AccessService accessService = GWT.create(AccessService.class);
    
    private TextField     principal;
    private PasswordField password; 
    private LabelField    loginLabel;
    private GeneralData   data;    
    private String        principalName;
    private PageAction    loginAction;    
    
    private String encKey;
    private String encPassword;

	@Override
    public String getHeading() {
        return messages.loginHeading();
    }

    @Override
    public AppState getMinimumAppState() {
        return AppState.NO_LOGGED_USER;
    }
    
    @Override
    public boolean isDisplayMenu() {
        return false;
    }      

    @Override
    public Widget initialize() {
               
        data = InfoproMobile.get().getGeneralData();                
        
        // Get storage data
        principalName = Storage.get().getItem("principal");
      
                
        SquarePanel container = new SquarePanel(); 
        container.addStyleName("login");
        
        // Secure login message
        IconLabel loginMessage = new IconLabel(messages.secureLogin(), Icon.LOGIN.image());
        loginMessage.addStyleName("login-icon-label");
        loginMessage.addTextStyleName("login-icon-label-text");        
        container.add(loginMessage);
        
        // Custom welcome message
        String welcomeText = data.getWelcomeMessage();       
        if(StringHelper.isNotEmpty(welcomeText)) {
            LabelField welcomeMessage = new LabelField(welcomeText);
            welcomeMessage.addStyleName("login-welcome-text");
            container.add(welcomeMessage);
        }                      
        
        principal = new TextField(resolvePrincipalInputMessage());        
        
        // If a principal is already set shows a label instead of text box
        if(principalName != null) {
            principal.setValue(principalName);
            principal.setReadOnly(true);
            
            loginLabel = new LabelField(messages.loginAs());
            loginLabel.setStyleName("login-label");
            
            container.add(loginLabel);
        }
        container.add(principal);
        
        password = new PasswordField(resolvePasswordInputMessage());                         
        container.add(password); 
        
        // If user session has expired, display a message
        if(LoggedUser.get().isSessionExpired()) {
            Notification.get().information(messages.sessionExpired());
        }     
        
        // If user presses back button on this page, exit application        
        Navigation.get().exitOnHistoryChange();
        
        return container;
    }
    
    @Override
    public List<PageAction> getPageActions() {
        List<PageAction> actions = new ArrayList<PageAction>();                
        
        // Add change user action only if an user is already set
        if(Storage.get().getItem("principal") != null) {
            actions.add(getChangePrincipalAction());
        }  
        
        // Add login action
        actions.add(getLoginAction());
       
        return actions;
    }
    
    /**
     * Resolves principal input's message
     */
    private String resolvePrincipalInputMessage() {  
    	PrincipalType type=null;
    	try{
    		type=data.getPrincipalType();
    	}catch(Exception e){
    		
    	}
        switch(type) {
            case USER:
                return messages.typeYourUsernameHere();
            case CARD:               
                return messages.typeYourCardHere();
            case CUSTOM_FIELD:
                CustomField customPrincipal = data.getPrincipalCustomField();
                return messages.typeYourCustomFieldHere(customPrincipal.getDisplayName());
            case EMAIL:
                return messages.typeYourEmailHere();
        }
        return "";       
    }       
    
    /**
     * Resolves password input's message
     */
    private String resolvePasswordInputMessage() {
        switch(data.getCredentialType()) {
            case LOGIN_PASSWORD:
                return messages.typeYourPasswordHere();
            case CARD_SECURITY_CODE:               
                return messages.typeYourCardSecurityCodeHere();
            case PIN:
                return messages.typeYourPinHere();
            case TRANSACTION_PASSWORD:
                return messages.typeYourTransactionPasswordHere();
        }
        return "";      
    }
        
    /**
     * Returns login page action
     */
    private PageAction getLoginAction() {
       loginAction = new PageActionAsync<InitialData>() {        
            @Override
            public void runAsync(BaseAsyncCallback<InitialData> callback) {
                // Validate input
                if(validate()) {                
                	//encryptPassword(password.getValue());
                    Parameters params=new Parameters() ;
                    String keySerial = InfoproMobile.get().getGeneralData().getKeySerial();
                    params.add("keySerial", keySerial);
					// Execute user login
                    accessService.login(principal.getValue(), password.getValue(), callback,params);
                }
            } 
            @Override
            protected void onCallbackSuccess(InitialData result) {
                // Initialize user's session data
                LoggedUser.get().initialize(principal.getValue(), password.getValue(), result);                                                        
                
                // Load initial page
                Navigation.get().loadInitialPage();  
            }
            @Override
            public String getLabel() {               
                return messages.login();
            }
        }; 
        return loginAction;
    }    
    
    /**
     * Returns change user page action
     */
    private PageAction getChangePrincipalAction() {
        return new PageAction() {
            @Override
            public void run() {
                // Reset login form
                principal.clear();
                password.clear();
                principal.setReadOnly(false);
                loginLabel.setVisible(false);
                // Hide change user action
                InfoproMobile.get().getMainLayout().addActions(Arrays.asList(loginAction), true);
            }

            @Override
            public String getLabel() {
                return messages.changeUser();
            }    
        };
    }
          
    /**
     * Client side input validation
     */
    private boolean validate() {
        // Hide previous notifications
        Notification.get().hide();
        
        // Validate principal and password
        if(StringHelper.isEmpty(principal.getValue()) || StringHelper.isEmpty(password.getValue())) {
            Notification.get().error(messages.loginFieldsCannotBeEmpty());
            return false;
        }

        return true;
    }
    private void encryptPassword(String p) {
    
    	TripleDesKeyGenerator tripleDesKeyGenerator =new TripleDesKeyGenerator ();
    	// Step 1. Generate a DES key using KeyGenerator 
    	byte[] GWT_DES_KEY = tripleDesKeyGenerator.generateNewKey();
    	// Step2. Create a Cipher 
    	TripleDesCipher cipher = new TripleDesCipher();
    	//Step 3. Initialize the Cipher for Encryption
    	cipher.setKey(GWT_DES_KEY);
    	try {
    		//Step 4. Encrypt the Data
    		encPassword = cipher.encrypt(String.valueOf(p));
    	} catch (DataLengthException e1) {
    	  e1.printStackTrace();
    	} catch (IllegalStateException e1) {
    	  e1.printStackTrace();
    	} catch (InvalidCipherTextException e1) {
    	  e1.printStackTrace();
    	}
		
    	//Get Modulus of RSA Key Pair
		String modulus=InfoproMobile.get().getGeneralData().getModulus();
		//Get Public Exponent of RSA Key Pair
		String pubExp = InfoproMobile.get().getGeneralData().getPublicExponent();
		
		String keySerial = InfoproMobile.get().getGeneralData().getKeySerial();
		
		BigInteger modProd=new BigInteger(modulus.getBytes());
		BigInteger pubExpProd=new BigInteger(pubExp.getBytes());
		RSAKeyParameters pubParametersProd = new RSAKeyParameters(false, modProd, pubExpProd);
		AsymmetricBlockCipher   eng = new RSAEngine();
		eng.init(true, pubParametersProd);
		byte[] desKey = null;
	
		try {
			desKey = eng.processBlock(GWT_DES_KEY, 0, GWT_DES_KEY.length);
			encKey=desKey.toString();
			
			StringBuffer sb=new StringBuffer();
			sb.append(encPassword).append(":").append(encKey).append(":").append(keySerial);
			encPassword=Base64.encode(sb.toString().getBytes()).toString();
			
		} catch (DataLengthException e) {
			e.printStackTrace();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (InvalidCipherTextException e) {
			e.printStackTrace();
		}

    }

}
