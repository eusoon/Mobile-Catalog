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

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import ong.eu.soon.ifx.element.CustPayeeId;
import ong.eu.soon.ifx.element.CustPayeeInfo;
import ong.eu.soon.ifx.element.CustPayeeKeys;
import ong.eu.soon.ifx.element.CustPayeeSel;
import ong.eu.soon.ifx.payee.CustPayeeAddRq;
import ong.eu.soon.ifx.payee.CustPayeeDelRq;
import ong.eu.soon.ifx.payee.CustPayeeInqRq;
import ong.eu.soon.mobile.client.IFX;
import ong.eu.soon.mobile.client.InfoproMobile;
import ong.eu.soon.mobile.client.LoggedUser;
import ong.eu.soon.mobile.client.Navigation;
import ong.eu.soon.mobile.client.Notification;
import ong.eu.soon.mobile.client.callback.CustPayeeInqRsCallbackWrapper;
import ong.eu.soon.mobile.client.model.Contact;
import ong.eu.soon.mobile.client.model.CustomFieldValue;
import ong.eu.soon.mobile.client.model.Member;
import ong.eu.soon.mobile.client.model.Parameters;
import ong.eu.soon.mobile.client.services.ContactService;
import ong.eu.soon.mobile.client.ui.Page;
import ong.eu.soon.mobile.client.ui.PageAnchor;
import ong.eu.soon.mobile.client.ui.panels.SquarePanel;
import ong.eu.soon.mobile.client.ui.widgets.EmailField;
import ong.eu.soon.mobile.client.ui.widgets.FormField;
import ong.eu.soon.mobile.client.ui.widgets.PromptDialog;
import ong.eu.soon.mobile.client.utils.BaseAsyncCallback;
import ong.eu.soon.mobile.client.utils.PageAction;
import ong.eu.soon.mobile.client.utils.PageActionAsync;
import ong.eu.soon.mobile.client.utils.ParameterKey;
import ong.eu.soon.mobile.json.ifx.element.CustPayeeRec;
import ong.eu.soon.mobile.json.ifx.element.Email;
import ong.eu.soon.mobile.json.ifx.element.Locator;
import ong.eu.soon.mobile.json.ifx.payee.CustPayeeAddRs;
import ong.eu.soon.mobile.json.ifx.payee.CustPayeeDelRs;
import ong.eu.soon.mobile.json.ifx.payee.CustPayeeInqRs;


import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.json.client.JSONNull;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Widget;

/**
 * A {@link Page} used to display contact details.
 */
public class ContactDetailsPage extends Page {

	private ContactService contactService = GWT.create(ContactService.class);

	private Contact contact;
	private FormField form;
	private List<PageAction> actions;
	private Long memberId;
	private SquarePanel container;

	@Override
	public String getHeading() {
		return messages.contactDetailsHeading();
	}

	@Override
	public Widget initialize() {

		container = new SquarePanel(true);
		container.setVisible(false);

		// Create form and sets labels
		form = new FormField();

		memberId = getParameters().getRequiredLong(ParameterKey.ID);
		Boolean save = getParameters().getBoolean(ParameterKey.SAVE);

		// If save, show success notification
		if (save != null && save) {
			Notification.get().success(messages.contactAdded());
		}

		// Actions will be rendered asynchronously when a member contact is
		// retrieved
		actions = new ArrayList<PageAction>();
		actions.add(getRemoveContactAction());
		if (LoggedUser.get().getInitialData().canMakeMemberPayments()) {
			actions.add(getMakePaymentAction());
		}

		// Display contact information
		getContact(memberId);

		container.add(form);

		return container;
	}

	/**
	 * Retrieves contact data and renders the form
	 */
	private void getContact(final Long memberId) {
		final LoggedUser loggerUser = LoggedUser.get();
		final Parameters params = new Parameters();
		CustPayeeInqRq custPayeeInqRq = new CustPayeeInqRq();
		custPayeeInqRq.setRqUID(IFX.getRqUID("PAYEE"));
		custPayeeInqRq.setMsgRqHdr(IFX.getMsgRqHdr(loggerUser, "custPayeeInq"));

		CustPayeeSel[] custPayeeSel = new CustPayeeSel[1];
		CustPayeeSel custPayeeSel1 = new CustPayeeSel();
		CustPayeeKeys custPayeeKeys = new CustPayeeKeys();
		CustPayeeId custPayeeId = new CustPayeeId();
		custPayeeId.setString(memberId.toString());
		custPayeeKeys.setCustPayeeId(custPayeeId);
		custPayeeSel1.setCustPayeeKeys(custPayeeKeys);
		custPayeeSel[0] = custPayeeSel1;

		custPayeeInqRq.setCustPayeeSel(custPayeeSel);
		params.add("custPayeeInqRq", custPayeeInqRq);

		final BaseAsyncCallback<Contact> callback = new BaseAsyncCallback<Contact>() {

			@Override
			public void onSuccess(Contact result) {
				contact = result;
				if (contact != null) {
					renderContactData();
				}

			}

		};

		new CustPayeeInqRsCallbackWrapper(){

			@Override
			protected void onSuccess(JsArray<Contact> result) {
				callback.onSuccess(result.get(0));
			}

			@Override
			protected void onFailure(Throwable throwable) {
				callback.onFailure(throwable);
			}

			@Override
			protected void onCall(AsyncCallback<CustPayeeInqRs> callback) {
				contactService.doCustPayeeInq(memberId, params, callback);
			}
			
		}.call();
		

	}

	/**
	 * Renders form data
	 */
	private void renderContactData() {

		Member member = contact.getMember();
		JsArray<CustomFieldValue> customFieldValues = null;

		Map<String, String> formData = new LinkedHashMap<String, String>();

		// Add member properties
		if (member != null) {
			formData.put(messages.username(), member.getUsername());
			formData.put(messages.name(), member.getName());
			formData.put(messages.email(),
					new EmailField(member.getEmail()).getHTML());
			customFieldValues = member.getCustomValues();

			// Add actions asynchronously
			InfoproMobile.get().getMainLayout().addActions(actions, true);
		}

		// Add custom fields
		if (customFieldValues != null && customFieldValues.length() > 0) {
			for (int i = 0; i < customFieldValues.length(); i++) {
				CustomFieldValue value = customFieldValues.get(i);
				formData.put(value.getDisplayName(), value.getValue());
			}
		}
		form.setData(formData);

		// Display loaded data
		container.setVisible(true);
	}

	/**
	 * Returns make payment page action
	 */
	private PageAction getMakePaymentAction() {
		return new PageAction() {
			@Override
			public void run() {
				Parameters params = new Parameters();
				params.set(ParameterKey.ID, memberId);
				Navigation.get().go(PageAnchor.MAKE_PAYMENT, params);
			}

			@Override
			public String getLabel() {
				return messages.makePayment();
			}
		};
	}

	/**
	 * Returns remove contact page action
	 */
	private PageAction getRemoveContactAction() {
		return new PageActionAsync<Void>() {
			@Override
			public void runAsync(final BaseAsyncCallback<Void> callback) {
				// Prompts user before remove contact
				PromptDialog dialog = new PromptDialog(messages.notice(),
						messages.deleteContact(contact.getMember().getName())) {
					@Override
					protected void onYesActionPressed() {

						Parameters params = new Parameters();
						final LoggedUser loggerUser = LoggedUser.get();
						CustPayeeDelRq custPayeeDelRq = new CustPayeeDelRq();


						custPayeeDelRq.setRqUID(IFX.getRqUID("PAYEE"));
						custPayeeDelRq.setMsgRqHdr(IFX.getMsgRqHdr(loggerUser, "custPayeeDel"));
					
						CustPayeeKeys custPayeeKeys = new CustPayeeKeys();

						CustPayeeId custPayeeId = new CustPayeeId();
						custPayeeId.setString(Long.toString(memberId));
						custPayeeKeys.setCustPayeeId(custPayeeId);
						custPayeeDelRq.setCustPayeeKeys(custPayeeKeys);
						params.add("custPayeeDelRq", custPayeeDelRq);

						AsyncCallback<CustPayeeDelRs> callback1 = new AsyncCallback<CustPayeeDelRs>() {

							@Override
							public void onFailure(Throwable caught) {
								callback.onFailure(caught);
							}

							@Override
							public void onSuccess(CustPayeeDelRs result) {
								CustPayeeRec custPayeeRec = result
										.getCustPayeeRec();
								String loginName = custPayeeRec
										.getCustPayeeEnvr().getPartyKeys()
										.getLoginIdent().getLoginName()
										.getString();
								if (loggerUser.getPrincipal().equalsIgnoreCase(
										loginName)) {
									JSONObject contact = new JSONObject();
									JSONObject member = new JSONObject();
									String userName = custPayeeRec
											.getCustPayeeEnvr().getLoginName()
											.getString();
									member.put("username",
											getAsJSONString(userName));
									String name = custPayeeRec
											.getCustPayeeInfo().getName()
											.getString();
									member.put("name", getAsJSONString(name));

									JsArray<ong.eu.soon.mobile.json.ifx.element.Contact> contacts = custPayeeRec
											.getCustPayeeInfo()
											.getStdPayeeRef().getStdPayeeInfo()
											.getPartyData().getContact();
									String eMail = getEmailFromContact(contacts);
									member.put("email", getAsJSONString(eMail));

									contact.put("member", member);
									String notes = "";
									contact.put("notes", getAsJSONString(notes));
								}

								else {
								}
							}

						};
						// contactService.removeContact(memberId, callback);
						contactService.custPayeeDel(params, callback1);
					}
				};
				dialog.display();
			}

			@Override
			public void onCallbackSuccess(Void result) {
				Notification.get().success(messages.contactRemoved());
				Navigation.get().go(PageAnchor.CONTACTS);
			}

			@Override
			public String getLabel() {
				return messages.removeContact();
			}
		};
	}

	/**
	 * Returns add contact page action
	 */
	private PageAction getAddToContactsAction() {
		return new PageActionAsync<Contact>() {
			@Override
			public String getLabel() {
				return messages.addToContacts();
			}

			@Override
			public void onCallbackSuccess(Contact result) {
				Notification.get().success(messages.contactAdded());
				updateActions(false);
			}

			@Override
			public void runAsync(final BaseAsyncCallback<Contact> callback) {

				Parameters params = new Parameters();
				final LoggedUser loggerUser = LoggedUser.get();
				CustPayeeAddRq custPayeeAddRq = new CustPayeeAddRq();

				custPayeeAddRq.setRqUID(IFX.getRqUID("PAYEE"));
				custPayeeAddRq.setMsgRqHdr(IFX.getMsgRqHdr(loggerUser,"custPayeeAdd"));
			
				CustPayeeInfo custPayeeInfo = new CustPayeeInfo();
				custPayeeAddRq.setCustPayeeInfo(custPayeeInfo);
				params.add("custPayeeAddRq", custPayeeAddRq);

				// contactService.saveContact(memberId, callback);
				AsyncCallback<CustPayeeAddRs> callback1 = new AsyncCallback<CustPayeeAddRs>() {

					@Override
					public void onFailure(Throwable caught) {
						callback.onFailure(caught);
					}

					@Override
					public void onSuccess(CustPayeeAddRs custPayeeAddRs) {
						CustPayeeRec custPayeeRec = custPayeeAddRs
								.getCustPayeeRec();
						String loginName = custPayeeRec.getCustPayeeEnvr()
								.getPartyKeys().getLoginIdent().getLoginName()
								.getString();
						if (loggerUser.getPrincipal().equalsIgnoreCase(
								loginName)) {
							JSONObject contact = new JSONObject();
							JSONObject member = new JSONObject();
							String userName = custPayeeRec.getCustPayeeEnvr()
									.getLoginName().getString();
							member.put("username", getAsJSONString(userName));
							String name = custPayeeRec.getCustPayeeInfo()
									.getName().getString();
							member.put("name", getAsJSONString(name));

							JsArray<ong.eu.soon.mobile.json.ifx.element.Contact> contacts = custPayeeRec
									.getCustPayeeInfo().getStdPayeeRef()
									.getStdPayeeInfo().getPartyData()
									.getContact();
							String eMail = getEmailFromContact(contacts);
							member.put("email", getAsJSONString(eMail));

							contact.put("member", member);
							String notes = "";
							contact.put("notes", getAsJSONString(notes));
						}

						else {
						}
						callback.onSuccess(contact);
					}
				};
				contactService.doCustPayeeAdd(memberId, params, callback1);
			}
		};
	}

	/**
	 * Return Email address from the given contact
	 */
	private String getEmailFromContact(
			JsArray<ong.eu.soon.mobile.json.ifx.element.Contact> contacts) {
		String eMail = "";
		for (int i = 0; i < contacts.length(); i++) {
			Locator locator = contacts.get(i).getLocator();
			if (locator instanceof Email) {
				Email email = (Email) locator;
				eMail = email.getEmailAddr().getString();
			}
		}
		return eMail;
	}

	private JSONValue getAsJSONString(String value) {
		if (value == null) {
			return JSONNull.getInstance();
		}

		return new JSONString(value);
	}

	/**
	 * Update page actions according to the page status
	 */
	private void updateActions(boolean isAdd) {
		List<PageAction> actions = new ArrayList<PageAction>();
		if (isAdd) {
			actions.add(getAddToContactsAction());
		} else {
			actions.add(getRemoveContactAction());
		}
		if (LoggedUser.get().getInitialData().canMakeMemberPayments()) {
			actions.add(getMakePaymentAction());
		}
		InfoproMobile.get().getMainLayout().addActions(actions, true);
	}

}
