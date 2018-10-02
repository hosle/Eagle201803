package com.hosle.linked_list;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddEvenLinkedListTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
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