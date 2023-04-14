package org.saharsh.leetcode.top.medium;

import org.junit.Assert;
import org.junit.Test;
import org.saharsh.leetcode.top.medium.N000098_ValidateBST.SolutionType;
import org.saharsh.leetcode.utils.BinaryTreeHelper;
import org.saharsh.leetcode.utils.TreeNode;

public class N000098_ValidateBSTTest {

	@Test
	public void test_case_one_solved_iteratively() {
		N000098_ValidateBST.solutionType = SolutionType.ITERATIVE;
		final Integer[] tree = { 2, 1, 3 };
		final TreeNode root = BinaryTreeHelper.fromArrayToBinaryTree(tree);
		Assert.assertTrue(N000098_ValidateBST.isValidBST(root));
	}

	@Test
	public void test_case_two_solved_iteratively() {
		N000098_ValidateBST.solutionType = SolutionType.ITERATIVE;
		final Integer[] tree = { 5, 1, 4, null, null, 3, 6 };
		final TreeNode root = BinaryTreeHelper.fromArrayToBinaryTree(tree);
		Assert.assertFalse(N000098_ValidateBST.isValidBST(root));
	}

	@Test
	public void test_case_one_solved_recursively() {
		N000098_ValidateBST.solutionType = SolutionType.RECURSIVE;
		final Integer[] tree = { 2, 1, 3 };
		final TreeNode root = BinaryTreeHelper.fromArrayToBinaryTree(tree);
		Assert.assertTrue(N000098_ValidateBST.isValidBST(root));
	}

	@Test
	public void test_case_two_solved_recursively() {
		N000098_ValidateBST.solutionType = SolutionType.RECURSIVE;
		final Integer[] tree = { 5, 1, 4, null, null, 3, 6 };
		final TreeNode root = BinaryTreeHelper.fromArrayToBinaryTree(tree);
		Assert.assertFalse(N000098_ValidateBST.isValidBST(root));
	}

}
