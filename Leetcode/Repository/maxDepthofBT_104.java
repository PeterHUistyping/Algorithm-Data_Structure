import lib.TreeOperation;
import lib.TreeNode;

public class maxDepthofBT_104 {
    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}

class IOtestingFor104 {
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
        System.out.print(maxDepthofBT_104.maxDepth(tree));
        System.out.println("\n ------ End of the Result ------ \n");

    }

}