package day14.tarena.com;
import java.io.FileOutputStream;
public class TestFileOutputStream {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new 
			  FileOutputStream("d:/go.txt");
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}//FileOutputStream�������new��new�����ԭ���ļ�
	}//����׷��ģʽ
}
