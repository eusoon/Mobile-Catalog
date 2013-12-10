package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.AcctBal;
import ong.eu.soon.mobile.json.ifx.element.AcctKeys;
import ong.eu.soon.mobile.json.ifx.element.AcctPeriodData;
import ong.eu.soon.mobile.json.ifx.element.EffDt;
import ong.eu.soon.mobile.json.ifx.element.MktgMaterial;
import ong.eu.soon.mobile.json.ifx.element.PartyKeys;
import ong.eu.soon.mobile.json.ifx.element.SPRefIdent;
import ong.eu.soon.mobile.json.ifx.element.StmtGroup;
import ong.eu.soon.mobile.json.ifx.element.StmtTimeFrame;

public class AcctStmtInfo extends IFXObject {

	protected AcctStmtInfo(){	
	}
	
	public final native  AcctKeys getAcctKeys()/*-{
		return $wnd.cleanObject(this.acctKeys);
	}-*/;
	public final native  void setAcctKeys(AcctKeys acctKeys)/*-{
		this.acctKeys = acctKeys;
	}-*/;
	public final native  PartyKeys getPartyKeys()/*-{
		return $wnd.cleanObject(this.partyKeys);
	}-*/;
	public final native  void setPartyKeys(PartyKeys partyKeys)/*-{
		this.partyKeys = partyKeys;
	}-*/;
	public final native  StmtTimeFrame getStmtTimeFrame()/*-{
		return $wnd.cleanObject(this.stmtTimeFrame);
	}-*/;
	public final native  void setStmtTimeFrame(StmtTimeFrame stmtTimeFrame)/*-{
		this.stmtTimeFrame = stmtTimeFrame;
	}-*/;
	public final native  ImageURL getImageURL()/*-{
		return $wnd.cleanObject(this.imageURL);
	}-*/;
	public final native  void setImageURL(ImageURL imageURL)/*-{
		this.imageURL = imageURL;
	}-*/;
	public final native  StmtImg getStmtImg()/*-{
		return $wnd.cleanObject(this.stmtImg);
	}-*/;
	public final native  void setStmtImg(StmtImg stmtImg)/*-{
		this.stmtImg = stmtImg;
	}-*/;
	public final native  AcctTrnRef getAcctTrnRef()/*-{
		return $wnd.cleanObject(this.acctTrnRef);
	}-*/;
	public final native  void setAcctTrnRef(AcctTrnRef acctTrnRef)/*-{
		this.acctTrnRef = acctTrnRef;
	}-*/;
	public final native  SubAcctRef getSubAcctRef()/*-{
		return $wnd.cleanObject(this.subAcctRef);
	}-*/;
	public final native  void setSubAcctRef(SubAcctRef subAcctRef)/*-{
		this.subAcctRef = subAcctRef;
	}-*/;
	public final native  EffDt getEffDt()/*-{
		return $wnd.cleanObject(this.effDt);
	}-*/;
	public final native  void setEffDt(EffDt effDt)/*-{
		this.effDt = effDt;
	}-*/;
	public final native  NextDt getNextDt()/*-{
		return $wnd.cleanObject(this.nextDt);
	}-*/;
	public final native  void setNextDt(NextDt nextDt)/*-{
		this.nextDt = nextDt;
	}-*/;
	public final native  AcctBal getAcctBal()/*-{
		return $wnd.cleanObject(this.acctBal);
	}-*/;
	public final native  void setAcctBal(AcctBal acctBal)/*-{
		this.acctBal = acctBal;
	}-*/;
	public final native  AcctPeriodData getAcctPeriodData()/*-{
		return $wnd.cleanObject(this.acctPeriodData);
	}-*/;
	public final native  void setAcctPeriodData(AcctPeriodData acctPeriodData)/*-{
		this.acctPeriodData = acctPeriodData;
	}-*/;
	public final native  CreditStmtData getCreditStmtData()/*-{
		return $wnd.cleanObject(this.creditStmtData);
	}-*/;
	public final native  void setCreditStmtData(CreditStmtData creditStmtData)/*-{
		this.creditStmtData = creditStmtData;
	}-*/;
	public final native  StmtGroup getStmtGroup()/*-{
		return $wnd.cleanObject(this.stmtGroup);
	}-*/;
	public final native  void setStmtGroup(StmtGroup stmtGroup)/*-{
		this.stmtGroup = stmtGroup;
	}-*/;
	public final native  MktgMaterial getMktgMaterial()/*-{
		return $wnd.cleanObject(this.mktgMaterial);
	}-*/;
	public final native  void setMktgMaterial(MktgMaterial mktgMaterial)/*-{
		this.mktgMaterial = mktgMaterial;
	}-*/;
	public final native  SPRefIdent getsPRefIdent()/*-{
		return $wnd.cleanObject(this.sPRefIdent);
	}-*/;
	public final native  void setsPRefIdent(SPRefIdent sPRefIdent)/*-{
		this.sPRefIdent = sPRefIdent;
	}-*/;

}
