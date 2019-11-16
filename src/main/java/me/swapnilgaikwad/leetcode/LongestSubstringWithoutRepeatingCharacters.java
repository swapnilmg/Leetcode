package me.swapnilgaikwad.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode Question 3: Longest Substring Without Repeating Characters
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * @author Swapnil Gaikwad
 */
public class LongestSubstringWithoutRepeatingCharacters {

    /**
     * Time complexity = O(n)
     * Space complexity = O(k)
     * where k is min of n and length charset used
     *
     * @param s input string
     * @return length of longest substring
     */
    public static int lengthOfLongestSubstring(String s) {
        int length = s.length(), ans = 0;

        // Map (character : last known index of that character + 1)
        Map<Character, Integer> map = new HashMap<>();

        for (int end = 0, start = 0; end < length; end++) {
            if (map.containsKey(s.charAt(end))) {
                start = Math.max(map.get(s.charAt(end)), start);
            }

            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return ans;
    }
}
