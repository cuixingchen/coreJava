package day3;

import java.util.Scanner;
public class TestSec 
{
	public static void main(String[] args) 
	{
		System.out.println("������������");
		Scanner sc = new Scanner(System.in);
		int sec = sc.nextInt();
		if(sec<0){
		    System.out.println("����Ƿ�");
			return;
		}
		int h = sec/3600;
		int m = sec%3600/60;
		int s = sec%3600%60;
		System.out.println(h+"Сʱ"+m+"��"+s+"��");
	}
}
