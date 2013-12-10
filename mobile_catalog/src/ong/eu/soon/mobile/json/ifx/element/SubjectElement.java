package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class SubjectElement extends IFXObject {
	protected SubjectElement(){	
	}
	public final native  Path getPath()/*-{
		return $wnd.cleanObject(this.path);
	}-*/;
	public final native  void setPath(Path path)/*-{
		this.path = path;
	}-*/;
	public final native  Value getValue()/*-{
		return $wnd.cleanObject(this.value);
	}-*/;
	public final native  void setValue(Value value)/*-{
		this.value = value;
	}-*/;
}
