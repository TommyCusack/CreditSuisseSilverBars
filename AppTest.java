package CreditSuisse.CreditSuisseTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import orderBoard.OrderBoard;


/**
 * Unit test for simple App.
 */
public class AppTest // extends TestCase
{
	/**
	 * Test method for {@link app.App#hashCode()}.
	 */
	@Test
	final void testHashCode() {
		App application = new App();
		Assertions.assertNotEquals(0, application.hashCode() , "application.hashCode() test passed");
	}
	
	/**
	 * Test method for {@link app.App#populateOrderBoard()}.
	 */
	@Test
	final void testPopulateOrderBoardArgumentNull() {
		App application = new App();
		application.populateOrderBoard(null);
		Assertions.assertTrue(true, "application.populateOrderBoard() test passed");
	}
	
	/**
	 * Test method for {@link app.App#populateOrderBoard()}.
	 */
	@Test
	final void testPopulateOrderBoard() {
		App application = new App();
		OrderBoard orderBoard = new OrderBoard();
		application.populateOrderBoard( orderBoard );
		Assertions.assertNotEquals(0, orderBoard.getOrderBoardAsList().size(), "application.populateOrderBoard() test passed");
	}

	/**
	 * Test method for {@link app.App#implementOrderBoard()}.
	 */
	@Test
	final void testImplementOrderBoardArgumentNull() {
		App application = new App();
		application.implementOrderBoard(null);
		Assertions.assertTrue(true, "application.populateOrderBoard() test passed");
	}
	
	/**
	 * Test method for {@link app.App#implementOrderBoard()}.
	 */
	@Test
	final void testImplementOrderBoard() {
		App application = new App();
		OrderBoard orderBoard = new OrderBoard();
		application.implementOrderBoard( orderBoard );
		Assertions.assertNotEquals(0, orderBoard.getOrderBoardAsList().size(), "application.populateOrderBoard() test passed");
	}
}
