package day1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class TestFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			FileInputStream fis = new 
			  FileInputStream("d:/123.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			//输出流
			FileOutputStream fos = new 
			  FileOutputStream("d:/copy.txt");
			PrintStream ps = new PrintStream(fos);
			for(int i=1;;i++){
				String s = br.readLine();
				if(s == null) break;
				System.out.println(i+":"+s);
				String m[]=s.split(",");
				for(int j=0;j<m.length;j++){
					String n[]=m[j].split(":");
					n[0].replace("{", "");
					ps.println("private String "+n[0]+";");
				}
				
			}
			br.close();//只需关闭最外层的包装流即可
			ps.close();
		}catch(Exception ee){
			ee.printStackTrace();
		}

	}

}
