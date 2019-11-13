package me.swapnilgaikwad.leetcode;

import me.swapnilgaikwad.leetcode.util.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {
    @Test
    void testPositiveCase() {
        ListNode list1 = ListNode.createList(new int[]{2, 4, 3});
        ListNode list2 = ListNode.createList(new int[]{5, 6, 4});
        ListNode expected = ListNode.createList(new int[]{7, 0, 8});
        ListNode actual = AddTwoNumbers.addTwoNumbers(list1, list2);
        Assertions.assertNotNull(actual);
        Assertions.assertEquals(expected.toString(), actual.toString());
    }
}
