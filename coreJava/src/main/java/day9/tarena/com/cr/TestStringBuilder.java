package day9.tarena.com.cr;

public class TestStringBuilder {
	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("abc");//2
		StringBuilder s2 = new StringBuilder("abc");//3
		System.out.println(s1.equals(s2));//f
		System.out.println(s1.length());//3
		System.out.println(s1.capacity());//3+16=19
		s2 = s1.append("d");//可变，返回自身  2+1=3
		System.out.println(s1.length());//4
		System.out.println(s1.capacity());//19
		System.out.println(s1);//abcd
		System.out.println(s1==s2);//t
		s1.reverse();
		System.out.println(s2);//dcba
		System.out.println(s1==s2);//t
		String ss = s1.toString();//转String
	}
}
