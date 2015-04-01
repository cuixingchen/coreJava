package day14.tarena.com;
import java.io.*;
public class TestKey {
	public static void main(String[] args) {
		try{
			InputStreamReader isr = new 
			  InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);//º¸≈Ã
			FileOutputStream fos = new FileOutputStream("d:/go.txt");
			DataOutputStream dos = new DataOutputStream(fos);//–¥»Î
			FileInputStream fis = new FileInputStream("d:/go.txt");
			DataInputStream dis = new DataInputStream(fis);//∂¡»°
			String s = br.readLine();
			dos.writeUTF(s);
			String temp = dis.readUTF();
			br.close();dos.close();dis.close();
			System.out.println(temp);
		}catch(Exception ee){
			ee.printStackTrace();
		}
	}

}
