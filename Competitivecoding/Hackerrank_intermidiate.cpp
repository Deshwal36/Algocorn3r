#include<bits/stdc++.h>

using namespace std;


int sortedSum(vector<int> v){
    const unsigned int M = 1000000007; 
    int sum=0;
    vector<int> :: iterator it1;

    for(it1=v.begin() ; it1!=v.end() ; it1++){
        sort(v.begin(),it1+1);
        cout<<"size:"<<it1-v.begin()<<"\n"; 
        int fun=0;
        for(int i=0; i<=(it1-v.begin()) ;i++){
            cout<<"v["<<i<<"]"<<v.at(i)<<"\n";
            fun+=((i+1)*(v.at(i)) )% M;
            
        }
        sum+=fun;
        //cout<<"fun:"<<fun<<"\n";
    }

    return sum;

}

int main(){

    
    #ifndef ONLINE_JUDGE
    freopen("in.txt","r",stdin);
    freopen("out.txt","w",stdout);
    #endif
    
    int t,n;
    cin>>t;
    vector<int> v;
    while(t--){
        cin>>n;
        v.push_back(n);
    }
    vector<int> :: iterator it;
    for(it=v.begin() ; it<v.end(); it++){
        cout<<*it;
    }
    cout<<"\n";
    int ans;
    ans=sortedSum(v);
    cout<<ans;

    return 0;

}