package day3;

import java.util.Scanner;
public class TestChat 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		for(;;){
		    String word = sc.next();
			if("over".equals(word)) break;//字符串比较用equals方法
			System.out.println("你说："+word);
		}
	}
}
