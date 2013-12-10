package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class Logo extends IFXObject {

	// begin Elements from Binary
	ContentType contentType;	 //	Open Enum	 Optional	 Specified in IETF RFC 2046.
	BinLength binLength;	 //	Long	 Required	 Identifies the size of the binary data in number of bytes.
	BinData binData;	 //	Raw Binary Data	 Required	 Binary data.
	// end Elements from Binary
	public ContentType getContentType() {
		return contentType;
	}
	public void setContentType(ContentType contentType) {
		this.contentType = contentType;
	}
	public BinLength getBinLength() {
		return binLength;
	}
	public void setBinLength(BinLength binLength) {
		this.binLength = binLength;
	}
	public BinData getBinData() {
		return binData;
	}
	public void setBinData(BinData binData) {
		this.binData = binData;
	}

}
