package day15.tarena.com;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
public class TestReceive {
	public static void main(String[] args){
		System.out.println("���շ���������");
		try {
			DatagramSocket ds = new DatagramSocket(2222);
			byte[] b = new byte[2048];
			DatagramPacket dp = new 
			  DatagramPacket(b,b.length);
			ds.receive(dp);	//�����̣߳�ֱ����������Ϊֹ		
			ds.close();
			//dp.getLength()ȡ���͵����ݵĳ���
			String s = new String(b,0,dp.getLength());
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
