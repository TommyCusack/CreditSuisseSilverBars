/**
 * 
 */
package user;

import java.util.concurrent.atomic.AtomicLong;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Tommy Cusack
 *
 */
class UserIdTestCase {
	
	/**
	 * Test method for {@link user.UserId#hashCode()}.
	 */
	@Test
	final void testHashCode() {
		UserId userId = new UserId();
		int hashCodeTest = 1;
		Assertions.assertNotEquals(hashCodeTest, userId.hashCode(), "userId.hashCode() test failed");
	}

	/**
	 * Test method for {@link user.UserId#UserId()}.
	 */
	@Test
	final void testUserIdUserIdNumber() {
		UserId userId = new UserId();
		Assertions.assertNotEquals(null, userId.getUserIdNumber(), "userId.testUserIdUserIdNumber() test failed");
	}

	/**
	 * Test method for {@link user.UserId#UserId()}.
	 */
	@Test
	final void testUserIdUserIdString() {
		UserId userId = new UserId();
		Assertions.assertNotEquals(null, userId.getUserIdString(), "userId.testUserIdUserIdString() test failed");
	}

	/**
	 * Test method for {@link user.UserId#UserId(java.lang.String)}.
	 */
	@Test
	final void testUserIdStringNonNull() {
		UserId userIdNonNull = new UserId("NonNull"); 
		Assertions.assertNotEquals(null, userIdNonNull.getUserIdString(), "userId.testUserIdStringNonNull() test failed");
	}

	/**
	 * Test method for {@link user.UserId#UserId(java.lang.String)}.
	 */
	@Test
	final void testUserIdStringNonEmpty() {
		UserId userIdNonEmpty = new UserId("NonEmpty"); 
		Assertions.assertNotEquals("", userIdNonEmpty.getUserIdString(), "userId.testUserIdStringNonEmpty() test failed");
	}

	/**
	 * Test method for {@link user.UserId#getUserIdString()}.
	 */
	@Test
	final void testGetUserIdString() {
		UserId userId = new UserId();
		Assertions.assertNotEquals(null, userId.getUserIdString(), "userId.getUserIdString() test failed");
	}

	/**
	 * Test method for {@link user.UserId#getUserIdString()}.
	 */
	@Test
	final void testGetUserIdStringEmpty() {
		UserId userId = new UserId();
		Assertions.assertNotEquals("", userId.getUserIdString(), "userId.getUserIdString() test failed");
	}
	
	/**
	 * Test method for {@link user.UserId#getUserIdNumber()}.
	 */
	@Test
	final void testGetUserIdNumber() {
		UserId userId = new UserId();
		Assertions.assertNotEquals(null, userId.getUserIdNumber(), "userId.getUserIdNumber() test failed");
	}

	/**
	 * Test method for {@link user.UserId#setUserIdString(java.lang.String)}.
	 */
	@Test
	final void testSetUserIdStringString() {
		UserId userId = new UserId();
		userId.setUserIdString("1");
		Assertions.assertNotEquals(null, userId.getUserIdString(), "userId.setUserIdString() test failed");
	}

	/**
	 * Test method for {@link user.UserId#setUserIdString(java.lang.String)}.
	 */
	@Test
	final void testSetUserIdStringStringEmpty() {
		UserId userId = new UserId();
		userId.setUserIdString("");
		Assertions.assertNotEquals(null, userId.getUserIdString(), "userId.setUserIdString() test failed");
	}

	/**
	 * Test method for {@link user.UserId#setUserIdString(java.util.concurrent.atomic.AtomicLong)}.
	 */
	@Test
	final void testSetUserIdStringAtomicLong() {
		UserId userId = new UserId();
		AtomicLong userIdNumberDifferent = new AtomicLong( userId.getUserIdNumber().getPlain() ); 
		userId.setUserIdString(userId.getUserIdNumber());
		Assertions.assertNotEquals(userId.getUserIdNumber(), userIdNumberDifferent, "userId.setUserIdString() test failed");
	}

	/**
	 * Test method for {@link user.UserId#setUserIdString(java.util.concurrent.atomic.AtomicLong)}.
	 */
	@Test
	final void testSetUserIdStringAtomicLongNull() {
		UserId userId = new UserId();
		userId.setUserIdString(userId.getUserIdNumber());
		Assertions.assertNotEquals(null, userId.getUserIdString(), "userId.setUserIdString() test failed");
	}

	/**
	 * Test method for {@link user.UserId#setUserIdString(java.util.concurrent.atomic.AtomicLong)}.
	 */
	@Test
	final void testSetUserIdStringAtomicLongEmpty() {
		UserId userId = new UserId();
		userId.setUserIdString(userId.getUserIdNumber());
		Assertions.assertNotEquals("", userId.getUserIdString(), "userId.setUserIdString() test failed");
	}

	/**
	 * Test method for {@link user.UserId#initialiseUserIdNumber()}.
	 */
	@Test
	final void testInitialiseUserIdNumber() {
		UserId userId = new UserId();
		Assertions.assertNotEquals(null, userId.getUserIdNumber(), "userId.getUserIdNumber() test failed");
	}

	/**
	 * Test method for {@link user.UserId#isUserIdInterfaceValid()}.
	 */
	@Test
	final void testIsUserIdInterfaceValidNonNull() {
		Assertions.assertEquals(false, UserId.isUserIdStringValid(null), "userId.testIsUserIdInterfaceValidNonNull() test failed");
	}

	/**
	 * Test method for {@link user.UserId#isUserIdInterfaceValid()}.
	 */
	@Test
	final void testIsUserIdInterfaceValidNonEmpty() {
		Assertions.assertEquals(false, UserId.isUserIdStringValid(""), "userId.testIsUserIdInterfaceValidNonEmpty() test failed");
	}
	
	/**
	 * Test method for {@link user.UserId#isUserIdInterfaceValid()}.
	 */
	@Test
	final void testIsUserIdInterfaceValidNonNullNumber() {
		UserId userId = new UserId();
		Assertions.assertNotEquals(null, userId.getUserIdNumber(), "userId.testIsUserIdInterfaceValidNonNullNumber() test failed");
	}
	
	/**
	 * Test method for {@link user.UserId#isUserIdStringValid(java.lang.String)}.
	 */
	@Test
	final void testIsUserIdStringValidNonNull() {
		Assertions.assertNotEquals(true, UserId.isUserIdStringValid(null), "userId.testIsUserIdStringValidNonNull() test failed");
	}

	/**
	 * Test method for {@link user.UserId#isUserIdStringValid(java.lang.String)}.
	 */
	@Test
	final void testIsUserIdStringValidNonEmpty() {
		Assertions.assertNotEquals(true, UserId.isUserIdStringValid(""), "userId.testIsUserIdStringValidNonEmpty() test failed");
	}

	/**
	 * Test method for {@link user.UserId#isUserIdNumberValid(java.util.concurrent.atomic.AtomicLong)}.
	 */
	@Test
	final void testIsUserIdNumberValid() {
		UserId userId = new UserId();
		Assertions.assertNotEquals(null, userId.getUserIdNumber(), "userId.testIsUserIdNumberValid() test failed");
	}

	/**
	 * Test method for {@link user.UserId#equals(java.lang.Object)}.
	 */
	@Test
	final void testEqualsObject() {
		UserId userId = new UserId();
		UserId userId2 = new UserId();
		Assertions.assertNotEquals(userId, userId2, "userId.testEqualsObject() test failed");
	}

	/**
	 * Test method for {@link user.UserId#toString()}.
	 */
	@Test
	final void testToStringNonNull() {
		UserId userId = new UserId();
		Assertions.assertNotEquals(null, userId.toString(), "userId.testToStringNonNull() test failed");
	}

	/**
	 * Test method for {@link user.UserId#toString()}.
	 */
	@Test
	final void testToStringNonEmpty() {
		UserId userId = new UserId();
		Assertions.assertNotEquals("", userId.toString(), "userId.testToStringNonEmpty() test failed");
	}

}
