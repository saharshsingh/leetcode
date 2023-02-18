package org.saharsh.leetcode.daily.easy;

import org.junit.Assert;
import org.junit.Test;
import org.saharsh.leetcode.utils.BinaryTreeHelper;

public class N000783_MinimumDistanceBetweenBSTNodesTest {

	@Test
	public void test_case_one() {

		// Arrange
		final Integer[] tree = { 4, 2, 6, 1, 3 };

		// Act
		final int min = N000783_MinimumDistanceBetweenBSTNodes.minDiffInBST(BinaryTreeHelper.fromArrayToBinaryTree(tree));

		// Assert
		Assert.assertEquals(1, min);

	}

	@Test
	public void test_case_two() {

		// Arrange
		final Integer[] tree = { 1, 0, 48, null, null, 12, 49 };

		// Act
		final int min = N000783_MinimumDistanceBetweenBSTNodes.minDiffInBST(BinaryTreeHelper.fromArrayToBinaryTree(tree));

		// Assert
		Assert.assertEquals(1, min);

	}

}
