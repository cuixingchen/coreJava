package day10.tarena.com;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class TestSet {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("one");set.add("two");
		set.add("three");set.add("four");
		set.add(new String("one"));
		System.out.println(set.size());//4
		set.remove("three");
		Iterator<String> it = set.iterator();//泛型不能传递
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
	}

}
