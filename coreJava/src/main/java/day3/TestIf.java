package day3;

import java.util.Scanner;
public class TestIf 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("������������");
		int a = sc.nextInt();
		if(a>0){
		    System.out.println(a+"������");
		}else if(a==0){
		    System.out.println(a+"����");
		}else{
		    System.out.println(a+"�Ǹ���");
		}
	}
}
