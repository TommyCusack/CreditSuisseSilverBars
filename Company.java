package company;

import utility.Utility;

/**
 * @author Tommy Cusack
 * @version 1.0
 * @since   2019-05-11
 * Company class holds minimal basic information about company owning OrderBoard.
 */
public class Company {
	private static final String COMPANY_NAME_DEFAULT = "Silver Bars Marketplace";
	private String companyName;

	public Company() {
		this(Company.getNameDefault());
	}
	
	public Company(String companyName) {
		setCompanyName(companyName);
	}
	
	/**
	 * @return the COMPANY_NAME_DEFAULT
	 */
	public static String getNameDefault() {
		return COMPANY_NAME_DEFAULT;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return this.companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		if(isCompanyNameValid(companyName)) {
			this.companyName = companyName;
		}else {
			this.companyName = Company.getNameDefault();
		}
	}

	/**
	 * @param companyName the companyName to validate
	 */
	public boolean isCompanyNameValid(String companyName) {
		return Utility.isStringNonNullandNonEmpty(companyName);
	}
	
	@Override public boolean equals(Object object) {
		return ( (object instanceof Company) 
				&& ((Company)object).getCompanyName().equals(getCompanyName()) );
	}
	
	@Override public int hashCode() {
		return Utility.generateHashCode( Utility.computeHashCode( getCompanyName() ) );
	}
	
	@Override public String toString() {
		return getCompanyName();
	}
}
