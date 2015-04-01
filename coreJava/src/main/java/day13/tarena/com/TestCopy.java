package day13.tarena.com;
import java.io.*;
public class TestCopy {
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("f:/个人资料/崔鹏飞.jpg");
			FileOutputStream fos = new FileOutputStream("f:/cuipengfei.jpg");
			byte[] b = new byte[2*1024];
			while(true){
				int n = fis.read(b);
				if(n==-1) break;
				fos.write(b,0,n);
			}
			fis.close();fos.close();
		}catch(Exception ee){
			ee.printStackTrace();
		}
	}

}
