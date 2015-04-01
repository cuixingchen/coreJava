package day7.tarena.com;

public class TestBlock {
	static int i1 = 1;
	static{//静态语句块，在类加载时执行
        System.out.println("static block");
	}
	{//非静态语句块，构造对象时执行
        System.out.println("not static");
	}
	public static void main(String[] args) {
		System.out.println("begin");
		TestBlock tb;//不进行类加载
		//TestBlock.i1 = 2;
		System.out.println("end");
		tb = new TestBlock();
		tb = new TestBlock();
	}
}
