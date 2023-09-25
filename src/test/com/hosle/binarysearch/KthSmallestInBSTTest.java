package com.hosle.binarysearch;

import com.hosle.tree.TreeNode;
import com.hosle.tree.TreeUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class KthSmallestInBSTTest {


    @Test
    public void solution() {

        Integer[] data = new Integer[]{3,1,4,null,2};

        TreeNode root = new TreeUtil().createByArray(data);

        assertEquals(2,new KthSmallestInBST().solution(root,2));
        assertEquals(3,new KthSmallestInBST().solution(root,3));
    }
}