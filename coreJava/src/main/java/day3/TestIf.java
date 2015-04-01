package day3;

import java.util.Scanner;
public class TestIf 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入整数：");
		int a = sc.nextInt();
		if(a>0){
		    System.out.println(a+"是正数");
		}else if(a==0){
		    System.out.println(a+"是零");
		}else{
		    System.out.println(a+"是负数");
		}
	}
}
