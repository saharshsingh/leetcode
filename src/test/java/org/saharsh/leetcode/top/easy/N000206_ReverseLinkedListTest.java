package org.saharsh.leetcode.top.easy;

import org.junit.Assert;
import org.junit.Test;
import org.saharsh.leetcode.utils.ListNode;
import org.saharsh.leetcode.utils.ListNodeHelper;

public class N000206_ReverseLinkedListTest {

	@Test
	public void test_case_one() {

		// Arrange
		final int[] list = { 1, 2, 3, 4, 5 };
		final ListNode head = ListNodeHelper.fromArrayToSinglyLinkedList(list);

		// Act
		ListNode reversed = N000206_ReverseLinkedList.reverseList(head);

		// Assert
		Assert.assertNull(head.next);
		Assert.assertEquals(list[0], head.val);

		for (int i = list.length - 1; i >= 0; i--) {
			Assert.assertEquals(list[i], reversed.val);
			reversed = reversed.next;
		}
		Assert.assertNull(reversed);

	}

	@Test
	public void test_case_two() {

		// Arrange
		final int[] list = { 1, 2 };
		final ListNode head = ListNodeHelper.fromArrayToSinglyLinkedList(list);

		// Act
		ListNode reversed = N000206_ReverseLinkedList.reverseList(head);

		// Assert
		Assert.assertNull(head.next);
		Assert.assertEquals(list[0], head.val);

		for (int i = list.length - 1; i >= 0; i--) {
			Assert.assertEquals(list[i], reversed.val);
			reversed = reversed.next;
		}
		Assert.assertNull(reversed);

	}

	@Test
	public void test_case_three() {

		// Arrange
		final int[] list = {};
		final ListNode head = ListNodeHelper.fromArrayToSinglyLinkedList(list);

		// Act
		final ListNode reversed = N000206_ReverseLinkedList.reverseList(head);

		// Assert
		Assert.assertNull(head);
		Assert.assertNull(reversed);

	}

}
