/**
 *
 * Description: ֱ��ѡ������
 * ���ȶ�����
 * ����ʱ�临�Ӷȣ�O(n^2) 
 * ���ʱ�临�Ӷȣ�O(n^2)
 *
 */

public void SelectSort(int[] a){
	int n=a.length;
	int minIndex;
	for(int i=0;i<n;i++){
		minIndex=i;
		for(int j=i+1;j<n;j++){
			if(a[j]<a[minIndex]){
				minIndex=j;
			}
		}
		Swap(a,i,minIndex);
	}
}

public void Swap(int[] a,int i,int j){
	if(i!=j){
		int tmp=a[i];
		a[i]=a[j];
		a[j]=tmp;
	}
}