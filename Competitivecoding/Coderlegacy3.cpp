/*Codechef
  Contest : COLE2020
  Problem : CLBRKT
*/

#include<bits/stdc++.h>

using namespace std;

int main(){

    ios::sync_with_stdio(false);
    cin.tie(0);
    
     #ifndef ONLINE_JUDGE
     freopen("in.txt","r",stdin);
     freopen("out.txt","w",stdout);
     #endif

    int t;
    cin>>t;

    while(t--){
        
        string a;
        cin>>a;

        int q;
        cin>>q;
        while(q--){
            int qt;
            cin>>qt;
            stack<char> s;
            while(qt!=a.size()){
                if(s.empty() && (a[qt-1]==')')){
                qt++;
                }
                if(s.empty() && (a[qt-1]=='(')){
                    s.push(a[qt-1]);
                    qt++;
                }
                if(s.top()=='(' && a[qt-1] == ')'){
                    s.pop();
                    if(s.empty()){
                    cout<<qt<<"\n";
                    break;
                    }
                    qt++;
                }else{
                    qt++;
                }
                
            }
            if(!s.empty()){
                cout<<-1;
            }
        }
    }


    return 0 ;
}