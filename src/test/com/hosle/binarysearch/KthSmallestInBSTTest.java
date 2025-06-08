package com.hosle.binarysearch;

import com.hosle.tree.TreeNode;
import com.hosle.tree.TreeUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class KthSmallestInBSTTest {


    @Test
    public void solution() {

        Integer[] data = new Integer[]{3,1,4,null,2};

        TreeNode root = new TreeUtil().createByArray(data);

        assertEquals(2,new KthSmallestInBST().solution(root,2));
        assertEquals(3,new KthSmallestInBST().solution(root,3));
    }

    @Test
    public void solution2(){
        Integer[] data = new Integer[]{3,1,4,null,2};

        TreeNode root = new TreeUtil().createByArray(data);

        k = 1;
        traverseTree(root, 0);

        assertEquals(1, result);
    }

    private int k;
    private int result;

    private int traverseTree(TreeNode root, int count){
        if (root == null){
            return 0;
        }

        int smallerCount = traverseTree(root.left, count);

        if (smallerCount + count + 1 == k ) {
            result = root.val;
            return smallerCount + 1;
        }

        int biggerCount = traverseTree(root.right, count + smallerCount + 1);

        return smallerCount + biggerCount + 1;
    }
}