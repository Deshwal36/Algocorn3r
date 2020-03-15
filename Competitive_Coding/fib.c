#include<stdio.h>
#define NIL -1

int table[10];

void initialise(){
  int i;
  for ( i = 0; i < 10; i++) {
    table[i]=NIL;
  }
}

int fib(int n){
  if(n==0 || n==1)
  return (n);
  else{
  if(table[n-1]==NIL)
  table[n-1]=fib(n-1);

  if(table[n-2]==NIL)
  table[n-2]=fib(n-2);

  table[n]=table[n-1]+table[n-2];

  return(table[n]);
}
}



int main(){
  int n=7;
  initialise();
  printf("fib(7) :%d",fib(n));
  return 0;
}
