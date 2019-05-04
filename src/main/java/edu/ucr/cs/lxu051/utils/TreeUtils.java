package edu.ucr.cs.lxu051.utils;

import edu.ucr.cs.lxu051.classes.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeUtils {

    public static TreeNode buildTree(Integer[] array) {
        TreeNode root = new TreeNode(array[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        for (int i = 1; i < array.length; i++) {
            TreeNode curr = queue.poll();
            if (array[i] != null) {
                curr.left = new TreeNode(array[i]);
                queue.offer(curr.left);
            }
            if (++i < array.length && array[i] != null) {
                curr.right = new TreeNode(array[i]);
                queue.offer(curr.right);
            }
        }
        return root;
    }
}
