package day10.tarena.com;
import java.util.List;
import java.util.ArrayList;
public class TestList {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Integer(80));//java��������-->���󻯣�
		list.add(80);//�Զ�װ��-->Integer
		Integer i1 = new Integer(90);
		int score = i1.intValue();//��ת�����鷳-->5.0�Զ�װ�䡢�Զ�����
	    Integer i2 = 90;//�Զ�װ��
	    int score2 = i2;//�Զ�����
	    int total = i1 + i2;
	    //90.equals("");//�����κ�ʱ�򶼿����Զ�װ�䡢�Զ�����
	    i2.equals("");
	    String s = "123";
	    int s3 = Integer.parseInt(s);//String-->int
	    String temp = s3+"";//int-->String
	    Integer in1 = new Integer(311);
	    Integer in2 = new Integer(311);
	    System.out.println(in1==in2);//f
	    Integer in3 = 128;Integer in4 = 128;//�Զ�װ��
	    System.out.println(in3==in4);//t
	    long l = 3; Long lo = 3L;//int-->long,IntegerX->Long
	}//Integer ���Զ�װ���(-128��127��new Integer(i))
}
