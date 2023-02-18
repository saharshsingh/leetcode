package org.saharsh.leetcode.daily.medium;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import org.saharsh.leetcode.utils.TreeNode;

/**
 * Given the root of a binary tree, return the zigzag level order traversal of
 * its nodes' values. (i.e., from left to right, then right to left for the next
 * level and alternate between).
 *
 * @author saharshsingh
 *
 */
public class N000103_BinaryTreeZigzagLevelOrderTraversal {

	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {

		// We'll capture nodes in zig zag order here as we traverse the tree
		final List<List<Integer>> result = new ArrayList<>();

		// We'll maintain a stack for each level. This way we get LIFO for each level,
		// without putting nodes from later level in front of unprocessed nodes of
		// current level
		final List<Deque<TreeNode>> levelBasedStack = new ArrayList<>();

		// schedule the root node and level for traversal
		levelBasedStack.add(new LinkedList<>());
		if (root != null) {
			levelBasedStack.get(0).push(root);
		}

		// keep traversing till we get to an empty level
		int level = 0;
		while (!levelBasedStack.get(level).isEmpty()) {

			// add a new list to result, if processing first node from current level
			if (result.size() != level + 1) {
				result.add(new ArrayList<>());
			}

			// Add next node in level stack to result
			final TreeNode node = levelBasedStack.get(level).pop();
			result.get(level).add(node.val);

			// If we don't have a stack for next level, add it. It doesn't matter if the
			// tree doesn't have any nodes in the next level, as the loop will just exit
			// once we see the empty stack
			if (levelBasedStack.size() != level + 2) {
				levelBasedStack.add(new LinkedList<>());
			}

			// Add children to next level's stack, making sure to add in correct
			// left-to-right or right-to-left order
			final Deque<TreeNode> nextLevelStack = levelBasedStack.get(level + 1);
			final boolean leftToRight = level % 2 == 0;
			push(nextLevelStack, leftToRight ? node.left : node.right);
			push(nextLevelStack, leftToRight ? node.right : node.left);

			// if no more unvisited nodes in this level, move on to next level
			if (levelBasedStack.get(level).isEmpty()) {
				level++;
			}

		}

		return result;

	}

	// helper function to only push non-null nodes to any of the stacks
	private static void push(Deque<TreeNode> stack, TreeNode node) {
		if (node != null) {
			stack.push(node);
		}
	}

}
