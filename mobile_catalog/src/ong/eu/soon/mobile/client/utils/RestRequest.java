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
package ong.eu.soon.mobile.client.utils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import ong.eu.soon.mobile.client.Configuration;
import ong.eu.soon.mobile.client.InfoproMobile;
import ong.eu.soon.mobile.client.LoggedUser;
import ong.eu.soon.mobile.client.model.Parameters;
import ong.eu.soon.mobile.client.model.ServerError;
import ong.eu.soon.mobile.client.services.AccessService;

import org.apache.commons.codec.binary.Hex;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestBuilder.Method;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.i18n.shared.DateTimeFormat;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.Random;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.StatusCodeException;
import com.googlecode.cryptogwt.emul.java.security.GeneralSecurityException;
import com.googlecode.cryptogwt.emul.java.security.NoSuchAlgorithmException;

/**
 * Wraps a {@link RequestBuilder} for REST requests, handling headers and result
 * types by convention.
 * 
 * @author luis
 */
public class RestRequest<T> {
	
	
	public static final String BASIC = "basic";
	public static final String DIGEST = "digest";
	public static final String AWS = "aws"; // Amazon S3 authentication
	private class RequestCallbackAdapter implements RequestCallback {

		private AsyncCallback<T> callback;

		public RequestCallbackAdapter(AsyncCallback<T> callback) {
			this.callback = callback;
		}

		@Override
		public void onError(Request request, Throwable exception) {

			// Stop loading progress
			InfoproMobile.get().getMainLayout().stopLoading();

			callback.onFailure(exception);
		}

		@Override
		public void onResponseReceived(Request request, Response response) {

			// Stop loading progress
			InfoproMobile.get().getMainLayout().stopLoading();

			// Parse the JSON value according to the content type
			JSONValue jsonValue = null;
			boolean isJson = ConnectionHelper.isJSON(response);
			String contentType = response.getHeader("Content-Type");
			if (isJson) {
				jsonValue = JSONParser.parseStrict(response.getText());
			}

			// Successful request
			if (response.getStatusCode() == Response.SC_OK) {

				// If server should not give a response value, call onSuccess
				if (httpMethod == RequestBuilder.DELETE) {
					callback.onSuccess(null);
					return;
				}

				// If is JSON extract value and call onSuccess
				if (isJson) {
					callback.onSuccess(extractResult(jsonValue));
					return;
				}

				// Otherwise throw response format exception
				callback.onFailure(new UnexpectedRestResponseFormatException(
						contentType));
			} else {
				if (isJson) {
					try {
						// Check for server exception
						ServerError serverError = jsonValue.isObject()
								.getJavaScriptObject().cast();
						callback.onFailure(serverError.resolveException());
					} catch (Exception e) {
						// Otherwise throw response format exception
						callback.onFailure(new UnexpectedRestResponseFormatException(
								contentType));
					}
				} else {
					callback.onFailure(new StatusCodeException(response
							.getStatusCode(), response.getStatusText()));
				}
			}
		}

		@SuppressWarnings("unchecked")
		protected T extractResult(JSONValue value) {
			if (value == null || value.isNull() != null) {
				return null;
			}
			if (value.isObject() != null) {
				return (T) value.isObject().getJavaScriptObject();
			} else if (value.isArray() != null) {
				return (T) value.isArray().getJavaScriptObject();
			} else if (value.isString() != null) {
				return (T) value.isString().stringValue();
			} else if (value.isNumber() != null) {
				return (T) Double.valueOf(value.isNumber().doubleValue());
			} else if (value.isBoolean() != null) {
				return (T) Boolean.valueOf(value.isBoolean().booleanValue());
			}
			return null;
		}
	}

	
	private Method httpMethod;
	private String path;
	private Parameters parameters;
	private JavaScriptObject postObject;
	private String username;
	private String password;
	private String realmName;
	private int nc = 0x00000001;

	private String key;
	private AccessService accessService = GWT.create(AccessService.class);

	protected String token;
	private String servicePrincipalName;
	private String oid="1.3.6.1.5.5.2";
	private String host;

	

	public RestRequest() {
	}

	public RestRequest(Method httpMethod, String path) {
		this();
		this.httpMethod = httpMethod;
		this.path = path;
	}

	public RestRequest(Method httpMethod, String path,
			JavaScriptObject postObject) {
		this(httpMethod, path);
		this.postObject = postObject;
	}

	public RestRequest(Method httpMethod, String path, Parameters parameters) {
		this(httpMethod, path);
		this.parameters = parameters;
	}
	public String getServicePrincipalName() {
		return servicePrincipalName;
	}

	public void setServicePrincipalName(String servicePrincipalName) {
		this.servicePrincipalName = servicePrincipalName;
	}
	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	public Method getHttpMethod() {
		return httpMethod;
	}

	public Parameters getParameters() {
		return parameters;
	}

	public String getPassword() {
		return password;
	}
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}
	
	public String getPath() {
		return path;
	}

	public JavaScriptObject getPostObject() {
		return postObject;
	}

	public String getUsername() {
		return username;
	}

	public String getRealmName() {
		return realmName;
	}

	public void setRealmName(String realmName) {
		this.realmName = realmName;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * Sends a request using the given callback to notify the results. This
	 * method prepares an authentication to be send within.
	 * SessionExpiredException may be raised if user session has expired.
	 */
	public Request sendAuthenticated(AsyncCallback<T> callback) {
		LoggedUser.get().prepare(this);
		return send(callback);
	}

	/**
	 * Sends a request using the given callback to notify the results. This
	 * method does not uses authentication, to perform authenticated requests
	 * see {@link #sendAuthenticated(AsyncCallback)}
	 */
	public Request send(AsyncCallback<T> callback) {
		Map<String, String> headers= new HashMap<String, String>(); 
		// Start loading progress
		InfoproMobile.get().getMainLayout().startLoading();

		String url = "";

		// Append parameters as GET
		if (httpMethod == RequestBuilder.GET) {
			url = Configuration.get().getServiceUrl(this.path, parameters);
		} else {
			url = Configuration.get().getServiceUrl(this.path);
		}

		RequestBuilder request = new RequestBuilder(httpMethod, url);
		request.setTimeoutMillis(20 * 1000); // 20 seconds
		request.setHeader("Accept", "application/json");
		headers.put("Accept", "application/json");
		request.setHeader("Cache-Control",
				"no-cache, no-store, must-revalidate");
		headers.put("Cache-Control",
				"no-cache, no-store, must-revalidate");
		if (httpMethod == RequestBuilder.POST) {
			request.setHeader("Content-Type", "application/json");
			headers.put("Content-Type", "application/json");
			// Send post body parameters
			if (parameters != null) {
				String json = parameters.toJSON();
				request.setRequestData(json);
			} else {
				// Send post without data
				request.setRequestData("");
			}
		}
		// Send a JSON post object
		if (postObject != null) {
			request.setHeader("Content-Type", "application/json");
			headers.put("Content-Type", "application/json");
			request.setRequestData(new JSONObject(postObject).toString());
		}
		if (username != null && !username.isEmpty()) {
			if(InfoproMobile.get().getGeneralData().getAuthenticationMode().equalsIgnoreCase(BASIC)){
				byte[] senderSecretKey=PublicKeyCryptography.generateSecretKey();
				String  strDataToTransmit=password+ ":"+InfoproMobile.get().getGeneralData().getKeySerial();
					
				byte[] byteDataToTransmit=strDataToTransmit.getBytes();
				PublicKeyCryptography.encryptData(byteDataToTransmit, senderSecretKey);
				String messageToSign=PublicKeyCryptography.getMessageToSign(senderSecretKey, byteDataToTransmit, url);
				
				request.setHeader("Authorization",
					"Basic " + Base64.encode(username + ":" + messageToSign));
				
			}else if(InfoproMobile.get().getGeneralData().getAuthenticationMode().equalsIgnoreCase(DIGEST)){
				String opaque = Integer.toString(Math.abs(Random.nextInt()));
				String qop = "auth";
				int nonceValiditySeconds = 10;
				long expirationTime = System.currentTimeMillis()
						+ (nonceValiditySeconds * 1000);
				String expectedNonceSignature = new String(
						DigestUtils.md5Hex(expirationTime + ":" + key));
				String nonceValue = expirationTime + ":" + expectedNonceSignature;
				String nonceValueBase64 = new String(Base64.encode(nonceValue));
				request.setHeader("Authorization", "Digest "
						+ DigestHelper.createAuthorizationHeader(nonceValueBase64, qop, opaque, username, realmName, httpMethod.toString(), password, nc++, path));
				
			}else if(InfoproMobile.get().getGeneralData().getAuthenticationMode().equalsIgnoreCase(AWS)){
				String contentToEncode = null;
				String contentMD5 = null;
				try {
					contentMD5 = HMACHelper.calculateMD5(contentToEncode);
				} catch (NoSuchAlgorithmException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				request.setHeader("Content-Md5", contentMD5);
				headers.put("Content-Md5", contentMD5);
				Date today = new Date();
				String DATE_FORMAT = "EEE, d MMM yyyy HH:mm:ss z";
				String currentDate =DateTimeFormat.getFormat(DATE_FORMAT).format(today);
				request.setHeader("Date", currentDate);
				headers.put("Date", currentDate);
				headers.put("x-amz-date", currentDate);
				request.setHeader("Host", host);
				headers.put("Host", host);
				String method = request.getHTTPMethod();
				String canonicalizedAmzHeaders =AWSHelper.getCanonicalizedAmzHeaders(headers);
				String canonicalizedResource = AWSHelper.getCanonicalizedResource(path,host);
		        
				
		        String contentType = request.getHeader("Content-Type") != null ? request
		                .getHeader("Content-Type") : "";

		        StringBuilder toSign = new StringBuilder();
		        toSign.append(method).append("\n");
		        toSign.append(contentMD5).append("\n");
		        toSign.append(contentType).append("\n");
		        toSign.append(currentDate).append("\n");
		        toSign.append(canonicalizedAmzHeaders);
		        toSign.append(canonicalizedResource);
		        try {
					String signature =AWSHelper.calculateRFC2104HMAC(toSign.toString(), AWSHelper.AWSSecretAccessKey, AWSHelper.HMAC_SHA1_ALGORITHM);
					 StringBuilder awsheader = new StringBuilder();
					 awsheader.append(AWSHelper.NAME).append(" ");
					 awsheader.append(AWSHelper.AWSAccessKeyId).append(":");
					 awsheader.append(signature);
				        
					request.setHeader("Authorization", awsheader.toString());
				} catch (GeneralSecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			/*else if(InfoproMobile.get().getGeneralData().getAuthenticationMode().equalsIgnoreCase(HMAC)){
				Date today = new Date();
				String DATE_FORMAT = "EEE, d MMM yyyy HH:mm:ss z";
				String currentDate =DateTimeFormat.getFormat(DATE_FORMAT).format(today);
				
				String contentToEncode = null;
				try{
					String hmac=HMACHelper.createSignature(request, 
										HMACHelper.PRIVATE_KEY, contentToEncode, username,currentDate, path);
					request.setHeader("hmac", username + ":" + hmac);
					request.setHeader("Date", currentDate);				
					String contentMD5=HMACHelper.calculateMD5(contentToEncode);
					request.setHeader("Content-Md5", contentMD5);
				}catch(Exception e){
					e.printStackTrace();
				}*/
				
				
			/*}else if(InfoproMobile.get().getGeneralData().getAuthenticationMode().equalsIgnoreCase(HMAC_DIGEST)){
				Date today = new Date();
				String DATE_FORMAT = "EEE, d MMM yyyy HH:mm:ss z";
				String currentDate =DateTimeFormat.getFormat(DATE_FORMAT).format(today);
				
				String contentToEncode = null;
				try{
					String hmac=HMACHelper.createSignature(request, url,
										HMACHelper.PRIVATE_KEY, contentToEncode, username,currentDate);
					request.setHeader("hmac", username + ":" + hmac);
					request.setHeader("Date", currentDate);
					request.setHeader("url", url);
					String contentMD5=HMACHelper.calculateMD5(contentToEncode);
					request.setHeader("Content-Md5", contentMD5);
				}catch(Exception e){
					e.printStackTrace();
				}
				
				
			}else if(InfoproMobile.get().getGeneralData().getAuthenticationMode().equalsIgnoreCase(SIGNATURE)){
				request.setHeader(SignatureHelper.APIKEY_HEADER, SignatureHelper.APIKEY);
				request.setHeader(SignatureHelper.SALT_HEADER, SignatureHelper.SALT);
				String hmac=SignatureHelper.createSignature();
				request.setHeader(SignatureHelper.SIGNATURE_HEADER, username + ":" + hmac);
			}else if(InfoproMobile.get().getGeneralData().getAuthenticationMode().equalsIgnoreCase(KERBOROS)){
				
				servicePrincipalName=InfoproMobile.get().getGeneralData().getServicePrincipalName();
				AsyncCallback<String> callback1=new AsyncCallback<String>(){

					@Override
					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void onSuccess(String result) {
						// TODO Auto-generated method stub
						token=result;
					}
					
				};
				getKerberosToken(callback1, servicePrincipalName,  oid);
				request.setHeader("Authorization",
						"Negotiate " + Base64.encode(token));
			}*/
		}
		request.setCallback(new RequestCallbackAdapter(callback));
		try {
			// Send request
			return request.send();
		} catch (RequestException e) {
			callback.onFailure(e);

			// Stop loading progress
			InfoproMobile.get().getMainLayout().stopLoading();

			// Returns an emulated request, which does nothing
			return new Request() {
				@Override
				public void cancel() {
				}

				@Override
				public boolean isPending() {
					return false;
				}
			};
		}
	}


	public void setHttpMethod(Method httpMethod) {
		this.httpMethod = httpMethod;
	}

	public void setParameters(Parameters parameters) {
		this.parameters = parameters;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void setPostObject(JavaScriptObject postObject) {
		this.postObject = postObject;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	/*public void getKerberosToken(AsyncCallback<String> callback,String servicePrincipalName, String oid) {
		Parameters params = new Parameters();
		params.add("servicePrincipalName", servicePrincipalName);
		params.add("oid", oid);
		accessService.getKerberosToken(params, callback);
	}*/

	

}