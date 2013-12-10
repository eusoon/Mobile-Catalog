package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class AcctHoldEnvr extends IFXObject {

	CreatedDt createdDt; //DateTime	Required	Created Date/Time. The date/time the object was created.
	CreateRefIdent createRefIdent; //NC-36	Optional	An identifier used to uniquely identify the creation of this object to the system that created the object. This will usually be a link to reference information used in creating the object.
	ClientCreateDt clientCreateDt; //DateTime	Optional	The created date/time as reported by the client. This can vary from the object creation date/time due to time zone differences, communication delays, etc
	ClientBusinessDt clientBusinessDt; //DateTime	Optional	The date/time that the client recorded this object for operational purposes. This date/time will often be used to manage the availability of information or funds.
	LastUpdateDt lastUpdateDt; //DateTime	Optional	Last update Date/Time. The date/time the object was created or modified. This field is intended to support optimistic concurrency implementations (provided on an inq and verified on a mod).
	LastUpdateRqUID lastUpdateRqUID; //UUID	Optional	Last update RqUID. The RqUID from the message that resulted in th object being created or modified. This field is intended to support optimistic concurrency implementations (provided on an inq and verified on a mod).
	LoginName loginName; //C-40	Optional	The login name (or Id) of the individual that authorized this object to be created. This is typically used when the object is created on behalf of its owner by someone who is not normally represented as a Party (i.e., an employee or agent).
	PartyKeys partyKeys; //Aggregate	Optional	Reference to the Party that this object is owned by or authorized by.
	CardKeys cardKeys; //Aggregate	Optional	This is dependent on Card proposal. Currently this is implemented as the CardLogicalData aggregate.
	PassbkKeys passbkKeys; //Aggregate	Optional	Currently PassbkAcceptData.
	NetworkTrnData networkTrnData; //Aggregate	Optional	Network Transaction Information. Identification and location of the terminal from which the message originates.
	ServerTerminalSeqNum serverTerminalSeqNum; //NC-36	Optional	Server Terminal Sequence Number. A terminal sequence number generated by the server to identify this object. This number is used in ATM and POS environments to uniquely identify transactions (with terminal name and date) for transaction management.
	PointOfServiceData pointOfServiceData; //Aggregate	Optional	The Point of Service Data. This aggregate contains information about the environment in which this message originated.
	ClientTerminalSeqNum clientTerminalSeqNum; //NC-36	Optional	Client Terminal Sequence Number. A terminal sequence number generated by the client to identify this object. This number is used in ATM, POS, Branch, Call Center and Teller environments to uniquely identify transactions at the client (with terminal name and date). This number is often required when requesting supporting documentation related to a customer transaction.
	
	public CreatedDt getCreatedDt() {
		return createdDt;
	}
	public void setCreatedDt(CreatedDt createdDt) {
		this.createdDt = createdDt;
	}
	public CreateRefIdent getCreateRefIdent() {
		return createRefIdent;
	}
	public void setCreateRefIdent(CreateRefIdent createRefIdent) {
		this.createRefIdent = createRefIdent;
	}
	public ClientCreateDt getClientCreateDt() {
		return clientCreateDt;
	}
	public void setClientCreateDt(ClientCreateDt clientCreateDt) {
		this.clientCreateDt = clientCreateDt;
	}
	public ClientBusinessDt getClientBusinessDt() {
		return clientBusinessDt;
	}
	public void setClientBusinessDt(ClientBusinessDt clientBusinessDt) {
		this.clientBusinessDt = clientBusinessDt;
	}
	public LastUpdateDt getLastUpdateDt() {
		return lastUpdateDt;
	}
	public void setLastUpdateDt(LastUpdateDt lastUpdateDt) {
		this.lastUpdateDt = lastUpdateDt;
	}
	public LastUpdateRqUID getLastUpdateRqUID() {
		return lastUpdateRqUID;
	}
	public void setLastUpdateRqUID(LastUpdateRqUID lastUpdateRqUID) {
		this.lastUpdateRqUID = lastUpdateRqUID;
	}
	public LoginName getLoginName() {
		return loginName;
	}
	public void setLoginName(LoginName loginName) {
		this.loginName = loginName;
	}
	public PartyKeys getPartyKeys() {
		return partyKeys;
	}
	public void setPartyKeys(PartyKeys partyKeys) {
		this.partyKeys = partyKeys;
	}
	public CardKeys getCardKeys() {
		return cardKeys;
	}
	public void setCardKeys(CardKeys cardKeys) {
		this.cardKeys = cardKeys;
	}
	public PassbkKeys getPassbkKeys() {
		return passbkKeys;
	}
	public void setPassbkKeys(PassbkKeys passbkKeys) {
		this.passbkKeys = passbkKeys;
	}
	public NetworkTrnData getNetworkTrnData() {
		return networkTrnData;
	}
	public void setNetworkTrnData(NetworkTrnData networkTrnData) {
		this.networkTrnData = networkTrnData;
	}
	public ServerTerminalSeqNum getServerTerminalSeqNum() {
		return serverTerminalSeqNum;
	}
	public void setServerTerminalSeqNum(ServerTerminalSeqNum serverTerminalSeqNum) {
		this.serverTerminalSeqNum = serverTerminalSeqNum;
	}
	public PointOfServiceData getPointOfServiceData() {
		return pointOfServiceData;
	}
	public void setPointOfServiceData(PointOfServiceData pointOfServiceData) {
		this.pointOfServiceData = pointOfServiceData;
	}
	public ClientTerminalSeqNum getClientTerminalSeqNum() {
		return clientTerminalSeqNum;
	}
	public void setClientTerminalSeqNum(ClientTerminalSeqNum clientTerminalSeqNum) {
		this.clientTerminalSeqNum = clientTerminalSeqNum;
	}
	
}
