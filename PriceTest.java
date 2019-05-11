/**
 * 
 */
package financial;

import java.util.Currency;
import java.util.Locale;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Tommy Cusack
 *
 */
class PriceTest {
	
	/**
	 * Test method for {@link financial.Price#hashCode()}.
	 */
	@Test
	final void testHashCode() {
		Price price = new Price();
		Assertions.assertNotEquals(0, price.hashCode(), "Price.hashCode() test failed");
	}

	/**
	 * Test method for {@link financial.Price#hashCode()}.
	 */
	@Test
	final void testHashCodeAmount() {
		Price price = new Price();
		Assertions.assertNotEquals(price.hashCode(), price.getAmount().hashCode(), "Price.testHashCodeAmount() test failed");
	}
	
	/**
	 * Test method for {@link financial.Price#hashCode()}.
	 */
	@Test
	final void testHashCodeCurrency() {
		Price price = new Price();
		Assertions.assertNotEquals(price.hashCode(), price.getCurrency().hashCode(), "Price.hashCodeCurrency() test failed");
	}
	
	/**
	 * Test method for {@link financial.Price#hashCode()}.
	 */
	@Test
	final void testHashCodeLocale() {
		Price price = new Price();
		Assertions.assertNotEquals(price.hashCode(), price.getLocale().hashCode(), "Price.hashCodeLocale() test failed");
	}
	
	/**
	 * Test method for {@link financial.Price#hashCode()}.
	 */
	@Test
	final void testHashCodeLocaleDefault() {
		Price price = new Price();
		Assertions.assertNotEquals(price.hashCode(), Price.getLocaleDefault().hashCode(), "Price.hashCodeLocaleDefault() test failed");
	}
	
	/**
	 * Test method for {@link financial.Price#Price()}.
	 */
	@Test
	final void testPrice() {
		Price price = new Price();
		Assertions.assertNotEquals(null, price, "Price.testPrice() test failed");
	}

	/**
	 * Test method for {@link financial.Price#Price()}.
	 */
	@Test
	final void testPriceAmount() {
		Price price = new Price();
		Assertions.assertEquals(true, price.isAmountValid( price.getAmount() ), "Price.testPriceAmount() test failed");
	}

	/**
	 * Test method for {@link financial.Price#Price()}.
	 */
	@Test
	final void testPriceCurrency() {
		Price price = new Price();
		Assertions.assertEquals(true, price.isCurrencyValid( price.getCurrency() ), "Price.testPriceCurrency() test failed");
	}

	/**
	 * Test method for {@link financial.Price#Price()}.
	 */
	@Test
	final void testPriceLocale() {
		Price price = new Price();
		Assertions.assertEquals(true, price.isLocaleValid( price.getLocale() ), "Price.testPriceLocale() test failed");
	}

	/**
	 * Test method for {@link financial.Price#Price(java.lang.Double)}.
	 */
	@Test
	final void testPriceDouble() {
		Price priceAmount = new Price(6.66);
		Assertions.assertNotEquals(null, priceAmount, "Price.testPriceDoubleAmount() test failed");
	}
	
	/**
	 * Test method for {@link financial.Price#Price()}.
	 */
	@Test
	final void testPriceDoubleAmount() {
		Price price = new Price();
		Price priceAmount = new Price(6.66);
		Assertions.assertEquals(true, priceAmount.isAmountValid( price.getAmount() ), "Price.testPriceDoubleAmount() test failed");
	}

	/**
	 * Test method for {@link financial.Price#Price()}.
	 */
	@Test
	final void testPriceDoubleCurrency() {
		Price price = new Price();
		Price priceAmount = new Price(6.66);
		Assertions.assertEquals(true, priceAmount.isCurrencyValid( price.getCurrency() ), "Price.testPriceDoubleCurrency() test failed");
	}

	/**
	 * Test method for {@link financial.Price#Price()}.
	 */
	@Test
	final void testPriceDoubleLocale() {
		Price price = new Price();
		Price priceAmount = new Price(6.66);
		Assertions.assertEquals(true, priceAmount.isLocaleValid( price.getLocale() ), "Price.testPriceDoubleLocale() test failed");
	}
	
	/**
	 * Test method for {@link financial.Price#Price(java.lang.Double, java.util.Locale)}.
	 */
	@Test
	final void testPriceConstructorDoubleLocale() {
		Price priceLocale = new Price(Locale.ENGLISH);
		Assertions.assertNotEquals(null, priceLocale, "Price.testPriceDoubleLocale() test failed");
	}

	/**
	 * Test method for {@link financial.Price#Price()}.
	 */
	@Test
	final void testPriceConstructorDoubleLocaleAmount() {
		Price price = new Price();
		Price priceAmountLocale = new Price(13.13, Locale.ENGLISH);
		Assertions.assertEquals(true, priceAmountLocale.isAmountValid( price.getAmount() ), "Price.testPriceConstructorDoubleLocale() test failed");
	}

	/**
	 * Test method for {@link financial.Price#Price()}.
	 */
	@Test
	final void testPriceConstructorDoubleLocaleCurrency() {
		Price price = new Price();
		Price priceAmountLocale = new Price(13.13, Locale.ENGLISH);
		Assertions.assertEquals(true, priceAmountLocale.isCurrencyValid( price.getCurrency() ), "Price.testPriceConstructorDoubleLocale() test failed");
	}

	/**
	 * Test method for {@link financial.Price#Price()}.
	 */
	@Test
	final void testPriceConstructorDoubleLocaleLocale() {
		Price price = new Price();
		Price priceAmountLocale = new Price(13.13, Locale.ENGLISH);
		Assertions.assertEquals(true, priceAmountLocale.isLocaleValid( price.getLocale() ), "Price.testPriceDoubleConstructorDoubleLocale() test failed");
	}
		
	/**
	 * Test method for {@link financial.Price#Price(java.util.Locale)}.
	 */
	@Test
	final void testPriceConstructorLocale() {
		Price priceLocale = new Price(Locale.ENGLISH);
		Assertions.assertNotEquals(null, priceLocale, "Price.testPriceConstructorLocale() test failed");
	}
	
	/**
	 * Test method for {@link financial.Price#Price()}.
	 */
	@Test
	final void testPriceConstructorLocaleAmount() {
		Price price = new Price();
		Price priceLocale = new Price(Locale.ENGLISH);
		Assertions.assertEquals(true, priceLocale.isAmountValid( price.getAmount() ), "Price.testPriceConstructorLocalemount() test failed");
	}

	/**
	 * Test method for {@link financial.Price#Price()}.
	 */
	@Test
	final void testPriceConstructorLocaleCurrency() {
		Price price = new Price();
		Price priceLocale = new Price(Locale.ENGLISH);
		Assertions.assertEquals(true, priceLocale.isCurrencyValid( price.getCurrency() ), "Price.testPriceConstructorLocaleCurrency() test failed");
	}

	/**
	 * Test method for {@link financial.Price#Price()}.
	 */
	@Test
	final void testPriceConstructorLocaleLocale() {
		Price price = new Price();
		Price priceLocale = new Price(Locale.ENGLISH);
		Assertions.assertEquals(true, priceLocale.isLocaleValid( price.getLocale() ), "Price.testPriceConstructorLocaleLocale() test failed");
	}
		
	/**
	 * Test method for {@link financial.Price#getCurrency()}.
	 */
	@Test
	final void testGetCurrency() {
		Price price = new Price();
		Assertions.assertEquals(true, (price.getCurrency() instanceof Currency), "userId.testGetCurrency() test failed");
	}

	/**
	 * Test method for {@link financial.Price#setCurrency(java.util.Currency)}.
	 */
	@Test
	final void testSetCurrencyCurrency() {
		Price price = new Price();
		price.setCurrency( Currency.getInstance( Locale.CANADA ) );
		Assertions.assertEquals(true, price.getCurrency().equals( Currency.getInstance( Locale.CANADA ) ), "userId.testSetCurrencyCurrency() test failed");
	}

	/**
	 * Test method for {@link financial.Price#setCurrency(java.util.Locale)}.
	 */
	@Test
	final void testSetCurrencyLocale() {
		Price price = new Price();
		price.setCurrency( Currency.getInstance( Price.getLocaleDefault() ) );
		Assertions.assertEquals(true, price.getCurrency().equals( Currency.getInstance( Price.getLocaleDefault() ) ), "userId.testSetCurrencyCurrency() test failed");
	}

	/**
	 * Test method for {@link financial.Price#getLocaleDefault()}.
	 */
	@Test
	final void testGetLocaleDefault() {
		Assertions.assertEquals(true, Price.getLocaleDefault() instanceof Locale, "Price.testGetLocaleDefault() test failed");
	}

	/**
	 * Test method for {@link financial.Price#getAmountDefault()}.
	 */
	@Test
	final void testGetAmountDefault() {
		Assertions.assertEquals(true, Price.getAmountDefault().equals(Price.AMOUNT_DEFAULT), "Price.testGetAmountDefault() test failed");
	}

	/**
	 * Test method for {@link financial.Price#getLocale()}.
	 */
	@Test
	final void testGetLocale() {
		Price price = new Price();
		Assertions.assertEquals(true, price.getLocale() instanceof Locale, "Price.testGetLocale() test failed");
	}

	/**
	 * Test method for {@link financial.Price#setLocale(java.util.Locale)}.
	 */
	@Test
	final void testSetLocale() {
		Price price = new Price();
		price.setLocale( Locale.FRANCE );
		Assertions.assertEquals(true, price.getLocale().equals( Locale.FRANCE ), "userId.testSetLocale() test failed");
	}

	/**
	 * Test method for {@link financial.Price#isAmountValid(java.lang.Double)}.
	 */
	@Test
	final void testIsAmountValid() {
		Price priceAmountLocale = new Price(13.13, Locale.ENGLISH);
		Assertions.assertEquals(true, priceAmountLocale.getAmount() instanceof Double, "userId.testIsAmountValid() test failed");
	}

	/**
	 * Test method for {@link financial.Price#isCurrencyValid(java.util.Currency)}.
	 */
	@Test
	final void testIsCurrencyValid() {
		Price price = new Price();
		Assertions.assertNotEquals(null, price.getCurrency(), "userId.testIsCurrencyValid() test failed");
	}

	/**
	 * Test method for {@link financial.Price#isCurrencyValid(java.util.Currency)}.
	 */
	@Test
	final void testIsCurrencyValidInstanceofCurrency() {
		Price price = new Price();
		Assertions.assertEquals(true, (price.getCurrency() instanceof Currency), "userId.testIsCurrencyValidInstanceofCurrency() test failed");
	}

	/**
	 * Test method for {@link financial.Price#isCurrencyValid(java.util.Currency)}.
	 */
	@Test
	final void testIsCurrencyValidAmount() {
		Price priceAmount = new Price(6.66);
		Assertions.assertNotEquals(null, priceAmount.getCurrency(), "userId.testIsCurrencyValidAmount() test failed");
	}

	/**
	 * Test method for {@link financial.Price#isCurrencyValid(java.util.Currency)}.
	 */
	@Test
	final void testIsCurrencyValidAmountInstanceofCurrency() {
		Price priceAmount = new Price(6.66);
		Assertions.assertEquals(true, (priceAmount.getCurrency() instanceof Currency), "userId.testIsCurrencyValidAmountInstanceofCurrency() test failed");
	}
	
	/**
	 * Test method for {@link financial.Price#isCurrencyValid(java.util.Currency)}.
	 */
	@Test
	final void testIsCurrencyValidAmountLocale() {
		Price priceAmountLocale = new Price(13.13, Locale.ENGLISH);
		Assertions.assertNotEquals(null, priceAmountLocale.getCurrency(), "userId.testIsCurrencyValidAmountLocale() test failed");
	}

	/**
	 * Test method for {@link financial.Price#isCurrencyValid(java.util.Currency)}.
	 */
	@Test
	final void testIsCurrencyValidAmountLocaleInstanceofCurrency() {
		Price priceAmountLocale = new Price(13.13, Locale.ENGLISH);
		Assertions.assertEquals(true, (priceAmountLocale.getCurrency() instanceof Currency), "userId.testIsCurrencyValidAmountLocaleInstanceofCurrency() test failed");
	}
	/**
	 * Test method for {@link financial.Price#isCurrencyValid(java.util.Currency)}.
	 */
	@Test
	final void testIsCurrencyValidLocale() {
		Price priceLocale = new Price(Locale.ENGLISH);
		Assertions.assertNotEquals(null, priceLocale.getCurrency(), "userId.testIsCurrencyValidLocale() test failed");
	}

	/**
	 * Test method for {@link financial.Price#isCurrencyValid(java.util.Currency)}.
	 */
	@Test
	final void testIsCurrencyValidLocaleInstanceofCurrency() {
		Price priceLocale = new Price(Locale.ENGLISH);
		Assertions.assertEquals(true, (priceLocale.getCurrency() instanceof Currency), "userId.testIsCurrencyValidLocaleInstanceofCurrency() test failed");
	}
	
	/**
	 * Test method for {@link financial.Price#isLocaleValid(java.util.Locale)}.
	 */
	@Test
	final void testIsLocaleValid() {
		Price price = new Price();
		Assertions.assertNotEquals(null, price.getLocale(), "userId.testIsLocaleValid() test failed");
	}

	/**
	 * Test method for {@link financial.Price#isLocaleValid(java.util.Locale)}.
	 */
	@Test
	final void testIsLocaleValidInstanceofLocale() {
		Price price = new Price();
		Assertions.assertEquals(true, (price.getLocale() instanceof Locale), "userId.testIsLocaleValidInstanceofLocale() test failed");
	}
	
	/**
	 * Test method for {@link financial.Price#isLocaleValid(java.util.Locale)}.
	 */
	@Test
	final void testIsLocaleValidAmount() {
		Price priceAmount = new Price(6.66);
		Assertions.assertNotEquals(null, priceAmount.getLocale(), "userId.testIsLocaleValidAmount() test failed");
	}

	/**
	 * Test method for {@link financial.Price#isLocaleValid(java.util.Locale)}.
	 */
	@Test
	final void testIsLocaleValidAmountInstanceofLocale() {
		Price priceLocale = new Price(Locale.ENGLISH);
		Assertions.assertEquals(true, (priceLocale.getLocale() instanceof Locale), "userId.testIsLocaleValidAmountInstanceofLocale() test failed");
	}
	
	/**
	 * Test method for {@link financial.Price#isLocaleValid(java.util.Locale)}.
	 */
	@Test
	final void testIsLocaleValidAmountLocale() {
		Price priceAmountLocale = new Price(13.13, Locale.ENGLISH);
		Assertions.assertNotEquals(null, priceAmountLocale.getLocale(), "userId.testIsLocaleValidAmountLocale() test failed");
	}

	/**
	 * Test method for {@link financial.Price#isLocaleValid(java.util.Locale)}.
	 */
	@Test
	final void testIsLocaleValidAmountLocaleInstanceofLocale() {
		Price priceAmountLocale = new Price(13.13, Locale.ENGLISH);
		Assertions.assertEquals(true, (priceAmountLocale.getLocale() instanceof Locale), "userId.testIsLocaleValidAmountLocaleInstanceofLocale() test failed");
	}
	
	/**
	 * Test method for {@link financial.Price#isLocaleValid(java.util.Locale)}.
	 */
	@Test
	final void testIsLocaleValidLocale() {
		Price priceLocale = new Price(Locale.ENGLISH);
		Assertions.assertNotEquals(null, priceLocale.getLocale(), "userId.testIsLocaleValidLocale() test failed");
	}

	/**
	 * Test method for {@link financial.Price#isLocaleValid(java.util.Locale)}.
	 */
	@Test
	final void testIsLocaleValidLocaleInstanceofLocale() {
		Price priceLocale = new Price(Locale.ENGLISH);
		Assertions.assertEquals(true, (priceLocale.getLocale() instanceof Locale), "userId.testIsLocaleValidLocaleInstanceofLocale() test failed");
	}
	
	/**
	 * Test method for {@link financial.Price#isPriceInterfaceValid()}.
	 */
	@Test
	final void testIsPriceInterfaceValid() {
		Price priceAmountLocale = new Price(13.13, Locale.ENGLISH);
		Assertions.assertEquals(true, (priceAmountLocale instanceof PriceInterface), "userId.testIsPriceInterfaceValid() test failed");
	}

	/**
	 * Test method for {@link financial.Price#isPriceInterfaceValid()}.
	 */
	@Test
	final void testIsPriceInterfaceValidNull() {
		Price priceAmountLocale = new Price(13.13, Locale.ENGLISH);
		Assertions.assertEquals(false, priceAmountLocale.isPriceInterfaceValid(null), "userId.testIsPriceInterfaceValid() test failed");
	}

	/**
	 * Test method for {@link financial.Price#isPriceInterfaceValid()}.
	 */
	@Test
	final void testIsPriceInterfaceValidThis() {
		Price priceAmountLocale = new Price(13.13, Locale.ENGLISH);
		Assertions.assertEquals(true, priceAmountLocale.isPriceInterfaceValid(priceAmountLocale), "userId.testIsPriceInterfaceValidThis() test failed");
	}

	/**
	 * Test method for {@link financial.Price#isPriceInterfaceValid()}.
	 */
	@Test
	final void testIsPriceInterfaceValidAmount() {
		Price priceAmountLocale = new Price(13.13, Locale.ENGLISH);
		Assertions.assertEquals(true, priceAmountLocale.isAmountValid( priceAmountLocale.getAmount() ), "userId.testIsPriceInterfaceValidAmount() test failed");
	}
	
	/**
	 * Test method for {@link financial.Price#isPriceInterfaceValid()}.
	 */
	@Test
	final void testIsPriceInterfaceValidCurrency() {
		Price priceAmountLocale = new Price(13.13, Locale.ENGLISH);
		Assertions.assertEquals(true, priceAmountLocale.isCurrencyValid( priceAmountLocale.getCurrency() ), "userId.testIsPriceInterfaceValidCurrency() test failed");
	}
	
	/**
	 * Test method for {@link financial.Price#isPriceInterfaceValid()}.
	 */
	@Test
	final void testIsPriceInterfaceValidLocale() {
		Price priceAmountLocale = new Price(13.13, Locale.ENGLISH);
		Assertions.assertEquals(true, priceAmountLocale.isLocaleValid( priceAmountLocale.getLocale() ), "userId.testIsPriceInterfaceValidLocale() test failed");
	}
	
	/**
	 * Test method for {@link financial.Price#isPriceInterfaceValid(financial.PriceInterface)}.
	 */
	@Test
	final void testIsPriceInterfaceValidPriceInterface() {
		Price priceLocale = new Price(Locale.ENGLISH);
		Assertions.assertEquals(true, priceLocale.isPriceInterfaceValid(priceLocale), "userId.testIsPriceInterfaceValidPriceInterface() test failed");
	}

	/**
	 * Test method for {@link financial.Price#getAmount()}.
	 */
	@Test
	final void testGetAmount() {
		Price priceAmountLocale = new Price(13.13, Locale.ENGLISH);
		Assertions.assertEquals(true, priceAmountLocale.getAmount() instanceof Double, "userId.testGetAmount() test failed");
	}

	/**
	 * Test method for {@link financial.Price#setAmount(java.lang.Double)}.
	 */
	@Test
	final void testSetAmount() {
		Price priceAmountLocale = new Price(13.13, Locale.ENGLISH);
		priceAmountLocale.setAmount(666.666);
		Assertions.assertEquals(true, priceAmountLocale.getAmount().equals(666.666), "userId.testSetAmount() test failed");
	}

	/**
	 * Test method for {@link financial.Price#setAmount(java.lang.Double)}.
	 */
	@Test
	final void testSetAmountNull() {
		Price priceAmountLocale = new Price(13.13, Locale.ENGLISH);
		priceAmountLocale.setAmount(null);
		Assertions.assertEquals(true, priceAmountLocale.getAmount().equals( Price.getAmountDefault() ), "userId.testSetAmountNull() test failed");
	}

	/**
	 * Test method for {@link financial.Price#equals(java.lang.Object)}.
	 */
	@Test
	final void testEqualsObject() {
		Price priceAmountLocale = new Price(13.13, Locale.ENGLISH);
		Price priceAmountLocale2 = new Price(13.13, Locale.ENGLISH);
		Assertions.assertEquals(priceAmountLocale, priceAmountLocale2, "userId.testEqualsObject() test failed");
	}

	/**
	 * Test method for {@link financial.Price#equals(java.lang.Object)}.
	 */
	@Test
	final void testEqualsObjectNull() {
		Price priceAmountLocale = new Price(13.13, Locale.ENGLISH);
		Assertions.assertFalse(priceAmountLocale.equals(null), "userId.testEqualsObjectNull() test failed");
	}

	/**
	 * Test method for {@link financial.Price#equals(java.lang.Object)}.
	 */
	@Test
	final void testEqualsObjectAmount() {
		Price priceAmountLocale = new Price(13.13, Locale.ENGLISH);
		Price priceAmountLocale2 = new Price( priceAmountLocale.getAmount() + 12.34, Locale.ENGLISH);
		Assertions.assertNotEquals(priceAmountLocale, priceAmountLocale2, "userId.testEqualsObjectAmount() test failed");
	}

	/**
	 * Test method for {@link financial.Price#equals(java.lang.Object)}.
	 */
	@Test
	final void testEqualsObjectCurrency() {
		Price priceAmountLocale = new Price(13.13, Locale.ENGLISH);
		Price priceAmountLocale2 = new Price( priceAmountLocale.getAmount(), priceAmountLocale.getLocale());
		priceAmountLocale2.setCurrency( Currency.getInstance( Locale.CANADA_FRENCH ) );
		Assertions.assertNotEquals(priceAmountLocale, priceAmountLocale2, "userId.testEqualsObjectCurrency() test failed");
	}

	/**
	 * Test method for {@link financial.Price#equals(java.lang.Object)}.
	 */
	@Test
	final void testEqualsObjectLocale() {
		Price priceAmountLocale = new Price(13.13, Locale.ENGLISH);
		Price priceAmountLocale2 = new Price( priceAmountLocale.getAmount(), Locale.FRANCE);
		Assertions.assertNotEquals(priceAmountLocale, priceAmountLocale2, "userId.testEqualsObjectLocale() test failed");
	}

	/**
	 * Test method for {@link financial.Price#toString()}.
	 */
	@Test
	final void testToStringNonEmpty() {
		Price price = new Price();
		Assertions.assertNotEquals("", price.toString(), "userId.testToStringNonEmpty() test failed");
	}

	/**
	 * Test method for {@link financial.Price#toString()}.
	 */
	@Test
	final void testToStringNonNull() {
		Price price = new Price();
		Assertions.assertNotEquals(null, price.toString(), "userId.testToStringNonNull() test failed");
	}
}
