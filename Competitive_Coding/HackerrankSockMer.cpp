/*Input Format

The first line contains an integer n, the number of socks represented in ar[].
The second line contains n space-separated integers describing the colors ar[i] of the socks in the pile.

Output Format

Return the total number of matching pairs of socks that John can sell.*/

#include<bits/stdc++.h>

using namespace std;

int main(){
    int n;cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];

    }

    sort(a,a+n);

    int ans=0;
    for(int i=0;i<n;i++){
        if(a[i]==a[i+1]){
            ans+=1;
            i++;
        }
       
        
    }
    cout<<ans;
    return 0;
}