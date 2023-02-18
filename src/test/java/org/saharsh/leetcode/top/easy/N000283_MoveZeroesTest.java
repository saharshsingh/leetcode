package org.saharsh.leetcode.top.easy;

import org.junit.Assert;
import org.junit.Test;

public class N000283_MoveZeroesTest {

	@Test
	public void test_case_one() {

		// Arrange
		final int[] nums = { 0, 1, 0, 3, 12 };

		// Act
		N000283_MoveZeroes.moveZeroes(nums);

		// Assert
		Assert.assertEquals(1, nums[0]);
		Assert.assertEquals(3, nums[1]);
		Assert.assertEquals(12, nums[2]);
		Assert.assertEquals(0, nums[3]);
		Assert.assertEquals(0, nums[4]);

	}

	@Test
	public void test_case_two() {

		// Arrange
		final int[] nums = { 0 };

		// Act
		N000283_MoveZeroes.moveZeroes(nums);

		// Assert
		Assert.assertEquals(0, nums[0]);

	}

}
