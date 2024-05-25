package org.saharsh.leetcode.top.medium;

import org.junit.Assert;
import org.junit.Test;

public class N000080_RemoveDuplicatesFromSortedArrayIITest {

	@Test
	public void test_case_one() {
		final int[] nums = { 1, 1, 1, 2, 2, 3 };
		final int result = N000080_RemoveDuplicatesFromSortedArrayII.removeDuplicates(nums);
		Assert.assertEquals(5, result);
	}

	@Test
	public void test_case_two() {
		final int[] nums = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
		final int result = N000080_RemoveDuplicatesFromSortedArrayII.removeDuplicates(nums);
		Assert.assertEquals(7, result);
	}

}
