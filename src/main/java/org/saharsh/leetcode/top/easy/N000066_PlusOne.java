package org.saharsh.leetcode.top.easy;

public class N000066_PlusOne {

	public static int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		final int[] expanded = new int[digits.length + 1];
		expanded[0] = 1;
		return expanded;
	}

}
