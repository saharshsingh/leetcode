package org.saharsh.leetcode.top.easy;

import org.junit.Assert;
import org.junit.Test;
import org.saharsh.leetcode.utils.ListNode;

public class N000160_IntersectionOfTwoLinkedListsTest {

	@Test
	public void test_case_one() {

		// Arrange
		final ListNode common = new ListNode(8);
		common.next = new ListNode(4);
		common.next.next = new ListNode(5);

		final ListNode headA = new ListNode(4);
		headA.next = new ListNode(1);
		headA.next.next = common;

		final ListNode headB = new ListNode(5);
		headB.next = new ListNode(6);
		headB.next.next = new ListNode(1);
		headB.next.next.next = common;

		// Act
		final ListNode intersection = N000160_IntersectionOfTwoLinkedLists.getIntersectionNode(headA, headB);

		// Assert
		Assert.assertEquals(common, intersection);
	}

	@Test
	public void test_case_two() {

		// Arrange
		final ListNode common = new ListNode(2);
		common.next = new ListNode(4);

		final ListNode headA = new ListNode(1);
		headA.next = new ListNode(9);
		headA.next.next = new ListNode(1);
		headA.next.next = common;

		final ListNode headB = new ListNode(3);
		headB.next = common;

		// Act
		final ListNode intersection = N000160_IntersectionOfTwoLinkedLists.getIntersectionNode(headA, headB);

		// Assert
		Assert.assertEquals(common, intersection);
	}

	@Test
	public void test_case_three() {

		// Arrange
		final ListNode headA = new ListNode(2);
		headA.next = new ListNode(6);
		headA.next.next = new ListNode(4);

		final ListNode headB = new ListNode(1);
		headB.next = new ListNode(5);

		// Act
		final ListNode intersection = N000160_IntersectionOfTwoLinkedLists.getIntersectionNode(headA, headB);

		// Assert
		Assert.assertNull(intersection);
	}

}
