package com.hosle.tree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Binary Tree Paths
 * Given the root of a binary tree, return all root-to-leaf paths in any order.
 *
 * Input: root = [1,2,3,null,5]
 * Output: ["1->2->5","1->3"]
 */
public class BTreePaths {

    public void solution(TreeNode root){

        ArrayList<ArrayList<TreeNode>> result = new ArrayList<>();

        traverse(root, result, new ArrayList<>());

        for (ArrayList<TreeNode> path : result){
            for (TreeNode node : path){
                System.out.print(node.val + ", ");
            }
            System.out.println();
        }
    }

    public void traverse(TreeNode root, ArrayList<ArrayList<TreeNode>> result, ArrayList<TreeNode> paths){
        if (root == null) {
            return;
        }

        paths.add(root);

        if (root.left == null && root.right == null) {
            result.add(new ArrayList<>(paths));
            paths.remove(root);
            return;
        }
        traverse(root.left, result, paths);
        traverse(root.right, result, paths);
        paths.remove(root);
    }
}
