package com.hosle.linked_list;

/**
 * Created by tanjiahao on 2018/3/8.
 * Eagle201803
 *
 * H: distance from head to cycle entry E
 * D: distance from E to X
 * L: cycle length
 *                           _____
 *                          /     \
 *         head_____H______E       \
 *                         \       /
 *                          X_____/
 *
 * If fast and slow both start at head, when fast catches slow, slow has traveled H+D and fast 2(H+D).
 *         Assume fast has traveled n loops in the cycle, we have:
 *         2H + 2D = H + D + L  -->  H + D = nL  --> H = nL - D
 *         Thus if two pointers start from head and X, respectively, one first reaches E, the other also reaches E.
 *         In my solution, since fast starts at head.next, we need to move slow one step forward in the beginning of part 2
 *
 */
public class DetectCycleInLinkedList {

    public ListNode solution(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while(fast !=null || slow!= null){
            if(fast==null || fast.next==null)
                return null;
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow)
                break;
        }

        if(fast == null){
            return null;
        }

        fast = head;

        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }

        return fast;
    }
}
