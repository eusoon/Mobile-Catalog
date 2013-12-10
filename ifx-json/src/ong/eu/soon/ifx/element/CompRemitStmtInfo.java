package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CompRemitStmtInfo extends IFXObject {

	//begin-xor	Optional
	LockboxDepIdent lockboxDepIdent; //Aggregate	Required	Lockbox Deposit Identifier. A unique identifier assigned to a specific lockbox where deposits are collected.
	AcctRef acctRef; //Aggregate	Required	Deposit Account Id Aggregate. Deposit account for remittanc etransactions.
	//end-xor
	CurAmt curAmt; //Aggregate	Required	Currency Amount. Total amount of the remittance deposit cycle.
	Count count; //Long	Optional	Count. Total number of batches processed in the remittance cycle.
	RefData refData; //Aggregate	Optional	Reference information associated with remittance deposit information.
	PrcDt prcDt; //Date	Required	Processing Date. The date the remittance payments were processed by the financial institution.
	RemitBatchData[] remitBatchData; //Aggregate	Optional Repeating	Batch Information Aggregate. One or more batches may be processed within a remittance deposit.
	LockboxURL lockboxURL; //URL	Optional	Lockbox URL. URL containing lockbox remittance information.
	
	public LockboxDepIdent getLockboxDepIdent() {
		return lockboxDepIdent;
	}
	public void setLockboxDepIdent(LockboxDepIdent lockboxDepIdent) {
		this.lockboxDepIdent = lockboxDepIdent;
	}
	public AcctRef getAcctRef() {
		return acctRef;
	}
	public void setAcctRef(AcctRef acctRef) {
		this.acctRef = acctRef;
	}
	public CurAmt getCurAmt() {
		return curAmt;
	}
	public void setCurAmt(CurAmt curAmt) {
		this.curAmt = curAmt;
	}
	public Count getCount() {
		return count;
	}
	public void setCount(Count count) {
		this.count = count;
	}
	public RefData getRefData() {
		return refData;
	}
	public void setRefData(RefData refData) {
		this.refData = refData;
	}
	public PrcDt getPrcDt() {
		return prcDt;
	}
	public void setPrcDt(PrcDt prcDt) {
		this.prcDt = prcDt;
	}
	public RemitBatchData[] getRemitBatchData() {
		return remitBatchData;
	}
	public void setRemitBatchData(RemitBatchData[] remitBatchData) {
		this.remitBatchData = remitBatchData;
	}
	public LockboxURL getLockboxURL() {
		return lockboxURL;
	}
	public void setLockboxURL(LockboxURL lockboxURL) {
		this.lockboxURL = lockboxURL;
	}
	
}
