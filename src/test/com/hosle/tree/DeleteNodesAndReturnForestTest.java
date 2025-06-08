package com.hosle.tree;


import com.sun.source.tree.AssertTree;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;


public class DeleteNodesAndReturnForestTest {

    @Test
    public void testSolution(){
        TreeNode node7 = new TreeNode(7);
        TreeNode node6 = new TreeNode(6);
        TreeNode node5 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3, node6, node7);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node1 = new TreeNode(1, node2,node3);

        int[] toDelete = new int[]{3,5};
        Integer[][] expectedInts = new Integer[][]{{1,2,null,4},{6},{7}};

        ArrayList<List<Integer>> result = new ArrayList<>();
        for (TreeNode item : new DeleteNodesAndReturnForest().solution(node1, toDelete)){
            result.add(new BinaryTreeLevelOrderTraversal().solution2(item));
        }
        System.out.println(Arrays.deepToString(result.toArray()));


        ArrayList<List<Integer>> expected = new ArrayList<>();
        for (Integer[] item : expectedInts) {
            expected.add(Arrays.asList(item));
        }
        System.out.println(Arrays.deepToString(expected.toArray()));

        assertTrue(TreeUtil.compareListsIgnoringOrder(expected, result));
    }

    @Test
    public void testSolution2(){
        TreeNode node4 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, null, node3);
        TreeNode node1 = new TreeNode(1, node2, node4);

        int[] toDelete = new int[]{3};
        Integer[][] expectedInts = new Integer[][]{{1,2,4}};

        ArrayList<List<Integer>> result = new ArrayList<>();
        for (TreeNode item : new DeleteNodesAndReturnForest().solution(node1, toDelete)){
            result.add(new BinaryTreeLevelOrderTraversal().solution2(item));
        }
        System.out.println(Arrays.deepToString(result.toArray()));


        ArrayList<List<Integer>> expected = new ArrayList<>();
        for (Integer[] item : expectedInts) {
            expected.add(Arrays.asList(item));
        }
        System.out.println(Arrays.deepToString(expected.toArray()));

        assertTrue(TreeUtil.compareListsIgnoringOrder(expected, result));
    }

    @Test
    public void testSolution3(){
        TreeNode node4 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node4, node3);
        TreeNode node1 = new TreeNode(1, node2, null);

        int[] toDelete = new int[]{2, 3};
        Integer[][] expectedInts = new Integer[][]{{1}, {4}};

        ArrayList<List<Integer>> result = new ArrayList<>();
        for (TreeNode item : new DeleteNodesAndReturnForest().solution(node1, toDelete)){
            result.add(new BinaryTreeLevelOrderTraversal().solution2(item));
        }
        System.out.println(Arrays.deepToString(result.toArray()));


        ArrayList<List<Integer>> expected = new ArrayList<>();
        for (Integer[] item : expectedInts) {
            expected.add(Arrays.asList(item));
        }
        System.out.println(Arrays.deepToString(expected.toArray()));

        assertTrue(TreeUtil.compareListsIgnoringOrder(expected, result));
    }


}