package ong.eu.soon.ifx.element;

public class SecTokenObject extends SecToken {
	CardVerifyType cardVerifyType;//Open Enum	RequiredCard Verify Type Valid values include: Unverified, Verified
	DocumentVerifyType documentVerifyType;//Open Enum	Required Document Verify Type Valid values include: Unverified, Verified
	public CardVerifyType getCardVerifyType() {
		return cardVerifyType;
	}
	public void setCardVerifyType(CardVerifyType cardVerifyType) {
		this.cardVerifyType = cardVerifyType;
	}
	public DocumentVerifyType getDocumentVerifyType() {
		return documentVerifyType;
	}
	public void setDocumentVerifyType(DocumentVerifyType documentVerifyType) {
		this.documentVerifyType = documentVerifyType;
	}

}
