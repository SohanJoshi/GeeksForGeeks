package com.medium;

import com.util.ListNode;

public class AddTwoNumbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode = new ListNode(0);
        ListNode temp = resultNode;
        int carry = 0;
        boolean first = true;

        while(l1 != null || l2 != null)
        {
            int sum = 0;
            if(l1 != null)
            {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null)
            {
                sum += l2.val;
                l2 = l2.next;
            }
            if(first)
            {
                temp.val = sum;
                first = false;
            }
            else
            {
                sum += carry;
                if(sum >= 10)
                {
                    carry = 1;
                    sum %= 10;
                }
                temp.next = new ListNode(sum);
                temp = temp.next;
                carry = 0;
            }
        }

        if(carry > 0)
            temp.next = new ListNode(carry);


        return resultNode;
    }
}
