package org.saharsh.leetcode.top.medium;

/**
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit
 * signed integer (similar to C/C++'s atoi function).
 * <p>
 * The algorithm for myAtoi(string s) is as follows:
 * <ul>
 * <li>Read in and ignore any leading whitespace.</li>
 * <li>Check if the next character (if not already at the end of the string) is
 * '-' or '+'. Read this character in if it is either. This determines if the
 * final result is negative or positive respectively. Assume the result is
 * positive if neither is present.</li>
 * <li>Read in next the characters until the next non-digit character or the end
 * of the input is reached. The rest of the string is ignored.</li>
 * <li>Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32).
 * If no digits were read, then the integer is 0. Change the sign as necessary
 * (from step 2).</li>
 * <li>If the integer is out of the 32-bit signed integer range [-231, 231 - 1],
 * then clamp the integer so that it remains in the range. Specifically,
 * integers less than -231 should be clamped to -231, and integers greater than
 * 231 - 1 should be clamped to 231 - 1.</li>
 * <li>Return the integer as the final result.</li>
 * </ul>
 * Note:
 * <ul>
 * <li>Only the space character ' ' is considered a whitespace character.</li>
 * <li>Do not ignore any characters other than the leading whitespace or the
 * rest of the string after the digits.</li>
 * </ul>
 *
 * @author saharshsingh
 *
 */
public class N000008_StringToInteger {

	public static int myAtoi(String s) {

		boolean negative = false;
		int value = 0;
		boolean parseInProgress = false;

		for (final char c : s.toCharArray()) {
			if (c < '0' || c > '9') {
				if (parseInProgress || (c != ' ' && c != '+' && c != '-')) {
					break;
				}
				if (c == '-') {
					negative = true;
				}
				if (c == '+' || c == '-') {
					parseInProgress = true;
				}
			} else {
				parseInProgress = true;
				final int digit = c - '0';
				if (willOverflow(value, digit)) {
					value = negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
					break;
				}
				value = (value * 10) + (negative ? -1 * digit : digit);
			}
		}

		return value;

	}

	private static boolean willOverflow(int value, int digit) {
		if (value < 0) {
			if (value < Integer.MIN_VALUE / 10) {
				return true;
			}
			if (Integer.MIN_VALUE + digit > value * 10) {
				return true;
			}
		} else {
			if (value > Integer.MAX_VALUE / 10) {
				return true;
			}
			if (Integer.MAX_VALUE - digit < value * 10) {
				return true;
			}
		}
		return false;
	}

}
