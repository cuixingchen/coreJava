package day5.tarena.com;
//����ʱ�Զ����룬����ʾ����
public class TestTwo {
	public static void main(String[] args) {
		int[][] arr1 = new int[3][];//arr1��3��һά����
		int[][] arr2 = new int[3][3];//ͬʱ�����ά��һά����ռ�
		//System.out.println(arr1[1][0]);//��ָ���쳣
		System.out.println(arr2[1][0]);//0
		for(int i=0;i<arr1.length;i++){//��ά���鸳ֵ
			arr1[i] = new int[3];
			for(int j=0;j<arr1[i].length;j++){
				arr1[i][j] = i+j;
			}
		}
		for(int i=0;i<arr1.length;i++){//ȡֵ
			for(int j=0;j<arr1[i].length;j++){
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		String[][] arr = {{"a","b","c"},{"1","2"},{"x"}};
	}
}
