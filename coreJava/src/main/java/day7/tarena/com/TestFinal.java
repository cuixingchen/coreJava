package day7.tarena.com;

public /*final*/ class TestFinal {
	private final int i1 /*= 1*/;//����ͬʱ��ֵ
	private final StaticField sf = new StaticField();
	public TestFinal(){
		i1 = 1;//�����ڹ����и�ֵ
		sf.i1 = 2;//final������������ֻ�Ե�һ��������
	}//final����û��set����
	public TestFinal(int i1){
		this.i1 = i1;
	}
	public /*final*/ void test(){}
	public static void main(String[] args){
		new TestFinal(1);//i1 = 1;
		new TestFinal(2);//i1 = 2;
	}
}//����һ��������˵������ֻ��һ�Σ��������Զ�ε���

class A extends TestFinal{
	public void test(){}
}
