package leetCode;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * LeetCode Problem 167: Two Sum II - Input array is sorted
 * 
 * @author swapnilgaikwad
 *
 */
public class TwoSumII {

	public int[] twoSum(int[] numbers, int target) {
		int l = 0, r = numbers.length - 1;
		int sum = numbers[l] + numbers[r];
		while (sum != target) {
			if (sum < target) {
				l++;
			} else {
				r--;
			}
			sum = numbers[l] + numbers[r];
		}
		int result[] = new int[2];
		result[0] = l + 1;
		result[1] = r + 1;
		return result;
	}

	@Test
	public void test() {
		int[] numbers = { 2, 7, 11, 15 };
		int target = 9;
		int[] expected = { 1, 2 };
		int[] actual = twoSum(numbers, target);
		assertEquals(expected[0], actual[0]);
		assertEquals(expected[1], actual[1]);
	}

}
