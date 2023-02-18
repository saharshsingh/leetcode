package org.saharsh.leetcode.daily.easy;

import org.junit.Assert;
import org.junit.Test;

public class N000035_SearchInsertPositionTest {

	@Test
	public void test_case_one() {
		final int[] nums = { 1, 3, 5, 6 };
		Assert.assertEquals(2, N000035_SearchInsertPosition.searchInsert(nums, 5));
	}

	@Test
	public void test_case_two() {
		final int[] nums = { 1, 3, 5, 6 };
		Assert.assertEquals(1, N000035_SearchInsertPosition.searchInsert(nums, 2));
	}

	@Test
	public void test_case_three() {
		final int[] nums = { 1, 3, 5, 6 };
		Assert.assertEquals(4, N000035_SearchInsertPosition.searchInsert(nums, 7));
	}

}
