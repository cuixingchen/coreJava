package day5.tarena.com;

public class TestStudent {
	public static void main(String[] args) {
		//����δ������󣿣�
	    Student st1 = new Student();
	    Student st2 = new Student(1,"zhang",30);
	    System.out.println(st1.id);
	    System.out.println(st2.id);
	    System.out.println(st1.name);
	    System.out.println(st2.name);
	    st1.id = 1;
	    st1.name = "zhang";
	    st1.age = 30;
	    //��ֵ�Ժ�st1��st2��һ��ͬѧ
	    st2.study("java");
	    String str = st2.coding("c++");
	    System.out.println(str);
	}
}
