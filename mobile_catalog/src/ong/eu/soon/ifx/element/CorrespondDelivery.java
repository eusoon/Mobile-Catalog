package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CorrespondDelivery extends IFXObject {
	CorrespondType correspondType;//Open Enum	Optional Correspondence Type Valid values include: Letters, PINs, Plastic, Statements
	DeliveryInstruction deliveryInstruction;//Aggregate Optiona Delivery Instruction

}
