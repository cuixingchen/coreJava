package day8.tarena.com;

public class LocalInner {
	private int i1;
    private static int i2;
    public void test(int i3){
    	final int i4 = 3;
    	/*public*/ class Local{//����ʹ��public���Σ���ֲ�����
    		public void go(int i5){
    			System.out.println(i1);
    			System.out.println(i2);
    //�ֲ��ڲ�����ֻ��ʹ��final�ľֲ�����
//    			System.out.println(i3);
    			System.out.println(i4);
    			System.out.println(i5);
    		}
    	}
    }
}
