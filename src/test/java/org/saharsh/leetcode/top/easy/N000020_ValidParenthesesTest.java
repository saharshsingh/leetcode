package org.saharsh.leetcode.top.easy;

import org.junit.Assert;
import org.junit.Test;

public class N000020_ValidParenthesesTest {

	@Test
	public void test_case_one() {
		Assert.assertTrue(N000020_ValidParentheses.isValid("()"));
	}

	@Test
	public void test_case_two() {
		Assert.assertTrue(N000020_ValidParentheses.isValid("()[]{}"));
	}

	@Test
	public void test_case_three() {
		Assert.assertFalse(N000020_ValidParentheses.isValid("(]"));
	}

}
