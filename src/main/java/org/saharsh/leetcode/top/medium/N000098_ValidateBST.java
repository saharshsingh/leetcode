package org.saharsh.leetcode.top.medium;

import java.util.Deque;
import java.util.LinkedList;

import org.saharsh.leetcode.utils.TreeNode;

public class N000098_ValidateBST {

	public enum SolutionType {
		ITERATIVE, RECURSIVE
	}

	public static SolutionType solutionType = SolutionType.ITERATIVE;

	public static boolean isValidBST(TreeNode root) {
		if (solutionType == SolutionType.ITERATIVE) {
			return iteratively(root);
		}
		return recursively(root);
	}

	// ---
	// ITERATIVE SOLUTION
	// ---
	private static boolean iteratively(TreeNode root) {
		final Deque<TreeNode> stack = new LinkedList<>();
		TreeNode prev = null;
		while (root != null || !stack.isEmpty()) {
			while (root != null) {
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			if (prev != null && prev.val >= root.val) {
				return false;
			}
			prev = root;
			root = root.right;
		}
		return true;
	}

	// ---
	// RECURSIVE SOLUTION
	// ---
	private static boolean recursively(TreeNode root) {
		return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private static boolean isValidBST(TreeNode root, int minAllowed, int maxAllowed) {
		if (root.val < minAllowed || root.val > maxAllowed) {
			return false;
		}
		if (root.left != null) {
			if (root.val <= root.left.val) {
				return false;
			}
			if (!isValidBST(root.left, minAllowed, Math.min(maxAllowed, root.val - 1))) {
				return false;
			}
		}
		if (root.right != null) {
			if (root.val >= root.right.val) {
				return false;
			}
			if (!isValidBST(root.right, Math.max(minAllowed, root.val + 1), maxAllowed)) {
				return false;
			}
		}
		return true;
	}

}
