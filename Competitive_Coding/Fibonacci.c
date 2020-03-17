/*
    DP concept used for reducing the time complexity
	
	* @param n: position of required fib number 
	* @return:  return fibonacci number at n
*/

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

