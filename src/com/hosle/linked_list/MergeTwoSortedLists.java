package com.hosle.linked_list;

import java.util.List;

/**
 * Merge two sorted linked lists and return it as a new list.
 *
 * The new list should be made by splicing together the nodes of the first two lists.
 *
 * https://www.programcreek.com/2012/12/leetcode-merge-two-sorted-lists-java/
 */
public class MergeTwoSortedLists {

    public ListNode solution(ListNode head1, ListNode head2){
        ListNode result = new ListNode(0);
        ListNode mergedList = result;

        while (head1!=null && head2 !=null){

            if(head1.val<head2.val){
                mergedList.next = head1;
                mergedList = mergedList.next;
                head1 = head1.next;

            }else{
                mergedList.next = head2;
                mergedList = mergedList.next;
                head2 = head2.next;
            }
        }

        if (head1 == null) {
            mergedList.next = head2;
        } else {
            mergedList.next = head1;
        }

        return result.next;

    }
}
