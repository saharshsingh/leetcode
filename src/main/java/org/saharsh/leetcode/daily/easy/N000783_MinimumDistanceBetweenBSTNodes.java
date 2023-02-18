package org.saharsh.leetcode.daily.easy;

import org.saharsh.leetcode.utils.TreeNode;

/**
 * Given the root of a Binary Search Tree (BST), return the minimum difference
 * between the values of any two different nodes in the tree.
 *
 * @author saharshsingh
 *
 */
public class N000783_MinimumDistanceBetweenBSTNodes {

	public static int minDiffInBST(TreeNode root) {
		return ((Integer) usingInOrderTraversal(root, null, Integer.MAX_VALUE)[1]).intValue();
	}

	private static Object[] usingInOrderTraversal(TreeNode current, TreeNode previous, Integer currentMin) {

		// if null just return current previous and min values back
		if (current == null) {
			return new Object[] { previous, currentMin };
		}

		// first visit nodes to left
		final Object[] prevResult = usingInOrderTraversal(current.left, previous, currentMin);

		// next visit this node
		previous = (TreeNode) prevResult[0];
		currentMin = (Integer) prevResult[1];
		if (previous != null) {
			currentMin = Math.min(current.val - previous.val, currentMin);
		}

		// then visit nodes to the right
		return usingInOrderTraversal(current.right, current, currentMin);

	}

}
