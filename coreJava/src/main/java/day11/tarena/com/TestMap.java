package day11.tarena.com;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
public class TestMap {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("four", 44);//新增 + 替换Value
		map.put("five", 4);
		System.out.println(map.size());//5
		System.out.println(map.get("four"));//44
		map.remove("one");//删除
		Set<String> set = map.keySet();//取出
		Iterator<String> it = set.iterator();
		while(it.hasNext()){//Map无序
			String key = it.next();
			Integer value = map.get(key);
			System.out.println(key+"="+value);
		}//练习：实现用户注册，要求提供用户名、密码、email
	}//放入Map中，key自己定义，放入完毕后，用key取出存入User
	//注意：密码需要密码确认

}
