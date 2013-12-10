package ong.eu.soon.ifx.element;

public enum ForExQuoteType {
	Drawdown("Drawdown"), FXFuture("FXFuture"), FXNetTrade("FXNetTrade"), FXOption("FXOption"), FXTrade("FXTrade"), Multi_Trade("Multi-Trade"), Offset("Offset"), SwapFarLeg("SwapFarLeg"), SwapNearLeg("SwapNearLeg"), TimeDeposit("TimeDeposit"), Two_Way("Two-Way");
	private String value;
	private ForExQuoteType(String value){
		this.value=value;
	}
}
