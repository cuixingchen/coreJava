package day7.tarena.com;

public class StaticField {
    int i1 = 1;
    private static int i2 = 1;//静态的属性所有对象共享
    public StaticField(){
    	i1++;
    	i2++;
    }
    public static void test(){
    	System.out.println("StaticField的方法");
    	//i1++;//静态方法中不能直接使用非静态属性
    	i2++;
    }
	public static void main(String[] args) {
		StaticField sf1 = new StaticField();
		StaticField sf2 = new StaticField();
		System.out.println(sf1.i1);//2
		System.out.println(sf2.i1);//2
		System.out.println(sf1.i2);//2 3
		System.out.println(sf2.i2);//2 3
		StaticField.test();//类名.调用
	}
}
