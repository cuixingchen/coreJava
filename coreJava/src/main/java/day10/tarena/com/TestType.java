package day10.tarena.com;
import java.util.List;
import java.util.ArrayList;
public class TestType {
	public static void main(String[] args) {
        //5.0�� ����+���ͣ����Ԫ�ص���������
		List<Integer> list = new ArrayList<Integer>();
		list.add(80);
		list.add(90);
		list.add(85);
		//list.add("90");
		int total = 0;
		for(int i=0;i<list.size();i++){
			Integer in = list.get(i);
			total = total + in;
		}
	}

}
