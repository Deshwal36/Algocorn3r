#include<bits/stdc++.h>
#include<list>
#include<iterator>
#include<map>
using namespace std;

int main(int argc, char ** argv)
{

    // #ifndef ONLINE_JUDGE
    // freopen("in.txt","r",stdin);
    // freopen("out.txt","w",stdout);
    // #endif

    map<char,int> M;
    
    string s="shivam deshwal";
    ///M['a']=2;
    ///cout<<M.end();
     for(int i=0;s[i];i++){
        
        // bool a= (M.find('a') != M.end());
        // cout<<a;
       if(M.find(s[i]) != M.end()){
           M[s[i]]++;
       }
       else{
           M.insert(make_pair(s[i],1));
       }
     }

     for(auto it:M){
         cout<<it.first<<"-"<<it.second<<"\n";
     }
    
    
 
  return 0;
}