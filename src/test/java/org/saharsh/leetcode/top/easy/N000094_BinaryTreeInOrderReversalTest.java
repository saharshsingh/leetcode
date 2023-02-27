package org.saharsh.leetcode.top.easy;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.saharsh.leetcode.utils.BinaryTreeHelper;
import org.saharsh.leetcode.utils.TreeNode;

public class N000094_BinaryTreeInOrderReversalTest {

	@Test
	public void test_case_one() {

		// Arrange
		final Integer[] tree = { 1, null, 2, null, null, 3 };
		final TreeNode root = BinaryTreeHelper.fromArrayToBinaryTree(tree);

		// Act
		final List<Integer> inOrder = N000094_BinaryTreeInOrderReversal.inorderTraversal(root);

		// Assert
		Assert.assertEquals(3, inOrder.size());
		int i = 0;
		Assert.assertEquals(1, inOrder.get(i++).intValue());
		Assert.assertEquals(3, inOrder.get(i++).intValue());
		Assert.assertEquals(2, inOrder.get(i++).intValue());

	}

	@Test
	public void test_case_two() {

		// Arrange
		final Integer[] tree = {};
		final TreeNode root = BinaryTreeHelper.fromArrayToBinaryTree(tree);

		// Act
		final List<Integer> inOrder = N000094_BinaryTreeInOrderReversal.inorderTraversal(root);

		// Assert
		Assert.assertEquals(0, inOrder.size());

	}

	@Test
	public void test_case_three() {

		// Arrange
		final Integer[] tree = { 1 };
		final TreeNode root = BinaryTreeHelper.fromArrayToBinaryTree(tree);

		// Act
		final List<Integer> inOrder = N000094_BinaryTreeInOrderReversal.inorderTraversal(root);

		// Assert
		Assert.assertEquals(1, inOrder.size());
		int i = 0;
		Assert.assertEquals(1, inOrder.get(i++).intValue());

	}

}
