package day12.tarena.com;

public class MyThread extends Thread{
	public void run(){
		for(int i=0;i<30;i++){
			System.out.println(this.getName()+":"+i);
			try {
				Thread.sleep(1000);//线程休眠1秒(1000毫秒)
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		//mt.run();//run()不能启动线程
		mt.start();//start()才能启动线程
		for(int i=0;i<30;i++){
			System.out.println("main:"+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}//主线程 + mt线程
}//多线程之间代码乱序执行，但每个线程内部代码顺序执行
