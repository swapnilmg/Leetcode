package me.swapnilgaikwad.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest {
    @Test
    void testPositiveCase() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        TwoSum solution = new TwoSum();
        int[] actual = solution.twoSum(nums, target);
        Assertions.assertArrayEquals(expected, actual);
    }
}
