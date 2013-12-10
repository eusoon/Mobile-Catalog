package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class PmtLegalRptData extends IFXObject {
	protected PmtLegalRptData(){	
	}
	public final native LegalRptCode getLegalRptCode() /*-{
		return $wnd.cleanObject(legalRptCode);
	}-*/;
	public final native void setLegalRptCode(LegalRptCode legalRptCode) /*-{
		this.legalRptCode = legalRptCode;
	}-*/;
	public final native SupplRptCode getSupplRptCode() /*-{
		return $wnd.cleanObject(supplRptCode);
	}-*/;
	public final native void setSupplRptCode(SupplRptCode supplRptCode) /*-{
		this.supplRptCode = supplRptCode;
	}-*/;
	public final native Desc getDesc() /*-{
		return $wnd.cleanObject(desc);
	}-*/;
	public final native void setDesc(Desc desc) /*-{
		this.desc = desc;
	}-*/;
	public final native Memo getMemo() /*-{
		return $wnd.cleanObject(memo);
	}-*/;
	public final native void setMemo(Memo memo) /*-{
		this.memo = memo;
	}-*/;
	public final native SupplyingCountry getSupplyingCountry() /*-{
		return $wnd.cleanObject(supplyingCountry);
	}-*/;
	public final native void setSupplyingCountry(SupplyingCountry supplyingCountry) /*-{
		this.supplyingCountry = supplyingCountry;
	}-*/;
	public final native CurAmt getCurAmt() /*-{
		return $wnd.cleanObject(curAmt);
	}-*/;
	public final native void setCurAmt(CurAmt curAmt) /*-{
		this.curAmt = curAmt;
	}-*/;
	public final native ImportDt getImportDt() /*-{
		return $wnd.cleanObject(importDt);
	}-*/;
	public final native void setImportDt(ImportDt importDt) /*-{
		this.importDt = importDt;
	}-*/;
}