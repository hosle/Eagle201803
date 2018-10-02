package com.hosle.linked_list;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeTwoSortedListsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void solution() {

        int[] array = {2, 4, 6, 8, 10, 12};
        int[] array2 = {1, 3, 5, 7, 9, 11};

        ListNode head1 = new ListUtil().createByArray(array);

        ListNode head2 = new ListUtil().createByArray(array2);

        ListNode result = new MergeTwoSortedLists().solution(head1, head2);
        while(result!=null){
            System.out.print(result.val+",");
            result = result.next;
        }
    }
}