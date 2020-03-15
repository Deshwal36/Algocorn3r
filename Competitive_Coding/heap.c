#include<stdio.h>


void swap(int *a,int *b){
  int t=*a;
  *a=*b;
  *b=t;
}
void heapify(int arr[],int n,int i){

int largest=i;
int l=2*i+1;
int r=2*i+2;

if(l<n && arr[largest]<arr[l])
largest=l;

if(r<n && arr[largest]<arr[r])
largest =r;

if(largest!=i){
swap(&arr[largest],&arr[i]);

heapify(arr,n,largest);
}

}


void heapsort(int arr[],int n){

int i;
for(i=n/2-1;i>=0;i--)
  heapify(arr,n,i);

for(i=n-1;i>=0;i--){
swap(&arr[0],&arr[i]);

heapify(arr,i,0);
}
}

void printarr(int arr[],int n){

  int i;
  printf("arr:");
  for(i=0;i<n;i++)
  printf("%d\t",arr[i]);
  printf("\n");
}

int main(){
  int arr[]={3,4,10,50,1};
  int n=sizeof(arr)/sizeof(arr[0]);
  printarr(arr,n);
  heapsort(arr,n);
  printarr(arr,n);


return 0;
}
