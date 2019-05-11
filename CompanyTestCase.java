/**
 * 
 */
package company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Tommy Cusack
 *
 */
class CompanyTestCase {

	/**
	 * Test method for {@link company.Company#hashCode()}.
	 */
	@Test
	final void testHashCode() {
		Company company = new Company();
		Assertions.assertNotEquals(0, company.hashCode(), "company.hashCode() test failed");
	}

	/**
	 * Test method for {@link company.Company#Company()}.
	 */
	@Test
	final void testCompany() {
		Company company = new Company();
		Assertions.assertNotEquals(null, company.getCompanyName(), "Company() test failed");
	}

	/**
	 * Test method for {@link company.Company#Company()}.
	 */
	@Test
	final void testCompanyEmpty() {
		Company company = new Company();
		Assertions.assertNotEquals("", company.getCompanyName(), "Company() test failed");
	}
	
	/**
	 * Test method for {@link company.Company#Company(java.lang.String)}.
	 */
	@Test
	final void testCompanyString() {
		Company companyConstructorString = new Company(null);
		Assertions.assertNotEquals(null, companyConstructorString.getCompanyName(), "Company() test failed");
	}

	/**
	 * Test method for {@link company.Company#Company(java.lang.String)}.
	 */
	@Test
	final void testCompanyStringEmpty() {
		Company companyConstructorString = new Company("");
		Assertions.assertNotEquals("", companyConstructorString.getCompanyName(), "company.getCompanyName() test failed");
	}
	
	/**
	 * Test method for {@link company.Company#getNameDefault()}.
	 */
	@Test
	final void testGetNameDefault() {
		Assertions.assertNotEquals(null, Company.getNameDefault(), "Company.getNameDefault() test failed");
	}

	/**
	 * Test method for {@link company.Company#getNameDefault()}.
	 */
	@Test
	final void testGetNameDefaultEmpty() {
		Assertions.assertNotEquals("", Company.getNameDefault(), "Company.getNameDefault() test failed");
	}
	
	/**
	 * Test method for {@link company.Company#getCompanyName()}.
	 */
	@Test
	final void testGetCompanyName() {
		Company company = new Company();
		Assertions.assertNotEquals(null, company.getCompanyName(), "company.getCompanyName() test failed");
	}

	/**
	 * Test method for {@link company.Company#getCompanyName()}.
	 */
	@Test
	final void testGetCompanyNameEmpty() {
		Company company = new Company();
		Assertions.assertNotEquals("", company.getCompanyName(), "company.getCompanyName() test failed");
	}
	
	/**
	 * Test method for {@link company.Company#setCompanyName(java.lang.String)}.
	 */
	@Test
	final void testSetCompanyName() {
		Company company = new Company();
		company.setCompanyName(null);
		Assertions.assertNotEquals(null, company.getCompanyName(), "company.setCompanyName() test failed");
	}
	
	/**
	 * Test method for {@link company.Company#setCompanyName(java.lang.String)}.
	 */
	@Test
	final void testSetCompanyNameEmpty() {
		Company company = new Company();
		company.setCompanyName("");
		Assertions.assertNotEquals("", company.getCompanyName(), "company.setCompanyName() test failed");
	}


	/**
	 * Test method for {@link company.Company#setCompanyName(java.lang.String)}.
	 */
	@Test
	final void testSetCompanyNameRandom() {
		Company company = new Company();
		company.setCompanyName("abc123");
		Assertions.assertEquals("abc123", company.getCompanyName(), "company.setCompanyName() test failed");
	}
	
	/**
	 * Test method for {@link company.Company#isCompanyNameValid(java.lang.String)}.
	 */
	@Test
	final void testIsCompanyNameValidNull() {
		Company company = new Company();
		Assertions.assertEquals(false, company.isCompanyNameValid(null), "company.isCompanyNameValid() test failed");
	}
	
	/**
	 * Test method for {@link company.Company#isCompanyNameValid(java.lang.String)}.
	 */
	@Test
	final void testIsCompanyNameValidEmpty() {
		Company company = new Company();
		Assertions.assertEquals(false, company.isCompanyNameValid(""), "company.isCompanyNameValid() test failed");
	}

	/**
	 * Test method for {@link company.Company#isCompanyNameValid(java.lang.String)}.
	 */
	@Test
	final void testIsCompanyNameValid() {
		Company company = new Company();
		Assertions.assertEquals(true, company.isCompanyNameValid("1"), "company.isCompanyNameValid() test failed");
	}

	/**
	 * Test method for {@link company.Company#equals(java.lang.Object)}.
	 */
	@Test
	final void testEqualsObject() {
		Company company = new Company();
		Company company2 = new Company("");
		Assertions.assertEquals(true, company.equals(company2), "company.Equals() test failed");
	}

	/**
	 * Test method for {@link company.Company#equals(java.lang.Object)}.
	 */
	@Test
	final void testEqualsObjectNot() {
		Company company = new Company();
		Company company2 = new Company("abc123");
		Assertions.assertNotEquals(true, company.equals(company2), "company.Equals() test failed");
	}
	
	/**
	 * Test method for {@link company.Company#toString()}.
	 */
	@Test
	final void testToString() {
		Company company = new Company();
		Assertions.assertNotEquals(null, company.toString(), "company.setCompanyName() test failed");
	}

	/**
	 * Test method for {@link company.Company#toString()}.
	 */
	@Test
	final void testToStringEmpty() {
		Company company = new Company();
		Assertions.assertNotEquals("", company.toString(), "company.setCompanyName() test failed");
	}

}
