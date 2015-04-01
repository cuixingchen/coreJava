package day13.tarena.com;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class TestFileInputStream {
	public static void main(String[] args) {
		String s = "";
		try {
			FileInputStream fis = new 
			  FileInputStream("c:/test.txt");
			byte[] b = new byte[30];
			while(true){
				int n = fis.read(b);
				if(n==-1) break;
				s = s + new String(b,0,n);
			}
			fis.close();
			
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
