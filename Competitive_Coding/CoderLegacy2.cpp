/*Codechef
  Contest : COLE2020
  Problem : CLPNT
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

    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int a[n];
        for(int i=0;i<n;i++){
            cin>>a[i];
        }
        cout<<"a[]";
        for(int i=0;i<n;i++){
            
            cout<<a[i];
        }
        cout<<"\n";
        int q;
        cin>>q;
        while(q--){
            int x,y,cross=0;
            cin>>x>>y;
            cout<<"x:"<<x<<"y:"<<y<<"\n";
            cout<<"cross:"<<cross<<"\n";
            for(int i=0;i<n;i++){
                int sign=((x+y)-a[i]);
                cout<<"sign:"<<sign<<"\n";
                if(sign==0){
                    cross=-1;
                    break;
                }
                if(sign>0)
                    cross+=1;
                
            }
            cout<<"cross:"<<cross<<"\n";
            cout<<"-------------\n";
        }

    }
    return 0;
}