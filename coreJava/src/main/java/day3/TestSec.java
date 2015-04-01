package day3;

import java.util.Scanner;
public class TestSec 
{
	public static void main(String[] args) 
	{
		System.out.println("请输入秒数：");
		Scanner sc = new Scanner(System.in);
		int sec = sc.nextInt();
		if(sec<0){
		    System.out.println("输入非法");
			return;
		}
		int h = sec/3600;
		int m = sec%3600/60;
		int s = sec%3600%60;
		System.out.println(h+"小时"+m+"分"+s+"秒");
	}
}
