package com.hosle.tree;

import java.util.ArrayList;

public class Traverse {

    public ArrayList<Integer> preOrder(TreeNode root){
        ArrayList<Integer> result = new ArrayList<>();

        doPreOrder(root,result);
        System.out.println();

        return result;
    }

    private void doPreOrder(TreeNode root, ArrayList<Integer> result){
        if(null == root){
            return;
        }

        result.add(root.val);
        System.out.print(root.val + " ");

        doPreOrder(root.left,result);
        doPreOrder(root.right,result);
    }

    public ArrayList<Integer> inOrder(TreeNode root){
        ArrayList<java.lang.Integer> result = new ArrayList<>();

        doInOrder(root,result);
        System.out.println();

        return result;
    }

    private void doInOrder(TreeNode root, ArrayList<Integer> result){
        if(null == root){
            return;
        }

        doInOrder(root.left,result);
        result.add(root.val);
        System.out.print(root.val + " ");
        doInOrder(root.right,result);
    }

    public ArrayList<Integer> postOrder(TreeNode root){
        ArrayList<Integer> result = new ArrayList<>();

        doPostOrder(root, result);
        System.out.println();
        return result;
    }

    private void doPostOrder(TreeNode root, ArrayList<Integer> result){
        if (null == root){
            return;
        }

        doPostOrder(root.left, result);
        doPostOrder(root.right, result);
        result.add(root.val);
        System.out.print(root.val + " ");
    }
}
