package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CreditMediaChkData extends IFXObject {
	ChkEnteredAmt ChkEnteredAmt;//Aggregate	Required Check Entered Amount. The amount the customer entered as the check amount being deposited or cashed.
	ChkCourtesyAmt ChkCourtesyAmt;//Aggregate	Optional Check Courtesy Amount. The amount read from the courtesy amount of the check being deposited or cashed.
	MicrReadIntegrity micrReadIntegrity;//Open Enum	Optional MICR Read Integrity. The integrity of the MICR data read from the check being deposited or cashed. Defined Values: Good, Partial, Bad
	MicrUnformatted micrUnformatted;//C-64	Optional MICR Unformatted. The unformatted MICR data read from the check being deposited or cashed.
	ChkImgData chkImgData;//Aggregate	Optional Check Images
	ChkDetail chkDetail;//Aggregate	Optional Check Detail
	PartyData partyData;//Abstract Aggregate	Optional Drawee information such as driver license number and birth date used by some network authorizers. Valid Aggregates are: OrgData PersonData
	ChkAcceptId chkAcceptId;//Identifier	Optional Check Accept Identifier. The identifier from the Check Accept add request message that can be used to find the original Check Accept info.
	public ChkEnteredAmt getChkEnteredAmt() {
		return ChkEnteredAmt;
	}
	public void setChkEnteredAmt(ChkEnteredAmt chkEnteredAmt) {
		ChkEnteredAmt = chkEnteredAmt;
	}
	public ChkCourtesyAmt getChkCourtesyAmt() {
		return ChkCourtesyAmt;
	}
	public void setChkCourtesyAmt(ChkCourtesyAmt chkCourtesyAmt) {
		ChkCourtesyAmt = chkCourtesyAmt;
	}
	public MicrReadIntegrity getMicrReadIntegrity() {
		return micrReadIntegrity;
	}
	public void setMicrReadIntegrity(MicrReadIntegrity micrReadIntegrity) {
		this.micrReadIntegrity = micrReadIntegrity;
	}
	public MicrUnformatted getMicrUnformatted() {
		return micrUnformatted;
	}
	public void setMicrUnformatted(MicrUnformatted micrUnformatted) {
		this.micrUnformatted = micrUnformatted;
	}
	public ChkImgData getChkImgData() {
		return chkImgData;
	}
	public void setChkImgData(ChkImgData chkImgData) {
		this.chkImgData = chkImgData;
	}
	public ChkDetail getChkDetail() {
		return chkDetail;
	}
	public void setChkDetail(ChkDetail chkDetail) {
		this.chkDetail = chkDetail;
	}
	public PartyData getPartyData() {
		return partyData;
	}
	public void setPartyData(PartyData partyData) {
		this.partyData = partyData;
	}
	public ChkAcceptId getChkAcceptId() {
		return chkAcceptId;
	}
	public void setChkAcceptId(ChkAcceptId chkAcceptId) {
		this.chkAcceptId = chkAcceptId;
	}
}
