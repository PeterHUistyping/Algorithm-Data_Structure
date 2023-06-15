/*
 * @lc app=leetcode id=283 lang=cpp
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int i,j,temp;
        for(i=0;i<nums.size()-1;i++)
        {
            if(!nums[i]) //0
            {
                for(j=i+1;j<nums.size();j++)
                {
                    if(nums[j]!=0) break; 
                }
                if(j<nums.size())
                {
                    temp=nums[j];
                     nums[j]=nums[i];
                     nums[i]=temp;
                }                
                else break;
            }
            
        }
    }

};
// @lc code=end

