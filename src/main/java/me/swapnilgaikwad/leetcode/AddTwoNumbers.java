package me.swapnilgaikwad.leetcode;

import me.swapnilgaikwad.leetcode.util.ListNode;

/**
 * LeetCode Question 2: Add Two Numbers
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse
 * order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = (l1 == null) ? 0 : l1.val;
            int n2 = (l2 == null) ? 0 : l2.val;

            int sum = n1 + n2 + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return head.next;
    }
}
