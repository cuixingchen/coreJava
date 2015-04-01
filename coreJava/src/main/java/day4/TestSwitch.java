package day4;

import java.util.Scanner;
public class TestSwitch 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩：");
		int score = sc.nextInt();
		switch(score){
		    case 5:
				System.out.println("优秀");
			    break;
			case 4:
				System.out.println("良好");
			    break;
			case 3:
				System.out.println("及格");
			    break;
			default:
				System.out.println("不及格");
			    break;
		}
	}
}
