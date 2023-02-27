package org.saharsh.leetcode.top.easy;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class N000026_RemoveDuplicatesFromSortedArrayTest {

	@Test
	public void test_case_one() {

		// Arrange
		final int[] nums = { 1, 1, 2 };

		// Act
		final int length = N000026_RemoveDuplicatesFromSortedArray.removeDuplicates(nums);

		// Assert
		final int[] expectedUnique = { 1, 2 };
		Assert.assertEquals(expectedUnique.length, length);
		Assert.assertArrayEquals(expectedUnique, Arrays.copyOfRange(nums, 0, length));

	}

	@Test
	public void test_case_two() {

		// Arrange
		final int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

		// Act
		final int length = N000026_RemoveDuplicatesFromSortedArray.removeDuplicates(nums);

		// Assert
		final int[] expectedUnique = { 0, 1, 2, 3, 4 };
		Assert.assertEquals(expectedUnique.length, length);
		Assert.assertArrayEquals(expectedUnique, Arrays.copyOfRange(nums, 0, length));

	}

}
