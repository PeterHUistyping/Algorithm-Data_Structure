/*
 * @lc app=leetcode id=977 lang=cpp
 *
 * [977] Squares of a Sorted Array
 */

// @lc code=start
class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
     vector<int> ans;
     if(nums[0]>=0)
     for(int i=0;i<nums.size();i++)
     {
        ans.push_back( int(nums[i]*nums[i]));
     }   
    else if(nums.back()<=0)
     for(int i=nums.size()-1;i>=0;i--)
     {
       ans.push_back( int(nums[i]*nums[i]));
     } 
     else 
     {
         int q;  //last nega
         for(q=0;q<nums.size();q++)
        {
         if(nums[q]>=0) break; //q
        } 
           q--; int w=q+1; //first nopositive
        while(q>=0&&w<nums.size()) //common
        {
            if(nums[w]>=-nums[q])    
            ans.push_back( int(pow(nums[q],2))),q--;
            else  ans.push_back( int(nums[w]*nums[w])),w++;
        }
        while(q>=0||w<nums.size())  //left
        {
            if(q>=0)    
            ans.push_back( int(nums[q]*nums[q])),q--;
            else  ans.push_back( int(nums[w]*nums[w])),w++;
        }

     }
        return ans;
    }
};
// @lc code=end

