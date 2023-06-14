package tree;

import java.util.ArrayList;
import java.util.List;

import lib.BSTNode;
import lib.BSTVisualise;
import lib.TestBST;
import lib.TestUtil;

/*
 * 94. Given the root of a binary tree, 
 * return the inorder traversal of its nodes' values.
 */
class Solution {
    public static List<Integer> inorderTraversal(BSTNode root) {
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
        BSTNode tree = new BSTNode();
        tree = TestBST.getTree();
        TestUtil.IO.printResult();
        List<Integer> list = new ArrayList<>();
        list = Solution.inorderTraversal(tree);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        TestUtil.IO.endofResult();
    }

}