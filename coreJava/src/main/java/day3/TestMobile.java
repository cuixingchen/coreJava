package day3;

import java.util.Scanner;
public class TestMobile 
{
	public static void main(String[] args) 
	{
		System.out.println("������ͨ��������");
		Scanner sc = new Scanner(System.in);
		int sec = sc.nextInt();
		if (sec<=0){
			System.out.println("ʱ������Ƿ�");
		}else if(sec<=180){
		    System.out.println("0.2Ԫ");
		}else{
		    double fee = 0.2;
			fee = fee + 0.1*((sec-180)/60);
			if(sec%60!=0) fee = fee+0.1;
			System.out.println(fee+"Ԫ");
		}
	}
}
