package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CardOrderInfo extends IFXObject {

	CardEmbossNum cardEmbossNum;	 //	NC-32	 Required	 Embossed Card Number
	CardSeqNum cardSeqNum;	 //	NC-3	 Optional	 Card Sequence Number
	ValidFromDt validFromDt;	 //	DateTime	 Optional	 Valid From Date
	ExpDt expDt;	 //	DateTime	 Optional	 Expiration Date
	Name name;	 //	C-40	 Optional	 Name
	SecondaryName secondaryName;	 //	C-40	 Optional	 Secondary Name
	CardMagData cardMagData;	 //	Aggregate	 Optional	 Card Magnetic Stripe Data
	OrigIssueDt origIssueDt;	 //	DateTime	 Optional	 Original Issue Date
	CardRef cardRef;	 //	Aggregate	 Optional	 Card Reference Aggregate
	PhotoInd photoInd;	 //	Boolean	 Optional	 Photo Indicator
	PictureRefIdent pictureRefIdent;	 //	NC-36	 Optional	 Picture Reference Identification
	CardDesign cardDesign;	 //	NC-16	 Optional	 Card Design
	CSPhoneNum cSPhoneNum;	 //	Phone Number	 Optional	 Card (customer) service phone number
	MemberSinceDt memberSinceDt;	 //	DateTime	 Optional	 Member Since Date
	CardType cardType;	 //	Open Enum	 Optional	 Card TypeValid values include: ATM, Credit, Debit, Identification, Loyalty, Multifunction, PrepaidDefault Value: Debit
	CardCategory cardCategory;	 //	Open Enum	 Optional	 Card CategoryValid values include: Classic, Gold, Platinum
	Brand brand;	 //	Open Enum	 Optional	 Card BrandValid values include: AmEx, CarteBancaire, Discover, JCB, MasterCard, PrivateLabel, VISA
	AffinityName affinityName;	 //	C-40	 Optional	 Affinity Name
	IssuerName issuerName;	 //	C-80	 Optional	 Card Issuer Name
	CardTechnology cardTechnology;	 //	Open Enum	 Optional	 Card TechnologyValid values include: ICCCard, MagStripeCard
	VendorProductIdent vendorProductIdent;	 //	C-255	 Optional	 Vendor Product Identification
	IssueReason issueReason;	 //	Open Enum	 Optional	 Issue ReasonValid values include: AcceleratedReissue, Additional, Lost/Stolen, New, Preissue, Reissue, Replace
	PinWaive pinWaive;	 //	Boolean	 Optional	 Pin Waive
	PremailerDt premailerDt;	 //	DateTime	 Optional	 Premailer Date
	PostmailerDt postmailerDt;	 //	DateTime	 Optional	 Postmailer Date
	PinmailerDt pinmailerDt;	 //	DateTime	 Optional	 Pinmailer Date
	OrderAcptDt orderAcptDt;	 //	DateTime	 Optional	 Order Accept Date
	OrderSchedDt orderSchedDt;	 //	DateTime	 Optional	 Order Schedule Date
	OrderShipDt orderShipDt;	 //	DateTime	 Optional	 Order Ship Date
	ReturnReason returnReason;	 //	C-20	 Optional	 Return Reason
	ReturnReasonDt returnReasonDt;	 //	DateTime	 Optional	 Return Reason Date
	ReturnResolveReason returnResolveReason;	 //	C-20	 Optional	 Return Resolve Reason
	ReturnResolveReasonDt returnResolveReasonDt;	 //	DateTime	 Optional	 Return Resolve Reason Date
	ProductionPriority productionPriority;	 //	Open Enum	 Optional	 Production PriorityValid values include: Emergency, Standard, Urgent
	DeliveryInstruction deliveryInstruction;	 //	Aggregate	 Optional	 Delivery Instruction
	PinDeliveryInstruction pinDeliveryInstruction;	 //	Aggregate	 Optional	 Pin Delivery Instruction
	PinOnlyInd pinOnlyInd;	 //	Boolean	 Optional	 Pin Only Indicator
	
	public CardEmbossNum getCardEmbossNum() {
		return cardEmbossNum;
	}
	public void setCardEmbossNum(CardEmbossNum cardEmbossNum) {
		this.cardEmbossNum = cardEmbossNum;
	}
	public CardSeqNum getCardSeqNum() {
		return cardSeqNum;
	}
	public void setCardSeqNum(CardSeqNum cardSeqNum) {
		this.cardSeqNum = cardSeqNum;
	}
	public ValidFromDt getValidFromDt() {
		return validFromDt;
	}
	public void setValidFromDt(ValidFromDt validFromDt) {
		this.validFromDt = validFromDt;
	}
	public ExpDt getExpDt() {
		return expDt;
	}
	public void setExpDt(ExpDt expDt) {
		this.expDt = expDt;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public SecondaryName getSecondaryName() {
		return secondaryName;
	}
	public void setSecondaryName(SecondaryName secondaryName) {
		this.secondaryName = secondaryName;
	}
	public CardMagData getCardMagData() {
		return cardMagData;
	}
	public void setCardMagData(CardMagData cardMagData) {
		this.cardMagData = cardMagData;
	}
	public OrigIssueDt getOrigIssueDt() {
		return origIssueDt;
	}
	public void setOrigIssueDt(OrigIssueDt origIssueDt) {
		this.origIssueDt = origIssueDt;
	}
	public CardRef getCardRef() {
		return cardRef;
	}
	public void setCardRef(CardRef cardRef) {
		this.cardRef = cardRef;
	}
	public PhotoInd getPhotoInd() {
		return photoInd;
	}
	public void setPhotoInd(PhotoInd photoInd) {
		this.photoInd = photoInd;
	}
	public PictureRefIdent getPictureRefIdent() {
		return pictureRefIdent;
	}
	public void setPictureRefIdent(PictureRefIdent pictureRefIdent) {
		this.pictureRefIdent = pictureRefIdent;
	}
	public CardDesign getCardDesign() {
		return cardDesign;
	}
	public void setCardDesign(CardDesign cardDesign) {
		this.cardDesign = cardDesign;
	}
	public CSPhoneNum getcSPhoneNum() {
		return cSPhoneNum;
	}
	public void setcSPhoneNum(CSPhoneNum cSPhoneNum) {
		this.cSPhoneNum = cSPhoneNum;
	}
	public MemberSinceDt getMemberSinceDt() {
		return memberSinceDt;
	}
	public void setMemberSinceDt(MemberSinceDt memberSinceDt) {
		this.memberSinceDt = memberSinceDt;
	}
	public CardType getCardType() {
		return cardType;
	}
	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}
	public CardCategory getCardCategory() {
		return cardCategory;
	}
	public void setCardCategory(CardCategory cardCategory) {
		this.cardCategory = cardCategory;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public AffinityName getAffinityName() {
		return affinityName;
	}
	public void setAffinityName(AffinityName affinityName) {
		this.affinityName = affinityName;
	}
	public IssuerName getIssuerName() {
		return issuerName;
	}
	public void setIssuerName(IssuerName issuerName) {
		this.issuerName = issuerName;
	}
	public CardTechnology getCardTechnology() {
		return cardTechnology;
	}
	public void setCardTechnology(CardTechnology cardTechnology) {
		this.cardTechnology = cardTechnology;
	}
	public VendorProductIdent getVendorProductIdent() {
		return vendorProductIdent;
	}
	public void setVendorProductIdent(VendorProductIdent vendorProductIdent) {
		this.vendorProductIdent = vendorProductIdent;
	}
	public IssueReason getIssueReason() {
		return issueReason;
	}
	public void setIssueReason(IssueReason issueReason) {
		this.issueReason = issueReason;
	}
	public PinWaive getPinWaive() {
		return pinWaive;
	}
	public void setPinWaive(PinWaive pinWaive) {
		this.pinWaive = pinWaive;
	}
	public PremailerDt getPremailerDt() {
		return premailerDt;
	}
	public void setPremailerDt(PremailerDt premailerDt) {
		this.premailerDt = premailerDt;
	}
	public PostmailerDt getPostmailerDt() {
		return postmailerDt;
	}
	public void setPostmailerDt(PostmailerDt postmailerDt) {
		this.postmailerDt = postmailerDt;
	}
	public PinmailerDt getPinmailerDt() {
		return pinmailerDt;
	}
	public void setPinmailerDt(PinmailerDt pinmailerDt) {
		this.pinmailerDt = pinmailerDt;
	}
	public OrderAcptDt getOrderAcptDt() {
		return orderAcptDt;
	}
	public void setOrderAcptDt(OrderAcptDt orderAcptDt) {
		this.orderAcptDt = orderAcptDt;
	}
	public OrderSchedDt getOrderSchedDt() {
		return orderSchedDt;
	}
	public void setOrderSchedDt(OrderSchedDt orderSchedDt) {
		this.orderSchedDt = orderSchedDt;
	}
	public OrderShipDt getOrderShipDt() {
		return orderShipDt;
	}
	public void setOrderShipDt(OrderShipDt orderShipDt) {
		this.orderShipDt = orderShipDt;
	}
	public ReturnReason getReturnReason() {
		return returnReason;
	}
	public void setReturnReason(ReturnReason returnReason) {
		this.returnReason = returnReason;
	}
	public ReturnReasonDt getReturnReasonDt() {
		return returnReasonDt;
	}
	public void setReturnReasonDt(ReturnReasonDt returnReasonDt) {
		this.returnReasonDt = returnReasonDt;
	}
	public ReturnResolveReason getReturnResolveReason() {
		return returnResolveReason;
	}
	public void setReturnResolveReason(ReturnResolveReason returnResolveReason) {
		this.returnResolveReason = returnResolveReason;
	}
	public ReturnResolveReasonDt getReturnResolveReasonDt() {
		return returnResolveReasonDt;
	}
	public void setReturnResolveReasonDt(ReturnResolveReasonDt returnResolveReasonDt) {
		this.returnResolveReasonDt = returnResolveReasonDt;
	}
	public ProductionPriority getProductionPriority() {
		return productionPriority;
	}
	public void setProductionPriority(ProductionPriority productionPriority) {
		this.productionPriority = productionPriority;
	}
	public DeliveryInstruction getDeliveryInstruction() {
		return deliveryInstruction;
	}
	public void setDeliveryInstruction(DeliveryInstruction deliveryInstruction) {
		this.deliveryInstruction = deliveryInstruction;
	}
	public PinDeliveryInstruction getPinDeliveryInstruction() {
		return pinDeliveryInstruction;
	}
	public void setPinDeliveryInstruction(
			PinDeliveryInstruction pinDeliveryInstruction) {
		this.pinDeliveryInstruction = pinDeliveryInstruction;
	}
	public PinOnlyInd getPinOnlyInd() {
		return pinOnlyInd;
	}
	public void setPinOnlyInd(PinOnlyInd pinOnlyInd) {
		this.pinOnlyInd = pinOnlyInd;
	}
	
}
