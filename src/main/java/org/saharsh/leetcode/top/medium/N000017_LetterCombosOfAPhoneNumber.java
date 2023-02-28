package org.saharsh.leetcode.top.medium;

import java.util.LinkedList;
import java.util.List;

/**
 * Given a string containing digits from 2-9 inclusive, return all possible
 * letter combinations that the number could represent. Return the answer in any
 * order.
 * <p>
 * A mapping of digits to letters is just like on the telephone buttons, range
 * of digits being 2-9.
 *
 * @author saharshsingh
 *
 */
public class N000017_LetterCombosOfAPhoneNumber {

	public static List<String> letterCombinations(String digits) {

		final String[] map = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		final LinkedList<String> combos = new LinkedList<>();

		if (digits.length() > 0) {
			combos.add("");
			for (int i = 0; i < digits.length(); i++) {
				final int size = combos.size();
				final String charsToAppend = map[digits.charAt(i) - '2'];
				for (int j = 0; j < size; j++) {
					final String base = combos.poll();
					for (int k = 0; k < charsToAppend.length(); k++) {
						combos.add(base + charsToAppend.charAt(k));
					}
				}
			}
		}

		return combos;

	}

}
