package day8.tarena.com;

public class LocalInner {
	private int i1;
    private static int i2;
    public void test(int i3){
    	final int i4 = 3;
    	/*public*/ class Local{//不能使用public修饰，象局部变量
    		public void go(int i5){
    			System.out.println(i1);
    			System.out.println(i2);
    //局部内部类中只能使用final的局部变量
//    			System.out.println(i3);
    			System.out.println(i4);
    			System.out.println(i5);
    		}
    	}
    }
}
