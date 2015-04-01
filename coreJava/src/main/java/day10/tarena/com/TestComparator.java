package day10.tarena.com;
import java.util.TreeSet;
import java.util.Comparator;
public class TestComparator {
	public static void main(String[] args) {
		/*TreeSet<Student> ts = 
			new TreeSet<Student>(new Comparator<Student>(){
				public int compare(Student s1,Student s2){
					return s1.getId()-s2.getId();
				}
			});*/
		TreeSet<Student> ts = 
			new TreeSet<Student>(new Comparator<Student>(){
				public int compare(Student s1,Student s2){
					return s1.getName().compareTo(s2.getName());
				}
			});
		for(int i=1;i<9;i++){
			Student s = new Student(9-i,"zhao"+i);
			ts.add(s);
		}
		System.out.println(ts);
	}
}
