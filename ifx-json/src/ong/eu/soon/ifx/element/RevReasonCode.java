package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class RevReasonCode extends IFXObject {
	RevReasonCodeValue revReasonCodeValue;//Open Enum	Optional Reversal Reason Code Value
	//Valid values include: CustCan, DepOutOfBal, DepOutOfBalApplied, DevUnableToCompTrn, FormatError, InvalidRs, MsgAuthnError, NoChkInEnvelope, OrigAmtIncorrect, PartiallyComp, PmtOutOfBal, PmtOutOfBalApplied, RsRecdLate, SuspectMalfunc, SuspectMalfunc-NoCashDisp, SuspectMalfuncCardRetain, SuspectMalfuncCardReturn, SuspectMalfuncTrack3NotUpdated, TimeOutTakingCard-CardRetainNoCashDisp, TimeOutTakingMoneyNoCashDisp, TimeoutWaitingForRs, UnableToDeliverMsgToPOS, Unspecified
	RevReasonCodeSource revReasonCodeSource;//Open Enum	Optional Reversal Reason Code Source
	//Valid values include: 8583:1993AnnexA.11

}