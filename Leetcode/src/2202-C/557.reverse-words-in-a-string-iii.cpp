#include "leetcode-definition.h"
/*
 * @lc app=leetcode id=557 lang=cpp
 *
 * [557] Reverse Words in a String III
 */

// @lc code=start
class Solution {
public:
    string reverseWords(string s) {
        int st=0;
        while(st<s.size())
        {
            int en;
            for( en=st+1;en<s.size();en++) //single st?
            {   
                if(s[en]==' ')break;
            }
            change(s,st,en-1);
            st=en+1;
        }
        return s;
    }
     void change(string & nums,int begin,int end )
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

