package com.hosle.tree;

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
}
