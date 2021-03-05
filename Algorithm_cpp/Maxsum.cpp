/*

	* @param arr: array
	* @return : maxsum
*/
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

