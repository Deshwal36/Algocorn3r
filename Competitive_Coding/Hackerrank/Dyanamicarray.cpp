#include<bits/stdc++.h>

using namespace std;

int main()
{

    // #ifndef ONLINE_JUDGE
    // freopen("in.txt","r",stdin);
    // freopen("out.txt","w",stdout);
    // #endif

    int n; cin >> n;
    int q; cin >> q;
    int** a=new int*[n];
    for(int i=0;i<n;i++){
        int k;
        cin>>k;

        a[i] = new int[k];
        for(int j=0;j<k;j++){
            cin>>a[i][j];
        }
    }

     while(q--){
        int index;cin>>index;
        int pos;cin>>pos;
        cout<<a[index][pos]<<"\n";
    } 
  return 0;
}