import static org.junit.Assert.*;

import org.junit.Test;

/**
 * LeetCode Problem 344: Reverse String
 * @author Swapnil Gaikwad
 *
 */
public class ReverseString {

	public String reverseString(String s) {
		return (new StringBuffer(s)).reverse().toString();
	}

	@Test
	public void test() {
		String s = "hello";
		String a = "olleh";
		assertEquals(true, a.equals(reverseString(s)));
		
		s = "swap";
		a = "paws";
		assertEquals(true, a.equals(reverseString(s)));
	}

}
