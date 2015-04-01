package day3;

import java.util.Scanner;
public class TestMax 
{
	public static void main(String[] args) 
	{
		System.out.println("ÊäÈë3¸öÊı×Ö£º");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = a;
		if(max<b) max = b;
		if(max<c) max = c;
		System.out.println(max);
		/*if(a>=b && a>=c){
		    System.out.println(a);
		}else if(b>=a && b>=c){
		    System.out.println(b);
		}else if(c>=a && c>=b){
		    System.out.println(c);
		}*/
	}
}
