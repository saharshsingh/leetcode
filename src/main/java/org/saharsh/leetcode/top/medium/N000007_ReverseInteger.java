package org.saharsh.leetcode.top.medium;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If
 * reversing x causes the value to go outside the signed 32-bit integer range
 * [-231, 231 - 1], then return 0.
 * <p>
 * Assume the environment does not allow you to store 64-bit integers (signed or
 * unsigned).
 *
 * @author saharshsingh
 *
 */
public class N000007_ReverseInteger {

	public static int reverse(int x) {
		int reversed = 0;
		while (x != 0) {
			if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10) {
				return 0;
			}
			reversed = (reversed * 10) + (x % 10);
			x = x / 10;
		}
		return reversed;
	}

}
