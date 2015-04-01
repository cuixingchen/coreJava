package day14.tarena.com;
import java.io.*;
public class TestChat {
	public static void main(String[] args) {
		try{
			InputStreamReader isr = new 
			  InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			FileOutputStream fos = new 
			  FileOutputStream("d:/chat.txt",true);
			PrintStream ps = new PrintStream(fos);
			while(true){
				String s = br.readLine();
				if("bye".equalsIgnoreCase(s)) break;
				ps.println(s);
			}
			ps.close();
			br.close();
		}catch(Exception ee){
			ee.printStackTrace();
		}
	}

}
