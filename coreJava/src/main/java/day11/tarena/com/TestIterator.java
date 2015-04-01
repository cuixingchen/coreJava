package day11.tarena.com;
import java.util.*;
public class TestIterator {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("1");set.add("2");set.add("3");
		/*Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}*/
		//迭代器用法2：for each 可以用于集合、数组
		for(String s : set){//for(元素类型 变量名:集合/数组){}
			System.out.println(s);
		}
	}
}
