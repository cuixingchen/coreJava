package day7.tarena.com;

public class SubStatic extends StaticField {
//静态方法重写也需要静态，但无法实现覆盖
	public static void test(){
		System.out.println("SubStatic");
	}  
	public static void main(String[] args) {
		StaticField sf1 = new StaticField();
		sf1.test();//父，转换成StaticField.test()
		SubStatic ss = new SubStatic();
		ss.test();//子，转换成SubStatic.test()
		StaticField sf2 = new SubStatic();
		sf2.test();//父，转换成StaticField.test()		
	}
}
