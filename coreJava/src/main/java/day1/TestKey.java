package day1;

import java.util.Scanner;
//import java.util.*;
public class TestKey 
{
	public static void main(String[] args) 
	{//new用来申请对象内存，System.in是系统输入--键盘
		Scanner sc = new Scanner(System.in);//Scanner扫描器
		System.out.println("请输入姓名：");
		String name = sc.next();//字符串用next
		System.out.println("请输入年龄：");
		int age = sc.nextInt();//int用nextInt
		System.out.println("名字："+name);//变量不放""中
		System.out.println("年龄："+age);//+做连接
	}
}
