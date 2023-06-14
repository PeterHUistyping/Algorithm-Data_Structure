package lib;

public class BST extends BSTNode {

    public static int getTreeDepth(BSTNode root) {
        if (root == null) {
            return 0;
        }
        return root == null ? 0 : (1 + Math.max(getTreeDepth(root.left), getTreeDepth(root.right)));
    }

   private boolean begin = true;// complement

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

    public static BSTNode sortedArrayToBST(int[] nums) {
        return sortedATBST(nums, 0, nums.length - 1);
    }

    public static BSTNode sortedATBST(int[] nums, int l, int h) {
        BSTNode ans = null;
        if (l <= h) {
            int m = (l + h) / 2;
            BSTNode root = new BSTNode(nums[m]); 
            root.left = sortedATBST(nums, l, m - 1);
            root.right = sortedATBST(nums, m + 1, h);
            ans = root;
        }
        return ans;
    }

    public static boolean isSameTree(BSTNode p, BSTNode q) {
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

    public static boolean isBalanced(BSTNode root) {
        if (root == null)
            return true;
        if (Math.abs(getTreeDepth(root.left) - getTreeDepth(root.right)) > 1)
            return false;
        if (isBalanced(root.left) && isBalanced(root.right))
            return true;
        return false;
    }

}
