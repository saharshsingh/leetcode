package org.saharsh.leetcode.top.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class N000350_IntersectionOfTwoArrays {

	public enum Approach {
		SORT, MAP
	}

	public static Approach approach = Approach.SORT;

	public static int[] intersect(int[] nums1, int[] nums2) {
		switch (approach) {
		case SORT:
			return usingSort(nums1, nums2);
		case MAP:
		default:
			return usingMap(nums1, nums2);
		}
	}

	private static int[] usingSort(int[] nums1, int[] nums2) {

		// sort both arrays
		Arrays.sort(nums1);
		Arrays.sort(nums2);

		// iterate through both arrays together, adding common elements to list
		final List<Integer> intersection = new ArrayList<>();
		for (int i = 0, j = 0; i < nums1.length && j < nums2.length;) {
			if (nums1[i] == nums2[j]) {
				intersection.add(nums1[i++]);
				j++;
			} else if (nums1[i] < nums2[j]) {
				i++;
			} else {
				j++;
			}
		}

		// return list as array
		final int[] asArray = new int[intersection.size()];
		for (int i = 0; i < intersection.size(); i++) {
			asArray[i] = intersection.get(i);
		}
		return asArray;

	}

	private static int[] usingMap(int[] nums1, int[] nums2) {

		final boolean oneIsLarger = nums1.length > nums2.length;

		// build a map of counts of each element from smaller array
		final Map<Integer, Integer> candidates = new HashMap<>();
		for (final int n : oneIsLarger ? nums2 : nums1) {
			candidates.put(n, 1 + candidates.getOrDefault(n, 0));
		}

		// Now iterate through the larger array, adding common elements into a list
		final List<Integer> intersection = new ArrayList<>();
		for (final int n : oneIsLarger ? nums1 : nums2) {
			Integer count = candidates.get(n);
			if (count != null && count > 0) {
				intersection.add(n);
				candidates.put(n, --count);
			}
		}

		// return list as array
		final int[] asArray = new int[intersection.size()];
		for (int i = 0; i < intersection.size(); i++) {
			asArray[i] = intersection.get(i);
		}
		return asArray;

	}

}
