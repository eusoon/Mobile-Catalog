package ong.eu.soon.mobile.json.ifx.element;

public  class CardOrderKeys extends BaseKeys {

	protected CardOrderKeys(){
	}
	
	public final native  SvcIdent getSvcIdent()/*-{
		return $wnd.cleanObject(this.svcIdent);
	}-*/;
	public final native  void setSvcIdent(SvcIdent svcIdent)/*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native  CardOrderId getCardOrderId()/*-{
		return $wnd.cleanObject(this.cardOrderId);
	}-*/;
	public final native  void setCardOrderId(CardOrderId cardOrderId)/*-{
		this.cardOrderId = cardOrderId;
	}-*/;
	public final native  CardEmbossNum getCardEmbossNum()/*-{
		return $wnd.cleanObject(this.cardEmbossNum);
	}-*/;
	public final native  void setCardEmbossNum(CardEmbossNum cardEmbossNum)/*-{
		this.cardEmbossNum = cardEmbossNum;
	}-*/;
	public final native  CardNum getCardNum()/*-{
		return $wnd.cleanObject(this.cardNum);
	}-*/;
	public final native  void setCardNum(CardNum cardNum)/*-{
		this.cardNum = cardNum;
	}-*/;
	public final native  CardSeqNum getCardSeqNum()/*-{
		return $wnd.cleanObject(this.cardSeqNum);
	}-*/;
	public final native  void setCardSeqNum(CardSeqNum cardSeqNum)/*-{
		this.cardSeqNum = cardSeqNum;
	}-*/;
	public final native  CreatedDt getCreatedDt()/*-{
		return $wnd.cleanObject(this.createdDt);
	}-*/;
	public final native  void setCreatedDt(CreatedDt createdDt)/*-{
		this.createdDt = createdDt;
	}-*/;
}
