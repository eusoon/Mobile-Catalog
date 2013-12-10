package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class DocCtrlOut extends IFXObject {

	SentPageCount sentPageCount; //Long	Optional	Sent Page Count

	public SentPageCount getSentPageCount() {
		return sentPageCount;
	}

	public void setSentPageCount(SentPageCount sentPageCount) {
		this.sentPageCount = sentPageCount;
	}	
}