package day12.tarena.com;

public class TestDaemon extends Thread{
	public void run(){
		while(true){
			System.out.println("i am superman");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args){
		TestDaemon td = new TestDaemon();
		td.setDaemon(true);
		td.start();
		System.out.println("main over");
	}
}
