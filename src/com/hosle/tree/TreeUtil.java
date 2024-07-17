package com.hosle.tree;

import java.util.ArrayList;

public class TreeUtil {

    public TreeNode createByArray(Integer[] array){
        if(null == array || array.length==0)
            return null;

        return build(array,1);
    }

    private TreeNode build(Integer[] array,int index){
        if (index > array.length || null == array[index-1]) {
            return null;
        }

        TreeNode root = new TreeNode(array[index - 1]);

        root.left = build(array, index * 2);

        root.right = build(array, index * 2 + 1);

        return root;
    }

    public static boolean compareListsIgnoringOrder(ArrayList list1, ArrayList list2) {

        if (list1 == null || list2 == null) return false;
        if (list1.size() != list2.size()) return false;

        for (Object o : list1) {
            list2.remove(o);
        }

        if (list2.size() != 0) return false;
        return true;
    }
}
