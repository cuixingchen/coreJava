package day16.tarena.com;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class TestDate {
	public static void main(String[] args) {
		//创建当前日期，比如注册
		Date d1 = new Date();//d1就是当前时间
		System.out.println(d1);
		DateFormat df = new SimpleDateFormat ("yyyyMMdd");
		System.out.println(df.format(d1));
		//创建指定日期，比如出生日期
		Calendar c = Calendar.getInstance();
		//月份的设置要-1
		c.set(1978, 1, 10);//设置时间，可以包括小时、分、秒
		Date d2 = c.getTime();
		System.out.println(d2);
	}

}
