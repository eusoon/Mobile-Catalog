package ong.eu.soon.ifx.element;

public class SecTokenICC extends SecToken {
	AppPan appPan;//HexBin-20	Required Application Primary Account Number
	AppPanSeq appPanSeq; //HexBin-1	 Optional Application PAN Sequence Number
	AppIdent appIdent;//HexBin-16	Optional Application Identifier
	PINBlock pINBlock; //NC-32	OptionaPIN Block
	public AppPan getAppPan() {
		return appPan;
	}
	public void setAppPan(AppPan appPan) {
		this.appPan = appPan;
	}
	public AppPanSeq getAppPanSeq() {
		return appPanSeq;
	}
	public void setAppPanSeq(AppPanSeq appPanSeq) {
		this.appPanSeq = appPanSeq;
	}
	public AppIdent getAppIdent() {
		return appIdent;
	}
	public void setAppIdent(AppIdent appIdent) {
		this.appIdent = appIdent;
	}
	public PINBlock getpINBlock() {
		return pINBlock;
	}
	public void setpINBlock(PINBlock pINBlock) {
		this.pINBlock = pINBlock;
	}

}
