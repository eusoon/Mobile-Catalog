package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class RemitBatchData extends IFXObject {

	RefData refData; //Aggregate	Optional	Reference Information Aggregate. Reference information associated with remittance information.
	CurAmt curAmt; //Aggregate	Required	Currency Amount. Total amount of the remittance deposit cycle.
	Count count; //Long	Required	Transaction count. Indicates the number of request messages contained in the file or <PaySvcRq>.
	RemitInfo[] remitInfo; //Aggregate	Required Repeating	Remittance Record Aggregate.
	
	public RefData getRefData() {
		return refData;
	}
	public void setRefData(RefData refData) {
		this.refData = refData;
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
	public RemitInfo[] getRemitInfo() {
		return remitInfo;
	}
	public void setRemitInfo(RemitInfo[] remitInfo) {
		this.remitInfo = remitInfo;
	}	
}
