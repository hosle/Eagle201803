package com.hosle.tree;


/**
 * Trim all leaves of a tree.
 * Input Tree
 *        1
 *     /    \
 *    2      3
 *   / \   /  \
 * 4   5  6    7
 *
 * Output
 *      1
 *    /  \
 *   2    3
 */
public class TrimAllLeaves {
    public void solution(TreeNode root){
        trimTree(root);
    }

    final int ERR_NULL = -1111;
    final int ERR_LEAF = -1112;
    private int trimTree(TreeNode node){
        if (node == null)
            return ERR_NULL;
        int leftError = trimTree(node.left);
        int rightError = trimTree(node.right);

        if (leftError == ERR_NULL && rightError == ERR_NULL){
            return ERR_LEAF;
        }

        if (leftError == ERR_LEAF){
            node.left = null;
        }

        if (rightError == ERR_LEAF) {
            node.right = null;
        }

        return 0;
    }

}
