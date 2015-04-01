package day15.tarena.com;
import java.net.URL;
import java.net.URLConnection;
import java.io.*;
public class TestURL {
	public static void main(String[] args) {
		try{
//			URL url = new URL("http://192.168.0.78/");
			URL url = new URL("http://127.0.0.1/");
			URLConnection uc = url.openConnection();
			InputStreamReader isr = new 
			  InputStreamReader(uc.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			while(true){
				String s = br.readLine();
				if(s == null) break;
				//s = new String(
					//s.getBytes("ISO8859-1"),"UTF-8");
				System.out.println(s);
			}
			br.close();
		}catch(Exception ee){
			ee.printStackTrace();
		}
	}

}
