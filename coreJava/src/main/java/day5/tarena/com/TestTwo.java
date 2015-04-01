package day5.tarena.com;
//保存时自动编译，并提示错误
public class TestTwo {
	public static void main(String[] args) {
		int[][] arr1 = new int[3][];//arr1有3个一维数组
		int[][] arr2 = new int[3][3];//同时分配二维和一维数组空间
		//System.out.println(arr1[1][0]);//空指针异常
		System.out.println(arr2[1][0]);//0
		for(int i=0;i<arr1.length;i++){//二维数组赋值
			arr1[i] = new int[3];
			for(int j=0;j<arr1[i].length;j++){
				arr1[i][j] = i+j;
			}
		}
		for(int i=0;i<arr1.length;i++){//取值
			for(int j=0;j<arr1[i].length;j++){
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		String[][] arr = {{"a","b","c"},{"1","2"},{"x"}};
	}
}
