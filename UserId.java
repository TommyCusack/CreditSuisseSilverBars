/**
 * 
 */
package user;

import java.util.concurrent.atomic.AtomicLong;

import utility.Utility;

/**
 * @author Tommy Cusack
 *
 */
public class UserId implements UserIdInterface{
	private AtomicLong userIdNumber;
	private String userIdString;
	
	public UserId() {
		initialiseUserIdNumber();
		setUserIdString(this.userIdNumber);
	}
	
	public UserId(String userIdString) {
		initialiseUserIdNumber();
		setUserIdString(userIdString);
	}
	
	protected void initialiseUserIdNumber() {
		if(userIdNumber != null) {
			userIdNumber.incrementAndGet();
		}else {
			userIdNumber = new AtomicLong(Long.MIN_VALUE);
		}
	}
	
	public String getUserIdString() {
		return this.userIdString;
	}
	
	public AtomicLong getUserIdNumber() {
		return this.userIdNumber;
	}
	
	public void setUserIdString(String userIdString) {
		if( isUserIdStringValid(userIdString) ) {
			this.userIdString = userIdString;
		}else {
			setUserIdString(this.userIdNumber);
		}
	}
	
	public void setUserIdString(AtomicLong userIdNumber) {
		if( isUserIdNumberValid(userIdNumber) ) {
			setUserIdString("user " + this.userIdNumber);
		}else {
			setUserIdString("user ");
		}
	}
	
	public boolean isUserIdInterfaceValid() {
		return (Utility.isStringNonNullandNonEmpty(this.userIdString) && isUserIdNumberValid(this.userIdNumber));
	}
	
	public static boolean isUserIdStringValid(String userIdString) {
		return Utility.isStringNonNullandNonEmpty(userIdString);
	}
	
	public static boolean isUserIdNumberValid(AtomicLong userIdNumber) {
		return (userIdNumber instanceof AtomicLong);
	}
	
	@Override public boolean equals(Object object) {
		return ( (object instanceof UserId) 
				&& ((UserId)object).getUserIdNumber().equals(getUserIdNumber()) );
	}
	
	@Override public int hashCode() {
		int hashCodeCompute = Utility.computeHashCode(this.userIdNumber.longValue());
		return Utility.generateHashCode(hashCodeCompute);
	}
	
	@Override public String toString() {
		return getUserIdString();
	}
	
}
