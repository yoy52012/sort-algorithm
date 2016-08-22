//快速排序
public void quickSort(int[] array,int start,int end){
    if(start<end){
        int x=array[start];
        int i=start;
        int j=end;
        while(i<j){
            while(i<j&&array[j]>=x)
                j--;
            if(i<j)
                array[i++]=array[j];
            while(i<j&&array[i]<x)
                i++;
            if(i<j)
                array[j--]=array[i];
        }
        array[i]=x;
        quickSort(array,start,i-1);
        quickSort(array,i+1,end);
    }
}
