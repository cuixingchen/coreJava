package day9.tarena.com.cr;

public class TestStringPool {
	public static void main(String[] args) {
		String s1 = "abc";//�ڴ���1������
		String s2 = "abc";//1
		String s3 = new String("abc");//2
		String s4 = new String("abc");//3
		System.out.println(s1 == s2);//t
		System.out.println(s1.equals(s2));//t
		System.out.println(s3 == s4);//f
		System.out.println(s3.equals(s4));//t
		String s5 = s1+"d";//����+����=���� 5
		String s6 = "abcd";//6
		String s7 = "abc"+"d";//����+����=��������� 6
		System.out.println(s5 == s6);//f
		System.out.println(s5 == s7);//f
		System.out.println(s6 == s7);//t
		s5 = s5.intern();//���ַ����ɶ���� 5
		System.out.println(s5 == s6);
	}
}
