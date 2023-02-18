package org.saharsh.leetcode.top.easy;

import org.junit.Assert;
import org.junit.Test;

public class N000169_MajorityElementTest {

	@Test
	public void test_case_one() {
		final int[] nums = { 3, 2, 3 };
		Assert.assertEquals(3, N000169_MajorityElement.majorityElement(nums));
	}

	@Test
	public void test_case_two() {
		final int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		Assert.assertEquals(2, N000169_MajorityElement.majorityElement(nums));
	}

	@Test
	public void test_case_three() {
		final int[] nums = { 3, 3, 4 };
		Assert.assertEquals(3, N000169_MajorityElement.majorityElement(nums));
	}

}
