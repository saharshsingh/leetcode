package org.saharsh.leetcode.daily.easy;

import org.junit.Assert;
import org.junit.Test;
import org.saharsh.leetcode.utils.BinaryTreeHelper;
import org.saharsh.leetcode.utils.TreeNode;

public class N000226_InvertBinaryTreeTest {

	@Test
	public void test_case_one() {

		// Arrange
		final Integer[] tree = { 4, 2, 7, 1, 3, 6, 9 };
		TreeNode root = BinaryTreeHelper.fromArrayToBinaryTree(tree);

		// Act
		root = N000226_InvertBinaryTree.invertTree(root);

		// Assert
		Assert.assertEquals(4, root.val);

		Assert.assertEquals(7, root.left.val);
		Assert.assertEquals(9, root.left.left.val);
		Assert.assertEquals(6, root.left.right.val);

		Assert.assertEquals(2, root.right.val);
		Assert.assertEquals(3, root.right.left.val);
		Assert.assertEquals(1, root.right.right.val);

	}

	@Test
	public void test_case_two() {

		// Arrange
		final Integer[] tree = { 2, 1, 3 };
		TreeNode root = BinaryTreeHelper.fromArrayToBinaryTree(tree);

		// Act
		root = N000226_InvertBinaryTree.invertTree(root);

		// Assert
		Assert.assertEquals(2, root.val);
		Assert.assertEquals(3, root.left.val);
		Assert.assertEquals(1, root.right.val);

	}

	@Test
	public void test_case_three() {

		// Arrange
		final Integer[] tree = {};
		TreeNode root = BinaryTreeHelper.fromArrayToBinaryTree(tree);

		// Act
		root = N000226_InvertBinaryTree.invertTree(root);

		// Assert
		Assert.assertNull(root);

	}

}
