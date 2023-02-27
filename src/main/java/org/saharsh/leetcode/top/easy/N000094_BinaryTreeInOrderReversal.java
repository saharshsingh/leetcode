package org.saharsh.leetcode.top.easy;

import java.util.ArrayList;
import java.util.List;

import org.saharsh.leetcode.utils.TreeNode;

/**
 * Given the root of a binary tree, return the inorder traversal of its nodes'
 * values.
 *
 * @author saharshsingh
 *
 */
public class N000094_BinaryTreeInOrderReversal {

	public static List<Integer> inorderTraversal(TreeNode root) {
		final List<Integer> seen = new ArrayList<>();
		traverse(root, seen);
		return seen;
	}

	private static void traverse(TreeNode node, List<Integer> seen) {
		if (node == null)
			return;
		traverse(node.left, seen);
		seen.add(node.val);
		traverse(node.right, seen);
	}

}
