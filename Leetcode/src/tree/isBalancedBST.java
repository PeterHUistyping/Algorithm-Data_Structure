package tree;
import lib.BSTNode;
import lib.TestBST;
import lib.TestUtil;

/*
 * 110. Given a binary tree, determine if it is height-balanced.
 */

public class isBalancedBST {
    public static int maxDepth(BSTNode root) {
        if (root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static boolean isBalanced(BSTNode root) {
        if (root == null)
            return true;
        if (Math.abs(maxDepth(root.left) - maxDepth(root.right)) > 1)
            return false;
        if (isBalanced(root.left) && isBalanced(root.right))
            return true;
        return false;
    }
}

class IOtestingFor110 {
    public static void main(String[] arguments) {
        BSTNode tree = new BSTNode();
        tree = TestBST.getTree();
        TestUtil.IO.printResult();
        System.out.print(isBalancedBST.isBalanced(tree));
        TestUtil.IO.endofResult();

    }

}