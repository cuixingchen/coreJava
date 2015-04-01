package day5.tarena.com;

public class TestStudent {
	public static void main(String[] args) {
		//类如何创建对象？？
	    Student st1 = new Student();
	    Student st2 = new Student(1,"zhang",30);
	    System.out.println(st1.id);
	    System.out.println(st2.id);
	    System.out.println(st1.name);
	    System.out.println(st2.name);
	    st1.id = 1;
	    st1.name = "zhang";
	    st1.age = 30;
	    //赋值以后，st1和st2是一个同学
	    st2.study("java");
	    String str = st2.coding("c++");
	    System.out.println(str);
	}
}
