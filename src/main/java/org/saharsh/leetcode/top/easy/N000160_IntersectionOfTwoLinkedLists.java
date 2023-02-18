package org.saharsh.leetcode.top.easy;

import org.saharsh.leetcode.utils.ListNode;

/**
 * Given the heads of two singly linked-lists headA and headB, return the node
 * at which the two lists intersect. If the two linked lists have no
 * intersection at all, return null.
 * <p>
 * The test cases are generated such that there are no cycles anywhere in the
 * entire linked structure.
 * <p>
 * Note that the linked lists must retain their original structure after the
 * function returns.
 *
 * @author saharshsingh
 *
 */
public class N000160_IntersectionOfTwoLinkedLists {

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode a = headA, b = headB;
		while (a != b) {
			a = a == null ? headB : a.next;
			b = b == null ? headA : b.next;
		}
		return a;
	}
}
