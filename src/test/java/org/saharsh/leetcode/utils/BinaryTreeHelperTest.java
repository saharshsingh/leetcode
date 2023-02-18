package org.saharsh.leetcode.utils;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeHelperTest {

	@Test
	public void test_empty_array() {
		final TreeNode root = BinaryTreeHelper.fromArrayToBinaryTree(new Integer[] {});
		Assert.assertNull(root);
	}

	@Test
	public void test_full_array() {

		// Arrange
		final Integer[] tree = { 30, 10, 50, 5, 20, 40, 60 };

		// Act
		final TreeNode root = BinaryTreeHelper.fromArrayToBinaryTree(tree);

		// Assert
		Assert.assertNotNull(root);
		Assert.assertEquals(30, root.val);

		TreeNode node = root.left;
		Assert.assertEquals(10, node.val);
		TreeNode left = node.left;
		Assert.assertEquals(5, left.val);
		Assert.assertNull(left.left);
		Assert.assertNull(left.right);
		TreeNode right = node.right;
		Assert.assertEquals(20, right.val);
		Assert.assertNull(right.left);
		Assert.assertNull(right.right);

		node = root.right;
		Assert.assertEquals(50, node.val);
		left = node.left;
		Assert.assertEquals(40, left.val);
		Assert.assertNull(left.left);
		Assert.assertNull(left.right);
		right = node.right;
		Assert.assertEquals(60, right.val);
		Assert.assertNull(right.left);
		Assert.assertNull(right.right);

	}

	@Test
	public void test_sparse_array() {

		// Arrange
		final Integer[] tree = { 30, 10, 50, 5, null, null, 60 };

		// Act
		final TreeNode root = BinaryTreeHelper.fromArrayToBinaryTree(tree);

		// Assert
		Assert.assertNotNull(root);
		Assert.assertEquals(30, root.val);

		TreeNode node = root.left;
		Assert.assertEquals(10, node.val);
		TreeNode left = node.left;
		Assert.assertEquals(5, left.val);
		Assert.assertNull(left.left);
		Assert.assertNull(left.right);
		TreeNode right = node.right;
		Assert.assertNull(right);

		node = root.right;
		Assert.assertEquals(50, node.val);
		left = node.left;
		Assert.assertNull(left);
		right = node.right;
		Assert.assertEquals(60, right.val);
		Assert.assertNull(right.left);
		Assert.assertNull(right.right);

	}

}
