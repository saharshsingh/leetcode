package org.saharsh.leetcode.top.easy;

import org.junit.Assert;
import org.junit.Test;
import org.saharsh.leetcode.top.easy.N000217_ContainsDuplicate.ImplMode;

public class N000217_ContainsDuplicateTest {

	@Test
	public void test_case_one() {
		final int[] nums = { 1, 2, 3, 4 };
		for (final ImplMode mode : ImplMode.values()) {
			N000217_ContainsDuplicate.implMode = mode;
			Assert.assertFalse("Failed for mode=" + mode, N000217_ContainsDuplicate.containsDuplicate(nums));
		}
	}

	@Test
	public void test_case_two() {
		final int[] nums = { 1, 2, 3, 1 };
		for (final ImplMode mode : ImplMode.values()) {
			N000217_ContainsDuplicate.implMode = mode;
			Assert.assertTrue("Failed for mode=" + mode, N000217_ContainsDuplicate.containsDuplicate(nums));
		}
	}

	@Test
	public void test_case_three() {
		final int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		for (final ImplMode mode : ImplMode.values()) {
			N000217_ContainsDuplicate.implMode = mode;
			Assert.assertTrue("Failed for mode=" + mode, N000217_ContainsDuplicate.containsDuplicate(nums));
		}
	}

}
