package com.hosle.linked_list;

import com.sun.xml.internal.ws.api.message.HeaderList;

/**
 * Given a sorted linked list,
 *
 * delete all duplicates such that each element appear only once.
 *
 * For example,
 *
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 *
 * https://www.programcreek.com/2013/01/leetcode-remove-duplicates-from-sorted-list/
 *
 */
public class RemoveDuplicatesfromSortedList {

    public ListNode solution(ListNode head){

        ListNode p = head;
        while (p != null && p.next != null) {
            if (p.val == p.next.val)
                p.next = p.next.next;
            else
                p = p.next;
        }

        return head;
    }
}
