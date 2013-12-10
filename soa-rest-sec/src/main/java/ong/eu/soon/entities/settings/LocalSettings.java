package ong.eu.soon.entities.settings;

import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;


import ong.eu.soon.utils.IntValuedEnum;
import ong.eu.soon.utils.conversion.AmountConverter;

import org.apache.commons.lang3.StringUtils;

public class LocalSettings {
	/**
	 * Contains possible number formats
	 * 
	 * @author luis
	 */
	public static enum NumberLocale {
		PERIOD_AS_DECIMAL(Locale.US), COMMA_AS_DECIMAL(Locale.GERMANY);
		private final Locale locale;

		private NumberLocale(final Locale locale1) {
			locale = locale1;
		}

		public Locale getLocale() {
			return locale;
		}
	}

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

	private NumberLocale numberLocale = NumberLocale.COMMA_AS_DECIMAL;
	private Precision precision = Precision.TWO;
	private transient AmountConverter amountConverter;
	private transient DecimalFormat decimalFormat;
	private transient DecimalFormatSymbols decimalSymbols;

	public NumberLocale getNumberLocale() {
		return numberLocale;
	}

	public Precision getPrecision() {
		return precision;
	}

	public Object getApplicationName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getApplicationUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	public AmountConverter getAmountConverter() {
		if (amountConverter == null) {
			amountConverter = new AmountConverter(getDecimalFormat());
		}
		return amountConverter;
	}

	public AmountConverter getAmountConverter(final String unitsPattern) {
		return new AmountConverter(getDecimalFormat(), unitsPattern);
	}

	private DecimalFormat getDecimalFormat() {
		if (decimalFormat == null) {
			decimalFormat = getDecimalFormat(precision.value);
		}
		return decimalFormat;
	}

	private DecimalFormat getDecimalFormat(final int precision) {
		String pattern = "#,##0";
		if (precision > 0) {
			pattern += "." + StringUtils.repeat("0", precision);
		}
		return new DecimalFormat(pattern, getDecimalSymbols());
	}

	public DecimalFormatSymbols getDecimalSymbols() {
		if (decimalSymbols == null) {
			decimalSymbols = new DecimalFormatSymbols(numberLocale.getLocale());
		}
		return decimalSymbols;
	}
}