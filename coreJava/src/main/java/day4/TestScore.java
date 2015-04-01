package day4;

import java.util.Scanner;
public class TestScore 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("«Î ‰»Î≥…º®");
		int total = 0;
		int max = 0;
		for(;;){
		    int s = sc.nextInt();
			if(s==-1) break;
			total = total + s;
			if(max<s) max = s;
		}
		System.out.println(total);
		System.out.println(max);
	}
}
