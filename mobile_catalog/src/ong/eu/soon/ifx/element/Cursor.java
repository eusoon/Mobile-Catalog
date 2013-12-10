package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXBase64Binary;

public class Cursor extends IFXBase64Binary {

	ContentType contentType; //Open Enum	Optional	Specified in IETF RFC 2046.

	BinLength binLength; //Long	Required	Identifies the size of the binary data in number of bytes.

	BinData binData; //Raw Binary Data	Required	Binary data.

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
