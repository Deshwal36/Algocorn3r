// 1395. Count Number of Teams
//
// There are n soldiers standing in a line. Each soldier is assigned a unique rating value.
//
// You have to form a team of 3 soldiers amongst them under the following rules:
//
// Choose 3 soldiers with index (i, j, k) with rating (rating[i], rating[j], rating[k]).
// A team is valid if:  (rating[i] < rating[j] < rating[k]) or (rating[i] > rating[j] > rating[k]) where (0 <= i < j < k < n).
// Return the number of teams you can form given the conditions. (soldiers can be part of multiple teams).

// Input: rating = [2,5,3,4,1]
// Output: 3
// Explanation: We can form three teams given the conditions. (2,3,4), (5,4,1), (5,3,1).
#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int numTeams(vector<int>& rating) {

    int ans=0;
    for(int i=0;i<rating.size();++i){
      for(int j=i;j<rating.size();++j){
        for(int k=j;k<rating.size();++k){
          if(rating[i]<rating[j] && rating[j]<rating[k] || rating[i]>rating[j] && rating[j]>rating[k]){
            ++ans;
          }
        }
      }
    }
    return ans;
    }
};

int main(int argc , char * argv[]) {
    ios::sync_with_stdio(0);
    cin.tie(0);
    //vector<int> rating=*argv;
    Solution s;

    cout<<s.numTeams(argv)<<"\n";

  return 0;
}
