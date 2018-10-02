package com.hosle.linked_list;

/**
 * Given a singly linked list,
 *
 * group all odd nodes together followed by the even nodes.
 *
 * Please note here we are talking about the node number and not the value in the nodes.
 *
 * The program should run in O(1) space complexity and O(nodes) time complexity.
 *
 * Example:
 *
 * Given 1->2->3->4->5->NULL,
 * return 1->3->5->2->4->NULL.
 *
 * https://www.programcreek.com/2015/03/leetcode-odd-even-linked-list-java/
 */
public class OddEvenLinkedList {

    public ListNode solution(ListNode head){
        if(head ==null || head.next == null)
            return head;

        ListNode p1 = head;
        ListNode p2 = head.next;
        ListNode evenStart = p2;

        while (p1!=null && p2!=null){

            if(p2.next == null)
                break;

            p1.next = p2.next;
            p1 = p1.next;

            p2.next = p1.next;
            p2 = p2.next;
        }

        p1.next = evenStart;

        return head;
    }

    public ListNode solution2(ListNode head){

        int i = 1;

        ListNode even = new ListNode(-1);
        ListNode odd = new ListNode(-1);
        ListNode result = odd;

        while (head!=null){
            if ((i & 1) == 0){
                even.next = head;
                even = even.next;
            }else{
                odd.next = head;
                odd = odd.next;
            }
            head = head.next;
            i++;
        }
        even.next = null;
        odd.next = even;

        return result.next;

    }
}
