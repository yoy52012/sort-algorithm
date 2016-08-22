/**
 * 排序算法：归并排序
 * 时间复杂度：O(nlgn)
 * 稳定性：稳定的
 */
public void mergeSort(int[] a,int n){
    int[] tmp=new int[n];
    mergesort(a,0,n-1,tmp);
}

public void mergesort(int[] a,int start,int end,int[] tmp){
    if(start<end){
        int mid=(start+end)>>1;
        mergesort(a,start,mid,tmp);
        mergesort(a,mid+1,end,tmp);
        mergeArray(a,start,mid,end,tmp);
    }
}

public void mergeArray(int[] a,int start,int mid,int end,int[] tmp){
    int i=start;
    int m=mid;
    int j=mid+1;
    int n=end;
    int k=0;
    while(i<=m&&j<=n){
        if(a[i]<=a[j]){
            tmp[k++]=a[i++];
        }else{
            tmp[k++]=a[j++];
        }
    }

    while(i<=m)
        tmp[k++]=a[i++];

    while(j<=n)
        tmp[k++]=a[j++];
    
    for(i=0;i<k;i++){
        a[start+i]=tmp[i];
    }
}