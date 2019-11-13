package me.swapnilgaikwad.leetcode.util;

/**
 * Definition for singly-linked list.
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode createList(int[] intArray) {
        ListNode head = new ListNode(intArray[0]);
        ListNode tail = head;

        for (int i = 1; i < intArray.length; i++) {
            tail.next = new ListNode(intArray[i]);
            tail = tail.next;
        }
        return head;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode current = this;
        while (current != null) {
            sb.append(current.val + " ");
            current = current.next;
        }
        return sb.toString();
    }
}
