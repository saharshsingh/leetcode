package org.saharsh.leetcode.utils;

public class BinaryTreeHelper {

	public static TreeNode fromArrayToBinaryTree(Integer[] tree) {
		return fromArrayToBinaryTree(tree, 0);
	}

	private static TreeNode fromArrayToBinaryTree(Integer[] tree, int rootIndex) {
		if (rootIndex >= tree.length || tree[rootIndex] == null) {
			return null;
		}
		final TreeNode leftChild = fromArrayToBinaryTree(tree, (rootIndex * 2) + 1);
		final TreeNode rightChild = fromArrayToBinaryTree(tree, (rootIndex * 2) + 2);
		return new TreeNode(tree[rootIndex], leftChild, rightChild);
	}
}
