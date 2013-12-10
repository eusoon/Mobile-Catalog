package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class AcctPayOffSel extends IFXObject {

	//begin-xor	Required Repeating
	AcctPayOffKeys[] acctPayOffKeys;	 //	Aggregate	 Required	 Account PayOff Keys Aggregate
	//begin-block	Required
	AcctKeys acctKeys;	 //	Aggregate	 Optional	 Account Keys Aggregate
	DtRange dtRange;	 //	Aggregate	 Optional	 The date range used to select the Payoff Effective Dates.
	PrcDtRange prcDtRange;	 //	Aggregate	 Optional	 The date range used to select the Payoff Request Dates.
	//end-block
	//end-xor
	public AcctPayOffKeys[] getAcctPayOffKeys() {
		return acctPayOffKeys;
	}
	public void setAcctPayOffKeys(AcctPayOffKeys[] acctPayOffKeys) {
		this.acctPayOffKeys = acctPayOffKeys;
	}
	public AcctKeys getAcctKeys() {
		return acctKeys;
	}
	public void setAcctKeys(AcctKeys acctKeys) {
		this.acctKeys = acctKeys;
	}
	public DtRange getDtRange() {
		return dtRange;
	}
	public void setDtRange(DtRange dtRange) {
		this.dtRange = dtRange;
	}
	public PrcDtRange getPrcDtRange() {
		return prcDtRange;
	}
	public void setPrcDtRange(PrcDtRange prcDtRange) {
		this.prcDtRange = prcDtRange;
	}

}
