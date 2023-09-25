package com.hosle.tree;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class TreeUtilTest {

    @BeforeAll
    public void setUp() throws Exception {
    }

    @AfterAll
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