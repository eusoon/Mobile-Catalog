package ong.eu.soon.mobile.json.ifx.element;

public class SecTokenCard extends SecToken {

	protected SecTokenCard(){	
	}
	
	public final native CardEmbossNum getCardEmbossNum() /*-{
		return $wnd.cleanObject(cardEmbossNum);
	}-*/;
	public final native void setCardEmbossNum(CardEmbossNum cardEmbossNum) /*-{
		this.cardEmbossNum = cardEmbossNum;
	}-*/;
	public final native CardSeqNum getCardSeqNum() /*-{
		return $wnd.cleanObject(cardSeqNum);
	}-*/;
	public final native void setCardSeqNum(CardSeqNum cardSeqNum) /*-{
		this.cardSeqNum = cardSeqNum;
	}-*/;
	public final native Brand getBrand() /*-{
		return $wnd.cleanObject(brand);
	}-*/;
	public final native void setBrand(Brand brand) /*-{
		this.brand = brand;
	}-*/;
	public final native CardTechnology getCardTechnology() /*-{
		return $wnd.cleanObject(cardTechnology);
	}-*/;
	public final native void setCardTechnology(CardTechnology cardTechnology) /*-{
		this.cardTechnology = cardTechnology;
	}-*/;
	public final native ExpDt getExpDt() /*-{
		return $wnd.cleanObject(expDt);
	}-*/;
	public final native void setExpDt(ExpDt expDt) /*-{
		this.expDt = expDt;
	}-*/;
	public final native CardVrfyData getCardVrfyData() /*-{
		return $wnd.cleanObject(cardVrfyData);
	}-*/;
	public final native void setCardVrfyData(CardVrfyData cardVrfyData) /*-{
		this.cardVrfyData = cardVrfyData;
	}-*/;
	public final native Name getName() /*-{
		return $wnd.cleanObject(name);
	}-*/;
	public final native void setName(Name name) /*-{
		this.name = name;
	}-*/;
	public final native CSPhoneNum getcSPhoneNum() /*-{
		return $wnd.cleanObject(cSPhoneNum);
	}-*/;
	public final native void setcSPhoneNum(CSPhoneNum cSPhoneNum) /*-{
		this.cSPhoneNum = cSPhoneNum;
	}-*/;
	public final native PINData getPINData() /*-{
		return $wnd.cleanObject(PINData);
	}-*/;
	public final native void setPINData(PINData pINData) /*-{
		PINData = pINData;
	}-*/;
}