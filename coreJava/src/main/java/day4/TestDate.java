package day4;

import java.util.Scanner;
public class TestDate 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("������������");
		int y = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		if(m<1||m>12){
		    System.out.println("������Ч");
			return;
		}
		int maxDay = 31;//��ÿ���µ��������
		if(m==4||m==6||m==9||m==11) maxDay = 30;
		if(m==2){
		    if((y%4==0&&y%100!=0)||y%400==0){
			    maxDay = 29;
			}else{
			    maxDay = 28;
			}
		}
		if(d>0&&d<=maxDay){
		    System.out.println("������Ч");
		}else{
		    System.out.println("������Ч");
		}
	}
}
