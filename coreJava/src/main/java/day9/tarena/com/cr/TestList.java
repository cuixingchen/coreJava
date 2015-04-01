package day9.tarena.com.cr;
import java.util.List;
import java.util.ArrayList;
public class TestList {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");list.add("b");
		list.add("c");list.add("d");
		list.add("a");
		System.out.println(list.size());//5
		list.remove("a");
		for(int i=0;i<list.size();i++){
			Object obj = list.get(i);
			System.out.println(obj);
		}
	}
}
