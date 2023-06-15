/*
 * @lc app=leetcode id=704 lang=cpp
 *
 * [704] Binary Search
 */

// @lc code=start
class Solution {
public:
    int search(vector<int>& nums, int target) {
          int len=nums.size();
        int lo=0,hi=len ,mid;   //error len-1
        while(lo<hi)
        {
            mid=lo+(hi-lo)/2;
             if(nums[mid]==target) return mid;
            else if(nums[mid]<target)
            lo=mid+1;
            else hi=mid;
        }

     return -1;  
    }
};
// @lc code=end

