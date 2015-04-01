package day7.tarena.com;

public class Test {
	public static void main(String[] args) {
		System.out.println("begin");
		TestBlock tb;//不进行类加载
		TestBlock.i1 = 2;
		System.out.println("end");
		tb = new TestBlock();
		tb = new TestBlock();
	}
}
