package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class NetworkTrnData extends IFXObject {
	protected NetworkTrnData(){	
	}
	public final native NetworkOwner getNetworkOwner() /*-{
		return $wnd.cleanObject(networkOwner);
	}-*/;
	public final native void setNetworkOwner(NetworkOwner networkOwner) /*-{
		this.networkOwner = networkOwner;
	}-*/;
	public final native OriginatorName getOriginatorName() /*-{
		return $wnd.cleanObject(originatorName);
	}-*/;
	public final native void setOriginatorName(OriginatorName originatorName) /*-{
		this.originatorName = originatorName;
	}-*/;
	public final native OriginatorType getOriginatorType() /*-{
		return $wnd.cleanObject(originatorType);
	}-*/;
	public final native void setOriginatorType(OriginatorType originatorType) /*-{
		this.originatorType = originatorType;
	}-*/;
	public final native TerminalIdent getTerminalIdent() /*-{
		return $wnd.cleanObject(terminalIdent);
	}-*/;
	public final native void setTerminalIdent(TerminalIdent terminalIdent) /*-{
		this.terminalIdent = terminalIdent;
	}-*/;
	public final native TerminalType getTerminalType() /*-{
		return $wnd.cleanObject(terminalType);
	}-*/;
	public final native void setTerminalType(TerminalType terminalType) /*-{
		this.terminalType = terminalType;
	}-*/;
	public final native PostAddr getPostAddr() /*-{
		return $wnd.cleanObject(postAddr);
	}-*/;
	public final native void setPostAddr(PostAddr postAddr) /*-{
		this.postAddr = postAddr;
	}-*/;
	public final native Desc getDesc() /*-{
		return $wnd.cleanObject(desc);
	}-*/;
	public final native void setDesc(Desc desc) /*-{
		this.desc = desc;
	}-*/;
	public final native Name getName() /*-{
		return $wnd.cleanObject(name);
	}-*/;
	public final native void setName(Name name) /*-{
		this.name = name;
	}-*/;
	public final native FIIdentType getfIIdentType() /*-{
		return $wnd.cleanObject(fIIdentType);
	}-*/;
	public final native void setfIIdentType(FIIdentType fIIdentType) /*-{
		this.fIIdentType = fIIdentType;
	}-*/;
	public final native FIIdent getfIIdent() /*-{
		return $wnd.cleanObject(fIIdent);
	}-*/;
	public final native void setfIIdent(FIIdent fIIdent) /*-{
		this.fIIdent = fIIdent;
	}-*/;
	public final native NetworkRefIdent getNetworkRefIdent() /*-{
		return $wnd.cleanObject(networkRefIdent);
	}-*/;
	public final native void setNetworkRefIdent(NetworkRefIdent networkRefIdent) /*-{
		this.networkRefIdent = networkRefIdent;
	}-*/;
	public final native AcquirerIdent getAcquirerIdent() /*-{
		return $wnd.cleanObject(acquirerIdent);
	}-*/;
	public final native void setAcquirerIdent(AcquirerIdent acquirerIdent) /*-{
		this.acquirerIdent = acquirerIdent;
	}-*/;
	public final native MerchNum getMerchNum() /*-{
		return $wnd.cleanObject(merchNum);
	}-*/;
	public final native void setMerchNum(MerchNum merchNum) /*-{
		this.merchNum = merchNum;
	}-*/;
	public final native MCC getmCC() /*-{
		return $wnd.cleanObject(mCC);
	}-*/;
	public final native void setmCC(MCC mCC) /*-{
		this.mCC = mCC;
	}-*/;

}