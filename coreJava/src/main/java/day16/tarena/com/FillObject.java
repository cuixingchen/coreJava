package day16.tarena.com;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.lang.reflect.*;
public class FillObject {
    public static Object getInstance(String cName,Map<String,Object> map) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException{
    	Class c = Class.forName(cName);
    	Object obj = c.newInstance();
    	Set<String> set = map.keySet();
    	for(String key : set){
    		String mName = "set"+key.substring(0,1).
    		  toUpperCase()+key.substring(1);
    		Field f = c.getDeclaredField(key);
    		Method m = c.getMethod(mName,f.getType());
    		m.invoke(obj, map.get(key));
    	}
    	return obj;
    }
	public static void main(String[] args) {
		/*String cName = "day16.tarena.com.Person";
		Map<String,Object> map = new 
		  HashMap<String,Object>();
		map.put("age",25);
		map.put("name", "zhang");*/
		String cName = "day16.tarena.com.Student";
		Map<String,Object> map = new 
		  HashMap<String,Object>();
		map.put("id",1);
		map.put("name", "zhang");
		try {
			Object obj = FillObject.getInstance(cName, map);
			System.out.println(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
