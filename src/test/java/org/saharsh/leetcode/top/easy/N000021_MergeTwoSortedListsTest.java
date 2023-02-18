package org.saharsh.leetcode.top.easy;

import org.junit.Assert;
import org.junit.Test;
import org.saharsh.leetcode.utils.ListNode;
import org.saharsh.leetcode.utils.ListNodeHelper;

public class N000021_MergeTwoSortedListsTest {

	@Test
	public void test_case_one() {

		// Arrange
		final ListNode list1 = ListNodeHelper.fromArrayToSinglyLinkedList(new int[] { 1, 2, 4 });
		final ListNode list2 = ListNodeHelper.fromArrayToSinglyLinkedList(new int[] { 1, 3, 4 });

		// Act
		ListNode merged = N000021_MergeTwoSortedLists.mergeTwoLists(list1, list2);

		// Assert
		Assert.assertEquals(1, merged.val);
		merged = merged.next;
		Assert.assertEquals(1, merged.val);
		merged = merged.next;
		Assert.assertEquals(2, merged.val);
		merged = merged.next;
		Assert.assertEquals(3, merged.val);
		merged = merged.next;
		Assert.assertEquals(4, merged.val);
		merged = merged.next;
		Assert.assertEquals(4, merged.val);
		merged = merged.next;
		Assert.assertNull(merged);

	}

	@Test
	public void test_case_two() {

		// Arrange
		final ListNode list1 = ListNodeHelper.fromArrayToSinglyLinkedList(new int[] {});
		final ListNode list2 = ListNodeHelper.fromArrayToSinglyLinkedList(new int[] {});

		// Act
		final ListNode merged = N000021_MergeTwoSortedLists.mergeTwoLists(list1, list2);

		// Assert
		Assert.assertNull(merged);

	}

	@Test
	public void test_case_three() {

		// Arrange
		final ListNode list1 = ListNodeHelper.fromArrayToSinglyLinkedList(new int[] {});
		final ListNode list2 = ListNodeHelper.fromArrayToSinglyLinkedList(new int[] { 0 });

		// Act
		ListNode merged = N000021_MergeTwoSortedLists.mergeTwoLists(list1, list2);

		// Assert
		Assert.assertEquals(0, merged.val);
		merged = merged.next;
		Assert.assertNull(merged);

	}

}
