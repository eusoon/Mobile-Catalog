package ong.eu.soon.mobile.json.ifx.element;

public class SecTokenObject extends SecToken {

	protected SecTokenObject(){	
	}
	
	public final native CardVerifyType getCardVerifyType() /*-{
		return $wnd.cleanObject(cardVerifyType);
	}-*/;
	public final native void setCardVerifyType(CardVerifyType cardVerifyType) /*-{
		this.cardVerifyType = cardVerifyType;
	}-*/;
	public final native DocumentVerifyType getDocumentVerifyType() /*-{
		return $wnd.cleanObject(documentVerifyType);
	}-*/;
	public final native void setDocumentVerifyType(DocumentVerifyType documentVerifyType) /*-{
		this.documentVerifyType = documentVerifyType;
	}-*/;

}