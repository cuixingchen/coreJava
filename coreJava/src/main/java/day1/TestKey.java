package day1;

import java.util.Scanner;
//import java.util.*;
public class TestKey 
{
	public static void main(String[] args) 
	{//new������������ڴ棬System.in��ϵͳ����--����
		Scanner sc = new Scanner(System.in);//Scannerɨ����
		System.out.println("������������");
		String name = sc.next();//�ַ�����next
		System.out.println("���������䣺");
		int age = sc.nextInt();//int��nextInt
		System.out.println("���֣�"+name);//��������""��
		System.out.println("���䣺"+age);//+������
	}
}
