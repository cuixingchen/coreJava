package day1;

import java.util.Scanner;
public class TestAdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入两个数字");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("和："+(a+b));
	}
}
