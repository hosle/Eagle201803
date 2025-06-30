package com.hosle.tree;

import javafx.util.Pair;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;

public class StepByStepDirectionsFromABinaryTreeNodeToAnother {
    public String solution(TreeNode root, int startValue, int destValue) {

        State result2 = traverse(root, startValue, destValue);

        System.out.println("result2 : " + result2.toStart + "," + result2.toDest);


        return "L";
    }

    public State traverse(TreeNode root, int start, int dest) {
        if (root == null) {
            return new State();
        }

        State leftResult = traverse(root.left, start, dest);
        State rightResult = traverse(root.right, start, dest);

        if (leftResult.done){
            return leftResult;
        }
        if (rightResult.done){
            return rightResult;
        }

        State newResult = new State();

        if (root.val == start) {
            newResult.foundStart = true;
        } else if (root.val == dest) {
            newResult.foundDest = true;
        }

        if (leftResult.foundStart) {
            newResult.toStart = "U" + leftResult.toStart;
            newResult.foundStart = true;
        }
        if (rightResult.foundStart) {
            newResult.toStart = "U" + rightResult.toStart;
            newResult.foundStart = true;
        }

        if (leftResult.foundDest) {
            newResult.toDest = "L" + leftResult.toDest;
            newResult.foundDest = true;
        }
        if (rightResult.foundDest) {
            newResult.toDest = "R" + rightResult.toDest;
            newResult.foundDest = true;
        }

        // merge when found common root
        if (root.val == dest && leftResult.foundStart) {
            newResult.toStart = "U" + leftResult.toStart;
            newResult.toDest = "";
            newResult.done = true;
            System.out.println("merge at val = " + root.val + ", newResult = " + newResult.toStart + ", " + newResult.toDest);
        }

        if (root.val == start && leftResult.foundDest){
            newResult.toStart = "";
            newResult.toDest = "L" + leftResult.toDest;
            newResult.done = true;
            System.out.println("merge at val = " + root.val + ", newResult = " + newResult.toStart + ", " + newResult.toDest);
        }

        if (root.val == dest && rightResult.foundStart){
            newResult.toStart = "U" + rightResult.toStart;
            newResult.toDest = "";
            newResult.done = true;
            System.out.println("merge at val = " + root.val + ", newResult = " + newResult.toStart + ", " + newResult.toDest);
        }

        if (root.val == start && rightResult.foundDest){
            newResult.toStart = "";
            newResult.toDest = "R" + rightResult.toDest;
            newResult.done = true;
            System.out.println("merge at val = " + root.val + ", newResult = " + newResult.toStart + ", " + newResult.toDest);
        }

        if (leftResult.foundStart && rightResult.foundDest) {
            newResult.toStart = "U" + leftResult.toStart;
            newResult.toDest = "R" + rightResult.toDest;
            System.out.println("merge at val = " + root.val + ", newResult = " + newResult.toStart + ", " + newResult.toDest);
            newResult.done = true;
        }

        if (rightResult.foundStart && leftResult.foundDest){
            newResult.toStart = "U" + rightResult.toStart;
            newResult.toDest = "L" + leftResult.toDest;
            System.out.println("merge at val = " + root.val + ", newResult = " + newResult.toStart + ", " + newResult.toDest);
            newResult.done = true;
        }

        return newResult;
    }

    static class State {
        String toStart = "";
        String toDest = "";
        Boolean foundStart = false;
        Boolean foundDest = false;
        Boolean done = false;
    }
}
