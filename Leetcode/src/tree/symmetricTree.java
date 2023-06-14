package tree;
import lib.BSTNode;
import lib.TestBST;
import lib.TestUtil;

/* 
 * 101. Given the root of a binary tree,
 *  check whether it is a mirror of itself (i.e., symmetric around its center).
*/
public class symmetricTree {
    public static boolean isSymmetric(BSTNode root) {
        return Symmetric(root.left, root.right);
    }

    public static boolean Symmetric(BSTNode p, BSTNode q) {
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
        BSTNode tree = new BSTNode();
        tree = TestBST.getTree();
        TestUtil.IO.printResult();
        System.out.print(symmetricTree.isSymmetric(tree));
        TestUtil.IO.endofResult();
    }

}