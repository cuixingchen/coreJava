package day2;

public class TestSim
{
	public static void main(String[] args){
	    boolean flag = true;//�������͵������ͳ�ʼ��
		char c1 = 'a';
		System.out.println(c1+1);//c1�����֣��Ǳ�����
		char c2 = '9';//�����c2�õ�����9��
		int i = c2 - '0';
		System.out.println(i);
		System.out.println(c2+1);//58
		int a = 0x255;
		System.out.println(a);
		byte b1 = 12;//?
		int b2 = 128;// 0.... 1000 0000
		long b3 = 12;//?b1 b2 b3������ô��
		b1 = (byte)b2;
		b3 = b2;
		System.out.println(b1);
		float f = 3.0F;
		System.out.println(0.1+0.2);
		System.out.println(0.1+0.2+0.2);
	}
}