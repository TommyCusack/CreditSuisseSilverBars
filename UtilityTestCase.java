package utility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UtilityTestCase {
	
	/**
	 * Test method for {@link utility.Utility#computeHashCode(boolean)}.
	 */
	@Test
	final void testComputeHashCodeBooleanTrue() {
		Assertions.assertEquals(1, Utility.computeHashCode(true), "Utility.testComputeHashCodeBooleanTrue(true) test failed");
	}	
	
	/**
	 * Test method for {@link utility.Utility#computeHashCode(boolean)}.
	 */
	@Test
	final void testComputeHashCodeBooleanFalse() {
		Assertions.assertEquals(0, Utility.computeHashCode(false), "Utility.testComputeHashCodeBooleanFalse(false) test failed");
	}	
	
	/**
	 * Test method for {@link utility.Utility#computeHashCode(char)}.
	 */
	@Test
	final void testComputeHashCodeChar() {
		char character = '7';
		Assertions.assertEquals( (int) character, Utility.computeHashCode(character), "Utility.testComputeHashCodeChar() test failed");
	}	
	
	/**
	 * Test method for {@link utility.Utility#computeHashCode(int)}.
	 */
	@Test
	final void testComputeHashCodeInt() {
		int number = 7;
		Assertions.assertEquals(number, Utility.computeHashCode(number), "Utility.testComputeHashCodeInt() test failed");
	}	
	
	/**
	 * Test method for {@link utility.Utility#computeHashCode(long)}.
	 */
	@Test
	final void testComputeHashCodeLongZero() {
		long number = (long) 0.0;
		Assertions.assertEquals((int) number, Utility.computeHashCode(number), "Utility.testComputeHashCodeLongZero() test failed");
	}	
	
	/**
	 * Test method for {@link utility.Utility#computeHashCode(long)}.
	 */
	@Test
	final void testComputeHashCodeLongNonZero() {
		long number = (long) 1.0;
		Assertions.assertEquals((int) number, Utility.computeHashCode(number), "Utility.testComputeHashCodeLongNonZero() test failed");
	}	
	
	/**
	 * Test method for {@link utility.Utility#computeHashCode(long)}.
	 */
	@Test
	final void testComputeHashCodeLongNonZeroMinValue() {
		long number = (long) Long.MIN_VALUE;
		Assertions.assertNotEquals(0, Utility.computeHashCode(number), "Utility.testComputeHashCodeLongNonZeroMinValue() test failed");
	}	
	
	/**
	 * Test method for {@link utility.Utility#computeHashCode(long)}.
	 */
	@Test
	final void testComputeHashCodeLongNonZeroMaxValue() {
		long number = (long) Long.MAX_VALUE;
		Assertions.assertNotEquals(0, Utility.computeHashCode(number), "Utility.testComputeHashCodeLongNonZeroMaxValue() test failed");
	}	
	
	/**
	 * Test method for {@link utility.Utility#computeHashCode(float)}.
	 */
	@Test
	final void testComputeHashCodeFloatZero() {
		float number = (float) 0.0;
		Assertions.assertEquals( (int) number, Utility.computeHashCode(number), "Utility.testComputeHashCodeFloatZero() test failed");
	}	
	
	/**
	 * Test method for {@link utility.Utility#computeHashCode(float)}.
	 */
	@Test
	final void testComputeHashCodeFloatNonZero() {
		float number = (float) 1.0;
		Assertions.assertNotEquals((int) number, Utility.computeHashCode(number), "Utility.testComputeHashCodeFloatNonZero() test failed");
	}	
	
	/**
	 * Test method for {@link utility.Utility#computeHashCode(float)}.
	 */
	@Test
	final void testComputeHashCodeFloatNonZeroMinValue() {
		float number = (float) Float.MIN_VALUE;
		Assertions.assertNotEquals((int) 0, Utility.computeHashCode(number), "Utility.testComputeHashCodeFloatNonZeroMinValue() test failed");
	}	
	
	/**
	 * Test method for {@link utility.Utility#computeHashCode(float)}.
	 */
	@Test
	final void testComputeHashCodeFloatNonZeroMaxValue() {
		float number = (float) Float.MAX_VALUE;
		Assertions.assertNotEquals((int) 0, Utility.computeHashCode(number), "Utility.testComputeHashCodeFloatNonZeroMaxValue() test failed");
	}
	
	/**
	 * Test method for {@link utility.Utility#computeHashCode(int)}.
	 */
	@Test
	final void testComputeHashCodeIntZero() {
		int number = 0;
		Assertions.assertEquals( number, Utility.computeHashCode(number), "Utility.testComputeHashCodeIntZero() test failed");
	}	
	
	/**
	 * Test method for {@link utility.Utility#computeHashCode(int)}.
	 */
	@Test
	final void testComputeHashCodeIntNonZero() {
		int number = 1;
		Assertions.assertEquals((int) number, Utility.computeHashCode(number), "Utility.testComputeHashCodeIntNonZero() test failed");
	}	
	
	/**
	 * Test method for {@link utility.Utility#computeHashCode(int)}.
	 */
	@Test
	final void testComputeHashCodeIntNonZeroMinValue() {
		int number = Integer.MIN_VALUE;
		Assertions.assertNotEquals((int) 0, Utility.computeHashCode(number), "Utility.testComputeHashCodeIntNonZeroMinValue() test failed");
	}	
	
	/**
	 * Test method for {@link utility.Utility#computeHashCode(int)}.
	 */
	@Test
	final void testComputeHashCodeIntNonZeroMaxValue() {
		int number = Integer.MAX_VALUE;
		Assertions.assertNotEquals((int) 0, Utility.computeHashCode(number), "Utility.testComputeHashCodeIntNonZeroMaxValue() test failed");
	}
	
	/**
	 * Test method for {@link utility.Utility#computeHashCode(double)}.
	 */
	@Test
	final void testComputeHashCodeDoubleZero() {
		double number = (double) 0.0;
		Assertions.assertEquals( (int) number, Utility.computeHashCode(number), "Utility.testComputeHashCodeDoubleZero() test failed");
	}	
	
	/**
	 * Test method for {@link utility.Utility#computeHashCode(double)}.
	 */
	@Test
	final void testComputeHashCodeDoubleNonZero() {
		double number = (double) 1.0;
		Assertions.assertNotEquals((int) number, Utility.computeHashCode(number), "Utility.testComputeHashCodeDoubleNonZero() test failed");
	}	
	
	/**
	 * Test method for {@link utility.Utility#computeHashCode(double)}.
	 */
	@Test
	final void testComputeHashCodeDoubleNonZeroMinValue() {
		double number = (double) Double.MIN_VALUE;
		Assertions.assertNotEquals((int) 0, Utility.computeHashCode(number), "Utility.testComputeHashCodeDoubleNonZeroMinValue() test failed");
	}	
	
	/**
	 * Test method for {@link utility.Utility#computeHashCode(double)}.
	 */
	@Test
	final void testComputeHashCodeDoubleNonZeroMaxValue() {
		double number = (double) Double.MAX_VALUE;
		Assertions.assertNotEquals((int) 0, Utility.computeHashCode(number), "Utility.testComputeHashCodeDoubleNonZeroMaxValue() test failed");
	}
	
	/**
	 * Test method for {@link utility.Utility#computeHashCode(String)}.
	 */
	@Test
	final void testComputeHashCodeString() {
		Assertions.assertNotEquals( 0, Utility.computeHashCode("0"), "Utility.testComputeHashCodeString() test failed");
	}	
	
	/**
	 * Test method for {@link utility.Utility#equalsUtility(java.lang.Object)}.
	 */
	@Test
	final void testEqualsObject() {
		Assertions.assertFalse(Utility.equalsUtility(new Object()), "Utility.testEqualsUtilityObject() test failed");
	}

	/**
	 * Test method for {@link utility.Utility#equals(java.lang.Object)}.
	 */
	@Test
	final void testEqualsNull() {
		Assertions.assertFalse(Utility.equalsUtility(null), "Utility.testEqualsUtilityNull() test failed");
	}

	/**
	 * Test method for {@link utility.Utility#generateHashCode(int)}.
	 */
	@Test
	final void testGenerateHashCodeZero() {
		int hashCode = 0;
		Assertions.assertEquals(hashCode, Utility.generateHashCode(hashCode), "Utility.testGenerateHashCodeZero(hashCode) test failed");
	}	
	
	/**
	 * Test method for {@link utility.Utility#generateHashCode(int)}.
	 */
	@Test
	final void testGenerateHashCode() {
		int hashCode = 1;
		Assertions.assertNotEquals(hashCode, Utility.generateHashCode(hashCode), "Utility.testGenerateHashCode(hashCode) test failed");
	}	
	
	/**
	 * Test method for {@link utility.Utility#generateHashCode(int)}.
	 */
	@Test
	final void testGenerateHashCodeNumberLargeNegative() {
		int hashCode = (int) (Integer.MIN_VALUE / 15);
		Assertions.assertNotEquals(hashCode, Utility.generateHashCode(hashCode), "Utility.testGenerateHashCodeNumberLargeNegative(hashCode) test failed");
	}	
	
	/**
	 * Test method for {@link utility.Utility#generateHashCode(int)}.
	 */
	@Test
	final void testGenerateHashCodeNumberLargePositive() {
		int hashCode = (int) (Integer.MAX_VALUE / 15);
		Assertions.assertNotEquals(hashCode, Utility.generateHashCode(hashCode), "Utility.testGenerateHashCodeNumberLargePositive(hashCode) test failed");
	}	
	
	/**
	 * Test method for {@link utility.Utility#getHashCode()}.
	 */
	@Test
	final void testHashCode() {
		Assertions.assertEquals(Utility.getHashCode(), Utility.getHashCode() , "Utility.testGetHashCode() test failed");
	}

	/**
	 * Test method for {@link utility.Utility#isStringNonNullandNonEmpty(String)}.
	 */
	@Test
	final void testIsStringNonNullandNonEmptyArgumentNull() {
		Assertions.assertNotEquals(true, Utility.isStringNonNullandNonEmpty(null), "Utility.testIsStringNonNullandNonEmptyArgumentNull(null) test failed");
	}

	/**
	 * Test method for {@link utility.Utility#isStringNonNullandNonEmpty(String)}.
	 */
	@Test
	final void testIsStringNonNullandNonEmptyArgumentEmpty() {
		Assertions.assertNotEquals(true, Utility.isStringNonNullandNonEmpty(""), "Utility.testIsStringNonNullandNonEmptyArgumentEmpty(\"\") test failed");
	}

	/**
	 * Test method for {@link utility.Utility#isStringNonNullandNonEmpty(String)}.
	 */
	@Test
	final void testIsStringNonNullandNonEmptyArgument() {
		Assertions.assertEquals(true, Utility.isStringNonNullandNonEmpty("Empty"), "Utility.testIsStringNonNullandNonEmptyArgument(\"\") test failed");
	}

	/**
	 * Test method for {@link utility.Utility#toString()}.
	 */
	@Test
	final void testToStringNull() {
		Assertions.assertNotEquals(null, Utility.utilityToString(), "Utility.testToStringNull() test failed");
	}
	
	/**
	 * Test method for {@link utility.Utility#toString()}.
	 */
	@Test
	final void testToStringEmpty() {
		Assertions.assertNotEquals("", Utility.utilityToString(), "Utility.testToStringEmpty() test failed");
	}
}
