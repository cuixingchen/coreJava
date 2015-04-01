package day14.tarena.com;
import java.net.Socket;
import java.io.*;
public class TestClient {
	public static void main(String[] args) {
		try{
			Socket so = new Socket("127.0.0.1",2222);
			DataInputStream dis = new 
			  DataInputStream(so.getInputStream());
			DataOutputStream dos = new 
			  DataOutputStream(so.getOutputStream());
			dos.writeUTF("Hello");
			String s = dis.readUTF();
			System.out.println(s);
			dis.close();dos.close();
			so.close();
		}catch(Exception ee){
			ee.printStackTrace();
		}
	}

}
