package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class DiscInfo extends IFXObject {
	DiscName discName;//C-64	Required Disclosure Name
	Version version;//NC-12	Optional The version of the object or item.
	//begin-xor Required
	LongText longText;//C-unbound	Required Disclosure Text.
	DiscURL discURL;//URL	Required Disclosure URL. The address for obtaining human-readable disclosure information.
	//end-xor
	public DiscName getDiscName() {
		return discName;
	}
	public void setDiscName(DiscName discName) {
		this.discName = discName;
	}
	public Version getVersion() {
		return version;
	}
	public void setVersion(Version version) {
		this.version = version;
	}
	public LongText getLongText() {
		return longText;
	}
	public void setLongText(LongText longText) {
		this.longText = longText;
	}
	public DiscURL getDiscURL() {
		return discURL;
	}
	public void setDiscURL(DiscURL discURL) {
		this.discURL = discURL;
	}

}
