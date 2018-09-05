package com.hosle.tree;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TreeUtilTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void createByArray() {
        Integer[] data = new Integer[]{5,3,6,2,4,null,null,1};

        TreeNode root = new TreeUtil().createByArray(data);

        ArrayList<Integer> traverseResult = new Traverse().inOrder(root);

        for(Integer item : traverseResult){
            System.out.print(String.valueOf(item)+",");
        }

    }
}