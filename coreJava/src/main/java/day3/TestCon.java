package day3;

public class TestCon
{
	public static void main(String[] args){
	    int a = 5;
		System.out.println((a>3)?1:2.0);//1�Զ�ת��1.0
		System.out.println((a>3)?1:"2.0");//1 �﷨��ȷʵ������
		double d = (a>3)?1:2.0;//t
		//int i1 = (a>3)?1:2.0;//f
		//int i2 = (a>3)?1:"2.0";//f
		//String s = (a>3)?1:"2.0";//f
		if(a>3){
		    int i2 = 1;
		}else{
		    String s = "2.0";
		}
	}
}