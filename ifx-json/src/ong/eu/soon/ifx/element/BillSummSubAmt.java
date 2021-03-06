package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class BillSummSubAmt extends IFXObject {

	BillSummAmtIdent billSummAmtIdent;	 //	NC-36	 Required	 Bill Summary Amount Identifier. Biller's identifier for this currency sub-amount. Used in a payment message to allocate a portion of a total payment amount to this sub-amount.
	ShortDesc shortDesc;	 //	C-15	 Required	 Short Description. A short description of the amount specified in within this aggregate. To be used for display to the consumer.
	Desc desc;	 //	C-80	 Optional	 Description. A longer description of the amount specified in . To be used when the short description may be insufficient to clearly describe the amount.
	Memo memo;	 //	C-255	 Optional	 Memo. Additional information about the amount specified in . This may be used to further describe terms or instructions that may apply to the amount specified.
	CurAmt curAmt;	 //	Aggregate	 Required	 Currency Amount. The amount being specified as described by the short description. This amount may be a zero or negative value.
	AllocateAllowed allocateAllowed;	 //	Boolean	 Optional	 Allocation Allowed Indicator. If True, the for the amount specified may be used to indicate the allocation breakdown of the total payment amount within the aggregate in a payment message. If False or omitted, the amount specified is for information only.
	
	public BillSummAmtIdent getBillSummAmtIdent() {
		return billSummAmtIdent;
	}
	public void setBillSummAmtIdent(BillSummAmtIdent billSummAmtIdent) {
		this.billSummAmtIdent = billSummAmtIdent;
	}
	public ShortDesc getShortDesc() {
		return shortDesc;
	}
	public void setShortDesc(ShortDesc shortDesc) {
		this.shortDesc = shortDesc;
	}
	public Desc getDesc() {
		return desc;
	}
	public void setDesc(Desc desc) {
		this.desc = desc;
	}
	public Memo getMemo() {
		return memo;
	}
	public void setMemo(Memo memo) {
		this.memo = memo;
	}
	public CurAmt getCurAmt() {
		return curAmt;
	}
	public void setCurAmt(CurAmt curAmt) {
		this.curAmt = curAmt;
	}
	public AllocateAllowed getAllocateAllowed() {
		return allocateAllowed;
	}
	public void setAllocateAllowed(AllocateAllowed allocateAllowed) {
		this.allocateAllowed = allocateAllowed;
	}	
}
