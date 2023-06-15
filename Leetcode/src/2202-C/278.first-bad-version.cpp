/*
 * @lc app=leetcode id=278 lang=cpp
 *
 * [278] First Bad Version
 */

// @lc code=start
// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        int lo=1,hi=n;int mid;
        while(lo<hi)
        {
            mid=lo+(hi-lo)/2;
            if(!isBadVersion(mid))
            lo=mid+1;
            else
            hi=mid;

        }
        return lo;
    }
};
// @lc code=end

