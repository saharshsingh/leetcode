package org.saharsh.leetcode.top.easy;

import org.saharsh.leetcode.utils.ListNode;

/**
 * Given the head of a singly linked list, reverse the list, and return the
 * reversed list.
 *
 * @author saharshsingh
 *
 */
public class N000206_ReverseLinkedList {
	public static ListNode reverseList(ListNode head) {
		ListNode prev = null;
		while (head != null) {
			final ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		return prev;
	}
}
