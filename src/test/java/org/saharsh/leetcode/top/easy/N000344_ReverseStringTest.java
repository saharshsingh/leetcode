package org.saharsh.leetcode.top.easy;

import org.junit.Assert;
import org.junit.Test;

public class N000344_ReverseStringTest {

	@Test
	public void test_case_one() {

		// Arrange
		final char[] s = { 'h', 'e', 'l', 'l', 'o' };

		// Act
		N000344_ReverseString.reverseString(s);

		// Assert
		int i = 0;
		Assert.assertEquals('o', s[i++]);
		Assert.assertEquals('l', s[i++]);
		Assert.assertEquals('l', s[i++]);
		Assert.assertEquals('e', s[i++]);
		Assert.assertEquals('h', s[i++]);

	}

	@Test
	public void test_case_two() {

		// Arrange
		final char[] s = { 'H', 'a', 'n', 'n', 'a', 'h' };

		// Act
		N000344_ReverseString.reverseString(s);

		// Assert
		int i = 0;
		Assert.assertEquals('h', s[i++]);
		Assert.assertEquals('a', s[i++]);
		Assert.assertEquals('n', s[i++]);
		Assert.assertEquals('n', s[i++]);
		Assert.assertEquals('a', s[i++]);
		Assert.assertEquals('H', s[i++]);

	}

}
