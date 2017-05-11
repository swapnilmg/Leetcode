package leetCode;

import static org.junit.Assert.*;

import org.junit.Test;

import leetCode.helper.JUnitHelper;
import leetCode.helper.ListNode;

/**
 * LeetCode Problem 2: Add Two Numbers
 * 
 * @author Swapnil Gaikwad
 *
 */
public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = null;
		ListNode tail = null;
		int carry = 0;
		while (l1 != null || l2 != null) {
			int l1v = 0, l2v = 0;
			if (l1 != null) {
				l1v = l1.val;
			}
			if (l2 != null) {
				l2v = l2.val;
			}
			int sum = l1v + l2v + carry;
			carry = sum / 10;
			ListNode current = new ListNode(sum % 10);
			if (tail == null) {
				head = current;
				tail = current;
			} else {
				tail.next = current;
				tail = tail.next;
			}
			if (l1 != null) {
				l1 = l1.next;
			}
			if (l2 != null) {
				l2 = l2.next;
			}
		}
		if (carry != 0) {
			ListNode current = new ListNode(carry);
			tail.next = current;
		}
		return head;
	}

	@Test
	public void test() {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);

		ListNode expected = new ListNode(7);
		expected.next = new ListNode(0);
		expected.next.next = new ListNode(8);

		ListNode actual = addTwoNumbers(l1, l2);

		assertTrue(JUnitHelper.checkLinkLists(expected, actual));
	}

}
