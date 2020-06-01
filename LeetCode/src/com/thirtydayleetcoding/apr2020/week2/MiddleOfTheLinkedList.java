package com.thirtydayleetcoding.apr2020.week2;

import com.util.ListNode;

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode fast = head, slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}
