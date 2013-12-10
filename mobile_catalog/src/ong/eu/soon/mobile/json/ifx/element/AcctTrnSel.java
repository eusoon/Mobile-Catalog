package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.AcctKeys;
import ong.eu.soon.mobile.json.ifx.element.DtRange;
import ong.eu.soon.mobile.json.ifx.element.Name;
import ong.eu.soon.mobile.json.ifx.element.TrnSrc;
import ong.eu.soon.mobile.json.ifx.element.TrnSubType;
import ong.eu.soon.mobile.json.ifx.element.TrnType;

public class AcctTrnSel extends IFXObject {

	protected AcctTrnSel(){	
	}
	public final native  AcctTrnKeys getAcctTrnKeys()/*-{
		return $wnd.cleanObject(this.acctTrnKeys);
	}-*/;
	public final native  void setAcctTrnKeys(AcctTrnKeys acctTrnKeys)/*-{
		this.acctTrnKeys = acctTrnKeys;
	}-*/;
	public final native  AcctKeys getAcctKeys()/*-{
		return $wnd.cleanObject(this.acctKeys);
	}-*/;
	public final native  void setAcctKeys(AcctKeys acctKeys)/*-{
		this.acctKeys = acctKeys;
	}-*/;
	public final native  DtRange getDtRange()/*-{
		return $wnd.cleanObject(this.dtRange);
	}-*/;
	public final native  void setDtRange(DtRange dtRange)/*-{
		this.dtRange = dtRange;
	}-*/;
	public final native  CurAmtRange getCurAmtRange()/*-{
		return $wnd.cleanObject(this.curAmtRange);
	}-*/;
	public final native  void setCurAmtRange(CurAmtRange curAmtRange)/*-{
		this.curAmtRange = curAmtRange;
	}-*/;
	public final native  RecordCountLimit getRecordCountLimit()/*-{
		return $wnd.cleanObject(this.recordCountLimit);
	}-*/;
	public final native  void setRecordCountLimit(RecordCountLimit recordCountLimit)/*-{
		this.recordCountLimit = recordCountLimit;
	}-*/;
	public final native  TrnType getTrnType()/*-{
		return $wnd.cleanObject(this.trnType);
	}-*/;
	public final native  void setTrnType(TrnType trnType)/*-{
		this.trnType = trnType;
	}-*/;
	public final native  TrnSubType getTrnSubType()/*-{
		return $wnd.cleanObject(this.trnSubType);
	}-*/;
	public final native  void setTrnSubType(TrnSubType trnSubType)/*-{
		this.trnSubType = trnSubType;
	}-*/;
	public final native  TrnSrc getTrnSrc()/*-{
		return $wnd.cleanObject(this.trnSrc);
	}-*/;
	public final native  void setTrnSrc(TrnSrc trnSrc)/*-{
		this.trnSrc = trnSrc;
	}-*/;
	public final native  Name getName()/*-{
		return $wnd.cleanObject(this.name);
	}-*/;
	public final native  void setName(Name name)/*-{
		this.name = name;
	}-*/;
	public final native  ChkNumRange getChkNumRange()/*-{
		return $wnd.cleanObject(this.chkNumRange);
	}-*/;
	public final native  void setChkNumRange(ChkNumRange chkNumRange)/*-{
		this.chkNumRange = chkNumRange;
	}-*/;
	public final native  RefIdentRange getRefIdentRange()/*-{
		return $wnd.cleanObject(this.refIdentRange);
	}-*/;
	public final native  void setRefIdentRange(RefIdentRange refIdentRange)/*-{
		this.refIdentRange = refIdentRange;
	}-*/;
	
}
