package day14.tarena.com;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
public class TestServer {
	public static void main(String[] args) {
		try{
			ServerSocket ss = new ServerSocket(2222);
			System.out.println("begin");
			Socket so = ss.accept();//等待客户连接
			System.out.println("end");
			DataInputStream dis = new 
			  DataInputStream(so.getInputStream());
			DataOutputStream dos = new 
			  DataOutputStream(so.getOutputStream());
			String s = dis.readUTF();
			dos.writeUTF("from server:"+s);
			dis.close();dos.close();
			so.close();
			ss.close();			
		}catch(Exception ee){
			ee.printStackTrace();
		}
	}

}
