package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class RecordCountLimit extends IFXObject {

	LimitPosition limitPosition; //Open Enum	Optional	Limit Positio	Valid values include: Bottom, Top	Default Value: Top
	MaxRecLimit maxRecLimit; //Long	Optional	Maximum Records Limit
	CurRecLimit curRecLimit; //Long	Optional	Current Record Limit
	
	public LimitPosition getLimitPosition() {
		return limitPosition;
	}
	public void setLimitPosition(LimitPosition limitPosition) {
		this.limitPosition = limitPosition;
	}
	public MaxRecLimit getMaxRecLimit() {
		return maxRecLimit;
	}
	public void setMaxRecLimit(MaxRecLimit maxRecLimit) {
		this.maxRecLimit = maxRecLimit;
	}
	public CurRecLimit getCurRecLimit() {
		return curRecLimit;
	}
	public void setCurRecLimit(CurRecLimit curRecLimit) {
		this.curRecLimit = curRecLimit;
	}

}
