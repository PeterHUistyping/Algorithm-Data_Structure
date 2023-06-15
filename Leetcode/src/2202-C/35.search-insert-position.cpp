/*
 * @lc app=leetcode id=35 lang=cpp
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
       int lo=0,hi=nums.size(),mid;
       while(lo<hi)
       {
           mid=lo+(hi-lo)/2;
           if(nums[mid]<target) lo=mid+1;
           else hi=mid;
       } return lo;
    }
};
// @lc code=end

