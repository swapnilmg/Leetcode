package leetCode.twoPointer;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * LeetCode Problem 283: Move Zeros
 * 
 * @author Swapnil Gaikwad
 *
 */
public class MoveZeros {

	public void moveZeroes(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != 0) {
				int j = i;
				while (j > 0 && nums[j - 1] == 0) {
					j--;
				}
				if (j != i) {
					nums[j] = nums[i];
					nums[i] = 0;
				}
			}
		}
	}

	@Test
	public void test() {
		int[] nums = { 0, 1, 0, 3, 12 };
		int[] expected = { 1, 3, 12, 0, 0 };
		moveZeroes(nums);
		for (int i = 0; i < nums.length; i++) {
			assertEquals(expected[i], nums[i]);
		}
	}

}
