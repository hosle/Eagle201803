package com.hosle.linked_list;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import javax.xml.transform.Result;


public class RemoveDuplicatesfromSortedListTest {


    @AfterAll
    public void tearDown() throws Exception {
        while(result!=null){
            System.out.print(result.val+",");
            result = result.next;
        }
    }

    ListNode result;

    @Test
    public void solution() {
        ListNode head = new ListUtil().createByArray(new int[]{1,1,2});

        result = new RemoveDuplicatesfromSortedList().solution(head);


    }

    @Test
    public void case2(){
        ListNode head2 = new ListUtil().createByArray(new int[]{1,1,2,3,3});
        result = new RemoveDuplicatesfromSortedList().solution(head2);

    }
}