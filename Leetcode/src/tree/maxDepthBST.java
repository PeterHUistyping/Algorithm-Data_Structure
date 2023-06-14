package tree;
import lib.BSTNode;
import lib.BSTVisualise;
import lib.TestBST;
import lib.TestUtil;
/*
 * 104. Given the root of a binary tree, return its maximum depth.
 * A binary tree's maximum depth is the number of nodes along the 
 * longest path from the root node down to the farthest leaf node.
 */
public class maxDepthBST {
    public static int maxDepth(BSTNode root) {
        if (root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}

class IOtestingFor104 {
    public static void main(String[] arguments) {
       
        BSTNode tree = new BSTNode();
        tree = TestBST.getTree();
        TestUtil.IO.printResult();
        System.out.print(maxDepthBST.maxDepth(tree));
        TestUtil.IO.endofResult();

    }

}