package org.saharsh.leetcode.daily.easy;

import org.saharsh.leetcode.utils.TreeNode;

/**
 * Given the root of a binary tree, invert the tree, and return its root.
 *
 * @author saharshsingh
 *
 */
public class N000226_InvertBinaryTree {

	public static TreeNode invertTree(TreeNode root) {

		if (root == null) {
			return null;
		}

		final TreeNode newLeft = invertTree(root.right);
		root.right = invertTree(root.left);
		root.left = newLeft;

		return root;

	}

}
