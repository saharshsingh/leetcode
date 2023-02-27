package org.saharsh.leetcode.top.easy;

import org.junit.Assert;
import org.junit.Test;

public class N000066_PlusOneTest {

	@Test
	public void test_case_one() {

		// Arrange
		final int[] digits = { 1, 2, 3 };

		// Act
		final int[] plusOne = N000066_PlusOne.plusOne(digits);

		// Assert
		Assert.assertEquals(1, plusOne[0]);
		Assert.assertEquals(2, plusOne[1]);
		Assert.assertEquals(4, plusOne[2]);

	}

	@Test
	public void test_case_two() {

		// Arrange
		final int[] digits = { 4, 3, 2, 1 };

		// Act
		final int[] plusOne = N000066_PlusOne.plusOne(digits);

		// Assert
		Assert.assertEquals(4, plusOne[0]);
		Assert.assertEquals(3, plusOne[1]);
		Assert.assertEquals(2, plusOne[2]);
		Assert.assertEquals(2, plusOne[3]);

	}

	@Test
	public void test_case_three() {

		// Arrange
		final int[] digits = { 9 };

		// Act
		final int[] plusOne = N000066_PlusOne.plusOne(digits);

		// Assert
		Assert.assertEquals(1, plusOne[0]);
		Assert.assertEquals(0, plusOne[1]);

	}

}
