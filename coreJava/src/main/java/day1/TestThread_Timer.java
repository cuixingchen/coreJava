package day1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class TestThread_Timer {

	/**
	 * @param args
	 */
	private static String s;
	private static int times=60;
	private static int hours=2;
	private static int minits=1;
	public static void main(String[] args) throws InterruptedException {
		UtilClock.runClock(hours,minits,times);
	}

	
}
