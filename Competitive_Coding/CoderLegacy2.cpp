/*Codechef
  Contest : COLE2020
  Problem : CLPNT
*/
#include<bits/stdc++.h>

using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);

    #ifndef ONLINE_JUDGE
    freopen("in.txt","r",stdin);
    freopen("out.txt","w",stdout);
    #endif

    int t;
    cin>>t;
    //cout<<"t:"<<t<<"\n";
    while(t--){
        int n;
        cin>>n;
        //cout<<"n:"<<n<<"\n";
        int a[n];
        for(int i=0;i<n;i++){
            //scanf("%d",a[i]);
            cin>>a[i];
        }
        //cout<<"\n";
        
        int q;
        cin>>q;
        //cout<<"q:"<<q<<"\n";
        while(q--){
            int x,y,cross=0;
            cin>>x>>y;
            auto it=lower_bound(a,a+n,x+y);
            int j=it-a;
            if(j==n)
            cout<<n<<"\n";
            else{
                if(a[j] == x+y)
                cout<<"-1\n";
                else
                cout<<j<<"\n";
            }
            //cout<<sum<<"\n";
            //cin>>x>>y;           
        }

    }
    return 0;
}