package org.saharsh.leetcode.top.easy;

import org.junit.Assert;
import org.junit.Test;
import org.saharsh.leetcode.top.easy.N000234_PalindromeLinkedList.SolutionType;
import org.saharsh.leetcode.utils.ListNode;

public class N000234_PalindromeLinkedListTest {

	@Test
	public void test_case_one() {

		// Arrange
		final ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(1);

		// Act and Assert
		testWithAllSolutionTypes(head, true);

	}

	@Test
	public void test_case_two() {

		// Arrange
		final ListNode head = new ListNode(1);
		head.next = new ListNode(2);

		// Act and Assert
		testWithAllSolutionTypes(head, false);

	}

	@Test
	public void test_single_element() {

		// Arrange
		final ListNode head = new ListNode(1);

		// Act and Assert
		testWithAllSolutionTypes(head, true);

	}

	private static void testWithAllSolutionTypes(ListNode head, boolean shouldPass) {
		for (final SolutionType solutionType : SolutionType.values()) {
			N000234_PalindromeLinkedList.solutionType = solutionType;
			Assert.assertEquals("Failed for solutionType: " + SolutionType.ITERATIVE, shouldPass,
					N000234_PalindromeLinkedList.isPalindrome(copyList(head)));
		}
	}

	private static ListNode copyList(ListNode head) {
		ListNode copy = new ListNode(head.val);
		final ListNode copyHead = copy;
		while (head.next != null) {
			copy.next = new ListNode(head.next.val);
			head = head.next;
			copy = copy.next;
		}
		return copyHead;
	}

}
