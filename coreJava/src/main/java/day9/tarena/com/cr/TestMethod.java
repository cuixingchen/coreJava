package day9.tarena.com.cr;

public class TestMethod {
	public static void main(String[] args) {
		String s1 = "张,男,35";
		String[] st = s1.split(",");
		for(int i=0;i<st.length;i++){
			System.out.println(st[i]);
		}
		String s2 = "abcdefg";
		System.out.println(s2.substring(2,5));//cde
		//s2 = s2.substring(2,5);
		System.out.println(s2);//String的引用必须重新赋值才能改变
		String s3 = "abcdddabcdddabcdddabc";
		int index = 0;
		for(int i=0;i<s3.length();i++){
		    index = s3.indexOf("abc",index);
		    if(index==-1) break;
		    System.out.println(index);
		    index++;
		}
		String st1 = "a$b$c";
		String[] stt = st1.split("\\$");
		for(int i=0;i<stt.length;i++){
			System.out.println(stt[i]);
		}
	}//练习：找出所有的abc的位置？第一个从0开始，
}//第二个从第一个位置+1开始，返回-1结束




