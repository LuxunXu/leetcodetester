package edu.ucr.cs.lxu051;

import edu.ucr.cs.lxu051.classes.TreeNode;
import edu.ucr.cs.lxu051.utils.TreeUtils;

public class GeneralTest {

    public static void main(String[] args) {
        Integer[] array = {3, 9, 20, null, null, 15, 7};
        TreeNode test = TreeUtils.buildTree(array);
    }
}
