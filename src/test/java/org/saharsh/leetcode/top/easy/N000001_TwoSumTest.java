package org.saharsh.leetcode.top.easy;

import org.junit.Assert;
import org.junit.Test;

public class N000001_TwoSumTest {

	@Test
	public void test_case_one() {

		// Arrange
		final int[] nums = { 2, 7, 11, 15 };

		// Act
		final int[] indices = N000001_TwoSum.twoSum(nums, 9);

		// Assert
		Assert.assertEquals(2, indices.length);
		Assert.assertEquals(0, indices[0]);
		Assert.assertEquals(1, indices[1]);

	}

	@Test
	public void test_case_two() {

		// Arrange
		final int[] nums = { 3, 2, 4 };

		// Act
		final int[] indices = N000001_TwoSum.twoSum(nums, 6);

		// Assert
		Assert.assertEquals(2, indices.length);
		Assert.assertEquals(1, indices[0]);
		Assert.assertEquals(2, indices[1]);

	}

	@Test
	public void test_case_three() {

		// Arrange
		final int[] nums = { 3, 3 };

		// Act
		final int[] indices = N000001_TwoSum.twoSum(nums, 6);

		// Assert
		Assert.assertEquals(2, indices.length);
		Assert.assertEquals(0, indices[0]);
		Assert.assertEquals(1, indices[1]);

	}

}
