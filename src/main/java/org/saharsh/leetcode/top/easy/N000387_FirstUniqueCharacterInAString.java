package org.saharsh.leetcode.top.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s, find the first non-repeating character in it and return its
 * index. If it does not exist, return -1.
 *
 * @author saharshsingh
 *
 */
public class N000387_FirstUniqueCharacterInAString {

	public enum Approach {
		LINEAR_TIME, CONSTANT_SPACE
	}

	public static Approach approach = Approach.LINEAR_TIME;

	public static int firstUniqChar(String s) {
		switch (approach) {
		case CONSTANT_SPACE:
			return inConstantSpace(s);
		case LINEAR_TIME:
		default:
			return inLinearTime(s);
		}
	}

	private static int inLinearTime(String s) {

		final Map<Character, Integer> counts = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			final char c = s.charAt(i);
			counts.put(c, 1 + counts.getOrDefault(c, 0));
		}

		for (int i = 0; i < s.length(); i++) {
			if (counts.get(s.charAt(i)) == 1) {
				return i;
			}
		}

		return -1;

	}

	private static int inConstantSpace(String s) {
		for (int i = 0; i < s.length(); i++) {
			boolean duplicateNotFound = true;
			for (int j = 0; j < s.length(); j++) {
				if (i == j) {
					continue;
				}
				if (s.charAt(i) == s.charAt(j)) {
					duplicateNotFound = false;
					break;
				}
			}
			if (duplicateNotFound) {
				return i;
			}
		}
		return -1;
	}

}
