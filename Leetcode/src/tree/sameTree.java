package tree;
import lib.BSTNode;
import lib.TestBST;
import lib.TestUtil;

/*
 * 100. Given the roots of two binary trees p and q, 
 * write a function to check if they are the same or not.
 * Two binary trees are considered the same if they are structurally 
 * identical, and the nodes have the same value.
 */
public class sameTree {
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
}

class IOtestingFor100 {
    public static void main(String[] arguments) {
        TestUtil.IO.printResult("Input Data");
        BSTNode tree = new BSTNode();
        tree = TestBST.getTree();
      
        TestUtil.IO.printResult();
        System.out.print(sameTree.isSameTree(tree, tree));
        TestUtil.IO.endofResult();
    }

}