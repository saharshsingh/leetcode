package org.saharsh.leetcode.top.easy;

/**
 * Write a function that reverses a string. The input string is given as an
 * array of characters s.
 * <p>
 * You must do this by modifying the input array in-place with O(1) extra
 * memory.
 *
 * @author saharshsingh
 *
 */
public class N000344_ReverseString {

	public static void reverseString(char[] s) {
		for (int i = 0, j = s.length - 1; i <= j; i++, j--) {
			final char swap = s[i];
			s[i] = s[j];
			s[j] = swap;
		}
	}

}
