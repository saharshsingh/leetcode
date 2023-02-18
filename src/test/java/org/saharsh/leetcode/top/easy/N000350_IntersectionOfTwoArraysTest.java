package org.saharsh.leetcode.top.easy;

import org.junit.Test;
import org.saharsh.leetcode.top.easy.N000350_IntersectionOfTwoArrays.Approach;
import org.saharsh.leetcode.utils.ArraysHelper;

public class N000350_IntersectionOfTwoArraysTest {

	@Test
	public void test_case_one() {

		for (final Approach approach : Approach.values()) {

			// Arrange
			final int[] nums1 = { 1, 2, 2, 1 };
			final int[] nums2 = { 2, 2 };

			// Act
			N000350_IntersectionOfTwoArrays.approach = approach;
			final int[] intersection = N000350_IntersectionOfTwoArrays.intersect(nums1, nums2);

			// Assert
			ArraysHelper.assertArrayOnlyContains(intersection, 2, 2);

		}

	}

	@Test
	public void test_case_two() {

		for (final Approach approach : Approach.values()) {

			// Arrange
			final int[] nums1 = { 4, 9, 5 };
			final int[] nums2 = { 9, 4, 9, 8, 4 };

			// Act
			N000350_IntersectionOfTwoArrays.approach = approach;
			final int[] intersection = N000350_IntersectionOfTwoArrays.intersect(nums1, nums2);

			// Assert
			ArraysHelper.assertArrayOnlyContains(intersection, 4, 9);

		}

	}

}
