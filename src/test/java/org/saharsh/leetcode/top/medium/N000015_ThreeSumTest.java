package org.saharsh.leetcode.top.medium;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class N000015_ThreeSumTest {

	@Test
	public void test_case_one() {

		// Arrange
		// -4, -1, -1, 0, 1, 2
		final int[] nums = { -1, 0, 1, 2, -1, -4 };

		// Act
		final List<List<Integer>> triplets = N000015_ThreeSum.threeSum(nums);

		// Assert
		Assert.assertEquals(2, triplets.size());

		Assert.assertEquals(-1, triplets.get(0).get(0).intValue());
		Assert.assertEquals(-1, triplets.get(0).get(1).intValue());
		Assert.assertEquals(2, triplets.get(0).get(2).intValue());

		Assert.assertEquals(-1, triplets.get(1).get(0).intValue());
		Assert.assertEquals(0, triplets.get(1).get(1).intValue());
		Assert.assertEquals(1, triplets.get(1).get(2).intValue());

	}

	@Test
	public void test_case_two() {

		// Arrange
		final int[] nums = { 0, 1, 1 };

		// Act
		final List<List<Integer>> triplets = N000015_ThreeSum.threeSum(nums);

		// Assert
		Assert.assertEquals(0, triplets.size());

	}

	@Test
	public void test_case_three() {

		// Arrange
		final int[] nums = { 0, 0, 0 };

		// Act
		final List<List<Integer>> triplets = N000015_ThreeSum.threeSum(nums);

		// Assert
		Assert.assertEquals(1, triplets.size());

		Assert.assertEquals(0, triplets.get(0).get(0).intValue());
		Assert.assertEquals(0, triplets.get(0).get(1).intValue());
		Assert.assertEquals(0, triplets.get(0).get(2).intValue());

	}

}
