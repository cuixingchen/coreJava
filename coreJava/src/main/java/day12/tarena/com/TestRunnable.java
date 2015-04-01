package day12.tarena.com;

public class TestRunnable implements Runnable{//不是线程类
	
	public static void main(String[] args) {
		TestRunnable tr = new TestRunnable();//tr不是线程
		//tr.start();
		Thread t = new Thread(tr);//t是线程，但执行tr
		t.start();
		for(int i=0;i<30;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public void run() {
		for(int i=0;i<30;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(1000);//线程休眠1秒(1000毫秒)
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
