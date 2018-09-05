package com.hosle.tree;

import java.util.ArrayList;

public class Traverse {

    public ArrayList<Integer> preOrder(TreeNode root){
        ArrayList<Integer> result = new ArrayList<>();

        doPreOrder(root,result);

        return result;
    }

    private void doPreOrder(TreeNode root, ArrayList<Integer> result){
        if(null == root){
            return;
        }

        result.add(root.val);

        doPreOrder(root.left,result);
        doPreOrder(root.right,result);
    }

    public ArrayList<Integer> inOrder(TreeNode root){
        ArrayList<java.lang.Integer> result = new ArrayList<>();

        doInOrder(root,result);

        return result;
    }

    private void doInOrder(TreeNode root, ArrayList<Integer> result){
        if(null == root){
            return;
        }

        doInOrder(root.left,result);
        result.add(root.val);
        doInOrder(root.right,result);
    }
}
