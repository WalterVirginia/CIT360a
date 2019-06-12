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
	void testEquals() {
		junit_ex addTest = new junit_ex();
		int expected_answer = 10;
		int actual_answer = addTest.addInt(6,4);
		assertEquals(expected_answer, actual_answer);
	}
	
	
}
