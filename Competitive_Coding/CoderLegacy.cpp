#include<bits/stdc++.h>

using namespace std;

bool isEven(int *a,int n){
    for(int i=0;i<n;i++){
        if(a[i]%2==0)
        return true;
    }
    return false;
}


int main(){
    int t,n,*a;
    cin>>t;
    while(t){
    cin>>n;
    a = new int[n+1];
    for(int i=0;i<n;i++){
        cin>>a[i];

    }
    if(isEven(a,n)){
        cout<<"NO";
        
    }
    else{
        
        cout<<"YES";
        

    }
    t--;
 }
 return 0;

}