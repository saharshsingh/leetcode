package org.saharsh.leetcode.top.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an integer array <code>nums</code>, return all the triplets
 * <code>[nums[i], nums[j],
 * nums[k]]</code> such that <code>i != j</code>, <code>i != k</code>, and
 * <code>j != k</code>, and <code>nums[i] + nums[j] + nums[k] == 0</code>.
 * <p>
 * Notice that the solution set must not contain duplicate triplets.
 *
 * @author saharshsingh
 *
 */
public class N000015_ThreeSum {

	public static List<List<Integer>> threeSum(int[] nums) {

		Arrays.sort(nums);

		final List<List<Integer>> result = new ArrayList<>();

		for (int i = 0; i < nums.length - 2;) {
			final int ni = nums[i];
			int l = i + 1;
			int r = nums.length - 1;
			while (l < r) {
				final int sum = ni + nums[l] + nums[r];
				if (sum == 0) {
					result.add(List.of(ni, nums[l], nums[r]));
					final int nl = nums[l];
					while (l < r && nums[l] == nl) {
						l++;
					}
					r--;
				} else if (sum < 0) {
					l++;
				} else {
					r--;
				}
			}
			while (i < nums.length - 2 && ni == nums[i]) {
				i++;
			}
		}

		return result;

	}

}
