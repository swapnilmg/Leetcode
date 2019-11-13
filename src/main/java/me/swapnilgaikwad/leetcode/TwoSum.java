package me.swapnilgaikwad.leetcode;

import java.util.HashMap;

/**
 * LeetCode Question 1: Two Sum
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * @author Swapnil Gaikwad
 */
public class TwoSum {

    /**
     * Time complexity = O(n)
     * Space complexity = O(n)
     *
     * @param nums   given integer array
     * @param target target addition
     * @return integer array of length 2 containing indexes of elements adding up to target
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
