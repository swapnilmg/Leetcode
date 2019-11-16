package me.swapnilgaikwad.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void testCase1() {
        String input = "abcabcbb";
        Assertions.assertEquals(3, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input));
    }

    @Test
    void testCase2() {
        String input = "bbbbb";
        Assertions.assertEquals(1, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input));
    }

    @Test
    void testCase3() {
        String input = "pwwkew";
        Assertions.assertEquals(3, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input));
    }

    @Test
    void testCase4() {
        String input = " ";
        Assertions.assertEquals(1, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input));
    }
}
