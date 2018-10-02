package com.hosle.linked_list;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.xml.transform.Result;

import static org.junit.Assert.*;

public class RemoveDuplicatesfromSortedListTest {

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
        ListNode head = new ListUtil().createByArray(new int[]{1,1,2});

        result = new RemoveDuplicatesfromSortedList().solution(head);


    }

    @Test
    public void case2(){
        ListNode head2 = new ListUtil().createByArray(new int[]{1,1,2,3,3});
        result = new RemoveDuplicatesfromSortedList().solution(head2);

    }
}