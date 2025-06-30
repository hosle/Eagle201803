package com.hosle.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StepByStepDirectionsFromABinaryTreeNodeToAnotherTest {

    @Test
    void solution() {
        TreeNode node3 = new TreeNode(3);
        TreeNode node6 = new TreeNode(6);
        TreeNode node4 = new TreeNode(4);
        TreeNode node1 = new TreeNode(1, node3,null);
        TreeNode node2 = new TreeNode(2, node6, node4);
        TreeNode root = new TreeNode(5, node1, node2);

        new StepByStepDirectionsFromABinaryTreeNodeToAnother().solution(root, 3, 6);
    }

    @Test
    void solution2() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2, node1, null);

        new StepByStepDirectionsFromABinaryTreeNodeToAnother().solution(node2, 2, 1);
    }



    @Test
    void solution3() {
//        [1,null,10,12,13,4,6,null,15,null,null,5,11,null,2,14,7,null,8,null,null,null,9,3]
        TreeNode node9 = new TreeNode(9);
        TreeNode node14 = new TreeNode(14, null, node9);
        TreeNode node8 = new TreeNode(8);
        TreeNode node11 = new TreeNode(11, null, node8);
        TreeNode node3 = new TreeNode(3);
        TreeNode node7 = new TreeNode(7, node3, null);
        TreeNode node5 = new TreeNode(5, node14, node7);
        TreeNode node6 = new TreeNode(6, node5, node11);
        TreeNode node4 = new TreeNode(4);
        TreeNode node12 = new TreeNode(12, node4, node6);
        TreeNode node2 = new TreeNode(2);
        TreeNode node15 = new TreeNode(15, null, node2);
        TreeNode node13 = new TreeNode(13, null, node15);
        TreeNode node10 = new TreeNode(10, node12, node13);
        TreeNode node1 = new TreeNode(1, null, node10);

        new StepByStepDirectionsFromABinaryTreeNodeToAnother().solution(node1, 6, 15);

    }

    @Test
    void solution4() {
        TreeNode node7 = new TreeNode(7);
        TreeNode node4 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3, node4, node7);

        TreeNode node2 = new TreeNode(2);
        TreeNode node6 = new TreeNode(6, null, node2);
        TreeNode node1 = new TreeNode(1, node6, null);
        TreeNode node8 = new TreeNode(8, node1, null);
        TreeNode node5 = new TreeNode(5, node8, node3);

        new StepByStepDirectionsFromABinaryTreeNodeToAnother().solution(node5, 4, 3);

    }
}