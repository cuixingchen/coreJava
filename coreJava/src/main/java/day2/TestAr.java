package day2;

public class TestAr 
{
	public static void main(String[] args) 
	{
		int a = 3;
		int b = 2;
		System.out.println(a/b);//1 int运算结果只取整数部分
		System.out.println(a%b);//1
		double d1 = 3.0;
		double d2 = 3.1;
		System.out.println(d1%b);//1.0 b自动类型转换成double
		System.out.println(d2%b);//1.1
		System.out.println(d1%2.0);//1.0
		System.out.println(d2%2.0);//1.1
		byte b1 =126;
		byte b2 = 3;
		b1 = (byte)(b1 + b2);//整型的变量运算，小于int的转成int后运算
		//b1 = 2 + 3;//常数运算编译时算出结果并赋值
		//b1 += b2;//赋值语句
		System.out.println(b1);
	}
}
