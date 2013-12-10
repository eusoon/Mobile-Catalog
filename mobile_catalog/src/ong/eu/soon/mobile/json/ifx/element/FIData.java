package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class FIData extends IFXObject {

	protected FIData(){
	}
	
	public final native  FIIdentType getFIIdentType()/*-{
		return $wnd.cleanObject(this.fIIdentType);
	}-*/;
	public final native  void setFIIdentType(FIIdentType fIIdentType)/*-{
		this.fIIdentType = fIIdentType;
	}-*/;
	public final native  FIIdent getFIIdent()/*-{
		return $wnd.cleanObject(this.fIIdent);
	}-*/;
	public final native  void setFIIdent(FIIdent fIIdent)/*-{
		this.fIIdent = fIIdent;
	}-*/;
	public final native  JsArray<RefData> getRefData()/*-{
		return $wnd.cleanObject(this.refData);
	}-*/;
	public final native  void setRefData(JsArray<RefData> refData)/*-{
		this.refData = refData;
	}-*/;
	public final native  Name getName()/*-{
		return $wnd.cleanObject(this.name);
	}-*/;
	public final native  void setName(Name name)/*-{
		this.name = name;
	}-*/;
	public final native  BranchIdent getBranchIdent()/*-{
		return $wnd.cleanObject(this.branchIdent);
	}-*/;
	public final native  void setBranchIdent(BranchIdent branchIdent)/*-{
		this.branchIdent = branchIdent;
	}-*/;
	public final native  BranchName getBranchName()/*-{
		return $wnd.cleanObject(this.branchName);
	}-*/;
	public final native  void setBranchName(BranchName branchName)/*-{
		this.branchName = branchName;
	}-*/;
	public final native  PostAddr getPostAddr()/*-{
		return $wnd.cleanObject(this.PostAddr);
	}-*/;
	public final native  void setPostAddr(PostAddr postAddr)/*-{
		PostAddr = postAddr;
	}-*/;
}
