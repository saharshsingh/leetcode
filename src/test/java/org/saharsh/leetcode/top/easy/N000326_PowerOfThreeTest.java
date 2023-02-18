package org.saharsh.leetcode.top.easy;

import org.junit.Assert;
import org.junit.Test;

public class N000326_PowerOfThreeTest {

	@Test
	public void test_case_one() {
		Assert.assertTrue(N000326_PowerOfThree.isPowerOfThree(27));
	}

	@Test
	public void test_case_two() {
		Assert.assertFalse(N000326_PowerOfThree.isPowerOfThree(0));
	}

	@Test
	public void test_case_three() {
		Assert.assertFalse(N000326_PowerOfThree.isPowerOfThree(-1));
	}

}
