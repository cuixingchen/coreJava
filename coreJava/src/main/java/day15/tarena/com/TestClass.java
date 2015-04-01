package day15.tarena.com;

public class TestClass {
	public static void main(String[] args) {
		try {
			Class c1 = Class.forName("java.lang.String");
			Class c2 = String.class;
			Class c3 = "abc".getClass();
			System.out.println(c1==c2);//t
			Class c4 = int.class;
			Class c5 = Integer.class;
			Class c6 = Integer.TYPE;
			System.out.println(c4 == c5);//f
			System.out.println(c4 == c6);//t
			System.out.println(c5 == c6);//f
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
