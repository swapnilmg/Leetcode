package me.swapnilgaikwad.leetcode;

import me.swapnilgaikwad.leetcode.util.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {

    void helper(ListNode list1, ListNode list2, ListNode expected) {
        ListNode actual = AddTwoNumbers.addTwoNumbers(list1, list2);
        Assertions.assertNotNull(actual);
        Assertions.assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void testNormalCase() {
        ListNode list1 = ListNode.createList(new int[]{2, 4, 3});
        ListNode list2 = ListNode.createList(new int[]{5, 6, 4});
        ListNode expected = ListNode.createList(new int[]{7, 0, 8});
        helper(list1, list2, expected);
    }

    @Test
    void testCarryCase() {
        ListNode list1 = ListNode.createList(new int[]{9, 9, 9});
        ListNode list2 = ListNode.createList(new int[]{1});
        ListNode expected = ListNode.createList(new int[]{0, 0, 0, 1});
        helper(list1, list2, expected);
    }
}
