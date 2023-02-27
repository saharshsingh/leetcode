package org.saharsh.leetcode.top.medium;

import org.junit.Assert;
import org.junit.Test;

public class N000007_ContainerWithMostWaterTest {

	@Test
	public void test_case_one() {
		final int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		final int expected = 49;
		Assert.assertEquals(expected, N000007_ContainerWithMostWater.maxArea(height));
	}

	@Test
	public void test_case_two() {
		final int[] height = { 1, 1 };
		final int expected = 1;
		Assert.assertEquals(expected, N000007_ContainerWithMostWater.maxArea(height));
	}

}
