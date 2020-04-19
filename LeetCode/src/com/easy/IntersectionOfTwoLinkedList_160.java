package com.easy;

import com.util.ListNode;

public class IntersectionOfTwoLinkedList_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return  null;

        int countA = countNodes(headA);
        int countB = countNodes(headB);

        for(int i = 0; i < countA - countB; i++)
            headA = headA.next;

        for(int i = 0; i < countB - countA; i++)
            headB = headB.next;

        while (headA != null && headB != null)
        {
            if(headA == headB)
                break;
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

    private int countNodes(ListNode head) {
        int count = 0;
        while(head != null) {
            head = head.next;
            count ++;
        }
        return count;
    }
}
