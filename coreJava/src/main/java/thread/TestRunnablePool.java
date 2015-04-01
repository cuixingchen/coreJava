package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestRunnablePool{
	public static void main(String[] args) {
		// 创建一个可重用固定线程数的线程池
		ExecutorService pool = Executors.newFixedThreadPool(2);
		// 创建实现了Runnable接口对象，Thread对象当然也实现了Runnable接口
		for(int i=0;i<10;i++){
			System.out.println("main:"+i);
			MyThread2 m = new MyThread2();
			m.setName("线程:"+i);
			Thread t = new Thread(m);
			pool.execute(t);
		}
		// 关闭线程池
		pool.shutdown();
	}

}
class MyThread2 implements Runnable{
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "正在执行。。。"+name);
	}


}
