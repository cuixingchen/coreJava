package day13.tarena.com;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestIo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			byte[] b = new byte[2*1024];
			FileInputStream fin=new FileInputStream("C:\\Users\\cuipengfei\\Desktop\\Ëæ±Ê.txt");
			BufferedInputStream bin=new BufferedInputStream(fin);
			DataInputStream din=new DataInputStream(bin);
			try {
				
				int n=din.read();
				System.out.print(n=='h');
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
