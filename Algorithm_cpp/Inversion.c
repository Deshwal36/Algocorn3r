/*
	Count Inversion Algorithm.
    #mergesort()
	* @param a: array
	* @param n: array length
	
	#_mergesort()
	* @param a: array
	* @param t: temp array
	* @param l: start index
	* @param r: end index
	
	#merge()
	* @param a: array
	* @param t: temp array
	* @param l: start index
	* @param mid: mid index
	* @param r: end index
*/

int mergesort(int a[],int n){
	int *temp=(int *)malloc(sizeof(int)*n);
	return _mergesort(a,temp,0,n-1);
}

int _mergesort(int a[],int temp[],int l,int r){
	int mid ,inv=0;
	if(r>l){
		mid = (l+r)/2;
		inv=_mergesort(a,temp,l,mid);
		inv+=_mergesort(a,temp,mid+1,r);

		inv+=merge(a,temp,l,mid+1,r);
	}

	return inv;
}

int merge(int a[],int temp[],int l,int mid,int r){
	int i,j,k;
	int inv=0;
	i=l;
	j=mid;
	k=l;

	while((i<=mid-1)&&(j<=r)){
		if(a[i]<=a[j]){
			temp[k++]=a[i++];
		}
		else{
			inv+=mid-1;
			temp[k++]=a[j++];
		}
	}

	while(i<=mid-1){
		temp[k++]=a[i++];
	}

	while(j<=r){
		temp[k++]=a[j++];
	}

	for(i=l;i<=r;i++)
	a[i]=temp[i];

	return inv;
}




