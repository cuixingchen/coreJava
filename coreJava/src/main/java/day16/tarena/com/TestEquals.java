package day16.tarena.com;

public class TestEquals {
	public static void main(String[] args) {
		Student s1 = new Student(1,"zhang");
		LitStudent ls1 = new LitStudent(1,"zhang");
		System.out.println(s1.equals(ls1));
		System.out.println(ls1.equals(s1));
		System.out.println(s1.hashCode());
		System.out.println(ls1.hashCode());
	}

}
