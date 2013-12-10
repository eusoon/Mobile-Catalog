package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.payee.*;
public class CustPayeeRsMsg extends IFXObject {
	MsgRecDt msgRecDt;//Timestamp	Optional Audit Record Creation Date
	//begin-xor Required	 
	CustPayeeAddRs custPayeeAddRs;//Aggregate	Required Customer Payee Add Response
	CustPayeeModRs custPayeeModRs;//Aggregate	Required Customer Payee Modify Response
	CustPayeeDelRs custPayeeDelRs;//Aggregate	Required Customer Payee Delete Response
	CustPayeeInqRs custPayeeInqRs;//Aggregate	Required Customer Payee Inquiry Response
	//end-xor
	public MsgRecDt getMsgRecDt() {
		return msgRecDt;
	}
	public void setMsgRecDt(MsgRecDt msgRecDt) {
		this.msgRecDt = msgRecDt;
	}
	public CustPayeeAddRs getCustPayeeAddRs() {
		return custPayeeAddRs;
	}
	public void setCustPayeeAddRs(CustPayeeAddRs custPayeeAddRs) {
		this.custPayeeAddRs = custPayeeAddRs;
	}
	public CustPayeeModRs getCustPayeeModRs() {
		return custPayeeModRs;
	}
	public void setCustPayeeModRs(CustPayeeModRs custPayeeModRs) {
		this.custPayeeModRs = custPayeeModRs;
	}
	public CustPayeeDelRs getCustPayeeDelRs() {
		return custPayeeDelRs;
	}
	public void setCustPayeeDelRs(CustPayeeDelRs custPayeeDelRs) {
		this.custPayeeDelRs = custPayeeDelRs;
	}
	public CustPayeeInqRs getCustPayeeInqRs() {
		return custPayeeInqRs;
	}
	public void setCustPayeeInqRs(CustPayeeInqRs custPayeeInqRs) {
		this.custPayeeInqRs = custPayeeInqRs;
	}

}
