package day12.tarena.com;

public class TestSleep extends Thread{
	public void run(){
		for(int i=0;i<30;i++){
			System.out.println(getName()+":"+i);
			try {
				Thread.yield();
				//Thread.sleep(100);
			} catch (Exception e){
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args){
		TestSleep ts1 = new TestSleep();
		TestSleep ts2 = new TestSleep();
		ts1.setPriority(1);
		ts2.setPriority(9);
		ts1.start();ts2.start();
	}

}
