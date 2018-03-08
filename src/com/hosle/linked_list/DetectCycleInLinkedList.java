package com.hosle.linked_list;

/**
 * Created by tanjiahao on 2018/3/8.
 * Eagle201803
 */
public class DetectCycleInLinkedList {

    public ListNode solution(ListNode head) {
        if(head == null||head.next==null){
            return null;
        }

        ListNode fast = head.next;
        ListNode slow = head;

        while(fast.val != slow.val){
            if(fast.next==null)
                return null;
            fast = fast.next.next;
            slow = slow.next;

            if(fast == null||slow == null){
                return null;
            }
        }

        fast = head;

        while(fast.val != slow.val){
            fast = fast.next;
            slow = slow.next;
        }

        return fast;
    }
}
