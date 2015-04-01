package day2;

public class TestSim
{
	public static void main(String[] args){
	    boolean flag = true;//布尔类型的声明和初始化
		char c1 = 'a';
		System.out.println(c1+1);//c1是数字，是编码数
		char c2 = '9';//如何由c2得到数字9？
		int i = c2 - '0';
		System.out.println(i);
		System.out.println(c2+1);//58
		int a = 0x255;
		System.out.println(a);
		byte b1 = 12;//?
		int b2 = 128;// 0.... 1000 0000
		long b3 = 12;//?b1 b2 b3有区别么？
		b1 = (byte)b2;
		b3 = b2;
		System.out.println(b1);
		float f = 3.0F;
		System.out.println(0.1+0.2);
		System.out.println(0.1+0.2+0.2);
	}
}