package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class EMVRsData extends IFXObject {
	EMVRsRawData eMVRsRawData;//HexBin-unbound	Optional EMV Response Raw Data
	AuthRsCode authRsCode;//C-2	Required Authorization Response Code. A code that defines the disposition of an EMV response message. As a minimum, the codes reflecting the following responses should be defined in the response messages from the Issuer to the terminal: Online Approval, Online Decline, Referral (initiated by Issuer), and Capture Card. In addition, the terminal shall be able to generate (and transmit to the ICC) the codes reflecting the following new responses when transactions are not authorized online: Unable to go Online, Offline Approved; Unable to go Online, Offline Declined; Offline Approved; Offline Declined; Approval (after card-initiated referral); and Decline (after card-initiated referral). The codes are to be set by the individual payment systems.The terminal shall never modify the Authorization Response Code returned in the response message. The card's final decision is reflected in the Cryptogram Information Data and not in the Authorization Response Code.
	public EMVRsRawData geteMVRsRawData() {
		return eMVRsRawData;
	}
	public void seteMVRsRawData(EMVRsRawData eMVRsRawData) {
		this.eMVRsRawData = eMVRsRawData;
	}
	public AuthRsCode getAuthRsCode() {
		return authRsCode;
	}
	public void setAuthRsCode(AuthRsCode authRsCode) {
		this.authRsCode = authRsCode;
	}
}
