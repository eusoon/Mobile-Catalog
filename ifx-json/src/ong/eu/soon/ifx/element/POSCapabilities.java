package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class POSCapabilities extends IFXObject {
	POSAttended pOSAttended;	 //	Boolean	 Optional	 An agent of the card acceptor attends the service device. Default is false.
	POSOperation[] pOSOperation;	 //	Open Enum	 Optional Repeating	 Valid values: CustomerOperated, AcceptorOperated, AdministratorOperated, ScheduleOperated
	POSEntryCapability[] pOSEntryCapability;	 //	Open Enum	 Optional Repeating	 Valid values: Unknown, Manual, MagStripe, BarCode, OCR, ICC, Customer.
	POSCaptureCapability pOSCaptureCapability;	 //	Boolean	 Optional	 The service provider can capture the identification device. Default is false.
	POSVerifyCapability[] pOSVerifyCapability;	 //	Open Enum	 Optional Repeating	 Valid values: Unknown, None, Signature, PictureID, OnlinePIN, OfflinePIN, DigitizedSignature, Biometrics, ICCSignature, Certificate, AddressVerification, TelephoneNumberVerification, PersonalInfoVerification.
	POSOutCapabilities[] pOSOutCapabilities;	 //	Open Enum	 Optional Repeating	 Valid values: None, TrackRewrite, ICCUpdate
	public POSAttended getpOSAttended() {
		return pOSAttended;
	}
	public void setpOSAttended(POSAttended pOSAttended) {
		this.pOSAttended = pOSAttended;
	}
	public POSOperation[] getpOSOperation() {
		return pOSOperation;
	}
	public void setpOSOperation(POSOperation[] pOSOperation) {
		this.pOSOperation = pOSOperation;
	}
	public POSEntryCapability[] getpOSEntryCapability() {
		return pOSEntryCapability;
	}
	public void setpOSEntryCapability(POSEntryCapability[] pOSEntryCapability) {
		this.pOSEntryCapability = pOSEntryCapability;
	}
	public POSCaptureCapability getpOSCaptureCapability() {
		return pOSCaptureCapability;
	}
	public void setpOSCaptureCapability(POSCaptureCapability pOSCaptureCapability) {
		this.pOSCaptureCapability = pOSCaptureCapability;
	}
	public POSVerifyCapability[] getpOSVerifyCapability() {
		return pOSVerifyCapability;
	}
	public void setpOSVerifyCapability(POSVerifyCapability[] pOSVerifyCapability) {
		this.pOSVerifyCapability = pOSVerifyCapability;
	}
	public POSOutCapabilities[] getpOSOutCapabilities() {
		return pOSOutCapabilities;
	}
	public void setpOSOutCapabilities(POSOutCapabilities[] pOSOutCapabilities) {
		this.pOSOutCapabilities = pOSOutCapabilities;
	}
	
	
}