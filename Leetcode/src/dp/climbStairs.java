package dp;

import lib.TestUtil;

/*
 * 70. You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. 
 * In how many distinct ways can you climb to the top?
 * 
 * Input constraints:
 * 1 <= n <= 45
 * 
 * Strategy:
 * The final answer f(n)=f(n-1)+f(n-2), 
 * depends on the previous overlapping problems.
 * 
 */

class Solution {
    /*
     * Top-Down with memoization
     * n is the maximum input integer.
     * Time complexity: O(n), each res[i] will only be calculated once
     * i.e. for each res[i], it takes T(i)=i.
     * Space complexity: O(n), an int array for each n.
     */
    static int [] res = new int[50];
    public static int climbStairs(int n) {
        if (res[n]>0){
            return res[n];
        }
        else if(n<=0){
            return 0;
        }
        else if(n<=2){
            res[1]=1;
            res[2]=2;
            return res[n];
        }
        return res[n]=climbStairs(n-1)+climbStairs(n-2);
    }
    /*
     * Time complexity: O(2^n) Recursion formula: T(n)=2T(n-1)
     * Space complexity: O(n), each time evaluate one-side only.
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

public class climbStairs {
    public static void main(String[]args){       
        TestUtil.IO.printResult();
        /*
         * Testing the maximum of the input data.
         */
        System.out.println(Solution.climbStairs(45));
        int a =1836311903;
        System.out.println(a);
        System.out.println(Solution.climbStairs(1));
        System.out.println(Solution.climbStairs(2));
        System.out.println(Solution.climbStairs(3));
    }
}