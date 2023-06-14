package lib;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    boolean begin = true;// complement

    public void PrintTreeAsArray() { // Inorder-Traversal
        if (left != null)
            left.PrintTreeAsArray();
        if (begin) {
            System.out.print(val + " ");
            begin = false;
        } else
            System.out.print(" " + val + " ");
        if (right != null)
            right.PrintTreeAsArray();
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedATBST(nums, 0, nums.length - 1);
    }

    public TreeNode sortedATBST(int[] nums, int l, int h) {
        TreeNode ans = null;
        if (l <= h) {
            int m = (l + h) / 2;
            TreeNode root = new TreeNode(nums[m]);
            root.left = sortedATBST(nums, l, m - 1);
            root.right = sortedATBST(nums, m + 1, h);
            ans = root;
        }
        return ans;
    }

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
