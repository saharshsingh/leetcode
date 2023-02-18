package org.saharsh.leetcode.top.easy;

/**
 * Given an integer n, return true if it is a power of three. Otherwise, return
 * false.
 * <p>
 * An integer n is a power of three, if there exists an integer x such that n ==
 * 3x.
 *
 * @author saharshsingh
 *
 */
public class N000326_PowerOfThree {

	public enum Performance {
		O_LOG_N, O_1;
	}

	public static Performance perfProfile = Performance.O_1;

	public static boolean isPowerOfThree(int n) {
		switch (perfProfile) {
		case O_LOG_N: {
			return inLogTime(n);
		}
		case O_1:
		default:
			return inConstantTime(n);
		}
	}

	private static boolean inConstantTime(int n) {
		return n > 0 && 1162261467 % n == 0;
	}

	private static boolean inLogTime(int n) {
		while (n > 1 && n % 3 == 0) {
			n = n / 3;
		}
		return n == 1;
	}

}
