/**
 *
 * Description:ð������
 * �ȶ�����
 * ����ʱ�临�Ӷ�Ϊ��O(n)   
 * ���ʱ�临�Ӷ�Ϊ��O(n^2)
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