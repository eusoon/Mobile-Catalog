package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public  class BillStmtData extends IFXObject {

	protected BillStmtData(){	
	}
	
	public final native  ImageURL getImageURL()/*-{
		return $wnd.cleanObject(this.imageURL);
	}-*/;
	public final native  void setImageURL(ImageURL imageURL)/*-{
		this.imageURL = imageURL;
	}-*/;
	public final native  JsArray<PrefetchURL> getPrefetchURL()/*-{
		return $wnd.cleanObject(this.prefetchURL);
	}-*/;
	public final native  void setPrefetchURL(JsArray<PrefetchURL> prefetchURL)/*-{
		this.prefetchURL = prefetchURL;
	}-*/;
	public final native  ExpDt getExpDt()/*-{
		return $wnd.cleanObject(this.expDt);
	}-*/;
	public final native  void setExpDt(ExpDt expDt)/*-{
		this.expDt = expDt;
	}-*/;
}
