package day15.tarena.com;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
public class TestServer {
	public static void main(String[] args) {
		try{
			ServerSocket ss = new ServerSocket(2222);
			System.out.println("Server�Ѿ�����������");
			while(true){
				Socket so = ss.accept();//�ȴ��ͻ�����
				new ServerThread(so).start();
			}
		}catch(Exception ee){
			ee.printStackTrace();
		}
	}

}
