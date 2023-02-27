package org.saharsh.leetcode.top.medium;

import org.junit.Assert;
import org.junit.Test;
import org.saharsh.leetcode.utils.ListNode;
import org.saharsh.leetcode.utils.ListNodeHelper;

public class N000002_AddTwoNumbersTest {

	@Test
	public void test_case_one() {

		// Arrange
		final ListNode l1 = ListNodeHelper.fromArrayToSinglyLinkedList(new int[] { 2, 4, 3 });
		final ListNode l2 = ListNodeHelper.fromArrayToSinglyLinkedList(new int[] { 5, 6, 4 });

		// Act
		ListNode sum = N000002_AddTwoNumbers.addTwoNumbers(l1, l2);

		// Assert
		Assert.assertEquals(7, sum.val);
		sum = sum.next;
		Assert.assertEquals(0, sum.val);
		sum = sum.next;
		Assert.assertEquals(8, sum.val);
		sum = sum.next;
		Assert.assertNull(sum);

	}

	@Test
	public void test_case_two() {

		// Arrange
		final ListNode l1 = ListNodeHelper.fromArrayToSinglyLinkedList(new int[] { 0 });
		final ListNode l2 = ListNodeHelper.fromArrayToSinglyLinkedList(new int[] { 0 });

		// Act
		ListNode sum = N000002_AddTwoNumbers.addTwoNumbers(l1, l2);

		// Assert
		Assert.assertEquals(0, sum.val);
		sum = sum.next;
		Assert.assertNull(sum);

	}

	@Test
	public void test_case_three() {

		// Arrange
		final ListNode l1 = ListNodeHelper.fromArrayToSinglyLinkedList(new int[] { 9, 9, 9, 9, 9, 9, 9 });
		final ListNode l2 = ListNodeHelper.fromArrayToSinglyLinkedList(new int[] { 9, 9, 9, 9 });

		// Act
		ListNode sum = N000002_AddTwoNumbers.addTwoNumbers(l1, l2);

		// Assert
		Assert.assertEquals(8, sum.val);
		sum = sum.next;
		Assert.assertEquals(9, sum.val);
		sum = sum.next;
		Assert.assertEquals(9, sum.val);
		sum = sum.next;
		Assert.assertEquals(9, sum.val);
		sum = sum.next;
		Assert.assertEquals(0, sum.val);
		sum = sum.next;
		Assert.assertEquals(0, sum.val);
		sum = sum.next;
		Assert.assertEquals(0, sum.val);
		sum = sum.next;
		Assert.assertEquals(1, sum.val);
		sum = sum.next;
		Assert.assertNull(sum);

	}

}
