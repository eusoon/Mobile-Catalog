package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public  class Correspondence extends IFXObject {
	
	protected Correspondence(){
	}
	
	public final native  CorrespondenceIdent getCorrespondenceIdent()/*-{
		return $wnd.cleanObject(this.correspondenceIdent);
	}-*/;
	public final native  void setCorrespondenceIdent(CorrespondenceIdent correspondenceIdent)/*-{
		this.correspondenceIdent = correspondenceIdent;
	}-*/;
	public final native  Desc getDesc()/*-{
		return $wnd.cleanObject(this.desc);
	}-*/;
	public final native  void setDesc(Desc desc)/*-{
		this.desc = desc;
	}-*/;
	public final native  Version getVersion()/*-{
		return $wnd.cleanObject(this.version);
	}-*/;
	public final native  void setVersion(Version version)/*-{
		this.version = version;
	}-*/;
	public final native  CorrespondenceType getCorrespondenceType()/*-{
		return $wnd.cleanObject(this.correspondenceType);
	}-*/;
	public final native  void setCorrespondenceType(CorrespondenceType correspondenceType)/*-{
		this.correspondenceType = correspondenceType;
	}-*/;
	public final native  DeliveryMethod getDeliveryMethod()/*-{
		return $wnd.cleanObject(this.deliveryMethod);
	}-*/;
	public final native  void setDeliveryMethod(DeliveryMethod deliveryMethod)/*-{
		this.deliveryMethod = deliveryMethod;
	}-*/;
	public final native  DeliveryDt getDeliveryDt()/*-{
		return $wnd.cleanObject(this.deliveryDt);
	}-*/;
	public final native  void setDeliveryDt(DeliveryDt deliveryDt)/*-{
		this.deliveryDt = deliveryDt;
	}-*/;
	public final native  ReceiptDt getReceiptDt()/*-{
		return $wnd.cleanObject(this.receiptDt);
	}-*/;
	public final native  void setReceiptDt(ReceiptDt receiptDt)/*-{
		this.receiptDt = receiptDt;
	}-*/;
	public final native  CampaignIdent getCampaignIdent()/*-{
		return $wnd.cleanObject(this.campaignIdent);
	}-*/;
	public final native  void setCampaignIdent(CampaignIdent campaignIdent)/*-{
		this.campaignIdent = campaignIdent;
	}-*/;
	public final native  FormImg getFormImg()/*-{
		return $wnd.cleanObject(this.formImg);
	}-*/;
	public final native  void setFormImg(FormImg formImg)/*-{
		this.formImg = formImg;
	}-*/;
	public final native  FormImgLoc getFormImgLoc()/*-{
		return $wnd.cleanObject(this.formImgLoc);
	}-*/;
	public final native  void setFormImgLoc(FormImgLoc formImgLoc)/*-{
		this.formImgLoc = formImgLoc;
	}-*/;
	public final native  BatchNum getBatchNum()/*-{
		return $wnd.cleanObject(this.batchNum);
	}-*/;
	public final native  void setBatchNum(BatchNum batchNum)/*-{
		this.batchNum = batchNum;
	}-*/;
	public final native  FileRecordNum getFileRecordNum()/*-{
		return $wnd.cleanObject(this.fileRecordNum);
	}-*/;
	public final native  void setFileRecordNum(FileRecordNum fileRecordNum)/*-{
		this.fileRecordNum = fileRecordNum;
	}-*/;
	public final native  JsArray<QuestionAnswer> getQuestionAnswer()/*-{
		return $wnd.cleanObject(this.questionAnswer);
	}-*/;
	public final native  void setQuestionAnswer(JsArray<QuestionAnswer> questionAnswer)/*-{
		this.questionAnswer = questionAnswer;
	}-*/;

}
