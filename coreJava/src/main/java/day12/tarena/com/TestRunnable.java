package day12.tarena.com;

public class TestRunnable implements Runnable{//�����߳���
	
	public static void main(String[] args) {
		TestRunnable tr = new TestRunnable();//tr�����߳�
		//tr.start();
		Thread t = new Thread(tr);//t���̣߳���ִ��tr
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
				Thread.sleep(1000);//�߳�����1��(1000����)
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
