package org.saharsh.leetcode.top.easy;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false
 * otherwise.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase, typically using all the original letters exactly
 * once.
 *
 * @author saharshsingh
 *
 */
public class N000242_ValidAnagram {

	public static boolean isAnagram(String s, String t) {
		final int[] counts = new int[26];
		for (int i = 0; i < s.length(); i++) {
			final int countIndex = s.charAt(i) - 'a';
			counts[countIndex]++;
		}
		for (int i = 0; i < t.length(); i++) {
			final int countIndex = t.charAt(i) - 'a';
			counts[countIndex]--;
		}
		for (final int count : counts) {
			if (count != 0) {
				return false;
			}
		}
		return true;
	}

}
