package org.saharsh.leetcode.top.easy;

import org.saharsh.leetcode.utils.ListNode;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 * <p>
 * Merge the two lists in a one sorted list. The list should be made by splicing
 * together the nodes of the first two lists.
 * <p>
 * Return the head of the merged linked list.
 *
 * @author saharshsingh
 *
 */
public class N000021_MergeTwoSortedLists {

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		ListNode head = null;
		ListNode prev = null;

		while (list1 != null || list2 != null) {

			ListNode next = null;
			if (list1 == null) {
				next = list2;
				list2 = list2.next;
			} else if (list2 == null) {
				next = list1;
				list1 = list1.next;
			} else if (list2.val < list1.val) {
				next = list2;
				list2 = list2.next;
			} else {
				next = list1;
				list1 = list1.next;
			}

			if (head == null) {
				head = next;
				prev = next;
			} else {
				prev.next = next;
				prev = next;
			}
		}

		return head;

	}

}
