package day16.tarena.com;

import java.lang.reflect.Method;

public class TestMethod {
	public static void main(String[] args) {
		try{
			Class c = Class.forName("day16.tarena.com.Person");
			Object obj = c.newInstance();
			Method m = c.getMethod("setAge",int.class);
			Method mEquals = c.getMethod("equals",Object.class);
			m.invoke(obj, 25);//ֱ�Ӳ�������obj�������뷴���޹�
			System.out.println(obj);
			Object ret = mEquals.invoke(obj, "zhang");
			System.out.println(ret);
		}catch(Exception ee){
			ee.printStackTrace();
		}
	}

}
