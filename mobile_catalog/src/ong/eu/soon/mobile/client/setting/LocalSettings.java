package ong.eu.soon.mobile.client.setting;
import java.math.MathContext;
import java.math.RoundingMode;

import ong.eu.soon.mobile.client.LoggedUser;
import ong.eu.soon.mobile.client.utils.IntValuedEnum;

public class LocalSettings {
	

	/**
	 * Indicates the number precision for the local currency
	 * 
	 * @author luis
	 */
	public static enum Precision implements IntValuedEnum {
		ZERO(0), ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6);
		private final int value;

		private Precision(final int value1) {
			value = value1;
		}

		public MathContext getMathContext() {
			return new MathContext(value, RoundingMode.HALF_UP);
		}

		@Override
		public int getValue() {
			return value;
		}
	}

	public static final int BIG_DECIMAL_DIVISION_PRECISION = 6;

	
	private Precision precision = Precision.TWO;



	private String applicationName;

	

	public Precision getPrecision() {
		return precision;
	}

	public String getApplicationName() {
		return this.applicationName;
	}

	public String getApplicationUsername() {

		return LoggedUser.get().getPrincipal();
	}
	
}
