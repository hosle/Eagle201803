package com.hosle.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateBinaryTreeFromDescriptionTest {

    @Test
    void createBinaryTree() {
        int[][] input = new int[][]{{20,15,1},{20,17,0},{50,20,1},{50,80,0},{80,19,1}};
        TreeNode root = new CreateBinaryTreeFromDescription().solution(input);
        new BinaryTreeLevelOrderTraversal().solution(root);
    }

    @Test
    void createBinaryTree2() {
        int[][] input = new int[][]{{39,70,1},{13,39,1},{85,74,1},{74,13,1},{38,82,1},{82,85,1}};
        TreeNode root = new CreateBinaryTreeFromDescription().solution(input);
        new BinaryTreeLevelOrderTraversal().solution(root);
    }
    
}