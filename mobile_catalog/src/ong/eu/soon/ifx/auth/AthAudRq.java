package ong.eu.soon.ifx.auth;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.AthKeys;
import ong.eu.soon.ifx.element.DtRange;
import ong.eu.soon.ifx.element.Method;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RecCtrlIn;
import ong.eu.soon.ifx.element.RqUID;

public class AthAudRq extends IFXObject {

	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	RecCtrlIn recCtrlIn;	 //	Aggregate	 Optional	 Records Control Input
	DtRange dtRange;	 //	Aggregate	 Optional	 Date Range
	Method[] method;	 //	Closed Enum	 Optional Repeating	 MethodValid values are limited to: Add, Advise, AuthMod, Can, Del, Mod, StatusMod
	AthKeys[] athKeys;	 //	Aggregate	 Optional Repeating	 Authorization Keys Aggregate
	
	public RqUID getRqUID() {
		return rqUID;
	}
	public void setRqUID(RqUID rqUID) {
		this.rqUID = rqUID;
	}
	public MsgRqHdr getMsgRqHdr() {
		return msgRqHdr;
	}
	public void setMsgRqHdr(MsgRqHdr msgRqHdr) {
		this.msgRqHdr = msgRqHdr;
	}
	public RecCtrlIn getRecCtrlIn() {
		return recCtrlIn;
	}
	public void setRecCtrlIn(RecCtrlIn recCtrlIn) {
		this.recCtrlIn = recCtrlIn;
	}
	public DtRange getDtRange() {
		return dtRange;
	}
	public void setDtRange(DtRange dtRange) {
		this.dtRange = dtRange;
	}
	public Method[] getMethod() {
		return method;
	}
	public void setMethod(Method[] method) {
		this.method = method;
	}
	public AthKeys[] getAthKeys() {
		return athKeys;
	}
	public void setAthKeys(AthKeys[] athKeys) {
		this.athKeys = athKeys;
	}
	
}
