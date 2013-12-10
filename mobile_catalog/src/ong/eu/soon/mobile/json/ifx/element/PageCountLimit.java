package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class PageCountLimit extends IFXObject {
	protected PageCountLimit(){	
	}
	public final native PageType getPageType() /*-{
		return $wnd.cleanObject(pageType);
	}-*/;
	public final native void setPageType(PageType pageType) /*-{
		this.pageType = pageType;
	}-*/;
	public final native CollatingSequence getCollatingSequence() /*-{
		return $wnd.cleanObject(collatingSequence);
	}-*/;
	public final native void setCollatingSequence(CollatingSequence collatingSequence) /*-{
		this.collatingSequence = collatingSequence;
	}-*/;
	public final native JsArray<PageNumRange> getPageNumRange() /*-{
		return $wnd.cleanObject(pageNumRange);
	}-*/;
	public final native void setPageNumRange(JsArray<PageNumRange> pageNumRange) /*-{
		this.pageNumRange = pageNumRange;
	}-*/;
}
