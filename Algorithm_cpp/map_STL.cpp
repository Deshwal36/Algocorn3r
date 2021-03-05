//SYNTAX std::map<T1,T2> obj; T1 is type of key || T2 is type of value 

// 1.std::map is an associative container that stores elements in <key, value> pair  
//   where key should be unique, otherwise it overrides the previous value.
// 2.Implented using self-balancing BST (AVL/R-B Tree).
// 3.Stores value in sorted order on the basis of key( A/D ).

#include<iostream>
#include<map>
#include<vector>
#include<string>
#include<functional>
using namespace std;

int main(){
    
    map<string,int,greater<>> Map1;
    Map1["shivam"]=24;
    Map1["utkarsh"]=22;
    Map1.insert(make_pair("abhay",28));
    
    for(auto i:Map1)
    cout<<i.first<<" "<<i.second<<endl;


    map<string,vector<int>> Map2;
    Map2["hi"].push_back(16);
    Map2["hi"].push_back(22);
    Map2["bye"].push_back(15);
    for(auto i:Map2){
    cout<<i.first<<":";
    for(auto j:i.second)
    cout<<j<<" ";
    cout<<endl;
    }

}