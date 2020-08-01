/*
	* @param a: Pointer to char array (a)
	* @param b: Pointer to char array (b)
	* @return:  boolean Y/N
*/

void swap(char *a,char *b){
	char temp=*a;
	*a=*b;
	*b=temp;
}

int partition(char *a,int p,int q){
	char x=a[p];
	int i=p;
	int j;
	for(j=p+1;j<=q;j++){
		if(a[j]<=x){
			i++;
			swap(&a[i],&a[j]);
		}
	}
	swap(&a[p],&a[i]);
	return i;

}

void quicksort(char *a,int p,int q){
	int i;
	while(p-q>0){
		i=partition(a,p,q);
		quicksort(a,p,i-1);
		quicksort(a,i+1,q);
	}
}

bool anagram(char* a,char* b){
	
	int n1=strlen(a);
	int n2=strlen(b);

	if(n1!=n2)
	return false;

	quicksort(a,0,n1-1);
	quicksort(b,0,n2-1);

	int i;
	for(i=0;i<n1;i++){
		if(a[i]!=b[i])
		return false;
	}

	return true;
}


