package day3;

import java.util.Scanner;
public class TestTr 
{
	public static void main(String[] args) 
	{
		System.out.println("�����빤������");
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		if(d>=10000){//�����ٽ��
		    System.out.println("�ɹ�ȥ");
		}else if(d>=5000/* && d<10000*/){
		    System.out.println("�𳵹�ȥ");
		}else if(d>=3000/* && d<5000*/){
		    System.out.println("������ȥ");
		}else if(d>=1500/* && d<3000*/){
		    System.out.println("���г���ȥ");
		}else{
		    System.out.println("�߹�ȥ");
		}//���˵�n����֧��ǰ��n-1����֧һ��������
	}
}
