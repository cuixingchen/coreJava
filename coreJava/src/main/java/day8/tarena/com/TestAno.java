package day8.tarena.com;

public class TestAno {
	public static void main(String[] args) {
		Object obj = new Object(){
			public String toString(){
				return "���������ڲ���";
			}
		};
		System.out.println(obj.toString());
	}
}
