package org.saharsh.leetcode.top.medium;

import org.saharsh.leetcode.utils.ListNode;

/**
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order, and each of their nodes
 * contains a single digit. Add the two numbers and return the sum as a linked
 * list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 *
 * @author saharshsingh
 *
 */
public class N000002_AddTwoNumbers {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = null;
		ListNode prev = null;
		while (l1 != null || l2 != null) {
			final int val = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;
			final ListNode next = new ListNode(val);
			if (prev != null && prev.val >= 10) {
				next.val += 1;
				prev.val -= 10;
			}
			if (prev == null) {
				head = next;
			} else {
				prev.next = next;
			}
			prev = next;
		}
		if (prev.val >= 10) {
			prev.next = new ListNode(1);
			prev.val -= 10;
		}
		return head;
	}
}
