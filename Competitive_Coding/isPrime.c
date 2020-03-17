/*
	* @param n: number
	* @return:  boolean Y/N
*/
int isPrime(int n){
	int i;
	for(i=2;i<=sqrt(n);i++){
		if(n%i==0)
		return 0;
	}
	return 1;

}
