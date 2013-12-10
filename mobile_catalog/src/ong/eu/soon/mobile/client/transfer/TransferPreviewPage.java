package ong.eu.soon.mobile.client.transfer;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import ong.eu.soon.mobile.client.LoggedUser;
import ong.eu.soon.mobile.client.Navigation;
import ong.eu.soon.mobile.client.Notification;
import ong.eu.soon.mobile.client.model.Fee;
import ong.eu.soon.mobile.client.model.Parameters;
import ong.eu.soon.mobile.client.model.PaymentConfirm;
import ong.eu.soon.mobile.client.model.PaymentPreview;
import ong.eu.soon.mobile.client.model.TransferType;
import ong.eu.soon.mobile.client.services.PaymentService;
import ong.eu.soon.mobile.client.services.XferService;
import ong.eu.soon.mobile.client.ui.Page;
import ong.eu.soon.mobile.client.ui.PageAnchor;
import ong.eu.soon.mobile.client.ui.panels.SquarePanel;
import ong.eu.soon.mobile.client.ui.widgets.FormField;
import ong.eu.soon.mobile.client.ui.widgets.LabelField;
import ong.eu.soon.mobile.client.ui.widgets.PasswordField;
import ong.eu.soon.mobile.client.utils.BaseAsyncCallback;
import ong.eu.soon.mobile.client.utils.PageAction;
import ong.eu.soon.mobile.client.utils.PageActionAsync;
import ong.eu.soon.mobile.client.utils.ParameterKey;
import ong.eu.soon.mobile.client.utils.StringHelper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;


public class TransferPreviewPage extends Page {

	private XferService xferService = GWT.create(XferService.class);
	private PaymentPreview preview;
    private SquarePanel container;
    private FormField form;
    private FlowPanel password;
    private PasswordField passwordField;
    private LabelField title;
    
    private boolean isSystem;
    private boolean requirePassword;
	@Override
	public String getHeading() {
		return messages.paymentConfirmationHeading();
	}

	@Override
	public Widget initialize() {
		isSystem = StringHelper.isEmpty(getParameters().getString(ParameterKey.MEMBER_TO_ID));
        requirePassword = LoggedUser.get().getInitialData().isRequireTransactionPassword();
        preview = (PaymentPreview) getParameters().getObject(ParameterKey.PAYMENT_PREVIEW);
        
        container = new SquarePanel();
        container.setVisible(false);
                
        form = new FormField();      
        title = new LabelField(messages.youAreAboutToPerformTheFollowingPayment());
        title.addStyleName("payment-label-field");
        
        password = new FlowPanel();
        
        container.add(title);
        container.add(form);
        container.add(password);
        
        renderPreviewData();
        
        return container;
	}
	/**
     * Renders the form with the data
     */
    private void renderPreviewData() {        
       
        TransferType transferType = preview.getTransferType();            
        JsArray<Fee> fees = preview.getFees();
        JsArrayString customFieldKeys = preview.getCustomFieldKeys();
        String to = preview.getTo() != null ? preview.getTo().getName() : transferType.getTo().getName(); 
        String description = getParameters().getString(ParameterKey.DESCRIPTION);                 
        boolean requireAuth = preview.isWouldRequireAuth();
        
        String feesData = "";
        if(fees != null && fees.length() > 0) {
            for(int i = 0; i < fees.length(); i++) {             
                Fee fee = fees.get(i);
                feesData += fee.getName() + "<br>" + messages.amount() + ": " + fee.getFormattedAmount() + "<br>";
            }
        }      
                       
        Map<String, String> formData = new LinkedHashMap<String, String>();                               
        formData.put(messages.transactionType(), transferType.getName());
        formData.put(messages.to(), to);
        formData.put(messages.amount(), preview.getFormattedFinalAmount());        
        formData.put(messages.description(), description);    
        
        if(customFieldKeys != null && customFieldKeys.length() > 0) {
            for(int i = 0; i < customFieldKeys.length(); i++) {
                String displayName = customFieldKeys.get(i);
                formData.put(displayName, preview.getCustomFieldValue(displayName));
            }       
        }      
        
        formData.put(messages.appliedFees(), feesData);
        
        form.setData(formData);
        
        if(requirePassword) {
            LabelField supplyPassword = new LabelField(messages.supplyTransactionPassword());
            supplyPassword.addStyleName("transaction-password-label-field");
            passwordField = new PasswordField(messages.typeYourTransactionPasswordHere());
            password.add(supplyPassword);
            password.add(passwordField);            
        }          
        
        if(requireAuth) {
            title.setText(messages.youAreAboutToPerformTheFollowingPaymentWithAuth());
        }
        container.setVisible(true);
    }
    @Override
    public List<PageAction> getPageActions() {
        return Arrays.asList(getCancelAction(), getConfirmAction());
    }
    
    /**
     * Validates input data before confirm the payment
     */
    private boolean validateData() {
        if(requirePassword && StringHelper.isEmpty(passwordField.getValue())) {
            Notification.get().error(messages.transactionPasswordIsRequired());
            return false;
        }
        return true;
    }
    /**
     * Returns confirm payment's page action
     */
    private PageAction getConfirmAction() {
        return new PageActionAsync<PaymentConfirm>() {     
            @Override
            public void runAsync(BaseAsyncCallback<PaymentConfirm> callback) {
                if(!validateData()) {
                    return;
                }        
                // Set the parameters to be used in confirmation
                Parameters confirmParams = new Parameters();
                confirmParams.setValues(getParameters().getValues());
                confirmParams.setObjectList(getParameters().getObjectList());                
                if(requirePassword) {
                    confirmParams.set(ParameterKey.TRANSACTION_PASSWORD, passwordField.getValue());
                }
                xferService.doTransfer(isSystem, confirmParams, callback);
            }
            @Override
            protected void onCallbackSuccess(PaymentConfirm result) {
                // Go to payment details page
                Parameters params = new Parameters();
                params.set(ParameterKey.ID, result.getPaymentId().toString());
                if(result.isPending()) {
                    params.set(ParameterKey.PAYMENT_PENDING, true);                            
                } else {
                    params.set(ParameterKey.PAYMENT_DONE, true);
                }
                Navigation.get().go(PageAnchor.TRANSFERS, params);
            }
            @Override
            public String getLabel() {             
                return messages.confirmPayment();
            }            
        };
    }
    
    /**
     * Returns the cancel's action page
     */
    private PageAction getCancelAction() {
        return new PageAction() {
            @Override
            public void run() {
                Navigation.get().go(PageAnchor.SERVICES);
            }
            @Override
            public String getLabel() {
                return messages.cancel();
            }            
        };
    }
}
