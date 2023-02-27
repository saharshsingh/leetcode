package org.saharsh.leetcode.top.medium;

import java.util.HashMap;
import java.util.Map;

public class N000003_LongestSubstringWithoutRepeatingCharacters {
	public static int lengthOfLongestSubstring(String s) {
		int i = 0, j = 0, maxSize = 0;
		final Map<Character, Boolean> current = new HashMap<>();
		while (j < s.length()) {
			final char c = s.charAt(j);
			final Boolean seen = current.get(c);
			if (seen != null && seen) {
				maxSize = j - i > maxSize ? j - i : maxSize;
				for (char ci = s.charAt(i++); ci != c; ci = s.charAt(i++)) {
					current.put(ci, false);
				}
			} else {
				current.put(c, true);
			}
			j++;
		}
		return j - i > maxSize ? j - i : maxSize;
	}
}
