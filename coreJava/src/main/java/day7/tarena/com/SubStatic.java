package day7.tarena.com;

public class SubStatic extends StaticField {
//��̬������дҲ��Ҫ��̬�����޷�ʵ�ָ���
	public static void test(){
		System.out.println("SubStatic");
	}  
	public static void main(String[] args) {
		StaticField sf1 = new StaticField();
		sf1.test();//����ת����StaticField.test()
		SubStatic ss = new SubStatic();
		ss.test();//�ӣ�ת����SubStatic.test()
		StaticField sf2 = new SubStatic();
		sf2.test();//����ת����StaticField.test()		
	}
}
