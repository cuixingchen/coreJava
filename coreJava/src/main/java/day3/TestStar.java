package day3;

public class TestStar 
{
	public static void main(String[] args) 
	{//二重循环
		for(int i=0;i<5;i++){
		    for(int j=0;j<=i;j++){//凑对次数
			    System.out.print("*");
			}//i=0; 1
			//System.out.println();
			System.out.print("\n");//\n代表换行
		}//i=1; 2
	}//i=4; 5
}
