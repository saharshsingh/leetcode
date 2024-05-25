package org.saharsh.leetcode.top.medium;

import org.junit.Assert;
import org.junit.Test;

public class N000189_RotateArrayTest {

	@Test
	public void test_case_one() {
		final int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		N000189_RotateArray.rotate(nums, 3);
		final int[] expected = { 5, 6, 7, 1, 2, 3, 4 };
		for (int i = 0; i < nums.length; i++) {
			Assert.assertEquals(expected[i], nums[i]);
		}
	}

	@Test
	public void test_case_two() {
		final int[] nums = { -1, -100, 3, 99 };
		N000189_RotateArray.rotate(nums, 2);
		final int[] expected = { 3, 99, -1, -100 };
		for (int i = 0; i < nums.length; i++) {
			Assert.assertEquals(expected[i], nums[i]);
		}
	}

}
