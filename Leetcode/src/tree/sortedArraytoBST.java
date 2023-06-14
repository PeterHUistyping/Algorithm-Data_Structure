package tree;

import lib.TreeNode;

/*
 * 108. Given an integer array nums where the elements are sorted 
 * in ascending order, convert it to a height-balanced binary search tree.
 */
class Solution {
    public TreeNode create(int[] nums, int index, int length) {
        TreeNode head;
        int lengthl = length / 2;
        int lengthr = length - (length / 2 + 1);
        if (length == 1) {
            head = new TreeNode(nums[index], null, null);
        } else if (length == 2) {
            head = new TreeNode(nums[index], create(nums, index - (lengthl + 1) / 2, lengthl), null);
        } else
            head = new TreeNode(nums[index], create(nums, index - (lengthl + 1) / 2, lengthl),
                    create(nums, index + lengthr / 2 + 1, lengthr));
        return head;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode head = create(nums, nums.length / 2, nums.length);
        return head;
    }

}

class IOtestingFor108 {
    public static void main(String[] arguments) {
        System.out.println("---- The Below is the Result ----");
        int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7 };
        Solution temps = new Solution();
        TreeNode tree = temps.sortedArrayToBST(nums);
        tree.PrintTreeAsArray();
        System.out.println("\n ------ End of the Result ------ ");
    }
}