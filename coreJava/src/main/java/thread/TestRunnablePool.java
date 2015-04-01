package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestRunnablePool{
	public static void main(String[] args) {
		// ����һ�������ù̶��߳������̳߳�
		ExecutorService pool = Executors.newFixedThreadPool(2);
		// ����ʵ����Runnable�ӿڶ���Thread����ȻҲʵ����Runnable�ӿ�
		for(int i=0;i<10;i++){
			System.out.println("main:"+i);
			MyThread2 m = new MyThread2();
			m.setName("�߳�:"+i);
			Thread t = new Thread(m);
			pool.execute(t);
		}
		// �ر��̳߳�
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
		System.out.println(Thread.currentThread().getName() + "����ִ�С�����"+name);
	}


}
