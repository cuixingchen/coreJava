package day14.tarena.com;
import java.io.*;
public class TestData {
	public static void main(String[] args) {
		try{
			FileOutputStream fos = new 
			  FileOutputStream("d:/int.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeInt(97);
			dos.close();
			FileInputStream fis = new 
			  FileInputStream("d:/int.txt");
			DataInputStream dis = new DataInputStream(fis);
			int i = dis.readInt();
			System.out.println(i);
			dis.close();
			//BufferedReader br = new BufferedReader(
				//new InputStreamReader(fis));
			//String s = br.readLine();
			//System.out.println(s);
			//br.close();
		}catch(Exception ee){
			ee.printStackTrace();
		}
	}

}
