package day7.tarena.com;

public class TestBlock {
	static int i1 = 1;
	static{//��̬���飬�������ʱִ��
        System.out.println("static block");
	}
	{//�Ǿ�̬���飬�������ʱִ��
        System.out.println("not static");
	}
	public static void main(String[] args) {
		System.out.println("begin");
		TestBlock tb;//�����������
		//TestBlock.i1 = 2;
		System.out.println("end");
		tb = new TestBlock();
		tb = new TestBlock();
	}
}
