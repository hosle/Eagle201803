package com.hosle.tree;

import java.util.LinkedList;
import java.util.Map;

public class StepByStepDirectionsFromABinaryTreeNodeToAnother {
    public String getDirections(TreeNode root, int startValue, int destValue) {
        // Pair<Integer, String> step = new Pair<>();
        LinkedList<Map<Integer, String>> queue = new LinkedList<>();

        PreOrderTraverse(root, true, startValue, queue);

        for (Map<Integer, String> step : queue){
            System.out.print(step.entrySet() + ", ");
        }
        return "L";
    }

    public boolean PreOrderTraverse(TreeNode root, boolean isLeft, int target, LinkedList<Map<Integer,String>> queue){
        if (root == null){
            return false;
        }

        queue.add(Map.of(
                root.val, isLeft?"L":"R"
        ));

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
