package com.hosle.linked_list;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;


public class OddEvenLinkedListTest {


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
        ListNode head = new ListUtil().createByArray(new int[]{1,2,3,4,5,6,7,8});

        result = new OddEvenLinkedList().solution(head);

    }

    @Test
    public void solution2() {
        ListNode head = new ListUtil().createByArray(new int[]{1,2,3,4,5,6,7,8});

        result = new OddEvenLinkedList().solution2(head);
    }
}