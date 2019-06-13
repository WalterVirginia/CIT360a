package Junit_examples;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import org.junit.jupiter.api.Test;


public class junit_test {
	
	/**
	 * This tests that the addInt method correctly adds the numbers
	 * which are passed into the method addInt from the junit_ex
	 * file. 
	 */
	@Test
	public void testEquals() {
		junit_ex addTest = new junit_ex();
		int expected_answer = 10;
		int actual_answer = addTest.addInt(6,4);
		assertEquals(expected_answer, actual_answer);
	}
	
	/**
	 * This tests that the expected and actual values of the arrays in
	 * the primateArray are the same. 
	 */
	
	@Test
	public void primateArray() {
		String[] expected = {"Cotton-Top Tamarin" , "Grey Gibbon" , "White-handed Gibbon" , "Golden Lion Tamarin" , "De Brazza's Monkey"};
		String[] actual = {
				"Cotton-Top Tamarin" , "Grey Gibbon" , "White-handed Gibbon" , "Golden Lion Tamarin" , "De Brazza's Monkey"};
		assertArrayEquals(expected,actual);		
		}
	
	/**
	 * This tests the method equalTo using the assertFalse junit test.
	 * equalTo method tests whether a first number is greater than or 
	 * equal to a second number.  
	 */
	@Test
	public void equalTo() {
		junit_ex JUbool = new junit_ex();
		assertFalse(JUbool.equalTo(6, 4));
	}
	
	/**
	 * This will test the hashmap AfricanAnimals from the junit_ex file. 
	 * We will test assertNotNull to make sure that all keys have values
	 * associated with them. 
	 */
	@Test 
	public void AfricanAnimals() {
		junit_ex notNull_test = new junit_ex();
		assertNotNull(notNull_test.AfricanAnimals("African Lion"));
	}
	
	/**
	 * This will test the hashmap animalCountries from the junit_ex file. 
	 * the junit_test used on this method will be assertNotSame to make
	 * sure that no keys reference the same object
	 */
	@Test
	public void animalCountries() {
		junit_ex ac_test = new junit_ex();
		assertNotSame(ac_test.animalCountries("Australia"), ac_test.animalCountries("Argentina"));
		
	}
	
	
	/**
	 * This will test the hashmap bestBooks from the junit_ex file. 
	 * the junit test used on this method will be assertNull. This 
	 * tests to see if an object is null. 
	 */
	@Test
	public void bestBooks() {
		junit_ex books_test = new junit_ex();
		assertNull(books_test.bestBooks("Dean Koontz"));
	}
	
	/**
	 * This will test that a String matches a predefined value. 
	 * The junit test assertThat will be used here. 
	 */
	String my_name = new String("Virginia");
	@Test
	public void test_assert() {
		assertThat(my_name, matches("Virginia"));
	}
	
	/**
	 * This will test that two values are equal to each other. 
	 * the junit test used here is assertSame. 
	 */
	@Test
	void ageIDie() {
		int age2093 = 106;
		int deathAge = 106;
		assertSame(age2093, deathAge);
	}
	
	/**
	 * This will test the method greaterThan from the junit_ex file. 
	 * the junit test used on this method is assertTrue. This tests
	 * to see if a condition is true. 
	 */
	@Test
	public void greaterThan() {
		junit_ex greaterThan_test = new junit_ex();
		assertTrue(greaterThan_test.greaterThan(7, 4));
	}
}
	

