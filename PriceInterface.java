/**
 * 
 */
package financial;

import java.util.Currency;
import java.util.Locale;

/**
 * @author Tommy Cusack
 *
 */
public interface PriceInterface {
	public Currency getCurrency();
	public void setCurrency(Currency currency);
	
	public Locale getLocale();
	public void setLocale(Locale locale);
	
	public Double getAmount();
	public void setAmount(Double amount);
	
	/* public boolean isAmountValid(BigDecimal amount);
	public boolean isCurrencyValid(Currency currency);
	public boolean isLocaleValid(Locale locale); */
	public boolean isPriceInterfaceValid();
	public boolean isPriceInterfaceValid(PriceInterface priceInterface);
}
