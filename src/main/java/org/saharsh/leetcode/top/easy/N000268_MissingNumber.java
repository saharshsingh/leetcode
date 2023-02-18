package org.saharsh.leetcode.top.easy;

/**
 * Given an array nums containing n distinct numbers in the range [0, n], return
 * the only number in the range that is missing from the array.
 *
 * @author saharshsingh
 *
 */
public class N000268_MissingNumber {

	public static int missingNumber(int[] nums) {

		int missing = 0;
		for (int i = 1; i <= nums.length; i++) {
			missing += i;
		}

		for (final int n : nums) {
			missing -= n;
		}

		return missing;

	}

}
