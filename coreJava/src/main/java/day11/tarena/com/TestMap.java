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
		map.put("four", 44);//���� + �滻Value
		map.put("five", 4);
		System.out.println(map.size());//5
		System.out.println(map.get("four"));//44
		map.remove("one");//ɾ��
		Set<String> set = map.keySet();//ȡ��
		Iterator<String> it = set.iterator();
		while(it.hasNext()){//Map����
			String key = it.next();
			Integer value = map.get(key);
			System.out.println(key+"="+value);
		}//��ϰ��ʵ���û�ע�ᣬҪ���ṩ�û��������롢email
	}//����Map�У�key�Լ����壬������Ϻ���keyȡ������User
	//ע�⣺������Ҫ����ȷ��

}
