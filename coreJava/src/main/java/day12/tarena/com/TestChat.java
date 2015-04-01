package day12.tarena.com;
import java.util.Scanner;
public class TestChat extends Thread{
	private boolean flag = false;
	public void run(){
		for(int i=50;i>0;i--){
			System.out.println("”‡œ¬"+i+"√Î...");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(flag) break;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TestChat tc = new TestChat();
		tc.start();
		for(;;){
			String s = sc.next();
			if("over".equalsIgnoreCase(s)){
				tc.flag = true;
				break;
			}
			System.out.println("ƒ„Àµ£∫"+s);
		}
	}
}
