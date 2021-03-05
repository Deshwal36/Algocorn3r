#include<iostream>
#include<vector>
#include<algorithm>
//#include<bits/stdc++.h>
using namespace std;

// struct greater{
//     bool operator()(const long &a, const long &b) const{
//         return a<b;
//     }
// };
int main(){
    ios:: sync_with_stdio(false);
    cin.tie(0);

    vector<int> v={1,2,3,4,5,6};
    
    make_heap(v.begin(),v.end()); //max heap : default
    
    cout<<"max heap :\n";
    for(int i=0;i<v.size();i++)
    cout<<v[i]<<"-";
    cout<<"\n";

    pop_heap(v.begin(),v.end()); //max element to last position
    v.pop_back();                   //remove last element
    
    for(int i=0;i<v.size();i++)
    cout<<v[i]<<"-";


    return 0;
}