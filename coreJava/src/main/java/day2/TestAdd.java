package day2;

public class TestAdd {
	public static void main(String[] args) 
	{
		int a = 5;
		System.out.println(a++);//++ֻ�����ڱ���
		double d = 3.0;
		System.out.println(++d);
		System.out.println(a);
		System.out.println(a++ + ++a);//6 + 8=14
		System.out.println("a="+a);
		a = a++;//++�͸�ֵ����:a++;a=8;
		System.out.println(a);
		//a = a++;����ʲô��ûд
	}//++/--ʵ�ֱ���������1�����Լ�1���ṩ�����ַ�ʽ:
}//++a ǰ++ ȡ++����������㣬a����1
//a++ ��++ ȡ++ǰ���������㣬a����1