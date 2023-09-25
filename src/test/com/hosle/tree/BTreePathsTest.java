package com.hosle.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BTreePathsTest {
    TreeNode tree = null;

    @BeforeEach
    void setUp() {
        //          1
        //       /     \
        //     2         3
        //   /  \       /  \
        //  4    5     6     7
        // /\   / \   / \   / \
        //8  9 10 11 12 13 14 15


        tree = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);
        TreeNode node10 = new TreeNode(10);
        TreeNode node11 = new TreeNode(11);
        TreeNode node12 = new TreeNode(12);
        TreeNode node13 = new TreeNode(13);
        TreeNode node14 = new TreeNode(14);
        TreeNode node15 = new TreeNode(15);

        node4.left = node8;
        node4.right = node9;
        node5.left = node10;
        node5.right = node11;
        node6.left = node12;
        node6.right = node13;
        node7.left = node14;
        node7.right = node15;

        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        tree.left = node2;
        tree.right = node3;
    }

    @Test
    void solution() {
        new BTreePaths().solution(tree);
    }
}