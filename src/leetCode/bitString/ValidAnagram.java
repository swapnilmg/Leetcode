package leetCode.bitString;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * LeetCode Problem 242: Valid Anagram
 * 
 * @author Swapnil Gaikwad
 *
 */
public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
		int[] intString = new int[26];
		for (char c : s.toCharArray()) {
			intString[c - 'a']++;
		}
		for (char c : t.toCharArray()) {
			intString[c - 'a']--;
		}
		for (int i : intString) {
			if (i != 0) {
				return false;
			}
		}
		return true;
	}

	@Test
	public void test() {
		assertEquals(true, isAnagram("anagram", "nagaram"));
		assertEquals(false, isAnagram("car", "rat"));
		assertEquals(false, isAnagram("a", "ab"));
	}

}
