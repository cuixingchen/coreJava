package day3;

import java.util.Scanner;
public class TestTaxi 
{
	public static void main(String[] args) {
		System.out.println("�����빫�����͵ȴ�ʱ�䣺");
		Scanner sc = new Scanner(System.in);
		int kil = sc.nextInt();
		int sec = sc.nextInt();
		if(kil<=0 || sec<0){
		   System.out.println("�������");
		   return;//return��Ӧvoid������ִ��return=��������
		}
		int money = 0;
		if(kil<=3){
		    money = 10;
		}else if(kil<=15){
		    money = 10 + (kil-3)*2;
		}else{
		    money = 10 + 12*2 + (kil-15)*3;
		}
		money = money + (sec/150)*1;
		System.out.println(money+"Ԫ");
	}
}
