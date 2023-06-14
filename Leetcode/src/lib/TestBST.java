package lib;

public class TestBST {
    private static int[] nums={ 0, 1, 2, 3, 4, 5, 6, 7 };
    private static BSTNode tree = new BSTNode();
    public TestBST(int[] nums){
        TestBST.nums=nums;
    } 
    public static BSTNode getTree() {
        tree = BST.sortedArrayToBST(nums);
        TestUtil.IO.printResult("Test BST tree");
        BSTVisualise.show(tree);
        BSTVisualise.printTreeHorizontal(tree);
        return tree;
    }
}
