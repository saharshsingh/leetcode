package org.saharsh.leetcode.top.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D
 * and M.
 * <p>
 * Symbol->Value
 * <ul>
 * <li>I->1</li>
 * <li>V->5</li>
 * <li>X->10</li>
 * <li>L->50</li>
 * <li>C->100</li>
 * <li>D->500</li>
 * <li>M->1000</li>
 * </ul>
 *
 * For example, 2 is written as II in Roman numeral, just two ones added
 * together. 12 is written as XII, which is simply X + II. The number 27 is
 * written as XXVII, which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is
 * written as IV. Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX. There
 * are six instances where subtraction is used:
 * <ul>
 * <li>I can be placed before V (5) and X (10) to make 4 and 9.</li>
 * <li>X can be placed before L (50) and C (100) to make 40 and 90.</li>
 * <li>C can be placed before D (500) and M (1000) to make 400 and 900.</li>
 * </ul>
 * Given a roman numeral, convert it to an integer.
 *
 * @author saharshsingh
 *
 */
public class N000013_RomanToInteger {

	private static final Map<Character, Integer> charMap = new HashMap<>();

	// static initializer for charMap
	static {
		charMap.put('I', 1);
		charMap.put('V', 5);
		charMap.put('X', 10);
		charMap.put('L', 50);
		charMap.put('C', 100);
		charMap.put('D', 500);
		charMap.put('M', 1000);
	}

	public static int romanToInt(String s) {
		int total = 0, nextValue = charMap.get(s.charAt(0));
		for (int i = 0; i < s.length(); i++) {
			final int value = nextValue;
			nextValue = i + 1 < s.length() ? charMap.get(s.charAt(i + 1)) : 0;
			total = nextValue > value ? total - value : total + value;
		}
		return total;
	}

}
