package day4;

public class TestCopy //数组拷贝时小心下标越界
{
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5,6,7};
        int[] b = new int[10];
		/*for(int i=0;i<4;i++){
		    b[4+i] = a[3+i];
		}*/
		System.arraycopy(a,3,b,4,4);//
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
	}
}
