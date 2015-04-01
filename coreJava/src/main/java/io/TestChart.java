package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TestChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String stt="http://photo.renren.com/photo/279945511/album-312219229";
		String str="http://photo.renren.com/photo/279945511/album-profile?curpage=0";
		try{
			InputStreamReader in=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(in);
//			FileOutputStream fos=new FileOutputStream("C:\\Users\\cuipengfei\\Desktop\\Ëæ±Ê.txt",true);
//			PrintStream ps = new PrintStream(fos);
			FileWriter fw=new FileWriter("C:\\Users\\cuipengfei\\Desktop\\Ëæ±Ê.txt",true);
			while(true){
				String s = br.readLine();
				if("bye".equalsIgnoreCase(s)) break;
				fw.write(s);
//				ps.println(s);
			}
			fw.close();
//			ps.close();
			br.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
