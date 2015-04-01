package day3;

import java.util.Scanner;
public class TestTr 
{
	public static void main(String[] args) 
	{
		System.out.println("请输入工资数：");
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		if(d>=10000){//考虑临界点
		    System.out.println("飞过去");
		}else if(d>=5000/* && d<10000*/){
		    System.out.println("火车过去");
		}else if(d>=3000/* && d<5000*/){
		    System.out.println("汽车过去");
		}else if(d>=1500/* && d<3000*/){
		    System.out.println("自行车过去");
		}else{
		    System.out.println("走过去");
		}//到了第n个分支，前面n-1个分支一定不成立
	}
}
