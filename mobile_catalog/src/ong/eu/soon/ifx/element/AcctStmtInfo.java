package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.AcctBal;
import ong.eu.soon.ifx.element.AcctKeys;
import ong.eu.soon.ifx.element.AcctPeriodData;
import ong.eu.soon.ifx.element.EffDt;
import ong.eu.soon.ifx.element.MktgMaterial;
import ong.eu.soon.ifx.element.PartyKeys;
import ong.eu.soon.ifx.element.SPRefIdent;
import ong.eu.soon.ifx.element.StmtGroup;
import ong.eu.soon.ifx.element.StmtTimeFrame;

public class AcctStmtInfo extends IFXObject {

	AcctKeys acctKeys; //Aggregate	Required	Account Keys Aggregate
	PartyKeys partyKeys; //Aggregate	Optional	Party Keys Aggregate
	StmtTimeFrame stmtTimeFrame; //Aggregate	Optional	Statement Time Frame
	ImageURL imageURL; //URL	Optional	Image URL
	//begin-xor	Optional
	StmtImg stmtImg; //Aggregate	Required	Statement Image.
	AcctTrnRef acctTrnRef; //Aggregate	Required Repeating	Account Transaction Reference Aggregate
	//end-xor
	SubAcctRef subAcctRef; //Aggregate	Optional Repeating	Sub-Account Reference Aggregate
	EffDt effDt; //DateTime	Optional	Effective Date Time
	NextDt nextDt; //DateTime	Optional	Next Closing Date
	AcctBal acctBal; //Aggregate	Optional Repeating	Account Balance
	AcctPeriodData acctPeriodData; //Aggregate	Optional Repeating	Account Period Data
	CreditStmtData creditStmtData; //Aggregate	Optional	Credit Statement Data Aggregate
	StmtGroup stmtGroup; //C-25	Optional	Statement Group
	MktgMaterial mktgMaterial; //Aggregate	Optional	Marketing Material
	SPRefIdent sPRefIdent; //NC-36	Optional	Service Provider Reference Identifier
	
	public AcctKeys getAcctKeys() {
		return acctKeys;
	}
	public void setAcctKeys(AcctKeys acctKeys) {
		this.acctKeys = acctKeys;
	}
	public PartyKeys getPartyKeys() {
		return partyKeys;
	}
	public void setPartyKeys(PartyKeys partyKeys) {
		this.partyKeys = partyKeys;
	}
	public StmtTimeFrame getStmtTimeFrame() {
		return stmtTimeFrame;
	}
	public void setStmtTimeFrame(StmtTimeFrame stmtTimeFrame) {
		this.stmtTimeFrame = stmtTimeFrame;
	}
	public ImageURL getImageURL() {
		return imageURL;
	}
	public void setImageURL(ImageURL imageURL) {
		this.imageURL = imageURL;
	}
	public StmtImg getStmtImg() {
		return stmtImg;
	}
	public void setStmtImg(StmtImg stmtImg) {
		this.stmtImg = stmtImg;
	}
	public AcctTrnRef getAcctTrnRef() {
		return acctTrnRef;
	}
	public void setAcctTrnRef(AcctTrnRef acctTrnRef) {
		this.acctTrnRef = acctTrnRef;
	}
	public SubAcctRef getSubAcctRef() {
		return subAcctRef;
	}
	public void setSubAcctRef(SubAcctRef subAcctRef) {
		this.subAcctRef = subAcctRef;
	}
	public EffDt getEffDt() {
		return effDt;
	}
	public void setEffDt(EffDt effDt) {
		this.effDt = effDt;
	}
	public NextDt getNextDt() {
		return nextDt;
	}
	public void setNextDt(NextDt nextDt) {
		this.nextDt = nextDt;
	}
	public AcctBal getAcctBal() {
		return acctBal;
	}
	public void setAcctBal(AcctBal acctBal) {
		this.acctBal = acctBal;
	}
	public AcctPeriodData getAcctPeriodData() {
		return acctPeriodData;
	}
	public void setAcctPeriodData(AcctPeriodData acctPeriodData) {
		this.acctPeriodData = acctPeriodData;
	}
	public CreditStmtData getCreditStmtData() {
		return creditStmtData;
	}
	public void setCreditStmtData(CreditStmtData creditStmtData) {
		this.creditStmtData = creditStmtData;
	}
	public StmtGroup getStmtGroup() {
		return stmtGroup;
	}
	public void setStmtGroup(StmtGroup stmtGroup) {
		this.stmtGroup = stmtGroup;
	}
	public MktgMaterial getMktgMaterial() {
		return mktgMaterial;
	}
	public void setMktgMaterial(MktgMaterial mktgMaterial) {
		this.mktgMaterial = mktgMaterial;
	}
	public SPRefIdent getsPRefIdent() {
		return sPRefIdent;
	}
	public void setsPRefIdent(SPRefIdent sPRefIdent) {
		this.sPRefIdent = sPRefIdent;
	}

}
