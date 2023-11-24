package com.hosle.tree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Binary Tree Zigzag Level Order Traversal
 * Given the root of a binary tree, return the zigzag level order traversal of its nodes' values.
 * (i.e., from left to right, then right to left for the next level and alternate between).
 * <p>
 * 3
 * /   \
 * 9    20
 * /  \
 * 15    7
 * Input: root = [3,9,20,null,null,15,7]
 * Output: [[3],[20,9],[15,7]]
 * <p>
 * Input: root = [1]
 * Output: [[1]]
 * <p>
 * Input: root = []
 * Output: []
 */
public class BinaryTreeZigzagOrderTraversal {

    public void solution(TreeNode root) {
        LinkedBlockingQueue<LinkedList<TreeNode>> result = new LinkedBlockingQueue<LinkedList<TreeNode>>();

        LinkedList<TreeNode> firstLevel = new LinkedList<>();
        firstLevel.add(root);
        result.add(firstLevel);

        boolean reverse = false;

        while (!result.isEmpty()) {
            LinkedList<TreeNode> currentLevel = result.poll();
            LinkedList<TreeNode> nextLevel = new LinkedList<>();

            for (TreeNode item : currentLevel) {
                if (item.left != null) {
                    nextLevel.add(item.left);
                }
                if (item.right != null) {
                    nextLevel.add(item.right);
                }
            }
            if (!nextLevel.isEmpty()) {
                result.add(nextLevel);
            }

            if (!reverse) {
                for (TreeNode item : currentLevel) {
                    if (item != null) {
                        System.out.print(item.val + ", ");
                    }
                }
            } else {
                for (int i = currentLevel.size() - 1; i >= 0; i--) {
                    TreeNode item = currentLevel.get(i);
                    if (item != null) {
                        System.out.print(item.val + ", ");
                    }
                }
            }
            reverse = !reverse;
        }
    }

    public void traverse(TreeNode root) {
        LinkedList<LinkedList<TreeNode>> queue = new LinkedList<>();
        LinkedList<TreeNode> start = new LinkedList<>();
        start.add(root);
        queue.add(start);
        boolean reverse = false;
        while (!queue.isEmpty()) {
            LinkedList<TreeNode> nodes = queue.poll();
            LinkedList<TreeNode> nextLevel = new LinkedList<>();

            if (reverse){
                for (int i = nodes.size() - 1; i >= 0; i--) {
                    TreeNode node = nodes.get(i);
                    System.out.print(node.val + ",");
                }
            } else {
                for (int i = 0; i < nodes.size(); i++) {
                    TreeNode node = nodes.get(i);
                    System.out.print(node.val + ",");
                }
            }
            reverse = !reverse;

            for (TreeNode node : nodes){
                if (node.left != null)
                    nextLevel.add(node.left);
                if (node.right != null)
                    nextLevel.add(node.right);
            }

            if (!nextLevel.isEmpty()) {
                queue.add(nextLevel);
            }
        }
    }
}
