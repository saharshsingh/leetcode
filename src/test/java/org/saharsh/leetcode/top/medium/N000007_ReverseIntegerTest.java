package org.saharsh.leetcode.top.medium;

import org.junit.Assert;
import org.junit.Test;

public class N000007_ReverseIntegerTest {

	@Test
	public void test_case_one() {
		Assert.assertEquals(321, N000007_ReverseInteger.reverse(123));
	}

	@Test
	public void test_case_two() {
		Assert.assertEquals(-321, N000007_ReverseInteger.reverse(-123));
	}

	@Test
	public void test_case_three() {
		Assert.assertEquals(21, N000007_ReverseInteger.reverse(120));
	}

	@Test
	public void test_zero() {
		Assert.assertEquals(0, N000007_ReverseInteger.reverse(0));
	}

	@Test
	public void test_positive_overflow() {
		Assert.assertEquals(0, N000007_ReverseInteger.reverse(Integer.MAX_VALUE));
	}

	@Test
	public void test_negative_overflow() {
		Assert.assertEquals(0, N000007_ReverseInteger.reverse(Integer.MIN_VALUE));
	}

}
