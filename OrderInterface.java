/**
 * 
 */
package order;

import financial.PriceInterface;
import user.UserIdInterface;

/**
 * @author Tommy Cusack
 * @version 1.0
 * @since   2019-05-11
 * OrderInterface declares the methods for Order to have the minimum required functionality.
 */
public interface OrderInterface {
	/**
	 * @return the orderType
	 */
	public OrderType getOrderType();

	/**
	 * @param orderType the orderType to set
	 */
	public void setOrderType(OrderType orderType);

	/**
	 * @return the priceImplementation
	 */
	public PriceInterface getPriceImplementation();

	/**
	 * @param priceImplementation the priceImplementation to set
	 */
	public void setPriceImplementation(PriceInterface priceImplementation);

	/**
	 * @return the userIdImplementation
	 */
	public UserIdInterface getUserIdImplementation();

	/**
	 * @param userIdImplementation the userIdImplementation to set
	 */
	public void setUserIdImplementation(UserIdInterface userIdImplementation);
}
