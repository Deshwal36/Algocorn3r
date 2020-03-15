#include<bits/stdc++.h>

using namespace std;

int maxsum(int *arr){
  int best=0;
  for(int i=0;i<8;i++){
    for(int j=i;j<8;j++){
         int sum=0;
          for(int k=i;k<=j;k++)
          sum+=arr[k];

    best=max(best,sum);
    }
  }
return best;
}


int main(){
  ios::sync_with_stdio(0);
  cin.tie(0);

  int arr[8] = {-1,2,4,-3,5,2,-5,2};
  for(int i=0;i<8;i++)
  cout <<"a["<<i<<"] :" <<arr[i]<< '\n';


  int best=maxsum(arr);
  cout<<"maxsum :"<<best<<"\n";
}
