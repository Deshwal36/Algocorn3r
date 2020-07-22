#include<iostream>
#include<algorithm>
#include<vector>
#include<iterator>

using namespace std;

int main(){
    vector<int> v={2,5,6,10,99,7,67,1};
    vector<int>::iterator it=v.begin();
    advance(it,4);
    sort(v.begin(),it); 

    
    for(it=v.begin(); it!=v.end(); it++)
    cout<<*it<<"-";

    cout<<"\n";

    partial_sort(v.begin(),v.begin()+3,v.end());
     for(it=v.begin(); it!=v.end(); it++)
    cout<<*it<<"-";

    cout<<"\n";

    int n[]={3,5,10,7,1,23,16};
    nth_element(n,n+2,n+7);
    for(int i=0;i<7;i++)
    cout<<n[i]<<"-";

    
    return 0;
}