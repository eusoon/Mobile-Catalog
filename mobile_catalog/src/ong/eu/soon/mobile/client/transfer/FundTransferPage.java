package ong.eu.soon.mobile.client.transfer;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import ong.eu.soon.ifx.acct.AcctInqRq;
import ong.eu.soon.ifx.element.RecSelect;
import ong.eu.soon.ifx.payee.CustPayeeInqRq;
import ong.eu.soon.mobile.client.IFX;
import ong.eu.soon.mobile.client.LoggedUser;
import ong.eu.soon.mobile.client.Navigation;
import ong.eu.soon.mobile.client.Notification;
import ong.eu.soon.mobile.client.callback.AcctInqRsCallbackWrapper;
import ong.eu.soon.mobile.client.callback.CustPayeeInqRsCallbackWrapper;
import ong.eu.soon.mobile.client.model.Account;
import ong.eu.soon.mobile.client.model.AccountData;
import ong.eu.soon.mobile.client.model.AccountStatus;
import ong.eu.soon.mobile.client.model.Contact;
import ong.eu.soon.mobile.client.model.InitialData;
import ong.eu.soon.mobile.client.model.Parameters;
import ong.eu.soon.mobile.client.model.PaymentPreview;
import ong.eu.soon.mobile.client.services.AccountService;
import ong.eu.soon.mobile.client.services.ContactService;
import ong.eu.soon.mobile.client.ui.Page;
import ong.eu.soon.mobile.client.ui.PageAnchor;
import ong.eu.soon.mobile.client.ui.panels.SquarePanel;
import ong.eu.soon.mobile.client.ui.widgets.FormField;
import ong.eu.soon.mobile.client.ui.widgets.NumberField;
import ong.eu.soon.mobile.client.ui.widgets.SelectionField;
import ong.eu.soon.mobile.client.ui.widgets.TextAreaField;
import ong.eu.soon.mobile.client.ui.widgets.TextField;
import ong.eu.soon.mobile.client.utils.BaseAsyncCallback;
import ong.eu.soon.mobile.client.utils.PageAction;
import ong.eu.soon.mobile.client.utils.ParameterKey;
import ong.eu.soon.mobile.client.utils.StringHelper;
import ong.eu.soon.mobile.json.ifx.acct.AcctInqRs;
import ong.eu.soon.mobile.json.ifx.payee.CustPayeeInqRs;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONNull;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;


public class FundTransferPage extends Page {
	private InitialData data;
	private FormField fromFields;
	private FormField toFields;
	private SquarePanel container;
	private NumberField amount;
	private TextAreaField description;
	private TextField swiftcode;
	private SelectionField<AccountData> fromAccount;
	private SelectionField<AccountData> toAccount;
	// private SelectionField<TransferTypeDetailed> transferTypes;
	final ListBox fromBox = new ListBox(false);
	final ListBox toBox = new ListBox(false);

	private ContactService payeeService = GWT.create(ContactService.class);
	private AccountService accountService = GWT.create(AccountService.class);

	private LoggedUser loggedUser = LoggedUser.get();
	private String unitsPattern;
	private JSONArray accountDataList;
	private boolean isSwiftTransfer;
	private String unitPattern;
	public String getUnitPattern() {
		return unitPattern;
	}

	public void setUnitPattern(String unitPattern) {
		this.unitPattern = unitPattern;
	}

	@Override
	public String getHeading() {
		return messages.fundTransferHeading();
	}

	@Override
	public Widget initialize() {
		container = new SquarePanel();
		container.setVisible(false);

		data = LoggedUser.get().getInitialData();

		this.fromFields=new FormField();
		this.toFields=new FormField();
		
		fromAccount = new SelectionField<AccountData>() {
			@Override
			protected String getDisplayName(AccountData item) {
				return item.getAccount().getAccountNo();
			}

			@Override
			protected void onItemSelected(AccountData item) {
				renderFromData(item, messages.from(), "MYR");
			}
		};
		toAccount = new SelectionField<AccountData>() {
			@Override
			protected String getDisplayName(AccountData item) {
				return item.getAccount().getAccountNo();
			}

			@Override
			protected void onItemSelected(AccountData item) {
				renderToData(item, messages.to(), "MYR");
			}
		};

		amount = new NumberField(data.getDecimalCount(),
				data.getDecimalSeparator(), messages.amount());
		amount.setOnlyPositive(true);

		description = new TextAreaField(messages.description());
		
		swiftcode = new TextField();

		Parameters params=this.getParameters();
		isSwiftTransfer=params.getBoolean(ParameterKey.IS_SWIFT_TRANSFER);
		if(isSwiftTransfer){
			swiftcode.setVisible(true);
		}else{
			swiftcode.setVisible(false);
		}
		container.add(fromBox);
		container.add(toBox);
		container.add(amount);
		container.add(description);
		container.add(swiftcode);

		return container;
	}

	

	private void getBeneficiaryAccountData(final Long memberId){
		final Parameters params=new Parameters();
		params.set(ParameterKey.DESTINATION, "SYSTEM");
		CustPayeeInqRq custPayeeInqRq=new CustPayeeInqRq();
		custPayeeInqRq.setRqUID(IFX.getRqUID("PAYEE"));
		custPayeeInqRq.setMsgRqHdr(IFX.getMsgRqHdr(loggedUser,"custPayeeInq"));
		
		RecSelect[] recSelect=new RecSelect[1];
		recSelect[0].setString("$custPayeeInqRs.custPayeeRec.custPayeeEnvr.partyKeys[partyId='"+memberId+"']");
		custPayeeInqRq.setRecSelect(recSelect);
		
		params.setObject("custPayeeInqRq", custPayeeInqRq);
		final BaseAsyncCallback<Contact> callback=new BaseAsyncCallback<Contact>(){

			@Override
			public void onSuccess(Contact contact) {
				final LoggedUser loggerUser = LoggedUser.get();
				
				if (contact != null) {
					final Parameters params=new Parameters();
	            	AcctInqRq acctInqRq=new AcctInqRq();
					acctInqRq.setRqUID(IFX.getRqUID("ACCT"));
					acctInqRq.setMsgRqHdr(IFX.getMsgRqHdr(loggerUser, "AcctInq"));

					RecSelect[] recSelect = new RecSelect[1];
					recSelect[0].setString("$.acctInqRs.acctRec.acctEnvr.partyKeys.loginIdent[?(@.loginName='"+contact.getMember().getUsername()+"')]");
					acctInqRq.setRecSelect(recSelect);
					
					params.add("accInqRq", acctInqRq);
					
					new AcctInqRsCallbackWrapper() {

							protected void onFailure(Throwable throwable) {
					        	
					        }
							@Override
							protected void onSuccess(JsArray<AccountData> result1) {
								renderAccount(result1);
							}
							@Override
							protected void onCall(AsyncCallback<AcctInqRs> callback) {
								// Fetch account data
								this.setUnitPattern(unitPattern);
								accountService.getAccountsData(params, callback);
							}
					      }.call(); 
				}
				
			}
			
		};
		new CustPayeeInqRsCallbackWrapper(){

			@Override
			protected void onSuccess(
					JsArray<ong.eu.soon.mobile.client.model.Contact> result) {
				
				callback.onSuccess(result.get(0));
				
			}

			@Override
			protected void onFailure(Throwable throwable) {
				callback.onFailure(throwable);	
				
			}

			@Override
			protected void onCall(AsyncCallback<CustPayeeInqRs> callback) {
				payeeService.doCustPayeeInq(memberId, params, callback); 
			}
	
		}.call();

		
	}

	private JsArray<AccountData> getOwnAccountData() {
		
		return loggedUser.getInitialData().getAccountDatas();
		
	}

	
	private void renderAccount(JsArray<AccountData> beneficiaryAccounts ){

		JsArray<AccountData> ownAccounts = this.getOwnAccountData();

		if (ownAccounts != null && ownAccounts.length() > 0) {
			fromAccount.setItems(ownAccounts);
			fromAccount.selectFirst();
			if (ownAccounts.length() == 1) {
				fromAccount.setVisible(false);
			}
			renderFromData(ownAccounts.get(0), messages.from(), "MYR");
		}
		if (beneficiaryAccounts != null && beneficiaryAccounts.length() > 0) {

				// Populate selection options and preselect the first item

				toAccount.setItems(beneficiaryAccounts);
				toAccount.selectFirst();

				// If only exists a transfer type, hide selection field
				if (beneficiaryAccounts.length() == 1) {
					toAccount.setVisible(false);
				}

				// Display data for the first transfer type retrieved

				renderToData(beneficiaryAccounts.get(0), messages.to(), "MYR");
				// Display loaded data
				container.setVisible(true);
			}
		if (ownAccounts != null && ownAccounts.length() > 0) {

				// Populate selection options and preselect the first item

				toAccount.setItems(ownAccounts);
				toAccount.selectFirst();

				// If only exists a transfer type, hide selection field
				if (ownAccounts.length() == 1) {
					toAccount.setVisible(false);
				}

				// Display data for the first transfer type retrieved

				renderToData(ownAccounts.get(0), messages.to(), "MYR");
				// Display loaded data
				container.setVisible(true);
			
		}
	}

	/**
	 * Renders page data according to the given transfer type
	 * 
	 * @param title
	 * @param currencyCode
	 */
	private void renderFromData(AccountData item, String title, String currencyCode) {
		Map<String, String> formData = new LinkedHashMap<String, String>();

		AccountStatus status = item.getStatus();

		// Display account from and balance
		String html = item.getAccount().getAccountNo() + "<br><i>"
				+ messages.balance() + ": " + status.getFormattedBalance()
				+ "</i>";

		formData.put(title, html);

		fromFields.setData(formData);

		// Update amount place holder with currency name
		amount.setPlaceHolder(messages.amountIn(currencyCode));

	}
	private void renderToData(AccountData item, String title, String currencyCode) {
		Map<String, String> formData = new LinkedHashMap<String, String>();


		// Display account from and balance
		String html = item.getAccount().getAccountNo() ;

		formData.put(title, html);

		toFields.setData(formData);

		// Update amount place holder with currency name
		amount.setPlaceHolder(messages.amountIn(currencyCode));

	}

	public String getUnitsPattern() {
		return this.unitsPattern;
	}

	public void setUnitsPattern(String unitsPattern) {
		this.unitsPattern = unitsPattern;
	}

	@Override
	public List<PageAction> getPageActions() {
		return Arrays.asList(getCancelAction(), getMakePaymentAction());
	}

	/**
	 * Returns make payment's action
	 */
	private PageAction getMakePaymentAction() {
		return new PageAction() {
			@Override
			public void run() {
				if (validatePayment()) {
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
		params.set(ParameterKey.CURRENCY_CODE, toAccount.getSelectedItem()
				.getAccount().getType().getCurrency().getName());
		params.set(ParameterKey.TO_ACCOUNT_ID, toAccount.getSelectedItem()
				.getId());
		params.setObject(ParameterKey.TO_ACCOUNT_NO, toAccount
				.getSelectedItem().getAccount());
		params.set(ParameterKey.FROM_ACCOUNT_ID, fromAccount.getSelectedItem()
				.getId());
		params.setObject(ParameterKey.FROM_ACCOUNT_NO, fromAccount
				.getSelectedItem().getAccount());
		params.set(ParameterKey.AMOUNT, amount.getValue());
		params.set(ParameterKey.DESCRIPTION, description.getValue());
		if(isSwiftTransfer){
			params.set(ParameterKey.SWIFTCODE, swiftcode.getValue());
		}
		params.set(ParameterKey.MEMBER_TO_ID, toAccount.getSelectedItem().getMember().getId());

		// Get data and go to payment preview page
		getPaymentPreviewData(params);
	}

	/**
	 * Returns the payment preview data
	 */
	private void getPaymentPreviewData(final Parameters params) {
		JSONObject transferPreview = new JSONObject();

		JSONObject fromMember = new JSONObject();
		String fromUsername = null;
		fromMember.put("username", getAsJSONString(fromUsername));
		String fromMemberName = null;
		fromMember.put("name", getAsJSONString(fromMemberName));
		String fromMemberEmail = null;
		fromMember.put("email", getAsJSONString(fromMemberEmail));

		JSONObject toMember = new JSONObject();
		String toUsername = null;
		toMember.put("username", getAsJSONString(toUsername));
		String toMemberName = null;
		toMember.put("name", getAsJSONString(toMemberName));
		String toMemberEmail = null;
		toMember.put("email", getAsJSONString(toMemberEmail));

		transferPreview.put("from", fromMember);
		transferPreview.put("to", toMember);
		String finalAmount = params.getRequiredString(ParameterKey.AMOUNT);
		transferPreview.put("finalAmount", getAsJSONString(finalAmount));

		JSONObject transferType = new JSONObject();
		JSONObject fromAccount = new JSONObject();
		JSONObject toAccount = new JSONObject();
		JSONObject currency = new JSONObject();

		Account fromAccount1 = (Account) params
				.getObject(ParameterKey.FROM_ACCOUNT_NO);
		String fromAccountName = fromAccount1.getAccountNo();
		fromAccount.put("name", getAsJSONString(fromAccountName));
		Account toAccount1 = (Account) params
				.getObject(ParameterKey.TO_ACCOUNT_NO);
		String toAccountName = toAccount1.getAccountNo();
		toAccount.put("name", getAsJSONString(toAccountName));
		String currencyCode = params.getString(ParameterKey.CURRENCY_CODE);
		currency.put("sysmbol", getAsJSONString(currencyCode));
		fromAccount.put("currency", currency);
		toAccount.put("currency", currency);

		transferType.put("from", fromAccount);
		transferType.put("to", toAccount);
		transferType.put("name", getAsJSONString("Fund Transfer"));
		transferPreview.put("transferType", transferType);
		
	
		if(isSwiftTransfer){
			String swift_code = params.getString(ParameterKey.SWIFTCODE);
			transferPreview.put("swiftcode", getAsJSONString(swift_code));
		}

		PaymentPreview preview = transferPreview.getJavaScriptObject().cast();
		params.setObject(ParameterKey.TRANSFER_PREVIEW, preview);
		Navigation.get().goNoHistory(PageAnchor.TRANSFER_PREVIEW, params);

	}

	private JSONValue getAsJSONString(String value) {
		if (value == null) {
			return JSONNull.getInstance();
		}

		return new JSONString(value);
	}

	/**
	 * Returns cancel's page action
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

	/**
	 * Client side validation before make a payment
	 */
	private boolean validatePayment() {
		if (StringHelper.isEmpty(amount.getValue())) {
			Notification.get().error(messages.amountIsRequired());
			return false;
		}
		return true;
	}

}
