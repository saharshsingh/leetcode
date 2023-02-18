package org.saharsh.leetcode.top.easy;

import org.junit.Assert;
import org.junit.Test;

public class N000268_MissingNumberTest {

	@Test
	public void test_case_one() {
		final int[] nums = { 3, 0, 1 };
		Assert.assertEquals(2, N000268_MissingNumber.missingNumber(nums));
	}

	@Test
	public void test_case_two() {
		final int[] nums = { 0, 1 };
		Assert.assertEquals(2, N000268_MissingNumber.missingNumber(nums));
	}

	@Test
	public void test_case_three() {
		final int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		Assert.assertEquals(8, N000268_MissingNumber.missingNumber(nums));
	}

}
