package org.saharsh.leetcode.top.medium;

import org.saharsh.leetcode.utils.ListNode;

/**
 * Given the head of a linked list, remove the nth node from the end of the list
 * and return its head.
 *
 * @author saharshsingh
 *
 */
public class N000019_RemoveNthFromListEnd {

	public static ListNode removeNthFromEnd(ListNode head, int n) {

		// find list length
		int l = 0;
		ListNode node = head;
		while (node != null) {
			l++;
			node = node.next;
		}

		// transform n to count from head
		n = l - n;

		// find node to delete
		node = head;
		ListNode prev = null;
		while (n > 0) {
			prev = node;
			node = node.next;
			n--;
		}

		// delete from list
		if (prev == null) {
			return node == null ? null : node.next;
		}
		prev.next = node.next;
		return head;

	}

}
