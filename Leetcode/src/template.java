import lib.TestUtil;

/*
 * Leetcode
 * 70. 
 * 
 * Input constraints:
 * 
 * 
 * Strategy:
 *  
 * 
 */

public class template {
    /*
     * n is the 
     * Time complexity: O(n) 
     * Recursion formula: T(n)=
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

    public static void main(String[]args){
        TestUtil.IO.printResult();
         /*
         * Testing the maximum of the input data.
         */
        int res45=climbStairs_Rec(45);
        System.out.println(res45);
        assert(res45==1836311903);
    }
}