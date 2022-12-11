import lib.TreeNode;
import lib.TreeOperation;

public class Same_Tree_100 {
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
        System.out.print(Same_Tree_100.isSameTree(tree, tree));
        System.out.println("\n ------ End of the Result ------ \n");
    }

}