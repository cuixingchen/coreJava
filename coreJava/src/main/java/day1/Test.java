package day1;

import java.util.Calendar;
import java.text.DateFormat;

public class Test {
    public static void main(String[] args) {
       Calendar calendar = Calendar.getInstance();
       DateFormat format = DateFormat.getDateInstance();
       String s =format.format(calendar.getTime());
       
       //int i = calendar.get(Calendar.YEAR);
       System.out.println(s);
       
       String m=System.getProperty("user.dir");
       System.out.println(1==0?true:false);
       System.out.println(m);
       System.out.print(Test.class);
       
    }

}
