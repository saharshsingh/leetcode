package org.saharsh.leetcode.top.easy;

/**
 * Given a non-negative integer x, return the square root of x rounded down to
 * the nearest integer. The returned integer should be non-negative as well.
 * <p>
 * You must not use any built-in exponent function or operator.
 * <ul>
 * <li>For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.</li>
 * </ul>
 *
 * @author saharshsingh
 *
 */
public class N000069_Sqrt {

	public static int mySqrt(int x) {

		// memoize cases where answer is 0 or 1
		if (x == 0)
			return 0;
		if (x < 4)
			return 1;

		// binary search for rest
		int low = 0;
		int high = x / 2;

		while (low <= high) {

			int c = (high + low) / 2;
			// we know c can't be higher than sqrt(Integer.MAX_VALUE)
			c = c > 46340 ? 46340 : c;

			// if x is in between c^2 and (c+1)^2, c is the answer
			final long cSquared = (long) c * (long) c;
			final long cPlusOneSq = (c + 1L) * (c + 1L);
			if (cSquared <= x && cPlusOneSq > x) {
				return c;
			}

			// otherwise, shift search window
			if (cSquared > x) {
				high = c - 1;
			} else {
				low = c + 1;
			}

		}

		// we should never reach here
		throw new RuntimeException("Unknown error occurred");

	}

}
