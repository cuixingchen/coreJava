package day12.tarena.com;

public class MyThread extends Thread{
	public void run(){
		for(int i=0;i<30;i++){
			System.out.println(this.getName()+":"+i);
			try {
				Thread.sleep(1000);//�߳�����1��(1000����)
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		//mt.run();//run()���������߳�
		mt.start();//start()���������߳�
		for(int i=0;i<30;i++){
			System.out.println("main:"+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}//���߳� + mt�߳�
}//���߳�֮���������ִ�У���ÿ���߳��ڲ�����˳��ִ��
