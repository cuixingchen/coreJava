package day10.tarena.com;
import java.util.List;
import java.util.ArrayList;
public class TestList {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Integer(80));//java基本类型-->对象化？
		list.add(80);//自动装箱-->Integer
		Integer i1 = new Integer(90);
		int score = i1.intValue();//得转换，麻烦-->5.0自动装箱、自动解箱
	    Integer i2 = 90;//自动装箱
	    int score2 = i2;//自动解箱
	    int total = i1 + i2;
	    //90.equals("");//不是任何时候都可以自动装箱、自动解箱
	    i2.equals("");
	    String s = "123";
	    int s3 = Integer.parseInt(s);//String-->int
	    String temp = s3+"";//int-->String
	    Integer in1 = new Integer(311);
	    Integer in2 = new Integer(311);
	    System.out.println(in1==in2);//f
	    Integer in3 = 128;Integer in4 = 128;//自动装箱
	    System.out.println(in3==in4);//t
	    long l = 3; Long lo = 3L;//int-->long,IntegerX->Long
	}//Integer 有自动装箱池(-128到127，new Integer(i))
}
