/**
 * 
 */
package order;

import java.util.concurrent.atomic.AtomicLong;

import utility.Utility;

/**
 * @author Tommy Cusack
 * @version 1.0
 * @since   2019-05-11
 * OrderId class provides the basic methods/fields allowing for Order identification.
 */
public class OrderId {
	private AtomicLong orderIdNumber = new AtomicLong( Long.MIN_VALUE );
	private String orderIdString;
	
	public OrderId() {
		this.orderIdNumber.incrementAndGet();
		setOrderIdString(this.orderIdNumber);
	}
	
	/**
	 * @return the orderIdNumber
	 */
	public AtomicLong getOrderIdNumber() {
		return this.orderIdNumber;
	}
	
	/**
	 * @return the orderIdString
	 */
	public String getOrderIdString() {
		return this.orderIdString;
	}
	
	/**
	 * @param orderIdString the orderIdString to set
	 */
	public void setOrderIdString(String orderIdString) {
		if(orderIdString instanceof String && !(orderIdString.equals("")) ) {
			this.orderIdString = orderIdString;
		}
	}
	
	/**
	 * @param orderIdNumber used to set the orderIdString
	 */
	public void setOrderIdString(AtomicLong orderIdNumber) {
		if( isOrderIdNumberValid(orderIdNumber) ) {
			setOrderIdString("user "+orderIdNumber);
		}else {
			setOrderIdString("user ");
		}
	}
	
	/**
	 * @param orderIdNumber to be validated
	 */
	public static boolean isOrderIdNumberValid(AtomicLong orderIdNumber) {
		return (orderIdNumber instanceof AtomicLong);
	}
	
	@Override public boolean equals(Object object) {
		if(object instanceof OrderId) {
			return ( ((OrderId) object).getOrderIdNumber().equals( this.getOrderIdNumber() ) );
		}
		return false;
	}
	
	@Override public int hashCode() {
		return Utility.generateHashCode( Utility.computeHashCode( this.getOrderIdNumber().longValue() ) );
	}	
	
	@Override public String toString() {
		return getOrderIdString();
	}
	
}
