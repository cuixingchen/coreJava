package day3;

import java.util.Scanner;
public class TestMobile 
{
	public static void main(String[] args) 
	{
		System.out.println("请输入通话秒数：");
		Scanner sc = new Scanner(System.in);
		int sec = sc.nextInt();
		if (sec<=0){
			System.out.println("时间输入非法");
		}else if(sec<=180){
		    System.out.println("0.2元");
		}else{
		    double fee = 0.2;
			fee = fee + 0.1*((sec-180)/60);
			if(sec%60!=0) fee = fee+0.1;
			System.out.println(fee+"元");
		}
	}
}
