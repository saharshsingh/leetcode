package org.saharsh.leetcode.top.medium;

import org.junit.Assert;
import org.junit.Test;

public class N000008_StringToIntegerTest {

	@Test
	public void test_case_one() {
		Assert.assertEquals(42, N000008_StringToInteger.myAtoi("42"));
	}

	@Test
	public void test_case_two() {
		Assert.assertEquals(-42, N000008_StringToInteger.myAtoi("   -42"));
	}

	@Test
	public void test_case_three() {
		Assert.assertEquals(4193, N000008_StringToInteger.myAtoi("4193 with words"));
	}

}
