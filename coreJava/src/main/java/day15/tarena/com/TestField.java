package day15.tarena.com;
import java.lang.reflect.Field;
public class TestField {
	public static void main(String[] args) {
		try{
			Class c = Person.class;
			Object obj = c.newInstance();
			Field f = c.getDeclaredField("name");
			System.out.println(f.getType());//ȡ���Ե�����
			f.setAccessible(true);//���еĶ����Է��ʣ������Ƽ�
			f.set(obj, "zhang");
			Object n = f.get(obj);
			System.out.println(n);
		}catch(Exception ee){
			ee.printStackTrace();
		}
	}

}
