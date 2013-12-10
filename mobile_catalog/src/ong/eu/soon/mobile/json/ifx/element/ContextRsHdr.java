package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class ContextRsHdr extends IFXObject {
	
	protected ContextRsHdr(){
	}
	
	public final native  ServerDt getServerDt()/*-{
		return $wnd.cleanObject(this. serverDt);
	}-*/;
	public final native  void setServerDt(ServerDt serverDt)/*-{
		this.serverDt = serverDt;
	}-*/;
	public final native  ServerTerminalSeqNum getServerTerminalSeqNum()/*-{
		return $wnd.cleanObject(this. serverTerminalSeqNum);
	}-*/;
	public final native  void setServerTerminalSeqNum(ServerTerminalSeqNum serverTerminalSeqNum)/*-{
		this.serverTerminalSeqNum = serverTerminalSeqNum;
	}-*/;
	public final native  Language getLanguage()/*-{
		return $wnd.cleanObject(this. language);
	}-*/;
	public final native  void setLanguage(Language language)/*-{
		this.language = language;
	}-*/;
	public final native  EMVRsData getEMVRsData()/*-{
		return $wnd.cleanObject(this. EMVRsData);
	}-*/;
	public final native  void setEMVRsData(EMVRsData eMVRsData)/*-{
		EMVRsData = eMVRsData;
	}-*/;
	public final native  MsgAuthCode getMsgAuthCode()/*-{
		return $wnd.cleanObject(this. MsgAuthCode);
	}-*/;
	public final native  void setMsgAuthCode(MsgAuthCode msgAuthCode)/*-{
		MsgAuthCode = msgAuthCode;
	}-*/;

}
