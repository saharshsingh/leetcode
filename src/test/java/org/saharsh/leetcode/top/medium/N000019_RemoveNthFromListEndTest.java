package org.saharsh.leetcode.top.medium;

import org.junit.Assert;
import org.junit.Test;
import org.saharsh.leetcode.utils.ListNode;
import org.saharsh.leetcode.utils.ListNodeHelper;

public class N000019_RemoveNthFromListEndTest {

	@Test
	public void test_case_one() {

		// Arrange
		final int[] list = { 1, 2, 3, 4, 5 };
		ListNode head = ListNodeHelper.fromArrayToSinglyLinkedList(list);

		// Act
		head = N000019_RemoveNthFromListEnd.removeNthFromEnd(head, 2);

		// Assert
		Assert.assertEquals(1, head.val);
		head = head.next;
		Assert.assertEquals(2, head.val);
		head = head.next;
		Assert.assertEquals(3, head.val);
		head = head.next;
		Assert.assertEquals(5, head.val);
		head = head.next;
		Assert.assertNull(head);

	}

	@Test
	public void test_case_two() {

		// Arrange
		final int[] list = { 1 };
		ListNode head = ListNodeHelper.fromArrayToSinglyLinkedList(list);

		// Act
		head = N000019_RemoveNthFromListEnd.removeNthFromEnd(head, 1);

		// Assert
		Assert.assertNull(head);

	}

	@Test
	public void test_case_three() {

		// Arrange
		final int[] list = { 1, 2 };
		ListNode head = ListNodeHelper.fromArrayToSinglyLinkedList(list);

		// Act
		head = N000019_RemoveNthFromListEnd.removeNthFromEnd(head, 1);

		// Assert
		Assert.assertEquals(1, head.val);
		head = head.next;
		Assert.assertNull(head);

	}

}
