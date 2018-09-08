package com.hosle.binarysearch;

import com.hosle.tree.TreeNode;
import com.hosle.tree.TreeUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KthSmallestInBSTTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void solution() {

        Integer[] data = new Integer[]{3,1,4,null,2};

        TreeNode root = new TreeUtil().createByArray(data);

        assertEquals(2,new KthSmallestInBST().solution(root,2));
        assertEquals(3,new KthSmallestInBST().solution(root,3));
    }
}