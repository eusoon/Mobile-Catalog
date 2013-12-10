package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
public class ContextRsHdr extends IFXObject {
	ServerDt serverDt;//DateTime	Required Server DateTime
	ServerTerminalSeqNum serverTerminalSeqNum;//NC-36	Optional Server Terminal Sequence Identifier
	Language language;//NC-17	Optional Language
	EMVRsData EMVRsData;//Aggregate	Optional EMV Response Data
	MsgAuthCode MsgAuthCode;//Aggregate	Optional Message Authentication Code
	public ServerDt getServerDt() {
		return serverDt;
	}
	public void setServerDt(ServerDt serverDt) {
		this.serverDt = serverDt;
	}
	public ServerTerminalSeqNum getServerTerminalSeqNum() {
		return serverTerminalSeqNum;
	}
	public void setServerTerminalSeqNum(ServerTerminalSeqNum serverTerminalSeqNum) {
		this.serverTerminalSeqNum = serverTerminalSeqNum;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public EMVRsData getEMVRsData() {
		return EMVRsData;
	}
	public void setEMVRsData(EMVRsData eMVRsData) {
		EMVRsData = eMVRsData;
	}
	public MsgAuthCode getMsgAuthCode() {
		return MsgAuthCode;
	}
	public void setMsgAuthCode(MsgAuthCode msgAuthCode) {
		MsgAuthCode = msgAuthCode;
	}

}
