package day4;

import java.util.Scanner;
public class TestSwitch 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("������ɼ���");
		int score = sc.nextInt();
		switch(score){
		    case 5:
				System.out.println("����");
			    break;
			case 4:
				System.out.println("����");
			    break;
			case 3:
				System.out.println("����");
			    break;
			default:
				System.out.println("������");
			    break;
		}
	}
}
