package day13.tarena.com;

import java.io.File;

public class TestReadFileName {
	public static void main(String [] args){
		File f1 = new File("F:/eclipsexin/DataReport/lib");
		String [] list=f1.list();
		for(int i=0;i<list.length;i++){
			System.out.println("set classpath=%classpath%;.\\lib\\"+list[i]);
		}
				
	}
}
