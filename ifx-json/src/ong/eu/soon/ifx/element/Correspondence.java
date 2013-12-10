package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class Correspondence extends IFXObject {
	CorrespondenceIdent correspondenceIdent; //NC-36	Optional	Correspondence Identifier
	Desc desc; //C-80	Optional	Description
	Version version; //NC-12	Optional	The version of the object or item
	CorrespondenceType correspondenceType; //C-40	Optional	Correspondence Type
	DeliveryMethod deliveryMethod; //Open Enum	Optional	Delivery Method		Valid values include: Channel, Courier, Email, Fax, HomeBank, InPerson, LocalPrinter, OverNight, Phone, Post, SMS, TwoDay, UPS, URL
	DeliveryDt deliveryDt; //Date	Optional	Delivery Date
	ReceiptDt receiptDt; //Date		Optional	Receipt Date
	CampaignIdent campaignIdent;//NC-36	Optional	Campaign Identifier
	FormImg formImg; //Aggregate	Optional	Form Image
	FormImgLoc formImgLoc; //C-255	Optional	Form Image Location
	BatchNum batchNum; //C-40	Optional	Batch Number
	FileRecordNum fileRecordNum; //C-40	Optional File Record Number
	QuestionAnswer[] questionAnswer;//Aggregate	Optional Repeating	Question and Answer Pair
	
	public CorrespondenceIdent getCorrespondenceIdent() {
		return correspondenceIdent;
	}
	public void setCorrespondenceIdent(CorrespondenceIdent correspondenceIdent) {
		this.correspondenceIdent = correspondenceIdent;
	}
	public Desc getDesc() {
		return desc;
	}
	public void setDesc(Desc desc) {
		this.desc = desc;
	}
	public Version getVersion() {
		return version;
	}
	public void setVersion(Version version) {
		this.version = version;
	}
	public CorrespondenceType getCorrespondenceType() {
		return correspondenceType;
	}
	public void setCorrespondenceType(CorrespondenceType correspondenceType) {
		this.correspondenceType = correspondenceType;
	}
	public DeliveryMethod getDeliveryMethod() {
		return deliveryMethod;
	}
	public void setDeliveryMethod(DeliveryMethod deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}
	public DeliveryDt getDeliveryDt() {
		return deliveryDt;
	}
	public void setDeliveryDt(DeliveryDt deliveryDt) {
		this.deliveryDt = deliveryDt;
	}
	public ReceiptDt getReceiptDt() {
		return receiptDt;
	}
	public void setReceiptDt(ReceiptDt receiptDt) {
		this.receiptDt = receiptDt;
	}
	public CampaignIdent getCampaignIdent() {
		return campaignIdent;
	}
	public void setCampaignIdent(CampaignIdent campaignIdent) {
		this.campaignIdent = campaignIdent;
	}
	public FormImg getFormImg() {
		return formImg;
	}
	public void setFormImg(FormImg formImg) {
		this.formImg = formImg;
	}
	public FormImgLoc getFormImgLoc() {
		return formImgLoc;
	}
	public void setFormImgLoc(FormImgLoc formImgLoc) {
		this.formImgLoc = formImgLoc;
	}
	public BatchNum getBatchNum() {
		return batchNum;
	}
	public void setBatchNum(BatchNum batchNum) {
		this.batchNum = batchNum;
	}
	public FileRecordNum getFileRecordNum() {
		return fileRecordNum;
	}
	public void setFileRecordNum(FileRecordNum fileRecordNum) {
		this.fileRecordNum = fileRecordNum;
	}
	public QuestionAnswer[] getQuestionAnswer() {
		return questionAnswer;
	}
	public void setQuestionAnswer(QuestionAnswer[] questionAnswer) {
		this.questionAnswer = questionAnswer;
	}

}
