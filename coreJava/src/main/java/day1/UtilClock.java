package day1;

import java.util.Timer;
import java.util.TimerTask;

public class UtilClock {

	/**
	 * @param args
	 */
	private static int times;
	private static int hours;
	private static int minits;
	public static void runClock(int hours_m,int minits_m,int times_m) throws InterruptedException {
		times=times_m;
		hours=hours_m;
		minits=minits_m;
		final Timer t=new Timer();
		t.schedule(new TimerTask() {
			
			@Override
			public void run() {
//				System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(Calendar.getInstance().getTime()));
				times--;
				if(times<=0){
					minits--;
					if(minits<0){
						hours--;
						if(hours<0){
							setTextView((hours+1),(minits+1),times);
							t.cancel();
						}else{
							setTextView((hours+1),(minits+1),times);
						}
						minits=59;
					}else{
						setTextView((hours),(minits+1),times);
					}
					times=60;
					
				}else{
					setTextView(hours,minits,times);
				}
			}
		}, 0,1);
	}

	private static void setTextView(int hou,int min,int tim){
		
		System.out.println(fomate(hou)+":"+fomate(min)+"  "+fomate(tim));
	}
	private static String  fomate(int s){
		if(s<10){
			return "0"+s;
		}else{
			return ""+s;
		}
	}
}
