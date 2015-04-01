package day15.tarena.com;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class TestSend {
	public static void main(String[] args) {
		System.out.println("窟僕圭。。。。");
		try{
			DatagramSocket ds = new DatagramSocket();
			byte[] b = "hello".getBytes();
			DatagramPacket dp = new 
			  DatagramPacket(b,b.length,
			  InetAddress.getLocalHost(),2222);
			ds.send(dp);
			ds.close();
		}catch(Exception ee){
			ee.printStackTrace();
		}
	}

}
