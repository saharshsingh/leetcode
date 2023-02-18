package org.saharsh.leetcode.utils;

/**
 * Singly-linked list definition used in many Leetcode problems
 *
 * @author saharshsingh
 *
 */
public class ListNode {

	public int val;
	public ListNode next;

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

}
