package leetCode.general;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * LeetCode Problem 136: Single Number
 * 
 * @author Swapnil Gaikwad
 *
 */
public class SingleNumber {
	public int singleNumber(int[] nums) {
		int result = 0;
		for (int n : nums) {
			result ^= n;
		}
		return result;
	}

	@Test
	public void test() {
		int[] n1 = { 1 };
		assertEquals(1, singleNumber(n1));

		int[] n2 = { 1, 2, 3, 2, 1 };
		assertEquals(3, singleNumber(n2));
	}

}
