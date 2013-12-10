package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PageCountLimit extends IFXObject {

	PageType pageType;//Open Enum	Optional Page Type Valid values include: Logical, Physical, ServerDiscretion Default Value: ServerDiscretion
	CollatingSequence collatingSequence;//Open Enum	Optional Collating Sequence Valid values include: Even, Normal, Odd, Reverse Default Value: Normal
	PageNumRange[] pageNumRange;//Aggregate	Optional Repeating Page Number Range
	public PageType getPageType() {
		return pageType;
	}
	public void setPageType(PageType pageType) {
		this.pageType = pageType;
	}
	public CollatingSequence getCollatingSequence() {
		return collatingSequence;
	}
	public void setCollatingSequence(CollatingSequence collatingSequence) {
		this.collatingSequence = collatingSequence;
	}
	public PageNumRange[] getPageNumRange() {
		return pageNumRange;
	}
	public void setPageNumRange(PageNumRange[] pageNumRange) {
		this.pageNumRange = pageNumRange;
	}


}
