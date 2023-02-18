package org.saharsh.leetcode.top.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and return false if every element is distinct.
 *
 * @author saharshsingh
 *
 */
public class N000217_ContainsDuplicate {

	public enum ImplMode {
		USE_SORT, USE_SET
	}

	public static ImplMode implMode = ImplMode.USE_SET;

	public static boolean containsDuplicate(int[] nums) {
		switch (implMode) {
		case USE_SORT:
			return usingSort(nums);
		case USE_SET:
		default:
			return usingSet(nums);
		}
	}

	private static boolean usingSet(int[] nums) {
		final Set<Integer> seen = new HashSet<>();
		for (final int num : nums) {
			if (seen.contains(num))
				return true;
			seen.add(num);
		}
		return false;
	}

	private static boolean usingSort(int[] nums) {
		Arrays.sort(nums);
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] == nums[i]) {
				return true;
			}
		}
		return false;
	}

}
