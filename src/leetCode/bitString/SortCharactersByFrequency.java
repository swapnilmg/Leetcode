package leetCode.bitString;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * LeetCode Problem 451: Sort Characters By Frequency
 * 
 * @author Swapnil Gaikwad
 *
 */
public class SortCharactersByFrequency {

	public String frequencySort(String s) {
		// return String s as it is if length less than 3
		if (s.length() < 3)
			return s;

		// count frequency of each character
		char[] string = s.toCharArray();
		int[] bitString = new int[256];
		int max = 0;
		for (char c : string) {
			bitString[c]++;
			max = Math.max(max, bitString[c]);
		}

		// sort characters by frequency
		String[] sortedChars = new String[max + 1];
		for (int i = 0; i < 256; i++) {
			if (bitString[i] > 0) {
				sortedChars[bitString[i]] = (sortedChars[bitString[i]] == null) ? new String("" + (char) i)
						: sortedChars[bitString[i]] + (char) i;
			}
		}

		// create return string
		StringBuilder sortedString = new StringBuilder();
		for (int i = max; i > 0; i--) {
			if (sortedChars[i] != null) {
				for (char c : sortedChars[i].toCharArray()) {
					for (int j = 0; j < i; j++) {
						sortedString.append(c);
					}
				}
			}
		}
		return sortedString.toString();
	}

	@Test
	public void test() {
		String example1 = "tree";
		String answer11 = "eert";
		String answer12 = "eetr";
		assertEquals(true, frequencySort(example1).equals(answer11) || frequencySort(example1).equals(answer12));

		String example2 = "cccaaa";
		String answer21 = "cccaaa";
		String answer22 = "aaaccc";
		assertEquals(true, frequencySort(example2).equals(answer21) || frequencySort(example2).equals(answer22));

		String example3 = "Aabb";
		String answer31 = "bbAa";
		String answer32 = "bbaA";
		assertEquals(true, frequencySort(example3).equals(answer31) || frequencySort(example3).equals(answer32));
	}

}
