public void MinHeapFixDown(int[] a,int i,int n){
	int tmp=a[i];
	int j=2*i+1;
	while(j<n){
		if(j+1<n&&a[j+1]<a[j])
			j++;
		if(a[j]>=tmp)
			break;
		a[i]=a[j];
		i=j;
		j=2*i+1;
	}
	a[i]=tmp;
}

public void MakeMinHeap(int[] a,int n){
	for(int i=n/2-1;i>=0;i--){
		MinHeapFixDown(a,i,n);
	}
}

public void MinHeapSort(int[]a ,int n){
	MakeMinHeap(a,n);
	for(int i=n-1;i>0;i--){
		Swap(a,0,i);
		MinHeapFixDown(a,0,i);
	}
}

public void Swap(int[] a,int i,int j){
	if(i!=j){
		int tmp=a[i];
		a[i]=a[j];
		a[j]=tmp;
	}
}