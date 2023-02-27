package org.saharsh.leetcode.top.easy;

import org.junit.Assert;
import org.junit.Test;

public class N000069_SqrtTest {

	@Test
	public void test_case_one() {
		Assert.assertEquals(2, N000069_Sqrt.mySqrt(4));
	}

	@Test
	public void test_case_two() {
		Assert.assertEquals(2, N000069_Sqrt.mySqrt(8));
	}

	@Test
	public void test_case_three() {
		Assert.assertEquals(9999, N000069_Sqrt.mySqrt(9999 * 9999));
	}

}
