package day15.tarena.com;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
public class TestPerson {
    public static void main(String[] args){
    	Class c = Person.class;
    	try {
			Field f = c.getDeclaredField("name");
			Method m = c.
			  getMethod("setName",String.class);
			Constructor con = c.
			  getConstructor(int.class,String.class);
			System.out.println(f);
			System.out.println(m);
			System.out.println(con);
			Object obj = con.newInstance(25,"zhang");
			System.out.println(obj);
			Object obj2 = c.newInstance();//必须调无参构造
			System.out.println(obj2);
			String s1 = "java.lang.String";
			String s2 = "day15.tarena.com.Person";
			Object ob1 = TestPerson.getInstance(s1);
			Object ob2 = TestPerson.getInstance(s2);
			System.out.println(ob1.getClass());
			System.out.println(ob2.getClass());
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    public static Object getInstance(String cName) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
    	Class c = Class.forName(cName);
    	return c.newInstance();
    }//动态的创建对象，必须有无参构造
}
