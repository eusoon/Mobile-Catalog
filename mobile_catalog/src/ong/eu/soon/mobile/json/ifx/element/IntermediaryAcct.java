package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class IntermediaryAcct extends IFXObject {
	protected IntermediaryAcct(){	
	}

	
	public final native  SeqNum getSeqNum()/*-{
		return $wnd.cleanObject(this.seqNum);
	}-*/;
	public final native  void setSeqNum(SeqNum seqNum)/*-{
		this.seqNum = seqNum;
	}-*/;
	public final native  AcctKeys getAcctKeys()/*-{
		return $wnd.cleanObject(this.acctKeys);
	}-*/;
	public final native  void setAcctKeys(AcctKeys acctKeys)/*-{
		this.acctKeys = acctKeys;
	}-*/;
	
}
