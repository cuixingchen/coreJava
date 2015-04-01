package day8.tarena.com;

public class TestStudent {
	public static void main(String[] args) {
		Student st1 = new Student(1,"zhang");
		Student st2 = new Student(1,"zhang");
		System.out.println(st1 == st2);//f
		System.out.println(st1.equals(st2));//t
	}

}
