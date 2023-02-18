package org.saharsh.leetcode.top.easy;

import org.junit.Assert;
import org.junit.Test;

public class N000202_HappyNumberTest {

	@Test
	public void test_19_is_a_happy_number() {
		Assert.assertTrue(N000202_HappyNumber.isHappy(19));
	}

	@Test
	public void test_2_is_not_a_happy_number() {
		Assert.assertFalse(N000202_HappyNumber.isHappy(2));
	}

}
