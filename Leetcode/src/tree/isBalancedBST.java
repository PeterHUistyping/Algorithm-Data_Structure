package tree;
import lib.TreeOperation;
import lib.TreeNode;

/*
 * 110. Given a binary tree, determine if it is height-balanced.
 */

public class isBalancedBST {
    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static boolean isBalanced(TreeNode root) {
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
        System.out.print(isBalancedBST.isBalanced(tree));
        System.out.println("\n ------ End of the Result ------ \n");

    }

}