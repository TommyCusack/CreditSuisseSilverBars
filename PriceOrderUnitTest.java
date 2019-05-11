/**
 * 
 */
package financial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import order.OrderUnit;

/**
 * @author tommy
 *
 */
class PriceOrderUnitTest {
	
	/**
	 * Test method for {@link financial.PriceOrderUnit#hashCode()}.
	 */
	@Test
	final void testHashCode() {
		PriceOrderUnit priceOrderUnit = new PriceOrderUnit( PriceOrderUnit.getPriceDefault(), OrderUnit.getOrderUnitDefault() );
		Assertions.assertNotEquals(0, priceOrderUnit.hashCode(), "PriceOrderUnit.hashCode() test failed");
	}

	/**
	 * Test method for {@link financial.PriceOrderUnit#PriceOrderUnit(financial.Price, order.OrderUnit)}.
	 */
	@Test
	final void testPriceOrderUnitOrderUnit() {
		PriceOrderUnit priceOrderUnit = new PriceOrderUnit( PriceOrderUnit.getPriceDefault(), OrderUnit.getOrderUnitDefault() );
		Assertions.assertEquals(true, priceOrderUnit.getOrderUnit() instanceof OrderUnit, "PriceOrderUnit.testPriceOrderUnitOrderUnit() test failed");
	}

	/**
	 * Test method for {@link financial.PriceOrderUnit#PriceOrderUnit(financial.Price, order.OrderUnit)}.
	 */
	@Test
	final void testPriceOrderUnitPrice() {
		PriceOrderUnit priceOrderUnit = new PriceOrderUnit( PriceOrderUnit.getPriceDefault(), OrderUnit.getOrderUnitDefault() );
		Assertions.assertEquals(true, priceOrderUnit.getPrice() instanceof Price, "PriceOrderUnit.testPriceOrderUnitPrice() test failed");
	}

	/**
	 * Test method for {@link financial.PriceOrderUnit#getOrderUnitDefault()}.
	 */
	@Test
	final void testGetOrderUnitDefault() {
		Assertions.assertEquals(true, PriceOrderUnit.getOrderUnitDefault().equals( OrderUnit.getOrderUnitDefault() ), "PriceOrderUnit.testGetOrderUnitDefault() test failed");
	}

	/**
	 * Test method for {@link financial.PriceOrderUnit#getOrderUnit()}.
	 */
	@Test
	final void testGetOrderUnit() {
		PriceOrderUnit priceOrderUnit = new PriceOrderUnit( PriceOrderUnit.getPriceDefault(), OrderUnit.getOrderUnitDefault() );
		Assertions.assertEquals(true, priceOrderUnit.getOrderUnit() instanceof OrderUnit, "PriceOrderUnit.testGetOrderUnit() test failed");
	}

	/**
	 * Test method for {@link financial.PriceOrderUnit#setOrderUnit(order.OrderUnit)}.
	 */
	@Test
	final void testSetOrderUnit() {
		PriceOrderUnit priceOrderUnit = new PriceOrderUnit( PriceOrderUnit.getPriceDefault(), OrderUnit.getOrderUnitDefault() );
		priceOrderUnit.setOrderUnit( OrderUnit.INVALID_ORDER_UNIT ); 
		Assertions.assertEquals(true, priceOrderUnit.getOrderUnit().equals( OrderUnit.INVALID_ORDER_UNIT ), "PriceOrderUnit.testSetOrderUnit() test failed");
	}

	/**
	 * Test method for {@link financial.PriceOrderUnit#setOrderUnit(order.OrderUnit)}.
	 */
	@Test
	final void testSetOrderUnitNull() {
		PriceOrderUnit priceOrderUnit = new PriceOrderUnit( PriceOrderUnit.getPriceDefault(), OrderUnit.getOrderUnitDefault() );
		priceOrderUnit.setOrderUnit( null ); 
		Assertions.assertEquals(true, priceOrderUnit.getOrderUnit().equals( OrderUnit.KILOGRAM ), "PriceOrderUnit.testSetOrderUnitNull() test failed");
	}

	/**
	 * Test method for {@link financial.PriceOrderUnit#getPrice()}.
	 */
	@Test
	final void testGetPrice() {
		PriceOrderUnit priceOrderUnit = new PriceOrderUnit( PriceOrderUnit.getPriceDefault(), OrderUnit.getOrderUnitDefault() );
		Assertions.assertEquals(true, priceOrderUnit.getPrice() instanceof Price, "PriceOrderUnit.testGetPrice() test failed");
	}

	/**
	 * Test method for {@link financial.PriceOrderUnit#setPrice(financial.Price)}.
	 */
	@Test
	final void testSetPrice() {
		PriceOrderUnit priceOrderUnit = new PriceOrderUnit( PriceOrderUnit.getPriceDefault(), OrderUnit.getOrderUnitDefault() );
		Price price = new Price(9.99);
		priceOrderUnit.setPrice( price );
		Assertions.assertEquals(true, priceOrderUnit.getPrice().equals(price), "PriceOrderUnit.testSetPrice() test failed");
	}

	/**
	 * Test method for {@link financial.PriceOrderUnit#setPrice(financial.Price)}.
	 */
	@Test
	final void testSetPriceNull() {
		PriceOrderUnit priceOrderUnit = new PriceOrderUnit( PriceOrderUnit.getPriceDefault(), OrderUnit.getOrderUnitDefault() );
		priceOrderUnit.setPrice( PriceOrderUnit.getPriceDefault() );
		priceOrderUnit.setPrice( null );
		Assertions.assertEquals(true, priceOrderUnit.getPrice().equals( PriceOrderUnit.getPriceDefault() ), "PriceOrderUnit.testSetPriceNull() test failed");
	}

	/**
	 * Test method for {@link financial.PriceOrderUnit#getPriceDefault()}.
	 */
	@Test
	final void testGetPriceDefault() {
		Assertions.assertEquals(true, PriceOrderUnit.getPriceDefault().equals(PriceOrderUnit.PRICE_DEFAULT), "PriceOrderUnit.testGetPriceDefault() test failed");
	}

	/**
	 * Test method for {@link financial.PriceOrderUnit#isOrderUnitValid(order.OrderUnit)}.
	 */
	@Test
	final void testIsOrderUnitValid() {
		PriceOrderUnit priceOrderUnit = new PriceOrderUnit( PriceOrderUnit.getPriceDefault(), OrderUnit.getOrderUnitDefault() );
		Assertions.assertEquals(true, priceOrderUnit.getOrderUnit() instanceof OrderUnit, "PriceOrderUnit.testIsOrderUnitValid() test failed");
	}

	/**
	 * Test method for {@link financial.PriceOrderUnit#isPriceOrderUnitValid()}.
	 */
	@Test
	final void testIsPriceOrderUnitValid() {
		PriceOrderUnit priceOrderUnit = new PriceOrderUnit( PriceOrderUnit.getPriceDefault(), OrderUnit.getOrderUnitDefault() );
		Assertions.assertEquals(true, priceOrderUnit.isPriceOrderUnitValid(), "PriceOrderUnit.testIsPriceOrderUnitValid() test failed");
	}
	
	/**
	 * Test method for {@link financial.PriceOrderUnit#isPriceOrderUnitValid(financial.PriceOrderUnit)}.
	 */
	@Test
	final void testIsPriceOrderUnitValidPriceOrderUnit() {
		PriceOrderUnit priceOrderUnit = new PriceOrderUnit( PriceOrderUnit.getPriceDefault(), OrderUnit.getOrderUnitDefault() );
		Assertions.assertEquals(true, PriceOrderUnit.isPriceOrderUnitValid(priceOrderUnit), "PriceOrderUnit.testIsPriceOrderUnitValidPriceOrderUnit() test failed");
	}

	/**
	 * Test method for {@link financial.PriceOrderUnit#isPriceOrderUnitValid(financial.PriceOrderUnit)}.
	 */
	@Test
	final void testIsPriceOrderUnitValidPriceOrderUnitNull() {
		Assertions.assertEquals(false, PriceOrderUnit.isPriceOrderUnitValid(null), "PriceOrderUnit.testIsPriceOrderUnitValidPriceOrderUnitNull() test failed");
	}

	/**
	 * Test method for {@link financial.PriceOrderUnit#equals(java.lang.Object)}.
	 */
	@Test
	final void testEqualsObject() {
		PriceOrderUnit priceOrderUnit = new PriceOrderUnit( PriceOrderUnit.getPriceDefault(), OrderUnit.getOrderUnitDefault() );
		PriceOrderUnit priceOrderUnit2 = new PriceOrderUnit( priceOrderUnit.getPrice(), priceOrderUnit.getOrderUnit());
		Assertions.assertEquals(priceOrderUnit, priceOrderUnit2, "PriceOrderUnit.testIsPriceOrderUnitValidPriceOrderUnit() test failed");
	}

	/**
	 * Test method for {@link financial.PriceOrderUnit#equals(java.lang.Object)}.
	 */
	@Test
	final void testEqualsObjectNull() {
		PriceOrderUnit priceOrderUnit = new PriceOrderUnit( PriceOrderUnit.getPriceDefault(), OrderUnit.getOrderUnitDefault() );
		Assertions.assertNotEquals(priceOrderUnit, null, "PriceOrderUnit.testIsPriceOrderUnitValidPriceOrderUnitNull() test failed");
	}

	/**
	 * Test method for {@link financial.PriceOrderUnit#toString()}.
	 */
	@Test
	final void testToStringNonNull() {
		PriceOrderUnit priceOrderUnit = new PriceOrderUnit( PriceOrderUnit.getPriceDefault(), OrderUnit.getOrderUnitDefault() );
		Assertions.assertNotEquals(null, priceOrderUnit.toString(), "PriceOrderUnit.testToStringNonNull() test failed");
	}

	/**
	 * Test method for {@link financial.PriceOrderUnit#toString()}.
	 */
	@Test
	final void testToStringNonEmpty() {
		PriceOrderUnit priceOrderUnit = new PriceOrderUnit( PriceOrderUnit.getPriceDefault(), OrderUnit.getOrderUnitDefault() );
		Assertions.assertNotEquals(null, priceOrderUnit.toString(), "PriceOrderUnit.testToStringNonEmpty() test failed");
	}
}
