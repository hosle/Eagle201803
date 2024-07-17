package com.hosle.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/delete-nodes-and-return-forest/description/
 *
 * Given the root of a binary tree, each node in the tree has a distinct value.
 *
 * After deleting all nodes with a value in to_delete, we are left with a forest (a disjoint union of trees).
 *
 * Return the roots of the trees in the remaining forest. You may return the result in any order.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root = [1,2,3,4,5,6,7], to_delete = [3,5]
 * Output: [[1,2,null,4],[6],[7]]
 * Example 2:
 *
 * Input: root = [1,2,4,null,3], to_delete = [3]
 * Output: [[1,2,4]]
 *
 *
 * Constraints:
 *
 * The number of nodes in the given tree is at most 1000.
 * Each node has a distinct value between 1 and 1000.
 * to_delete.length <= 1000
 * to_delete contains distinct values between 1 and 1000.
 *
 */
public class DeleteNodesAndReturnForest {
    public List<TreeNode> solution(TreeNode root, int[] to_delete) {
        ArrayList<TreeNode> result = new ArrayList<>();

        TreeNode newRoot = deleteNodes(root, result, to_delete);
        if (newRoot != null){
            result.add(newRoot);
        }
        return result;
    }

    public TreeNode deleteNodes(TreeNode root, ArrayList<TreeNode> result, int[] to_delete){
        if (root == null){
            return null;
        }

        TreeNode leftTree = deleteNodes(root.left, result, to_delete);
        TreeNode rightTree = deleteNodes(root.right, result, to_delete);

        root.left = leftTree;
        root.right = rightTree;

        if (isTarget(to_delete, root)){
            if (root.left != null){
                result.add(root.left);
            }
            if (root.right != null){
                result.add(root.right);
            }
            return null;
        } else {

            return root;
        }
    }

    public boolean isTarget(int[] to_delete, TreeNode node){
        if (node == null)
            return false;

        for (int x : to_delete){
            if (x == node.val){
                return true;
            }
        }
        return false;
    }
}
