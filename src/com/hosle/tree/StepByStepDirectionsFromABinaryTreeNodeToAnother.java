package com.hosle.tree;

import javafx.util.Pair;

import java.util.LinkedList;

public class xx {
    public String getDirections(TreeNode root, int startValue, int destValue) {
        // Pair<Integer, String> step = new Pair<>();
        LinkedList<Pair<Integer, String>> queue = new LinkedList<>();

        PreOrderTraverse(root, true, startValue, queue);

        for (Pair<Integer, String> step : queue){
            System.out.print(step.getKey() + ", ");
        }
        return "L";
    }

    public boolean PreOrderTraverse(TreeNode root, boolean isLeft, int target, LinkedList<Pair<Integer,String>> queue){
        if (root == null){
            return false;
        }

        queue.add(new Pair<Integer,String>(root.val, isLeft?"L":"R"));

        if (root.val == target){
            return true;
        }
        boolean foundinLeft = PreOrderTraverse(root.left, true, target, queue);
        if (!foundinLeft && !queue.isEmpty()){
            queue.removeLast();
        }
        boolean foundinRight = PreOrderTraverse(root.right, false, target, queue);
        if (!foundinRight && !queue.isEmpty()){
            queue.removeLast();
        }
        return foundinLeft||foundinRight;

    }
}
