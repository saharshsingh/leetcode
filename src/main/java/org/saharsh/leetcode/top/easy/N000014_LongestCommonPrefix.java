package org.saharsh.leetcode.top.easy;

/**
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 *
 * @author saharshsingh
 *
 */
public class N000014_LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
		for (int i = 0; i < strs[0].length(); i++) {
			final char c = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if (i == strs[j].length() || strs[j].charAt(i) != c) {
					return strs[0].substring(0, i);
				}
			}
		}
		return strs[0];
	}
}
