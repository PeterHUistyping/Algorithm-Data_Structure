package tree;

import java.util.ArrayList;
import java.util.List;


import lib.TreeNode;
import lib.TreeOperation;

/*
 * 94. Given the root of a binary tree, 
 * return the inorder traversal of its nodes' values.
 */
class Solution {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list_R = new ArrayList<>();
        if (root == null) {
            return list;
        }
        list = inorderTraversal(root.left);
        list.add(root.val);
        list_R = inorderTraversal(root.right);// list+ = inorderTraversal(root.right);
        for (int i = 0; i < list_R.size(); i++) {
            list.add(list_R.get(i));
        }
        return list;
    }

}

class IOtestingFor94 {
    public static void main(String[] arguments) {
        System.out.println("---- The Below is the Result ----");
        int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7 };
        TreeNode tree = new TreeNode();
        tree = tree.sortedArrayToBST(nums);
        tree.PrintTreeAsArray();
        System.out.println("\n---- The Below is the Result ----");
        TreeOperation.show(tree);
        System.out.println("\n---- The Below is the Result ----");
        TreeOperation.printTreeHorizontal(tree);
        System.out.println("\n---- The Below is the Result ----");
        List<Integer> list = new ArrayList<>();
        list = Solution.inorderTraversal(tree);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n ------ End of the Result ------ \n");
    }

}