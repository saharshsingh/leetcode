package org.saharsh.leetcode.top.easy;

/**
 * Given an array nums of size n, return the majority element.
 * <p>
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You
 * may assume that the majority element always exists in the array.
 *
 * @author saharshsingh
 *
 */
public class N000169_MajorityElement {
	public static int majorityElement(int[] nums) {
		int candidate = nums[0], votes = 1;
		for (int i = 1; i < nums.length; i++) {
			votes += candidate == nums[i] ? 1 : -1;
			if (votes == 0) {
				candidate = nums[i];
				votes = 1;
			}
		}
		return candidate;
	}
}
