package org.saharsh.leetcode.top.easy;

import org.junit.Assert;
import org.junit.Test;

public class N000013_RomanToIntegerTest {

	@Test
	public void test_case_one() {
		Assert.assertEquals(3, N000013_RomanToInteger.romanToInt("III"));
	}

	@Test
	public void test_case_two() {
		Assert.assertEquals(58, N000013_RomanToInteger.romanToInt("LVIII"));
	}

	@Test
	public void test_case_three() {
		Assert.assertEquals(1994, N000013_RomanToInteger.romanToInt("MCMXCIV"));
	}

}
