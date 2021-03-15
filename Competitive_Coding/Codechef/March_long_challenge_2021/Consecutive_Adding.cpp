#include<bits/stdc++.h>
using namespace std;

 

int main() {
int a;
cin>>a;
while(a--)
{int a1,b,b1,c,su;
  cin>>a1;
cin>>b; 
cin >>b1;
vector<vector<long>> aa(a1,vector<long>(b,0)),bb(a1,vector<long>(b,0));
for(int i=0;i<aa.size();i++)
{
    for(int j=0;j<aa[i].size();j++)
    {long gg;
        cin>>gg;
        aa[i][j]=gg;
    }
}
for(int i=0;i<aa.size();i++)
{
    for(int j=0;j<aa[i].size();j++)
    {long gg;
        cin>>gg;
        bb[i][j]=gg;
    }
}

 

long diff=0,he=-1; 

 

for(int i=0;i<aa.size();i++)
{vector<long>aa1(aa[0].size()+1,0);
diff=0,he=-1; 
    for(int j=0;j<=aa[i].size();j++)
    {
        long val;
        diff-=aa1[j];
        aa[i][j]+=diff;
        if(j<=aa[i].size()-b1)
        {
      val=bb[i][j]-aa[i][j];
      aa1[j+b1]=val;
      diff=diff+val;
      aa[i][j]=aa[i][j]+val;
        }
    }
}

 

diff=0,he=-1; 
for(int j=aa[0].size()-b1;j<aa[0].size();j++)
{vector<long>aa2(aa.size()+1,0);
diff=0,he=-1;
    for(int i=0;i<aa.size();i++)
    {
        long val;
        diff-=aa2[i];
        aa[i][j]+=diff;
        if(i<=aa.size()-b1)
        {
      val=bb[i][j]-aa[i][j];
      aa2[i+b1]=val;
      diff=diff+val;
      aa[i][j]=aa[i][j]+val;
        }
    }
}
int check=1;
for(int i=0;i<aa.size();i++)
{
    for(int j=0;j<aa[0].size();j++)
    {
    if(aa[i][j]!=bb[i][j])
    {
        check=0;
        break;
    }
    }
   
}
if(check)
{
    cout<<"Yes"<<endl;
}
else
 cout<<"No"<<endl;
}
    return 0;
}