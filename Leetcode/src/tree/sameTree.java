package tree;
import lib.TreeNode;
import lib.TreeOperation;
import lib.TestUtil;

/*
 * 100. Given the roots of two binary trees p and q, 
 * write a function to check if they are the same or not.
 * Two binary trees are considered the same if they are structurally 
 * identical, and the nodes have the same value.
 */
public class sameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p != null && q == null || p == null && q != null) // beginning
            return false;
        else if (p != null && q != null) {
            if (p.val != q.val)
                return false;

            if (isSameTree(p.left, q.left) && isSameTree(p.right, q.right))
                return true;
        } else if (p == null && q == null)
            return true;

        return false;
    }
}

class IOtestingFor100 {
    public static void main(String[] arguments) {
        TestUtil.IO.printResult("Input Data");
        int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7 };
        TreeNode tree = new TreeNode();
        tree = tree.sortedArrayToBST(nums);
        tree.PrintTreeAsArray();
        TestUtil.IO.printResult();
        //TestUtil.IO.printResult();
        TreeOperation.show(tree);
        TestUtil.IO.printResult();
        
        TreeOperation.printTreeHorizontal(tree);
        TestUtil.IO.printResult();

        System.out.print(sameTree.isSameTree(tree, tree));
        TestUtil.IO.endofResult();
    }

}