package lib;

public class BSTNode {
    public int val;
    public BSTNode left;
    public BSTNode right;

    public BSTNode() {}

    public BSTNode(int val) {
        this.val = val;
    }

    public BSTNode(int val, BSTNode left, BSTNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void PrintTreeAsArray(){}
}
