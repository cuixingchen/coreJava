package day1;

public class TestString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s="123@456789";
		
		System.out.println(s.substring(0, 3));
		System.out.println(s.substring(0, s.lastIndexOf("@")));
	}

}
