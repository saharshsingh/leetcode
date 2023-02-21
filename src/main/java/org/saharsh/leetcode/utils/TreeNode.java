package org.saharsh.leetcode.utils;

/**
 * Binary Tree definition used in many Leetcode problems
 *
 * @author saharshsingh
 *
 */
public class TreeNode {

	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int val) {
		this.val = val;
	}

	public TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
