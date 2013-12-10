package ong.eu.soon.mobile.client.callback;

import java.math.BigDecimal;

import ong.eu.soon.ifx.element.BalTypeValues;
import ong.eu.soon.mobile.client.LoggedUser;
import ong.eu.soon.mobile.client.model.AccountData;
import ong.eu.soon.mobile.client.setting.LocalSettings;
import ong.eu.soon.mobile.client.utils.Amount;
import ong.eu.soon.mobile.client.utils.AmountHelper;
import ong.eu.soon.mobile.json.ifx.acct.AcctInqRs;
import ong.eu.soon.mobile.json.ifx.element.AcctBal;
import ong.eu.soon.mobile.json.ifx.element.AcctRec;


import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONNull;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.rpc.AsyncCallback;

public abstract class AcctInqRsCallbackWrapper {

	private long start;
	private String unitPattern;
	private final LoggedUser loggerUser = LoggedUser.get();
	

	public final AsyncCallback<AcctInqRs> getAsyncCallback() {
		AsyncCallback<AcctInqRs> asyncCallback = new AsyncCallback<AcctInqRs>() {

			@Override
			public void onSuccess(AcctInqRs acctInqRs) {
				Log.debug("Time : " + (System.currentTimeMillis() - start));

				LocalSettings localSettings = new LocalSettings();

				JSONArray arr = new JSONArray();

				JsArray<AcctRec> acctRecs = acctInqRs.getAcctRec();
				for (int i = 0; i < acctRecs.length(); i++) {
					AcctRec acctRec = acctRecs.get(i);
					String loginName = acctRec.getAcctEnvr().getPartyKeys()
							.getLoginIdent().getLoginName().getString();
					if (loggerUser.getPrincipal().equalsIgnoreCase(loginName)) {
						JSONObject accountData = new JSONObject();
						JSONObject account = new JSONObject();
						String id = acctRec.getAcctId().getString();
						account.put("accountNo", getAsJSONString(id));
						String type = acctRec.getAcctInfo().getAcctType()
								.getAcctTypeValue().getString();
						account.put("type", getAsJSONString(type));
						accountData.put("account", account);
						String currencyCode = acctRec.getAcctInfo().getCurCode()
								.getCurCodeValue().getString();
						unitPattern = currencyCode + "$#amount#";
						JSONObject accountStatus = new JSONObject();

						JsArray<AcctBal> acctBals = acctRec.getAcctInfo()
								.getAcctBal();
						for (int y = 0; y < acctBals.length(); y++) {
							AcctBal acctBal = acctBals.get(y);
							if (acctBal.getBalType().getBalTypeValues()
									.equals(BalTypeValues.Current)
									|| acctBal.getBalType().getBalTypeValues()
											.equals(BalTypeValues.Outstanding)) {
								String balance = acctBal.getCurAmt().getAmt()
										.getString();
								accountStatus.put("balance",
										getAsJSONString(balance));
								Amount amt = new Amount();
								amt.setValue(new BigDecimal(balance));
								String formattedBalance = AmountHelper
										.getFormattedAmount(
												Double.valueOf(balance),
												getUnitPattern());
								accountStatus.put("formattedBalance",
										getAsJSONString(formattedBalance));
							} else if (acctBal.getBalType().getBalTypeValues()
									.equals(BalTypeValues.CreditLimit)) {
								String creditLimit = acctBal.getCurAmt().getAmt()
										.getString();
								accountStatus.put("creditLimit",
										getAsJSONString(creditLimit));
								Amount amt = new Amount();
								amt.setValue(new BigDecimal(creditLimit));
								String formattedCreditLimit = AmountHelper
										.getFormattedAmount(
												Double.valueOf(creditLimit),
												getUnitPattern());
								accountStatus.put("formattedCreditLimit",
										getAsJSONString(formattedCreditLimit));
							} else if (acctBal.getBalType().getBalTypeValues()
									.equals(BalTypeValues.Avail)) {
								String availableBalance = acctBal.getCurAmt()
										.getAmt().getString();
								accountStatus.put("availableBalance",
										getAsJSONString(availableBalance));
								Amount amt = new Amount();
								amt.setValue(new BigDecimal(availableBalance));
								String formattedAvailableBalance = AmountHelper
										.getFormattedAmount(
												Double.valueOf(availableBalance),
												getUnitPattern());
								accountStatus.put("formattedAvailableBalance",
										getAsJSONString(formattedAvailableBalance));
							}
							accountData.put("accountStatus", accountStatus);
						}
						arr.set(i++, accountData);
					} else {

					}
				}

				JsArray<AccountData> result1 = arr.getJavaScriptObject().cast();
				AcctInqRsCallbackWrapper.this.onSuccess(result1);
			}

			@Override
			public void onFailure(Throwable throwable) {
				 Log.debug("Time (failure) : " + (System.currentTimeMillis() - start));
				AcctInqRsCallbackWrapper.this.onFailure(throwable);			
			}
		};
		return asyncCallback;
	}

	protected abstract void onSuccess(JsArray<AccountData> result1);

	protected abstract void onFailure(Throwable throwable) ;

	protected abstract void onCall(AsyncCallback<AcctInqRs> callback) ;

	public final void call() {
		start = System.currentTimeMillis();
		onCall(getAsyncCallback());
	}

	private JSONValue getAsJSONString(String value) {
		if (value == null) {
			return JSONNull.getInstance();
		}

		return new JSONString(value);
	}

	public String getUnitPattern() {
		return unitPattern;
	}

	public void setUnitPattern(String unitPattern) {
		this.unitPattern = unitPattern;
	}

}
