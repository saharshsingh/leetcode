package org.saharsh.leetcode.daily.medium;

import org.junit.Assert;
import org.junit.Test;

public class N000540_SingleElementInSortedArrayTest {

	@Test
	public void test_case_one() {
		final int[] nums = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
		Assert.assertEquals(2, N000540_SingleElementInSortedArray.singleNonDuplicate(nums));
	}

	@Test
	public void test_case_two() {
		final int[] nums = { 3, 3, 7, 7, 10, 11, 11 };
		Assert.assertEquals(10, N000540_SingleElementInSortedArray.singleNonDuplicate(nums));
	}

}
