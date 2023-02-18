package org.saharsh.leetcode.top.easy;

import org.saharsh.leetcode.utils.ListNode;

/**
 * Given the head of a singly linked list, return true if it is a palindrome or
 * false otherwise.
 *
 * @author saharshsingh
 *
 */
public class N000234_PalindromeLinkedList {

	// ----------

	public enum SolutionType {
		ITERATIVE_MODIFICATION_ALLOWED, ITERATIVE, RECURSIVE
	}

	public static SolutionType solutionType = SolutionType.ITERATIVE;

	public static boolean isPalindrome(ListNode head) {
		switch (solutionType) {
		case ITERATIVE_MODIFICATION_ALLOWED:
			return iterativelyWithModification(head);
		case RECURSIVE:
			return recursively(head);
		case ITERATIVE:
		default:
			return iteratively(head);
		}
	}

	private static boolean iterativelyWithModification(ListNode head) {

		// Get to middle of the list
		ListNode slow = head, fast = head;
		while (fast.next != null) {
			fast = fast.next;
			if (fast.next == null) {
				break;
			}
			fast = fast.next;
			slow = slow.next;
		}

		// reverse second half of linked list
		ListNode prev = null;
		while (slow != null) {
			final ListNode next = slow.next;
			slow.next = prev;
			prev = slow;
			slow = next;
		}

		// Check for palindrome
		while (head != null) {
			if (head.val != fast.val) {
				return false;
			}
			head = head.next;
			fast = fast.next;
		}

		return true;

	}

	private static boolean iteratively(ListNode head) {

		// copy the list and reverse it
		ListNode next = head.next;
		ListNode tail = new ListNode(head.val);
		int size = 1;
		while (next != null) {
			tail = new ListNode(next.val, tail);
			next = next.next;
			size++;
		}

		// verify palindrome
		for (int i = 0; i < size / 2; i++) {
			if (head.val != tail.val) {
				return false;
			}
			head = head.next;
			tail = tail.next;
		}

		return true;

	}

	private static boolean recursively(ListNode head) {
		return findPairNode(head.next, head) != null;
	}

	private static ListNode findPairNode(ListNode node, ListNode head) {
		if (node == null)
			return head;
		final ListNode pair = findPairNode(node.next, head);
		if (pair == null)
			return null;
		if (node.val != pair.val)
			return null;
		return pair.next;
	}

}
