package org.saharsh.leetcode.utils;

import org.junit.Assert;
import org.junit.Test;

public class ListNodeHelperTest {

	@Test
	public void test_empty_list() {
		Assert.assertNull(ListNodeHelper.fromArrayToSinglyLinkedList(new int[0]));
	}

	@Test
	public void test_typical_list() {

		// Arrange
		final int[] list = { 23, 4, 12, 15, 33, 10, 2, 6, 22 };

		// Act
		ListNode head = ListNodeHelper.fromArrayToSinglyLinkedList(list);

		// Assert
		for (int i = 0; i < list.length; i++) {
			Assert.assertEquals(list[i], head.val);
			head = head.next;
		}
		Assert.assertNull(head);

	}

}
