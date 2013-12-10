package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class MsgAuthCode extends IFXObject {
	MacValue macValue;//HexBin-unbound	Required The Message Authentication Code value. Calculated using an encryption key shared by both endpoints according to a previously agreed algorithm such as ANSI X9.9/FIPS113 or ANSI X9.71/FIPS198.
	MacVariant MacVariant;//HexBin-8	Optional The Message Authentication Variant value. This field is used to ensure that MAC values will not be repeatable. When used, this value will be generated randomly before the MacValue is calculated. Mac variants cannot be retransmitted.
	SecObjId SecObjId;//Identifier	Optional The Security Object ID of the encryption key used to calculate the MAC Value. Used in lieu of check digits to help identify key synchronization errors.
	public MacValue getMacValue() {
		return macValue;
	}
	public void setMacValue(MacValue macValue) {
		this.macValue = macValue;
	}
	public MacVariant getMacVariant() {
		return MacVariant;
	}
	public void setMacVariant(MacVariant macVariant) {
		MacVariant = macVariant;
	}
	public SecObjId getSecObjId() {
		return SecObjId;
	}
	public void setSecObjId(SecObjId secObjId) {
		SecObjId = secObjId;
	}
}
