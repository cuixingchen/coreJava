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
		//�������÷�2��for each �������ڼ��ϡ�����
		for(String s : set){//for(Ԫ������ ������:����/����){}
			System.out.println(s);
		}
	}
}
