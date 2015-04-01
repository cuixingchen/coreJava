package day1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class TestThread {

	/**
	 * @param args
	 */
	private static String s;
	private static int times;
	public static void main(String[] args) throws InterruptedException {
		s="主线程";
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				s="副线程";
			}
		}).start();
		
//		new Timer().schedule(new TimerTask() {
//			
//			@Override
//			public void run() {
//				System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(Calendar.getInstance().getTime()));
//			}
//		}, 0,1000);
		times=0;
		final Timer t=new Timer();
		t.schedule(new TimerTask() {
			
			@Override
			public void run() {
				times++;
				if(times>=5){
					t.cancel();
				}
				System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(Calendar.getInstance().getTime()));
			}
		}, 0,1000);
		System.out.println("===============:"+s);
		
		
	}

}
