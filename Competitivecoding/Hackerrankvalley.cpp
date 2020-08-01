#include<bits/stdc++.h>

using namespace std;

int main(){

    
    int n;
    cin>>n;
    string str;
    cin>>str;
    //cout<<str<<"\n";

    int ans=0,sea=0;
    
    for(int i=0;i<n;i++){
       
        if(sea==0 && str[i]=='D'){
            ans+=1;
            
        }

        if(str[i]=='U'){
            sea+=1;
        }
        if(str[i]=='D'){
            sea-=1;
        }

         
        //cout<<"level: "<<sea<<"\n";
          
    }
    cout<<ans;
    return 0;
}