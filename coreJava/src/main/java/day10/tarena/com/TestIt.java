package day10.tarena.com;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class TestIt {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		for(int i=0;i<5;i++){
			list.add(""+i);}
		list.add("11");list.add("12");
		for(int i=0;i<list.size();i++){
			String s = list.get(i);
			if(s.startsWith("1")) {
				list.remove(i);
				i--;//listɾ������Ҫi--
			}}
		/*Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);}*/
		//iterator()ֻ�ܵ�1��
		//Iterator<String> it = list.iterator();
		//while(it.hasNext()){//ÿ��ѭ��next()ֻ��һ��
			//String s = /*list.iterator()*/it.next();
			//if(s.startsWith("1")) it.remove();//list.remove(s);
			//System.out.println(s/*it.next()*/);
		//}//�ڵ������У�����ʹ�ü��ϵ�remove�����õ�������
		System.out.println(list);
	}

}
