package com.hosle.linked_list;

public class ListUtil {

    public ListNode createByArray(int[] data){
        if(data == null || data.length == 0){
            return null;
        }

        ListNode head1 = new ListNode(0);
        ListNode build1 = head1;
        for(int item :data){
            build1.next = new ListNode(item);
            build1 = build1.next;
        }
        build1 = null;

        return head1.next;
    }
}
