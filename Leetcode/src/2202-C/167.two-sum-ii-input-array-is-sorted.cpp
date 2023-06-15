#include "leetcode-definition.h"
/*
 * @lc app=leetcode id=167 lang=cpp
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
      int i=0,j=numbers.size()-1;
      vector<int> a;
     while(i<j)
     {
        if(numbers[i]+numbers[j]==target) break;

        else if(numbers[i]+numbers[j]>target)
        j--;
        else i++;

     }
      a.push_back(i+1);
        a.push_back(j+1);
       return a;
    }
};
// @lc code=end

