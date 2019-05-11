package utility;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Tommy Cusack
 * @version 1.0
 * @since   2019-05-11
 * Utility class has generic methods used by many classes in different packages
 * 
 */
public class Utility {
	// Suppresses default constructor, ensuring non-instantiability.
	private Utility() {}
	
	/*
	 * @param bool boolean to use for calculating hashCode.
	 * @return hashCode computed from boolean.
	 */
	public static int computeHashCode(boolean bool) {
		return (bool?1:0);
	}
	
	/*
	 * @param charField char to use for calculating hashCode.
	 * @return hashCode computed from char.
	 */
	public static int computeHashCode(char charField) {
		return (int) charField;
	}
	
	/*
	 * @param intField int to use for calculating hashCode.
	 * @return hashCode computed from int. 
	 */
	public static int computeHashCode(int intField) {
		return intField;
	}
	
	/*
	 * @param longField long to use for calculating hashCode.
	 * @return hashCode computed from int. 
	 */
	public static int computeHashCode(long longField) {
		return (int) (longField^(longField>>>32));
	}
	
	/*
	 * @param floatField float to use for calculating hashCode.
	 * @return hashCode computed from float. 
	 */
	public static int computeHashCode(float floatField) {
		return Float.floatToIntBits(floatField);
	}
	
	/*
	 * @param doubleField double to use for calculating hashCode.
	 * @return hashCode computed from double. 
	 */
	public static int computeHashCode(double doubleField) {
		return computeHashCode( Double.doubleToLongBits(doubleField) );
	}
	
	/*
	 * @param string String to use for calculating hashCode.
	 * @return hashCode computed from String. 
	 */
	public static int computeHashCode(String string) {
		int hashCodeComputed = 0;
		
		if(string instanceof String) {
			final char[] charArray = string.toCharArray();
			for(char character:charArray) {
				hashCodeComputed += 3 * computeHashCode(character);
			}
			return hashCodeComputed;
		}
		return 0;
	}
	
	/*
	 * Utility method logging error message in common format used by disparate classes. 
	 * @param logger Logger to log exceptions with message.
	 * @param loggingLevel Logger.Level indicates severity of exception message.
	 * @param exception Exception whose details are to be logged.
	 * @param packageName String indicating package where Exception was thrown.
	 * @param methodName String indicating method where Exception was thrown.
	 * @param message String providing user friendly display message.
	 * @return void. 
	 */
	public static void logErrorMessage(Logger logger, Level loggingLevel, Exception exception, String packageName, String methodName, String message) {
		if(logger instanceof Logger && loggingLevel instanceof Level && exception instanceof Exception
			&& packageName instanceof String && methodName instanceof String && message instanceof String){
			logger.logp(loggingLevel, packageName, methodName, "Exception occurred when trying to addOrder().");
			logger.logp(loggingLevel, packageName, methodName, "toString() = " + exception.toString());
			logger.logp(loggingLevel, packageName, methodName, "getMessage() = " + exception.getMessage());
		}
	}
	
	public static boolean equalsUtility(Object object) {
		return (object instanceof Utility);
	}
	
	public static int generateHashCode(int hashCode) {
		if(hashCode != 0) {
			if( Math.abs( (Integer.MAX_VALUE / hashCode) + 1) < 31  && Math.abs( (Integer.MIN_VALUE / hashCode) - 1) < 31){
				return hashCode * 31;
			}else {
				return (hashCode >>> 5) * 31;
			}
		}
		
		return 0;
	}
	
	public static int getHashCode() {
		return generateHashCode(0);
	}	
	
	public static boolean isStringNonNullandNonEmpty(String genericString) {
		return (genericString != null && !(genericString.equals("")) );
	}
	
	public static String utilityToString() {
		return "Generic Utility class holding methods invoked from multiple packages/classes.";
	}
	
}
