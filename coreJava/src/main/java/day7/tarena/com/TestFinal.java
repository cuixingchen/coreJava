package day7.tarena.com;

public /*final*/ class TestFinal {
	private final int i1 /*= 1*/;//声明同时赋值
	private final StaticField sf = new StaticField();
	public TestFinal(){
		i1 = 1;//或者在构造中赋值
		sf.i1 = 2;//final对于引用类型只对第一层起作用
	}//final属性没有set方法
	public TestFinal(int i1){
		this.i1 = i1;
	}
	public /*final*/ void test(){}
	public static void main(String[] args){
		new TestFinal(1);//i1 = 1;
		new TestFinal(2);//i1 = 2;
	}
}//对于一个对象来说，构造只调一次，方法可以多次调用

class A extends TestFinal{
	public void test(){}
}
