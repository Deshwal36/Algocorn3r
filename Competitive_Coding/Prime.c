#include<stdio.h>
#include<math.h>

int prime(int n){
   int i;
   for(i=2;i<=sqrt(n);i++){
     if(n%i==0)
     return 0;
   }
   return 1;

}

void printarr(int a[],int n){
  int i;
  printf("arr:");
  for(i=0;i<n;i++){
    printf("%d\t",a[i]);
  }
  printf("\n");
}

int main(){
 int max=0,a[100],n=13195,i,count=2;
 a[0]=2;
 a[1]=3;
  for(i=4;i<=n/2;i++){
    if(prime(i)){
     a[count]=i;
     count++;
    }
}


for(i=0;i<count;i++){
if(13195%a[i]==0)
max=a[i];
}
printarr(a,count);
printf("max factor:%d",max);
return 0;
}
