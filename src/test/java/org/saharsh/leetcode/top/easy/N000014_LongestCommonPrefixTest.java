package org.saharsh.leetcode.top.easy;

import org.junit.Assert;
import org.junit.Test;

public class N000014_LongestCommonPrefixTest {

	@Test
	public void test_case_one() {
		final String[] strs = { "flower", "flow", "flight" };
		Assert.assertEquals("fl", N000014_LongestCommonPrefix.longestCommonPrefix(strs));
	}

	@Test
	public void test_case_two() {
		final String[] strs = { "dog", "racecar", "car" };
		Assert.assertEquals("", N000014_LongestCommonPrefix.longestCommonPrefix(strs));
	}

}
