#include <iostream>
#include <vector>
using namespace std;
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
int main()
{
    vector <int> a;
    int i=0,target;
    while(i!=100){
        cin>>i;   a.push_back(i);
    }
    cin>>target;
    cout<<target;
    Solution h;
     cout<< h.search(a, target  );
}