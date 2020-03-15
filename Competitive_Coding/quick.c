#include<stdio.h>

void swap(int *a,int *b){
  int t;
  t=*a;
  *a=*b;
  *b=t;
}

int partition(int arr[],int p,int q){
  int x=arr[p];
  int i=p;
  int j;
  for(j=p+1;j<=q;j++){
    if(arr[j]<=x){
      i++;
      swap(&arr[j],&arr[i]);

    }
  }
  swap(&arr[p],&arr[i]);
  return i;
}

void quick(int arr[],int p,int q){
   if(p<q){
    int m=partition(arr,p,q);
    quick(arr,p,m-1);
    quick(arr,m+1,q);
}

}



void printarr(int arr[],int n){
  int i;
  for(i=0;i<n;i++)
  printf("%d\t",arr[i] );
  printf("\n");
}



int main(){
  int arr[]={10};
  int n=sizeof(arr)/sizeof(arr[0]);
  printf("arr:");
  printarr(arr,n);
  quick(arr,0,n-1);
  printf("sorted arr:");
  printarr(arr,n);
  return 0;
}
