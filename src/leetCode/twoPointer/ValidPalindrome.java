package leetCode.twoPointer;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * LeetCode Problem 125: Valid Palindrome
 * 
 * @author Swapnil Gaikwad
 *
 */
public class ValidPalindrome {

	public boolean isPalindrome(String s) {
		char[] arr = s.toLowerCase().toCharArray();
		int l = 0, r = arr.length - 1;
		while (l < r) {
			if (!Character.isLetterOrDigit(arr[l])) {
				l++;
				continue;
			}
			if (!Character.isLetterOrDigit(arr[r])) {
				r--;
				continue;
			}
			if (arr[l] != arr[r]) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}

	@Test
	public void test() {
		assertEquals(true, isPalindrome("A man, a plan, a canal: Panama"));
		assertEquals(false, isPalindrome("race a car"));
		assertEquals(true, isPalindrome(""));
	}

}
