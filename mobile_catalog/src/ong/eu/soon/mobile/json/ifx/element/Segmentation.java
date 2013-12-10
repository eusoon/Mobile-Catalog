package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class Segmentation extends IFXObject {

	protected Segmentation(){	
	}
	
	public final native SegmentType getSegmentType() /*-{
		return $wnd.cleanObject(segmentType);
	}-*/;
	public final native void setSegmentType(SegmentType segmentType) /*-{
		this.segmentType = segmentType;
	}-*/;
	public final native SegmentValue getSegmentValue() /*-{
		return $wnd.cleanObject(segmentValue);
	}-*/;
	public final native void setSegmentValue(SegmentValue segmentValue) /*-{
		this.segmentValue = segmentValue;
	}-*/;

}