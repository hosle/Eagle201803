package com.hosle.linked_list;

import com.hosle.linked_list.DetectCycleInLinkedList;
import com.hosle.linked_list.ListNode;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


/**
 * Created by tanjiahao on 2018/3/8.
 * Eagle201803
 */
public class DetectCycleInLinkedListTest {
    ListNode result = null;

    @AfterAll
    public void tearDown() throws Exception {
//        if(null == result){
//            System.out.println("no cycle");
//        }else{
//            System.out.println(result.val);
//        }
    }

    @Test
    public void solution() throws Exception {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;

        assertNull(new DetectCycleInLinkedList().solution(node1));

        ListNode node3 = new ListNode(3);
        node2.next = node3;

        assertNull(new DetectCycleInLinkedList().solution(node1));

        ListNode node4 = new ListNode(4);
        node3.next = node4;
        node4.next = node2;

        assertEquals(2,new DetectCycleInLinkedList().solution(node1).val);


    }

}