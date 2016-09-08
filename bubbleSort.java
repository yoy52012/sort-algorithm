/**
 *
 * Description:冒泡排序
 * 稳定排序
 * 最优时间复杂度为：O(n)   
 * 最差时间复杂度为：O(n^2)
 */

public void BubbleSort(int[] a){
	int n=a.length;
	for(int i=0;i<n;i++){
		for(int j=0;j<n-i-1;j++){
			if(a[j]>a[j+1]){
				int tmp=a[j];
				a[j]=a[j+1];
				a[j+1]=tmp;
			}
		}
	}
}