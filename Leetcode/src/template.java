import lib.TestUtil;

/*
 * Leetcode
 * 70. You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. 
 * In how many distinct ways can you climb to the top?
 * 
 * Input constraints:
 * 1 <= n <= 45
 * 
 * Strategy:
 * The final answer f(n)=f(n-1)+f(n-2), depends on the previous overlapping problems.
 * 
 */

class Solution {
    /*
     * Time complexity: O(2^n) Recursion formula: T(n)=2T(n-1)
     * Space complexity: O(n)
     */
    public static int climbStairs_Rec(int n) {
        if (n==1){
            return 1;
        }
        else if(n==2){
            return 2;
        }
        else if(n<=0){
            return 0;
        }
        return climbStairs_Rec(n-1)+climbStairs_Rec(n-2);
    }
}

public class template {
    public static void main(String[]args){
        TestUtil.IO.printResult();
         /*
         * Testing the maximum of the input data.
         */
        System.out.println(Solution.climbStairs_Rec(45));
    }
}