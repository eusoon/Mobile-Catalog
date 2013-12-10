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
package ong.eu.soon.mobile.client.payments;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import ong.eu.soon.ifx.element.IssuedIdentType;
import ong.eu.soon.ifx.element.PmtId;
import ong.eu.soon.ifx.element.PmtKeys;
import ong.eu.soon.ifx.element.PmtSel;
import ong.eu.soon.ifx.element.RecSelect;
import ong.eu.soon.ifx.payment.PmtInqRq;
import ong.eu.soon.mobile.client.IFX;
import ong.eu.soon.mobile.client.LoggedUser;
import ong.eu.soon.mobile.client.Navigation;
import ong.eu.soon.mobile.client.Notification;
import ong.eu.soon.mobile.client.model.AccountStatus;
import ong.eu.soon.mobile.client.model.InitialData;
import ong.eu.soon.mobile.client.model.Parameters;
import ong.eu.soon.mobile.client.model.PaymentData;
import ong.eu.soon.mobile.client.model.PaymentPreview;
import ong.eu.soon.mobile.client.model.TransferTypeDetailed;
import ong.eu.soon.mobile.client.services.PaymentService;
import ong.eu.soon.mobile.client.ui.Page;
import ong.eu.soon.mobile.client.ui.PageAnchor;
import ong.eu.soon.mobile.client.ui.panels.SquarePanel;
import ong.eu.soon.mobile.client.ui.widgets.CustomFieldForm;
import ong.eu.soon.mobile.client.ui.widgets.CustomValueField;
import ong.eu.soon.mobile.client.ui.widgets.FormField;
import ong.eu.soon.mobile.client.ui.widgets.NumberField;
import ong.eu.soon.mobile.client.ui.widgets.SelectionField;
import ong.eu.soon.mobile.client.ui.widgets.TextAreaField;
import ong.eu.soon.mobile.client.utils.BaseAsyncCallback;
import ong.eu.soon.mobile.client.utils.PageAction;
import ong.eu.soon.mobile.client.utils.ParameterKey;
import ong.eu.soon.mobile.client.utils.StringHelper;
import ong.eu.soon.mobile.json.ifx.bill.BillInqRs;
import ong.eu.soon.mobile.json.ifx.element.BillRec;
import ong.eu.soon.mobile.json.ifx.element.BillerInfo;
import ong.eu.soon.mobile.json.ifx.element.CreditorCurAmt;
import ong.eu.soon.mobile.json.ifx.element.IssuedIdent;
import ong.eu.soon.mobile.json.ifx.element.OrgPartyInfo;
import ong.eu.soon.mobile.json.ifx.element.PartyInfo;
import ong.eu.soon.mobile.json.ifx.element.PartyKeys;
import ong.eu.soon.mobile.json.ifx.element.PersonPartyInfo;
import ong.eu.soon.mobile.json.ifx.element.PmtCreditDetail;
import ong.eu.soon.mobile.json.ifx.element.PmtInfo;
import ong.eu.soon.mobile.json.ifx.element.PmtInstruction;
import ong.eu.soon.mobile.json.ifx.element.PmtRec;
import ong.eu.soon.mobile.json.ifx.element.ToAcctKeys;
import ong.eu.soon.mobile.json.ifx.payment.PmtInqRs;


import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONNull;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Widget;

/**
 * A {@link Page} used to make a payment. 
 */
public class MakePaymentPage extends Page {

    private PaymentService paymentService = GWT.create(PaymentService.class);
    
    private InitialData data; 
    private FormField fields;
    private CustomFieldForm customFields;
    private SquarePanel container;
    private PaymentData paymentData;
    private NumberField amount;
    private TextAreaField description;
    private SelectionField<TransferTypeDetailed> transferTypes;
    private boolean isSystem;
  
    @Override
    public String getHeading() {
        return messages.makePaymentHeading();
    }

    @Override
    public Widget initialize() {
       
        container = new SquarePanel();  
        container.setVisible(false);
        
        data = LoggedUser.get().getInitialData();
        
        fields = new FormField();               

        transferTypes = new SelectionField<TransferTypeDetailed>() {
            @Override
            protected String getDisplayName(TransferTypeDetailed item) {
                return item.getName();
            }
            @Override
            protected void onItemSelected(TransferTypeDetailed item) {
                renderData(item);
            }
        };      
        
        amount = new NumberField(data.getDecimalCount(), data.getDecimalSeparator(), messages.amount());  
        amount.setOnlyPositive(true);
        
        description = new TextAreaField(messages.description());               
        
        customFields = new CustomFieldForm();
        
        container.add(fields);
        container.add(transferTypes);
        container.add(amount);
        container.add(description);   
        container.add(customFields);
        
        getPaymentData();
        
        return container;
    }
    
    /**
     * Fetches payment data and displays the page
     */
    private void getPaymentData() {
             
        Parameters params = new Parameters();                 
        Boolean isSystem = getParameters().getBoolean(ParameterKey.IS_SYSTEM_ACCOUNT);
        LoggedUser loggedUser=LoggedUser.get();
        PmtInqRq pmtInqRq=new PmtInqRq();
        pmtInqRq.setRqUID(IFX.getRqUID("PAY"));
		pmtInqRq.setMsgRqHdr(IFX.getMsgRqHdr(loggedUser,"pmtInq"));
        if(isSystem != null && isSystem) {
            this.isSystem = true;
            params.set(ParameterKey.DESTINATION, "SYSTEM");
            RecSelect[] recSelect=new RecSelect[1];
            recSelect[0].setString("$pmtInqRs.pmtRec.pmtInfo.pmtCreditDetail.toAcctKeys.acctIdent[acctIdentValue='"+"']");
            pmtInqRq.setRecSelect(recSelect);
        } else {           
            this.isSystem = false;
            Long memberId = getParameters().getRequiredLong(ParameterKey.ID);     
            params.set(ParameterKey.DESTINATION, "MEMBER");
            params.set(ParameterKey.TO_MEMBER_ID, memberId);
            RecSelect[] recSelect=new RecSelect[1];
            recSelect[0].setString("$pmtInqRs.pmtRec.pmtInfo.pmtCreditDetail.toAcctKeys[acctId='"+memberId+"']");
            pmtInqRq.setRecSelect(recSelect);
        }
        params.setObject(ParameterKey.PMTINQRQ, pmtInqRq);
        final BaseAsyncCallback<PaymentData> callback=new BaseAsyncCallback<PaymentData>(){

			@Override
			public void onSuccess(PaymentData result) {
				paymentData = result;                
                
                if(paymentData != null && paymentData.getTransferTypes() != null && paymentData.getTransferTypes().length() > 0) {            
                    
                    // Populate selection options and preselect the first item
                    transferTypes.setItems(paymentData.getTransferTypes());    
                    transferTypes.selectFirst();
                    
                    // If only exists a transfer type, hide selection field  
                    if(paymentData.getTransferTypes().length() == 1) {
                        transferTypes.setVisible(false);
                    }
                    
                    // Display data for the first transfer type retrieved
                    renderData(paymentData.getTransferTypes().get(0));
                    
                    // Display loaded data
                    container.setVisible(true);
                }   
				
			}
			
		};
        // Fetch payment data
        AsyncCallback<PmtInqRs> callback1=new AsyncCallback<PmtInqRs> (){

			@Override
			public void onFailure(Throwable caught) {
				callback.onFailure(caught);
				
			}

			@Override
			public void onSuccess(PmtInqRs pmtInqRs) {
				JsArray<PmtRec> pmtRecs=pmtInqRs.getPmtRec();
				JSONObject paymentData= new JSONObject();
				JSONObject transferTypes1= new JSONObject();
				JSONObject from=new JSONObject();
				JSONObject to=new JSONObject();
				for(int i=0; i<pmtRecs.length();i++){
					PmtRec pmtRec=pmtRecs.get(i);
					PmtInfo pmtInfo=pmtRec.getPmtInfo();
					JsArray<PmtCreditDetail> pmtCreditDetails=pmtInfo.getPmtCreditDetail();
					PmtInstruction pmtInstruction=pmtInfo.getPmtInstruction();
					String fromAccountName=pmtInfo.getPmtInstruction().getFromAcctRef().getAcctKeys().getAcctId().getString();
					from.put("name", getAsJSONString(fromAccountName));
					for(int j=0; j<pmtCreditDetails.length();j++){
						PmtCreditDetail pmtCreditDetail=pmtCreditDetails.get(j);
						CreditorCurAmt creditorCurAmt=pmtCreditDetail.getCreditorCurAmt();
						String symbol=creditorCurAmt.getCurCode().getCurCodeValue().getString();
						JSONObject currency=new JSONObject();;
						currency.put("symbol", getAsJSONString(symbol));
						ToAcctKeys toAcctKey=pmtCreditDetail.getToAcctKeys();
						String toAccountName=toAcctKey.getAcctId().getString();
						to.put("name", getAsJSONString(toAccountName));
						to.put("currency", currency);	
						symbol=pmtCreditDetail.getDebtorCurAmt().getCurCode().getCurCodeValue().getString();
						currency.put("symbol", getAsJSONString(symbol));
						from.put("currency", currency);	
						transferTypes1.put("to", to);
						transferTypes1.put("from", from);
						String name=pmtInstruction.getPmtMethod().getString();
						transferTypes1.put("name", getAsJSONString(name));
						paymentData.put("transferTypes", transferTypes1);
						PaymentData result=paymentData.getJavaScriptObject().cast();
						callback.onSuccess(result);	
					}	
				}
			}
			 private JSONValue getAsJSONString(String value) {
	        		if (value == null) {
	        			return JSONNull.getInstance();
	        		}

	        		return new JSONString(value);
	        	}
        };
		paymentService.doPaymentInq(params, callback1);

    }
    
    @Override
    public List<PageAction> getPageActions() {
        return Arrays.asList(getCancelAction(), getMakePaymentAction());
    }
    
    /**
     * Renders page data according to the given transfer type
     */
    private void renderData(TransferTypeDetailed item) {
        Map<String, String> formData = new LinkedHashMap<String, String>();
              
        AccountStatus status = paymentData.get(item.getFrom().getId());
        
        // Display account from and balance
        String html = item.getFrom().getName() + "<br><i>" + 
                      messages.balance() + ": " +
                      status.getFormattedBalance() + "</i>";
        
        formData.put(messages.from(), html);
        
        // If it is system show account name, otherwise display member name
        if(isSystem) {
            formData.put(messages.to(), item.getTo().getName());
        } else {
            formData.put(messages.to(), paymentData.getMemberTo().getName());
        }  
        
        fields.setData(formData);
        
        // Update amount place holder with currency name
        amount.setPlaceHolder(messages.amountIn(item.getTo().getCurrency().getName()));
        
        // Add custom fields
        customFields.setCustomFields(item.getCustomFields());     
    }

    /**
     * Returns make payment's action
     */
    private PageAction getMakePaymentAction() {
        return new PageAction() {
            @Override
            public void run() {  
                if(validatePayment()) {
                    setPageParameters();                   
                }
            }
            @Override
            public String getLabel() {             
                return messages.makePayment();
            }          
        };
    }
    
    /**
     * Sets the parameters to be used in payment preview and confirmation page
     */
    private void setPageParameters() {
        Parameters params = new Parameters();                    
        params.set(ParameterKey.TRANSFER_TYPE_ID, transferTypes.getSelectedItem().getId());
        params.set(ParameterKey.AMOUNT, amount.getValue());
        params.set(ParameterKey.DESCRIPTION, description.getValue());
        if(!isSystem) {
            params.set(ParameterKey.MEMBER_TO_ID, paymentData.getMemberTo().getId());
        }
        JSONArray values = new JSONArray();
        int i = 0;
        for(CustomValueField customValueField : customFields.getCustomValueFields()) {                        
            values.set(i, customValueField.getValue());
            i++;
        }
        params.setObjectList(ParameterKey.CUSTOM_VALUES, values);        
        // Get data and go to payment preview page
        getPaymentPreviewData(params);
    }
    
    /**
     * Returns the payment preview data
     */
    private void getPaymentPreviewData(final Parameters params) { 
    	final BaseAsyncCallback<PaymentPreview> callback=new BaseAsyncCallback<PaymentPreview>(){
    		 @Override
             public void onSuccess(PaymentPreview result) {
                 PaymentPreview preview = result; 
                 params.setObject(ParameterKey.PAYMENT_PREVIEW, preview);
                 Navigation.get().goNoHistory(PageAnchor.PAYMENT_PREVIEW, params);
             }  
    		
    	};
    	AsyncCallback<BillInqRs> callback1=new AsyncCallback<BillInqRs>(){

			@Override
			public void onFailure(Throwable caught) {
				callback.onFailure(caught);
				
			}

			@Override
			public void onSuccess(BillInqRs billInqRs) {
				JSONObject paymentPreview= new JSONObject();
				JSONObject from= new JSONObject();
				JSONObject to= new JSONObject();
				paymentPreview.put("from", from);
				JsArray<BillRec> billRecs=billInqRs.getBillRec();
				for(int i=0; i<billRecs.length();i++){
					BillRec billRec=billRecs.get(i);
					BillerInfo billerInfo=billRec.getBillInfo().getBillerInfo();
					
					String billerName=billerInfo.getName().getString();
					String toAccount=billerInfo.getCreditorData().getCreditorAcctNumWithDebtor().getString();
					
				}
				
				PaymentPreview result1=paymentPreview.getJavaScriptObject().cast();
				callback.onSuccess(result1);
				
			}
			private JSONValue getAsJSONString(String value) {
        		if (value == null) {
        			return JSONNull.getInstance();
        		}

        		return new JSONString(value);
        	}
    	};
		paymentService.doPaymentPreview(isSystem, params, callback1);
//        paymentService.getPaymentPreview(isSystem, params, new BaseAsyncCallback<PaymentPreview>() {
//            @Override
//            public void onSuccess(PaymentPreview result) {
//                PaymentPreview preview = result; 
//                params.setObject(ParameterKey.PAYMENT_PREVIEW, preview);
//                Navigation.get().goNoHistory(PageAnchor.PAYMENT_PREVIEW, params);
//            }          
//        });
    }
    
    /**
     * Returns cancel's page action
     */
    private PageAction getCancelAction() {
        return new PageAction() {
            @Override
            public void run() {
                Navigation.get().go(PageAnchor.PAYMENTS);
            }
            @Override
            public String getLabel() {
                return messages.cancel();
            }            
        };
    }
    
    /**
     * Client side validation before make a payment
     */
    private boolean validatePayment() {
        if(StringHelper.isEmpty(amount.getValue())) {
            Notification.get().error(messages.amountIsRequired());
            return false;
        }       
        return true;               
    }
}
