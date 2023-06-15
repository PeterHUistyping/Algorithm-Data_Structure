/*
 * @lc app=leetcode id=189 lang=cpp
 *
 * [189] Rotate Array
 */

// @lc code=start
class Solution {
public:
    void rotate(vector<int>& nums, int k) {
         k=k%nums.size();
        if(k!=0)
        {
        change(nums,0,nums.size()-1);
        if(k-1)
        change(nums,0,k-1);
        if(nums.size()-k)
        change(nums,k,nums.size()-1);
        }
    }
    void change(vector<int>& nums,int begin,int end )
    {
        int i=begin,j=end;
        while(i<j)
        {
            int temp;
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;j--;
        }
    }
    
};
// @lc code=end

