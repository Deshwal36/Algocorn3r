/*Codechef
  Contest : COLE2020
  Problem : CLLCM
*/
#include<bits/stdc++.h>

using namespace std;

int main(){
    ios:: sync_with_stdio(false);
    cin.tie(0);

    #ifndef ONLINE_JUDGE
    freopen("in.txt","r",stdin);
    freopen("out.txt","w",stdout);
    #endif

    int t,n;
    cin>>t;
    while(t--){
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];

        }
    int ans =1;
    for(int i=0;i<n;i++){
        ans*=a[i];
        }
    if(ans%2 !=0){
        cout<<"YES\n";
    }else{
        cout<<"NO\n";
     }
    }
 return 0;

}