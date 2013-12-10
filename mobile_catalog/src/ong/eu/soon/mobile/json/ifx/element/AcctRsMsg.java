package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.acct.AcctAddRs;
import ong.eu.soon.mobile.json.ifx.acct.AcctAdviseRs;
import ong.eu.soon.mobile.json.ifx.acct.AcctDelRs;
import ong.eu.soon.mobile.json.ifx.acct.AcctInqRs;
import ong.eu.soon.mobile.json.ifx.acct.AcctModRs;
import ong.eu.soon.mobile.json.ifx.acct.AcctRevRs;
import ong.eu.soon.mobile.json.ifx.acct.AcctStatusInqRs;
import ong.eu.soon.mobile.json.ifx.acct.AcctStatusModRs;
import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class AcctRsMsg extends IFXObject {

	protected AcctRsMsg(){	
	}
	
	public final native   AcctAddRs getAcctAddRs()/*-{
		return $wnd.cleanObject(this.acctAddRs);
	}-*/;
	public final native  void setAcctAddRs(AcctAddRs acctAddRs)/*-{
		this.acctAddRs = acctAddRs;
	}-*/;
	public final native  MsgRecDt getMsgRecDt()/*-{
		return $wnd.cleanObject(this.MsgRecDt);
	}-*/;
	public final native  void setMsgRecDt(MsgRecDt msgRecDt)/*-{
		MsgRecDt = msgRecDt;
	}-*/;
	public final native  AcctModRs getAcctModRs()/*-{
		return $wnd.cleanObject(this.AcctModRs);
	}-*/;
	public final native  void setAcctModRs(AcctModRs acctModRs)/*-{
		AcctModRs = acctModRs;
	}-*/;
	public final native  AcctDelRs getAcctDelRs()/*-{
		return $wnd.cleanObject(this.AcctDelRs);
	}-*/;
	public final native  void setAcctDelRs(AcctDelRs acctDelRs)/*-{
		AcctDelRs = acctDelRs;
	}-*/;
	public final native  AcctRevRs getAcctRevRs()/*-{
		return $wnd.cleanObject(this.AcctRevRs);
	}-*/;
	public final native  void setAcctRevRs(AcctRevRs acctRevRs)/*-{
		AcctRevRs = acctRevRs;
	}-*/;
	public final native  AcctInqRs getAcctInqRs()/*-{
		return $wnd.cleanObject(this.AcctInqRs);
	}-*/;
	public final native  void setAcctInqRs(AcctInqRs acctInqRs)/*-{
		AcctInqRs = acctInqRs;
	}-*/;
	public final native  AcctAdviseRs getAcctAdviseRs()/*-{
		return $wnd.cleanObject(this.AcctAdviseRs);
	}-*/;
	public final native  void setAcctAdviseRs(AcctAdviseRs acctAdviseRs)/*-{
		AcctAdviseRs = acctAdviseRs;
	}-*/;
	public final native  AcctStatusModRs getAcctStatusModRs()/*-{
		return $wnd.cleanObject(this.AcctStatusModRs);
	}-*/;
	public final native  void setAcctStatusModRs(AcctStatusModRs acctStatusModRs)/*-{
		AcctStatusModRs = acctStatusModRs;
	}-*/;
	public final native  AcctStatusInqRs getAcctStatusInqRs()/*-{
		return $wnd.cleanObject(this.AcctStatusInqRs);
	}-*/;
	public final native  void setAcctStatusInqRs(AcctStatusInqRs acctStatusInqRs)/*-{
		AcctStatusInqRs = acctStatusInqRs;
	}-*/;

}
