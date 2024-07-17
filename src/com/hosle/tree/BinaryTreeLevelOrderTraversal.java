package com.hosle.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Binary Tree Level Order Traversal
 *
 * Given the root of a binary tree,
 * return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
 *
 *       3
 *     /   \
 *    9    20
 *        /  \
 *      15    7
 * Input: root = [3,9,20,null,null,15,7]
 * Output: [[3],[9,20],[15,7]]
 */
public class BinaryTreeLevelOrderTraversal {

    public void solution(TreeNode root){
        LinkedList<TreeNode> outList = new LinkedList<>();

        outList.add(root);

        while(outList.size()>0){
            TreeNode current = outList.poll();
            if (current!=null) {
                System.out.print(current.val + ", ");
                outList.add(current.left);
                outList.add(current.right);
            }
        }
    }

    public List<Integer> solution2(TreeNode root){
        LinkedList<TreeNode> outList = new LinkedList<>();
        outList.add(root);
        LinkedList<Integer> result = new LinkedList<>();

        while(!outList.isEmpty()){
            TreeNode current = outList.poll();
            if (current!=null) {
                System.out.print(current.val + ", ");
                result.add(current.val);
                outList.add(current.left);
                outList.add(current.right);
            } else {
                result.add(null);
            }
        }
        while(result.getLast() == null){
            result.removeLast();
        }
        System.out.println();
        return result;
    }
}
