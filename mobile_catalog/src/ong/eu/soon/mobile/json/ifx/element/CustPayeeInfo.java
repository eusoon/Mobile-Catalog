package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class CustPayeeInfo extends IFXObject {

	protected CustPayeeInfo(){	
	}
	
	public final native  Name getName()/*-{
		return $wnd.cleanObject(this.name);
	}-*/;
	public final native  void setName(Name name)/*-{
		this.name = name;
	}-*/;
	public final native  Nickname getNickname()/*-{
		return $wnd.cleanObject(this.nickname);
	}-*/;
	public final native  void setNickname(Nickname nickname)/*-{
		this.nickname = nickname;
	}-*/;
	public final native  StdPayeeRef getStdPayeeRef()/*-{
		return $wnd.cleanObject(this.stdPayeeRef);
	}-*/;
	public final native  void setStdPayeeRef(StdPayeeRef stdPayeeRef)/*-{
		this.stdPayeeRef = stdPayeeRef;
	}-*/;
	public final native  FSPayee getFSPayee()/*-{
		return $wnd.cleanObject(this.fSPayee);
	}-*/;
	public final native  void setFSPayee(FSPayee fSPayee)/*-{
		this.fSPayee = fSPayee;
	}-*/;
	public final native  XferPayee getXferPayee()/*-{
		return $wnd.cleanObject(this.xferPayee);
	}-*/;
	public final native  void setXferPayee(XferPayee xferPayee)/*-{
		this.xferPayee = xferPayee;
	}-*/;
	public final native  PayerAcctNum getPayerAcctNum()/*-{
		return $wnd.cleanObject(this.payerAcctNum);
	}-*/;
	public final native  void setPayerAcctNum(PayerAcctNum payerAcctNum)/*-{
		this.payerAcctNum = payerAcctNum;
	}-*/;
	public final native  PayeeAcctNum getPayeeAcctNum()/*-{
		return $wnd.cleanObject(this.payeeAcctNum);
	}-*/;
	public final native  void setPayeeAcctNum(PayeeAcctNum payeeAcctNum)/*-{
		this.payeeAcctNum = payeeAcctNum;
	}-*/;
	public final native  DfltPmtData getDfltPmtData()/*-{
		return $wnd.cleanObject(this.dfltPmtData);
	}-*/;
	public final native  void setDfltPmtData(DfltPmtData dfltPmtData)/*-{
		this.dfltPmtData = dfltPmtData;
	}-*/;
	public final native  LastPmtCurAmt getLastPmtCurAmt()/*-{
		return $wnd.cleanObject(this.lastPmtCurAmt);
	}-*/;
	public final native  void setLastPmtCurAmt(LastPmtCurAmt lastPmtCurAmt)/*-{
		this.lastPmtCurAmt = lastPmtCurAmt;
	}-*/;
	public final native  LastPmtDt getLastPmtDt()/*-{
		return $wnd.cleanObject(this.lastPmtDt);
	}-*/;
	public final native  void setLastPmtDt(LastPmtDt lastPmtDt)/*-{
		this.lastPmtDt = lastPmtDt;
	}-*/;
}