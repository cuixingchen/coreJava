package io;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class SocketTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket s= new Socket("time-A.timefreq.bldrdoc.gov",13);
			try{
				InputStream inStream = s.getInputStream();
				Scanner in = new Scanner(inStream);
				while(in.hasNext()){
					String line = in.nextLine();
					System.out.println(line);
				}
			}finally{
				s.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
