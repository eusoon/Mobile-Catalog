package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class OperRsHdr extends IFXObject {

	AsyncRqUID asyncRqUID; //UUID	Optional	Asynchronous Request Identifier 	This element will be deprecated from this aggregate. Use AsyncRsData instead.
	AsyncRsData asyncRsData; //Aggregate	Optional	Asynchronous Response Data
	CredentialsRsHdr[] credentialsRsHdr; //Aggregate	Optional Repeating	Credentials Response Header
	ContextRsHdr contextRsHdr; //Aggregate	Optional	Context Response Header
	FeeRsHdr[] feeRsHdr; //Aggregate	Optional Repeating	Fee Response Header
	CardUpdateRsHdr cardUpdateRsHdr; //Aggregate	Optional	Card Update Response Header
	
	public AsyncRqUID getAsyncRqUID() {
		return asyncRqUID;
	}
	public void setAsyncRqUID(AsyncRqUID asyncRqUID) {
		this.asyncRqUID = asyncRqUID;
	}
	public AsyncRsData getAsyncRsData() {
		return asyncRsData;
	}
	public void setAsyncRsData(AsyncRsData asyncRsData) {
		this.asyncRsData = asyncRsData;
	}
	public CredentialsRsHdr[] getCredentialsRsHdr() {
		return credentialsRsHdr;
	}
	public void setCredentialsRsHdr(CredentialsRsHdr[] credentialsRsHdr) {
		this.credentialsRsHdr = credentialsRsHdr;
	}
	public ContextRsHdr getContextRsHdr() {
		return contextRsHdr;
	}
	public void setContextRsHdr(ContextRsHdr contextRsHdr) {
		this.contextRsHdr = contextRsHdr;
	}
	public FeeRsHdr[] getFeeRsHdr() {
		return feeRsHdr;
	}
	public void setFeeRsHdr(FeeRsHdr[] feeRsHdr) {
		this.feeRsHdr = feeRsHdr;
	}
	public CardUpdateRsHdr getCardUpdateRsHdr() {
		return cardUpdateRsHdr;
	}
	public void setCardUpdateRsHdr(CardUpdateRsHdr cardUpdateRsHdr) {
		this.cardUpdateRsHdr = cardUpdateRsHdr;
	}

}
