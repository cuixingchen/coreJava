package day12.tarena.com;

public class TestJoin extends Thread{
	public void run(){
		for(int i=0;i<30;i++){
			System.out.println(getName()+":"+i);
			try {
				Thread.sleep(100);
			} catch (Exception e){
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws Exception{
		TestJoin tj1 = new TestJoin();
		TestJoin tj2 = new TestJoin();
		tj1.start();
		//tj1.join();
		tj2.start();
	    //tj1.join();
		for(int i=0;i<30;i++){
			System.out.println("main:"+i);
			Thread.sleep(100);
		}
		tj1.join();
	}
}
