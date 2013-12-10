package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class DfltPmtData extends IFXObject {
	
	protected DfltPmtData(){
	}
	
	public final native  FromAcctRef getFromAcctRef()/*-{
		return $wnd.cleanObject(this.fromAcctRef);
	}-*/;
	public final native  void setFromAcctRef(FromAcctRef fromAcctRef)/*-{
		this.fromAcctRef = fromAcctRef;
	}-*/;
	public final native  Category getCategory()/*-{
		return $wnd.cleanObject(this.category);
	}-*/;
	public final native  void setCategory(Category category)/*-{
		this.category = category;
	}-*/;
	public final native  Memo getMemo()/*-{
		return $wnd.cleanObject(this.memo);
	}-*/;
	public final native  void setMemo(Memo memo)/*-{
		this.memo = memo;
	}-*/;
}