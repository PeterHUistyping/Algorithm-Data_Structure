package dp;

import lib.TestUtil;

/*
 * Leetcode
 * 746. Min Cost Climbing Stairs
 * You are given an integer array cost 
 * where cost[i] is the cost of ith step on a staircase. 
 * Once you pay the cost, you can either climb one or two steps.
 *
 * You can either start from the step with index 0, or the step with index 1.
 * 
 * Return the minimum cost to reach the top of the floor.
 *
 * Input constraints:
 * 2 <= cost.length <= 1000
 * 0 <= cost[i] <= 999
 * 
 * Strategy:
 * The final answer f(n)=min(f(n-1)+cost[n-1],f(n-2)+cost[n-2])
 * depends on the previous overlapping problems.
 * Starting from len(cost)=0, to 2.
 * 
 */

public class minCostClimbStairs {
    /*
     * n is the size of the input cost array, 2-1000.
     * Same as climbStairs.java
     * Time complexity: O(n) 
     * Space complexity: O(n)  
     */

     /* 
      * Precondition: Input array should have length>=2
      */
    static int []minCost = new int [1005];
    public static int minCost(int[] cost,int index){
        if (minCost[index]>0){
            return minCost[index];
        }
        if(index<2){
            return 0; 
        }
        return minCost[index]=Math.min(minCost(cost, index-1)+cost[index-1],
                                       minCost(cost, index-2)+cost[index-2]);
    }

     /* 
      * Precondition: Input array should not be empty
      */
    public static int minCostClimbingStairs(int[] cost) {
        // reset to empty data structure
        minCost=new int [1005];
        if(cost.length<2){
            return cost[0];
        }
        return minCost(cost, cost.length);
    }

    public static void main(String[]args){
        TestUtil.IO.printResult();
         /*
         * Testing input data.
         */
        int []input2={1,100,1,1,1,100,1,1,100,1};
        int cost=minCostClimbingStairs(input2);
        System.out.println(cost);
        assert(cost==6);

        /*
         * Testing input data where greedy methods will fail.
         * Greedy choice will take 1 instead of 200
         * Missing taking 100 as the first one and taking two steps afterwards.
         */
        int []input3={1,100,200};
        cost=minCostClimbingStairs(input3);
        System.out.println(cost);
        assert(cost==100);

        /*
         * Testing the maximum of input data 999,000 in total.
         * int is enough
         */
        
    }
}