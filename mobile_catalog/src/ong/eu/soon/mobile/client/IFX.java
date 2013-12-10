package ong.eu.soon.mobile.client;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.i18n.shared.DateTimeFormat;
import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONNull;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.json.client.JSONValue;

import java.util.UUID;

import java.util.Date;

import ong.eu.soon.ifx.element.BinData;
import ong.eu.soon.ifx.element.BinLength;
import ong.eu.soon.ifx.element.ClientApp;
import ong.eu.soon.ifx.element.ClientDt;
import ong.eu.soon.ifx.element.ContextRqHdr;
import ong.eu.soon.ifx.element.CredentialsRqHdr;
import ong.eu.soon.ifx.element.CryptPswd;
import ong.eu.soon.ifx.element.CryptType;
import ong.eu.soon.ifx.element.Environment;
import ong.eu.soon.ifx.element.LoginName;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.Name;
import ong.eu.soon.ifx.element.Org;
import ong.eu.soon.ifx.element.POSLocation;
import ong.eu.soon.ifx.element.PointOfServiceData;
import ong.eu.soon.ifx.element.Pswd;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.SecToken;
import ong.eu.soon.ifx.element.SecTokenLogin;
import ong.eu.soon.ifx.element.SubjectPswd;
import ong.eu.soon.ifx.element.SubjectRole;
import ong.eu.soon.ifx.element.SvcIdent;
import ong.eu.soon.ifx.element.SvcName;
import ong.eu.soon.ifx.element.SvcProviderName;
import ong.eu.soon.ifx.element.Version;
import ong.eu.soon.mobile.client.model.Account;
import ong.eu.soon.mobile.client.model.AccountData;
import ong.eu.soon.mobile.client.model.AccountType;
import ong.eu.soon.mobile.client.model.Currency;
import ong.eu.soon.mobile.client.model.GeneralData;
import ong.eu.soon.mobile.client.model.InitialData;





public class IFX {
	
	
	public static RqUID getRqUID(String prefix){
		String uuid=UUID.randomUUID().toString();
		RqUID rqUID=new RqUID();
		StringBuilder sbRqUID=new StringBuilder(prefix);
      	rqUID.setString(sbRqUID.append("-").append(uuid).toString());
		return rqUID;
	}
	public static  MsgRqHdr getMsgRqHdr(LoggedUser loggedUser, String service) {
    	GeneralData generalData=InfoproMobile.get().getGeneralData();
    	MsgRqHdr msgRqHdr = new MsgRqHdr();
    	InitialData initialData=loggedUser.getInitialData();
    	
    	String username=loggedUser.getPrincipal();
    	String svcProviderURL=initialData.getSvcProviderName();
    	
		SvcIdent svcIdent = new SvcIdent();
		SvcProviderName svcProviderName = new SvcProviderName();
		svcProviderName.setString(svcProviderURL);
		svcIdent.setSvcProviderName(svcProviderName);
		SvcName svcName=new SvcName();
		svcName.setString(service);
		svcIdent.setSvcName(svcName);
		msgRqHdr.setSvcIdent(svcIdent);

		CredentialsRqHdr[] credentialsRqHdr = new CredentialsRqHdr[1];

		SubjectRole subjectRole = SubjectRole.Party;

		SecTokenLogin secToken1 = new SecTokenLogin();
		LoginName loginName = new LoginName();
		loginName.setString(username);
		
		secToken1.setLoginName(loginName);
		SubjectPswd subjectPswd = new SubjectPswd();
		String password=loggedUser.getPassword();
		if (initialData.getCryptType().equals(CryptType.BASE64)) {
			Pswd pswd = new Pswd();
			pswd.setString(password);
			subjectPswd.setPswd(pswd);
		} else {
			CryptPswd cryptPswd = new CryptPswd();
			BinData binData=new BinData();
			binData.setString(password);
			cryptPswd.setBinData(binData);
			BinLength binLength=new BinLength();
			binLength.setString(Integer.toString(password.length()));
			cryptPswd.setBinLength(binLength);
			subjectPswd.setCryptPswd(cryptPswd);
		}
		secToken1.setSubjectPswd(subjectPswd);

		SecToken[] secTokens = new SecToken[1];
		secTokens[0] = secToken1;
		credentialsRqHdr[0].setSubjectRole(subjectRole);
		credentialsRqHdr[0].setSecToken(secTokens);
		msgRqHdr.setCredentialsRqHdr(credentialsRqHdr);

		ContextRqHdr contextRqHdr = new ContextRqHdr();
		PointOfServiceData pointOfServiceData = new PointOfServiceData();
		pointOfServiceData.setEnvironment(Environment.MCommerce);
		pointOfServiceData.setPOSLocation(POSLocation.Customer);
		contextRqHdr.setPointOfServiceData(pointOfServiceData);
		
		ClientDt clientDt = new ClientDt();
		DateTimeFormat df =  DateTimeFormat.getFormat(initialData.getDateFormat());//"yyyy-mm-dd hh:mm:ss"
		// formatted as per ISO 8601
		String strDate = df.format(new Date());
		clientDt.setString(strDate);
		contextRqHdr.setClientDt(clientDt);
		

		ClientApp clientApp = new ClientApp();
		Name name = new Name();
		name.setString(generalData.getApplicationName());
		clientApp.setName(name);
		
		Org org = new Org();
		org.setString(Configuration.ORG_NAME);
		clientApp.setOrg(org);
		
		Version version = new Version();
		version.setString(generalData.getApplicationVersion());
		clientApp.setVersion(version);
		contextRqHdr.setClientApp(clientApp);
		
		msgRqHdr.setContextRqHdr(contextRqHdr);
		return msgRqHdr;
    }
	public static JsArray<Account> getAccounts(JsArray<AccountData> accountDatas){
		JSONArray accounts1=new JSONArray();
   	 for(int i = 0; i < accountDatas.length(); i++) {
        	AccountData accountData = accountDatas.get(i);
        	Account account=accountData.getAccount();
   
        	JSONObject account1=new JSONObject();
        	account1.put("accountNo", getAsJSONString(account.getAccountNo()));
        	AccountType accountType=account.getType();
        	JSONObject accountType1=new JSONObject();
        	JSONObject currency1=new JSONObject();
        	Currency currency=accountType.getCurrency();
        	currency1.put("id", getAsJSONString(Long.toString(currency.getId())));
        	currency1.put("symbol", getAsJSONString(currency.getSymbol()));
        	currency1.put("name", getAsJSONString(currency.getName()));
        	accountType1.put("id", getAsJSONString(Long.toString(accountType.getId())));
        	accountType1.put("currency", currency1);
        	accountType1.put("name", getAsJSONString(accountType.getName()));
        	account1.put("type", accountType1);
        	account1.put("id", getAsJSONString(Long.toString(account.getId())));
        	accounts1.set(i, account1);
        }
       return accounts1.getJavaScriptObject().cast();
	}
	private static JSONValue getAsJSONString(String value) {
		if (value == null) {
			return JSONNull.getInstance();
		}

		return new JSONString(value);
	} 
}
