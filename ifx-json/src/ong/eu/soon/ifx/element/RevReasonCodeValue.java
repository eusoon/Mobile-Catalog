package ong.eu.soon.ifx.element;

public enum RevReasonCodeValue {
	
	CustCan("CustCan"), DepOutOfBal("DepOutOfBal"), DepOutOfBalApplied("DepOutOfBalApplied"), DevUnableToCompTrn("DevUnableToCompTrn"), FormatError("FormatError"), InvalidRs("InvalidRs"), MsgAuthnError("MsgAuthnError"), NoChkInEnvelope("NoChkInEnvelope"), OrigAmtIncorrect("OrigAmtIncorrect"), PartiallyComp("PartiallyComp"), PmtOutOfBal("PmtOutOfBal"), PmtOutOfBalApplied("PmtOutOfBalApplied"), RsRecdLate("RsRecdLate"), SuspectMalfunc("SuspectMalfunc"), SuspectMalfunc_NoCashDisp("SuspectMalfunc-NoCashDisp"), SuspectMalfuncCardRetain("SuspectMalfuncCardRetain"), SuspectMalfuncCardReturn("SuspectMalfuncCardReturn"), SuspectMalfuncTrack3NotUpdated("SuspectMalfuncTrack3NotUpdated"), TimeOutTakingCard_CardRetainNoCashDisp("TimeOutTakingCard-CardRetainNoCashDisp"), TimeOutTakingMoneyNoCashDisp("TimeOutTakingMoneyNoCashDisp"), TimeoutWaitingForRs("TimeoutWaitingForRs"), UnableToDeliverMsgToPOS("UnableToDeliverMsgToPOS"), Unspecified("Unspecified");
	private String value;
	private RevReasonCodeValue(String value){
		this.value=value;
	}
}