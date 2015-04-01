package day15.tarena.com;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class TestInetAddress {
	public static void main(String[] args) {
		try {
			//取本机IP
			InetAddress ia = InetAddress.getLocalHost();
			//取任意IP
			byte[] b = {172-256,164-256,0,6};
			InetAddress server = InetAddress.
			  getByAddress(b);//172.164.0.6
			System.out.println(ia);
			System.out.println(server);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
