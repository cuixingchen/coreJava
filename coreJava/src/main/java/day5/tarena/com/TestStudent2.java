package day5.tarena.com;

public class TestStudent2 {
	public static void main(String[] args) {
		Student2 st = new Student2();
		st.setAge(-30);
		System.out.println(st.getAge());
		//st.age = -30;//�Ϸ� ������
		//System.out.println("�����ǣ�"+st.age);
		Student2 st2 = new Student2(1,"zhan",-30);
		System.out.println(st2.getAge());
	}
}
