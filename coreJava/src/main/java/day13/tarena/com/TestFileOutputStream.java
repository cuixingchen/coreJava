package day13.tarena.com;
import java.io.FileOutputStream;
public class TestFileOutputStream {
	public static void main(String[] args) {
		try{
			//FileOutputStream fos = new //�滻д
			  //FileOutputStream("c:/go.txt");
			FileOutputStream fos = new //׷��
			  FileOutputStream("c:/go.txt",true);
			String s = "i love u"+"\n";
			fos.write(s.getBytes());
			fos.close();
		}catch(Exception ee){
			ee.printStackTrace();
		}//��ϰ��д����ʵ�������ļ��Ŀ���(ͨ�ÿ�������������)
	}
}
