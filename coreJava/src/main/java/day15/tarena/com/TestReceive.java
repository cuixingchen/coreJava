package day15.tarena.com;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
public class TestReceive {
	public static void main(String[] args){
		System.out.println("接收方。。。。");
		try {
			DatagramSocket ds = new DatagramSocket(2222);
			byte[] b = new byte[2048];
			DatagramPacket dp = new 
			  DatagramPacket(b,b.length);
			ds.receive(dp);	//阻塞线程，直到发送数据为止		
			ds.close();
			//dp.getLength()取发送的数据的长度
			String s = new String(b,0,dp.getLength());
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
