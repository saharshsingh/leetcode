package org.saharsh.leetcode.top.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 *
 * @author saharshsingh
 *
 */
public class N000001_TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		final Map<Integer, Integer> cache = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			final int complement = target - nums[i];
			final Integer j = cache.get(complement);
			if (j != null) {
				return new int[] { j, i };
			}
			cache.put(nums[i], i);
		}
		throw new IllegalArgumentException("No solution exists");
	}
}
