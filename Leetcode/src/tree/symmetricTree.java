package tree;
import lib.TreeOperation;
import lib.TreeNode;

/* 
 * 101. Given the root of a binary tree,
 *  check whether it is a mirror of itself (i.e., symmetric around its center).
*/
public class symmetricTree {
    public static boolean isSymmetric(TreeNode root) {
        return Symmetric(root.left, root.right);
    }

    public static boolean Symmetric(TreeNode p, TreeNode q) {
        if (p != null && q == null || p == null && q != null) // beginning
            return false;
        else if (p != null && q != null) {
            if (p.val != q.val)
                return false;

            if (Symmetric(p.left, q.right) && Symmetric(p.right, q.left))
                return true;
        } else if (p == null && q == null)
            return true;

        return false;
    }
}

class IOtestingFor101 {
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
        System.out.print(symmetricTree.isSymmetric(tree));
        System.out.println("\n ------ End of the Result ------ \n");

    }

}