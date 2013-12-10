package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class NetworkTrnData extends IFXObject {
	NetworkOwner networkOwner;//Open Enum	Required Network Owner. The name of the individual or organization that owns the source network. Defined Values: ATM, POS, ACH, FedNet, SWIFT, Branch, CallCenter, Other
	OriginatorName originatorName;//C-40	Optional Name. Name of originator of the Message.
	OriginatorType originatorType;//Long	Optional The type of organization that the originator represents. This is usually a coded value representing the industry that the organization operates in. It contains the SIC code or other nationally defined industry value.
	TerminalIdent terminalIdent;//NC-36	Optional Terminal Identifier. Identification of terminal, such as terminal code or terminal number of ATM. Required if <NetworkOwner> is ATM.
	TerminalType terminalType;//Open Enum	Optional Defined values: AdminTerm, ATM, POS, CustomerDevice, ECR, DialCash, TravelerCheckDispenser, FuelPump, ScripTerm, CouponTerm, TicketTerm, POBTerm, Teller, Utility, Vending, Payment, VRU
	//begin-or Optional
	PostAddr postAddr;//Aggregate	Optional Postal Address. Physical Address of the terminal. At least one of <PostAddr>, <Desc> and <Name> is required if <NetworkOwner> is ATM.
	Desc desc;//C-80	Optional Description. A generally accepted name for the location of the terminal. At least one of <PostAddr>, <Desc> and <Name> is required if <NetworkOwner> is ATM.
	Name name; //C-40	Optional Name. Name of the owner or operator of the terminal. At least one of <PostAddr>, <Desc> and <Name> is required if <NetworkOwner> is ATM.
	//end-or
	FIIdentType fIIdentType;//Open Enum	Optional Bank Identifier Type. Type of bank identifier. Default value is ABA.
	FIIdent fIIdent;//NC-34	Optional Bank Identifier. Qualifies account number if known by the customer/client. Usage is expected to be routing and transit number in the US or the equivalent in an international implementation. This is required in USA when <NetworkOwner> is ACH.
	NetworkRefIdent networkRefIdent;//NC-36	Optional Network Reference Identifier. Reference number assigned by network due to the processing of a message at the respective network. Example: Federal Reserve wire network assigns a Fed Reference Number or ACH trace number, or an ISO retrieval reference number.
	AcquirerIdent acquirerIdent;//NC-36	Optional Acquirer Identifier
	MerchNum merchNum;//C-23	Optional Merchant Number
	MCC mCC;//C-4	Optional Merchant Category Code
	public NetworkOwner getNetworkOwner() {
		return networkOwner;
	}
	public void setNetworkOwner(NetworkOwner networkOwner) {
		this.networkOwner = networkOwner;
	}
	public OriginatorName getOriginatorName() {
		return originatorName;
	}
	public void setOriginatorName(OriginatorName originatorName) {
		this.originatorName = originatorName;
	}
	public OriginatorType getOriginatorType() {
		return originatorType;
	}
	public void setOriginatorType(OriginatorType originatorType) {
		this.originatorType = originatorType;
	}
	public TerminalIdent getTerminalIdent() {
		return terminalIdent;
	}
	public void setTerminalIdent(TerminalIdent terminalIdent) {
		this.terminalIdent = terminalIdent;
	}
	public TerminalType getTerminalType() {
		return terminalType;
	}
	public void setTerminalType(TerminalType terminalType) {
		this.terminalType = terminalType;
	}
	public PostAddr getPostAddr() {
		return postAddr;
	}
	public void setPostAddr(PostAddr postAddr) {
		this.postAddr = postAddr;
	}
	public Desc getDesc() {
		return desc;
	}
	public void setDesc(Desc desc) {
		this.desc = desc;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public FIIdentType getFIIdentType() {
		return fIIdentType;
	}
	public void setFIIdentType(FIIdentType fIIdentType) {
		this.fIIdentType = fIIdentType;
	}
	public FIIdent getFIIdent() {
		return fIIdent;
	}
	public void setFIIdent(FIIdent fIIdent) {
		this.fIIdent = fIIdent;
	}
	public NetworkRefIdent getNetworkRefIdent() {
		return networkRefIdent;
	}
	public void setNetworkRefIdent(NetworkRefIdent networkRefIdent) {
		this.networkRefIdent = networkRefIdent;
	}
	public AcquirerIdent getAcquirerIdent() {
		return acquirerIdent;
	}
	public void setAcquirerIdent(AcquirerIdent acquirerIdent) {
		this.acquirerIdent = acquirerIdent;
	}
	public MerchNum getMerchNum() {
		return merchNum;
	}
	public void setMerchNum(MerchNum merchNum) {
		this.merchNum = merchNum;
	}
	public MCC getMCC() {
		return mCC;
	}
	public void setMCC(MCC mCC) {
		this.mCC = mCC;
	}

}