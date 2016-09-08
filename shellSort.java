/**
 *
 * Description:ϣ��������С��������
 * ���ȶ�����
 * ����ʱ�临�Ӷȣ�O(n)  
 * ���ʱ�临�Ӷȣ�O(n^2)  
 * ƽ��ʱ�临�Ӷȣ�O(n^1.2)
 */

public void ShellSort(int[] a){
	int n=a.length;
	int d=n;
	while(true){
		d=d/2;
		for(int i=0;i<d;i++){
			for(int j=i+d;j<n;j+=d){
				int tmp=a[j];
				int k;
				for(k=j-d;k>=0&&a[k]>tmp;k-=d){
					a[k+d]=a[k];
				}
				a[k+d]=tmp;
			}
		}
		if(d==1) break;
	}
}