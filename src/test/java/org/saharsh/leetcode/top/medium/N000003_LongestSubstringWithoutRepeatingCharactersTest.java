package org.saharsh.leetcode.top.medium;

import org.junit.Assert;
import org.junit.Test;

public class N000003_LongestSubstringWithoutRepeatingCharactersTest {

	@Test
	public void test_case_one() {
		final String s = "abcabcbb";
		final int l = N000003_LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
		Assert.assertEquals(3, l);
	}

	@Test
	public void test_case_two() {
		final String s = "bbbbb";
		final int l = N000003_LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
		Assert.assertEquals(1, l);
	}

	@Test
	public void test_case_three() {
		final String s = "pwwkew";
		final int l = N000003_LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
		Assert.assertEquals(3, l);
	}

}
