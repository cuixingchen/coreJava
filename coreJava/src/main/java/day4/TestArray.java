package day4;

public class TestArray 
{
	public static void main(String[] args) 
	{
		int[] arr1 = new int[5];//��������ʼ�����飬��7������
		System.out.println(arr1[0]);//0
		int[] arr2 = {1,2,3,4,5};//��̬��ʼ��
		System.out.println(arr2[0]);//1
		//System.out.println(arr1[5]);//���������±�Խ���쳣
		for(int i=0;i<arr1.length;i++){//����Ԫ�ظ�ֵ
		   arr1[i] = i+1;
		}
		for(int i=0;i<arr2.length;i++){//ȡ������Ԫ��
		   System.out.println(arr2[i]);
		}
		
	}
}
