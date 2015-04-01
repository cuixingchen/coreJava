package day13.tarena.com;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintStream;
import java.io.FileOutputStream;
public class TestLineRead {
	public static void main(String[] args) {
		try{
			FileInputStream fis = new 
			  FileInputStream("c:/test.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			//�����
			FileOutputStream fos = new 
			  FileOutputStream("d:/copy.txt");
			PrintStream ps = new PrintStream(fos);
			for(int i=1;;i++){
				String s = br.readLine();
				if(s == null) break;
				//System.out.println(i+":"+s);
				ps.println(i+":"+s);
			}
			br.close();//ֻ��ر������İ�װ������
			ps.close();
		}catch(Exception ee){
			ee.printStackTrace();
		}
	}

}
