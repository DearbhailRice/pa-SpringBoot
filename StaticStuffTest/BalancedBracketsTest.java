package uk.ac.belfastmet.StaticStuffTest;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.ac.belfastmet.StaticStuff.Balancedbrackets;

/**
 * Class to test the Balanced Brackets Class
 * 
 * @author ric19171870
 *
 */
public class BalancedBracketsTest {

	/**
	 * tests balanced brackets method returns balanced for the string [()]
	 */
	@Test
	public void testBalancedBracketsbal1() {
		assertEquals("Balanced", Balancedbrackets.balancedBrackets("[()]"));
	}

	/**
	 * tests balanced brackets method returns balanced for the string {[]}
	 */
	@Test
	public void testBalancedBracketsbal2() {
		assertEquals("Balanced", Balancedbrackets.balancedBrackets("{[]}"));
	}

	/**
	 * tests balanced brackets method returns balanced for the string []{}()
	 */

	@Test
	public void testBalancedBracketsbal3() {
		assertEquals("Balanced", Balancedbrackets.balancedBrackets("[]{}()"));
	}

	/**
	 * tests balanced brackets method returns Not balanced for the string [)[)
	 */

	@Test
	public void testBalancedBracketsNotbal1() {
		assertEquals("Not Balanced", Balancedbrackets.balancedBrackets("[)[)"));
	}

	/**
	 * tests balanced brackets method returns Not balanced for the string ()]()
	 */

	@Test
	public void testBalancedBracketsNotbal2() {
		assertEquals("Not Balanced", Balancedbrackets.balancedBrackets("()]()"));
	}

	/**
	 * tests balanced brackets method returns Not balanced for the string [)[)
	 */
	@Test
	public void testBalancedBracketsNotbal3() {
		assertEquals("Not Balanced", Balancedbrackets.balancedBrackets("[)]("));
	}
	
	/**
	 * tests balanced brackets method returns Not balanced for the string [)[)
	 */
	@Test
	public void testBalancedBracketsNotbal4() {
		assertEquals("Not Balanced", Balancedbrackets.balancedBrackets("())("));
	}

}
