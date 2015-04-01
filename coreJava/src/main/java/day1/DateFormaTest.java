package day1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateFormaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		SimpleDateFormat simformat=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
//		Calendar calendar=Calendar.getInstance();
//		calendar.getTime();
//		System.out.println(calendar.getTime().toString());
//		String nowDate=simformat.format(calendar.getTime());
//		System.out.println(nowDate);
//		try {
//			Date datef=simformat.parse(nowDate);
//			calendar.setTime(datef);
//			System.out.println(calendar.get(Calendar.YEAR));
//			System.out.println(calendar.get(Calendar.MONTH)+1);
//			System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
//			System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
//			System.out.println(calendar.get(Calendar.MINUTE));
//			System.out.println(calendar.get(Calendar.SECOND));
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}

		
		
		String s="Nov 12, 2013 5:00:00 PM";
		DateFormat df1 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM, Locale.US);
		try {
			Date d=df1.parse(s);
			System.out.println(d.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
