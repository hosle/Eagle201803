package com.hosle.binarysearch;

import com.hosle.tree.TreeNode;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**
 * Given a binary search tree,
 * write a function kthSmallest to find the kth smallest element in it.
 *
 * Example 1:
 *
 * Input: root = [3,1,4,null,2], k = 1
 *    3
 *   / \
 *  1   4
 *   \
 *    2
 * Output: 1
 *
 * Example 2:
 *
 * Input: root = [5,3,6,2,4,null,null,1], k = 3
 *        5
 *       / \
 *      3   6
 *     / \
 *    2   4
 *   /
 *  1
 * Output: 3
 */

public class KthSmallestInBST {

    private int kthSmallestValue = Integer.MIN_VALUE;

    public int solution(TreeNode root, int k){

        traverseTree(root,k, 0);

        return kthSmallestValue;
    }

    private int traverseTree(TreeNode root,int k, int count){
        if (null == root) {
            return 0;
        }

        int smallerCount = traverseTree(root.left, k, count);

        if (smallerCount + 1 + count == k) {
            kthSmallestValue = root.val;
            return smallerCount + 1;
        }

        int largerCount = traverseTree(root.right, k, count + smallerCount + 1);

        return smallerCount + largerCount + 1;
    }
}
