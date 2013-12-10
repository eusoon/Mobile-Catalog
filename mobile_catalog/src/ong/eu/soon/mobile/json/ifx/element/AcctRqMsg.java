package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.acct.AcctAddRq;
import ong.eu.soon.mobile.json.ifx.acct.AcctAdviseRq;
import ong.eu.soon.mobile.json.ifx.acct.AcctAudRq;
import ong.eu.soon.mobile.json.ifx.acct.AcctDelRq;
import ong.eu.soon.mobile.json.ifx.acct.AcctInqRq;
import ong.eu.soon.mobile.json.ifx.acct.AcctModRq;
import ong.eu.soon.mobile.json.ifx.acct.AcctStatusInqRq;
import ong.eu.soon.mobile.json.ifx.acct.AcctStatusModRq;
import ong.eu.soon.mobile.json.ifx.acct.AcctSyncRq;
import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class AcctRqMsg extends IFXObject {

	protected AcctRqMsg(){	
	}
	
	public final native  AcctAddRq getAcctAddRq()/*-{
		return $wnd.cleanObject(this.acctAddRq);
	}-*/;
	public final native  void setAcctAddRq(AcctAddRq acctAddRq)/*-{
		this.acctAddRq = acctAddRq;
	}-*/;
	public final native  AcctModRq getAcctModRq()/*-{
		return $wnd.cleanObject(this.acctModRq);
	}-*/;
	public final native  void setAcctModRq(AcctModRq acctModRq)/*-{
		this.acctModRq = acctModRq;
	}-*/;
	public final native  AcctDelRq getAcctDelRq()/*-{
		return $wnd.cleanObject(this.acctDelRq);
	}-*/;
	public final native  void setAcctDelRq(AcctDelRq acctDelRq)/*-{
		this.acctDelRq = acctDelRq;
	}-*/;
	public final native  AcctInqRq getAcctInqRq()/*-{
		return $wnd.cleanObject(this.acctInqRq);
	}-*/;
	public final native  void setAcctInqRq(AcctInqRq acctInqRq)/*-{
		this.acctInqRq = acctInqRq;
	}-*/;
	public final native  AcctAdviseRq getAcctAdviseRq()/*-{
		return $wnd.cleanObject(this.acctAdviseRq);
	}-*/;
	public final native  void setAcctAdviseRq(AcctAdviseRq acctAdviseRq)/*-{
		this.acctAdviseRq = acctAdviseRq;
	}-*/;
	public final native  AcctAudRq getAcctAudRq()/*-{
		return $wnd.cleanObject(this.acctAudRq);
	}-*/;
	public final native  void setAcctAudRq(AcctAudRq acctAudRq)/*-{
		this.acctAudRq = acctAudRq;
	}-*/;
	public final native  AcctSyncRq getAcctSyncRq()/*-{
		return $wnd.cleanObject(this.acctSyncRq);
	}-*/;
	public final native  void setAcctSyncRq(AcctSyncRq acctSyncRq)/*-{
		this.acctSyncRq = acctSyncRq;
	}-*/;
	public final native  AcctStatusModRq getAcctStatusModRq()/*-{
		return $wnd.cleanObject(this.acctStatusModRq);
	}-*/;
	public final native  void setAcctStatusModRq(AcctStatusModRq acctStatusModRq)/*-{
		this.acctStatusModRq = acctStatusModRq;
	}-*/;
	public final native  AcctStatusInqRq getAcctStatusInqRq()/*-{
		return $wnd.cleanObject(this.acctStatusInqRq);
	}-*/;
	public final native  void setAcctStatusInqRq(AcctStatusInqRq acctStatusInqRq)/*-{
		this.acctStatusInqRq = acctStatusInqRq;
	}-*/;
	public final native  RevRqUID getRevRqUID()/*-{
		return $wnd.cleanObject(this.revRqUID);
	}-*/;
	public final native  void setRevRqUID(RevRqUID revRqUID)/*-{
		this.revRqUID = revRqUID;
	}-*/;
}