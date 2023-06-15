/*
 * @lc app=leetcode id=344 lang=cpp
 *
 * [344] Reverse String
 */

// @lc code=start
class Solution {
public:
    void reverseString(vector<char>& s) {
        int i=0,j=s.size()-1;
        while(i<j)
        {
            int temp;
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;j--;
        }
    }
    
};
// @lc code=end

