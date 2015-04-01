package day10.tarena.com;
import java.util.TreeSet;
public class TestTreeSet {
	public static void main(String[] args) {
		TreeSet<Person> ts = new TreeSet<Person>();//可排序
		Person p1 = new Person(30,"zhang");
		ts.add(p1);
		Person p2 = new Person(25,"zhao");
		ts.add(p2);//比较大小 从第二个元素开始
		Person p3 = new Person(28,"li");
		ts.add(p3);
		System.out.println(ts);
	}

}
