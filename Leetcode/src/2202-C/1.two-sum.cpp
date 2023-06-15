/*
 * @lc app=leetcode id=1 lang=cpp
 *
 * [1] Two Sum
 */

// @lc code=start
 
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
           vector <int> v;
     for(int i=0;i<nums.size()-1;i++)
        for(int j=i+1;j<nums.size();j++)
         if (nums[i]+nums[j]==target)
         {
              v.push_back(i),v.push_back(j);
        }
                    return v;
    }
};
// @lc code=end

