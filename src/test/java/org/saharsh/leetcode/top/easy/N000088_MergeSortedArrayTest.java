package org.saharsh.leetcode.top.easy;

import org.junit.Assert;
import org.junit.Test;

public class N000088_MergeSortedArrayTest {

	@Test
	public void test_case_one() {

		// Arrange
		final int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		final int[] nums2 = { 2, 5, 6 };

		// Act
		N000088_MergeSortedArray.merge(nums1, 3, nums2, 3);

		// Assert
		int i = 0;
		Assert.assertEquals(1, nums1[i++]);
		Assert.assertEquals(2, nums1[i++]);
		Assert.assertEquals(2, nums1[i++]);
		Assert.assertEquals(3, nums1[i++]);
		Assert.assertEquals(5, nums1[i++]);
		Assert.assertEquals(6, nums1[i++]);

	}

	@Test
	public void test_case_two() {

		// Arrange
		final int[] nums1 = { 1 };
		final int[] nums2 = {};

		// Act
		N000088_MergeSortedArray.merge(nums1, 1, nums2, 0);

		// Assert
		int i = 0;
		Assert.assertEquals(1, nums1[i++]);

	}

	@Test
	public void test_case_three() {

		// Arrange
		final int[] nums1 = { 0 };
		final int[] nums2 = { 1 };

		// Act
		N000088_MergeSortedArray.merge(nums1, 0, nums2, 1);

		// Assert
		int i = 0;
		Assert.assertEquals(1, nums1[i++]);

	}

}
