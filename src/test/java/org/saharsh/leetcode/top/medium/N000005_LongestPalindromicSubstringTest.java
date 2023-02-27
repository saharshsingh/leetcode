package org.saharsh.leetcode.top.medium;

import org.junit.Assert;
import org.junit.Test;

public class N000005_LongestPalindromicSubstringTest {

	@Test
	public void test_case_one() {
		Assert.assertEquals("bab", N000005_LongestPalindromicSubstring.longestPalindrome("babad"));
	}

	@Test
	public void test_case_two() {
		Assert.assertEquals("bb", N000005_LongestPalindromicSubstring.longestPalindrome("cbbd"));
	}

}
