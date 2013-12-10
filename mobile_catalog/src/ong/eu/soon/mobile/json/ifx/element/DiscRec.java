package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class DiscRec extends IFXObject {
	
	protected DiscRec(){
	}
	
	public final native  SvcIdent getSvcIdent()/*-{
		return $wnd.cleanObject(this.svcIdent);
	}-*/;
	public final native  void setSvcIdent(SvcIdent svcIdent)/*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native  DiscId getDiscId()/*-{
		return $wnd.cleanObject(this.discId);
	}-*/;
	public final native  void setDiscId(DiscId discId)/*-{
		this.discId = discId;
	}-*/;
	public final native  DiscInfo getDiscInfo()/*-{
		return $wnd.cleanObject(this.discInfo);
	}-*/;
	public final native  void setDiscInfo(DiscInfo discInfo)/*-{
		this.discInfo = discInfo;
	}-*/;
	public final native  DiscEnvr getDiscEnvr()/*-{
		return $wnd.cleanObject(this.discEnvr);
	}-*/;
	public final native  void setDiscEnvr(DiscEnvr discEnvr)/*-{
		this.discEnvr = discEnvr;
	}-*/;
	public final native  DiscStatus getDiscStatus()/*-{
		return $wnd.cleanObject(this.DiscStatus);
	}-*/;
	public final native  void setDiscStatus(DiscStatus discStatus)/*-{
		DiscStatus = discStatus;
	}-*/;
}
