package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public  class ContextRqHdr extends IFXObject {
	
	protected ContextRqHdr(){
	}
	
	public final native  JsArray<FieldSelect> getFieldSelect()/*-{
		return $wnd.cleanObject(this.fieldSelect);
	}-*/;
	public final native  void setFieldSelect(JsArray<FieldSelect> fieldSelect)/*-{
		this.fieldSelect = fieldSelect;
	}-*/;
	public final native  ClientTerminalSeqNum getClientTerminalSeqNum()/*-{
		return $wnd.cleanObject(this.clientTerminalSeqNum);
	}-*/;
	public final native  void setClientTerminalSeqNum(ClientTerminalSeqNum clientTerminalSeqNum)/*-{
		this.clientTerminalSeqNum = clientTerminalSeqNum;
	}-*/;
	public final native  NetworkTrnData getNetworkTrnData()/*-{
		return $wnd.cleanObject(this.networkTrnData);
	}-*/;
	public final native  void setNetworkTrnData(NetworkTrnData networkTrnData)/*-{
		this.networkTrnData = networkTrnData;
	}-*/;
	public final native  PointOfServiceData getPointOfServiceData()/*-{
		return $wnd.cleanObject(this.pointOfServiceData);
	}-*/;
	public final native  void setPointOfServiceData(PointOfServiceData pointOfServiceData)/*-{
		this.pointOfServiceData = pointOfServiceData;
	}-*/;
	public final native  EMVRqData geteMVRqData()/*-{
		return $wnd.cleanObject(this.eMVRqData);
	}-*/;
	public final native  void seteMVRqData(EMVRqData eMVRqData)/*-{
		this.eMVRqData = eMVRqData;
	}-*/;
	public final native  MsgAuthCode getMsgAuthCode()/*-{
		return $wnd.cleanObject(this.msgAuthCode);
	}-*/;
	public final native  void setMsgAuthCode(MsgAuthCode msgAuthCode)/*-{
		this.msgAuthCode = msgAuthCode;
	}-*/;
	public final native  ClientDt getClientDt()/*-{
		return $wnd.cleanObject(this.clientDt);
	}-*/;
	public final native  void setClientDt(ClientDt clientDt)/*-{
		this.clientDt = clientDt;
	}-*/;
	public final native  CustLangPref getCustLangPref()/*-{
		return $wnd.cleanObject(this.custLangPref);
	}-*/;
	public final native  void setCustLangPref(CustLangPref custLangPref)/*-{
		this.custLangPref = custLangPref;
	}-*/;
	public final native  ClearingLangCode getClearingLangCode()/*-{
		return $wnd.cleanObject(this.clearingLangCode);
	}-*/;
	public final native  void setClearingLangCode(ClearingLangCode clearingLangCode)/*-{
		this.clearingLangCode = clearingLangCode;
	}-*/;
	public final native  ClientApp getClientApp()/*-{
		return $wnd.cleanObject(this.clientApp);
	}-*/;
	public final native  void setClientApp(ClientApp clientApp)/*-{
		this.clientApp = clientApp;
	}-*/;
	public final native  ProxyClient getProxyClient()/*-{
		return $wnd.cleanObject(this.proxyClient);
	}-*/;
	public final native  void setProxyClient(ProxyClient proxyClient)/*-{
		this.proxyClient = proxyClient;
	}-*/;
	public final native  MsgGroupReference getMsgGroupReference()/*-{
		return $wnd.cleanObject(this.msgGroupReference);
	}-*/;
	public final native  void setMsgGroupReference(MsgGroupReference msgGroupReference)/*-{
		this.msgGroupReference = msgGroupReference;
	}-*/;
}
