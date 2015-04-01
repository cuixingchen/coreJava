package day10.tarena.com;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
public class TestHashSet {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		for(int i=0;i<5;i++){
			Student s = new Student(i+1,"zhang"+(i+1));
			set.add(s);
			System.out.println("**************");
		}
		//Student s = new Student(1,"zhaoyun");
		//set.add(s);
		//System.out.println(set);
		set.remove(new Student(1,"zhaoyun"));
		System.out.println(set);
		System.out.println("++++++++++++++++++");
		List<Student> list = new ArrayList<Student>();
		for(int i=0;i<5;i++){
			Student s = new Student(i+1,"zhang"+(i+1));
			list.add(s);
			System.out.println("**************");
		}
		list.remove(new Student(1,"zhaoyun"));
		System.out.println(list);
	}
}
