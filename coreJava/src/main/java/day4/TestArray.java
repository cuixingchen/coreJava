package day4;

public class TestArray 
{
	public static void main(String[] args) 
	{
		int[] arr1 = new int[5];//声明并初始化数组，有7个变量
		System.out.println(arr1[0]);//0
		int[] arr2 = {1,2,3,4,5};//静态初始化
		System.out.println(arr2[0]);//1
		//System.out.println(arr1[5]);//引发数组下标越界异常
		for(int i=0;i<arr1.length;i++){//数组元素赋值
		   arr1[i] = i+1;
		}
		for(int i=0;i<arr2.length;i++){//取出数组元素
		   System.out.println(arr2[i]);
		}
		
	}
}
