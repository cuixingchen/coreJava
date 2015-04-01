package day2;

public class TestAdd {
	public static void main(String[] args) 
	{
		int a = 5;
		System.out.println(a++);//++只能用于变量
		double d = 3.0;
		System.out.println(++d);
		System.out.println(a);
		System.out.println(a++ + ++a);//6 + 8=14
		System.out.println("a="+a);
		a = a++;//++和赋值两个:a++;a=8;
		System.out.println(a);
		//a = a++;等于什么都没写
	}//++/--实现变量的自增1或者自减1，提供了两种方式:
}//++a 前++ 取++后的数做运算，a自增1
//a++ 后++ 取++前的数做运算，a自增1