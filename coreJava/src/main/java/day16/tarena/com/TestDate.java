package day16.tarena.com;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class TestDate {
	public static void main(String[] args) {
		//������ǰ���ڣ�����ע��
		Date d1 = new Date();//d1���ǵ�ǰʱ��
		System.out.println(d1);
		DateFormat df = new SimpleDateFormat ("yyyyMMdd");
		System.out.println(df.format(d1));
		//����ָ�����ڣ������������
		Calendar c = Calendar.getInstance();
		//�·ݵ�����Ҫ-1
		c.set(1978, 1, 10);//����ʱ�䣬���԰���Сʱ���֡���
		Date d2 = c.getTime();
		System.out.println(d2);
	}

}
