/**
 * 
 */
package financial;

import java.util.ArrayList;
import java.util.Currency;
import java.util.Locale;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import utility.Utility;


/**
 * @author Tommy Cusack
 * @version 1.0
 * @since   2019-05-11
 * Price implements PriceInterface methods to deliver basic Price functionality.
 */
public class Price implements PriceInterface{
	private static final Logger LOGGER = Logger.getLogger( Class.class.getName() );
	
	public static final Locale LOCALE_DEFAULT = Locale.UK;
	public static final Double AMOUNT_DEFAULT = 0.0;
	
	private Double amount;
	private Currency currency;
	private Locale locale;
	
	public Price(){
		this( Price.getAmountDefault(), Price.getLocaleDefault() );
	}
	
	public Price(Double amount) {
		this( amount, Price.getLocaleDefault() );
	}
	
	public Price(Double amount, Locale locale) {
		LOGGER.addHandler(new ConsoleHandler());
		setAmount(amount);
		setLocale(locale);
		setCurrency(locale);
	}
	
	public Price(Locale locale) {
		this( Price.AMOUNT_DEFAULT, locale );
	}

	public Currency getCurrency() {
		return this.currency;
	}

	public void setCurrency(Currency currency) {
		if( isCurrencyValid(currency) ) {
			this.currency = currency;
		}else {
			setCurrency( Price.getLocaleDefault() );
		}
	}

	public void setCurrency(Locale locale) {
		try {
			if( isLocaleValid(locale) ){
				if(Currency.getInstance(locale) instanceof Currency) {
					this.currency = Currency.getInstance(locale);
				}else{
					this.currency = Currency.getInstance( Price.getLocaleDefault() );
				}
			}else{
				this.currency = Currency.getInstance( Price.getLocaleDefault() );
			}
		}catch(Exception e) {
			Utility.logErrorMessage(LOGGER, Level.SEVERE, e, Class.class.getPackageName(), "setCurrency(Locale locale)", "Exception thrown! Setting Currency to default value in Locale " + locale.toString());
			this.currency = Currency.getInstance( Price.getLocaleDefault() );
		}
	}

	public static Locale getLocaleDefault() {
		return Price.LOCALE_DEFAULT;
	}
	
	public static Double getAmountDefault() {
		return Price.AMOUNT_DEFAULT;
	}
	
	public Locale getLocale() {
		return this.locale;
	}

	public void setLocale(Locale locale) {
		if( isLocaleValid(locale) ){
			this.locale = locale;
		}else {
			this.locale = Price.getLocaleDefault();
		}
	}
	
	public boolean isAmountValid(Double amount) {
		return (amount instanceof Double);
	}
	
	public boolean isCurrencyValid(Currency currency) {
		return (currency instanceof Currency);
	}
	
	public boolean isLocaleValid(Locale locale) {
		return (locale instanceof Locale);
	}

	public boolean isPriceInterfaceValid() {
		return isPriceInterfaceValid(this);
	}

	public boolean isPriceInterfaceValid(PriceInterface priceInterface) {
		return (priceInterface instanceof PriceInterface 
				&& isAmountValid( ((Price)priceInterface).amount) 
				&& isCurrencyValid( ((Price)priceInterface).currency) 
				&& isLocaleValid( ((Price)priceInterface).locale) );
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		if( isAmountValid(amount) ) {
			this.amount = amount;
		}else {
			this.amount = Price.getAmountDefault();
		}
	}

	@Override public boolean equals(Object object) {
		try {
			return ( (object instanceof Price) 
					&& ((Price)object).amount.equals(this.amount)  
					&& ((Price)object).currency == this.currency 
					&& ((Price)object).locale == this.locale);
		}catch(Exception e) {
			LOGGER.logp(Level.WARNING, Class.class.getPackageName(), "equals(Object object)", "Exception occurred when trying to determine equals.");
		}
		return false;
	}
	
	@Override public int hashCode() {
		int hashCodeAmount = 0;
		int hashCodeCurrency = 0;
		int hashCodeLocale = 0;
		
		if(this.amount!= null) {
			hashCodeAmount = this.amount.hashCode();
		}
		if(this.currency != null) {
			hashCodeCurrency = this.currency.hashCode();
		}
		if(this.locale != null) {
			hashCodeLocale = this.locale.hashCode();
		}
		
		return Utility.generateHashCode( hashCodeAmount * 7 + hashCodeCurrency * 11 + hashCodeLocale * 13 );
	}

	@Override public String toString() {
		StringBuilder priceStringBuilder;
		
		if( isCurrencyValid(this.currency) ) {
			priceStringBuilder = new StringBuilder(this.currency.getSymbol());
		}else {
			priceStringBuilder = new StringBuilder("");
		}
		priceStringBuilder.append(" ");
		
		if( isAmountValid(this.amount) ) {
			priceStringBuilder.append(this.amount);
		}else {
			priceStringBuilder.append(" ");
		}
		
		return priceStringBuilder.toString();
	}
	
}
