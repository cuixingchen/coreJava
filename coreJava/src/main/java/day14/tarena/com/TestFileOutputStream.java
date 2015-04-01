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
		}//FileOutputStream不能随便new，new后清空原有文件
	}//除非追加模式
}
