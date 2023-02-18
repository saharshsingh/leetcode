package org.saharsh.leetcode.top.easy;

import org.junit.Assert;
import org.junit.Test;

public class N000242_ValidAnagramTest {

	@Test
	public void test_case_one() {
		Assert.assertTrue(N000242_ValidAnagram.isAnagram("anagram", "nagaram"));
	}

	@Test
	public void test_case_two() {
		Assert.assertFalse(N000242_ValidAnagram.isAnagram("rat", "car"));
	}

}
