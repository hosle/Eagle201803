package test.com.hosle.linked_list;

import com.hosle.linked_list.DetectCycleInLinkedList;
import com.hosle.linked_list.ListNode;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tanjiahao on 2018/3/8.
 * Eagle201803
 */
public class DetectCycleInLinkedListTest {
    ListNode result = null;

    @After
    public void tearDown() throws Exception {
        if(null == result){
            System.out.println("no cycle");
        }else{
            System.out.println(result.val);
        }
    }

    @Test
    public void solution() throws Exception {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;

        result = new DetectCycleInLinkedList().solution(node1);
    }

}