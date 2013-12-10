package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class ChkData extends IFXObject {

	protected ChkData(){
	}
	
	public final native  ChkNum getChkNum()/*-{
		return $wnd.cleanObject(this.chkNum);
	}-*/;
	public final native  void setChkNum(ChkNum chkNum)/*-{
		this.chkNum = chkNum;
	}-*/;
	public final native  OrigDt getOrigDt()/*-{
		return $wnd.cleanObject(this.origDt);
	}-*/;
	public final native  void setOrigDt(OrigDt origDt)/*-{
		this.origDt = origDt;
	}-*/;
	public final native  CreditorData getCreditorData()/*-{
		return $wnd.cleanObject(this.creditorData);
	}-*/;
	public final native  void setCreditorData(CreditorData creditorData)/*-{
		this.creditorData = creditorData;
	}-*/;
	public final native  Memo getMemo()/*-{
		return $wnd.cleanObject(this.memo);
	}-*/;
	public final native  void setMemo(Memo memo)/*-{
		this.memo = memo;
	}-*/;
}
