package org.saharsh.leetcode.daily.medium;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.saharsh.leetcode.utils.BinaryTreeHelper;
import org.saharsh.leetcode.utils.TreeNode;

public class N000103_BinaryTreeZigzagLevelOrderTraversalTest {

	@Test
	public void test_case_one() {

		final Integer[] tree = { 3, 9, 20, null, null, 15, 7 };
		final TreeNode root = BinaryTreeHelper.fromArrayToBinaryTree(tree);

		final List<List<Integer>> result = N000103_BinaryTreeZigzagLevelOrderTraversal.zigzagLevelOrder(root);

		Assert.assertEquals(3, result.size());

		Assert.assertEquals(1, result.get(0).size());
		Assert.assertEquals(3, result.get(0).get(0).intValue());

		Assert.assertEquals(2, result.get(1).size());
		Assert.assertEquals(20, result.get(1).get(0).intValue());
		Assert.assertEquals(9, result.get(1).get(1).intValue());

		Assert.assertEquals(2, result.get(2).size());
		Assert.assertEquals(15, result.get(2).get(0).intValue());
		Assert.assertEquals(7, result.get(2).get(1).intValue());

	}

}
