package org.saharsh.leetcode.utils;

public class ListNodeHelper {
	public static ListNode fromArrayToSinglyLinkedList(int[] list) {
		if (list.length == 0) {
			return null;
		}
		final ListNode head = new ListNode(list[0]);
		ListNode curr = head;
		for (int i = 1; i < list.length; i++) {
			curr.next = new ListNode(list[i]);
			curr = curr.next;
		}
		return head;
	}
}
