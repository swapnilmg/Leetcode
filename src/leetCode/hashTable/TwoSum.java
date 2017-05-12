package leetCode.hashTable;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

/**
 * LeetCode Problem 1: Two Sum
 * 
 * @author Swapnil Gaikwad
 * 
 */
public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		int result[] = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int n = nums[i];
			if (map.containsKey(target - n)) {
				result[0] = map.get(target - n);
				result[1] = i;
				return result;
			} else {
				map.put(n, i);
			}
		}
		return null;
	}

	@Test
	public void test() {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] result = { 0, 1 };
		assertEquals(result[0], twoSum(nums, target)[0]);
		assertEquals(result[1], twoSum(nums, target)[1]);
	}

}
