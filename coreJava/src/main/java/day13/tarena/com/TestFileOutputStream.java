package day13.tarena.com;
import java.io.FileOutputStream;
public class TestFileOutputStream {
	public static void main(String[] args) {
		try{
			//FileOutputStream fos = new //替换写
			  //FileOutputStream("c:/go.txt");
			FileOutputStream fos = new //追加
			  FileOutputStream("c:/go.txt",true);
			String s = "i love u"+"\n";
			fos.write(s.getBytes());
			fos.close();
		}catch(Exception ee){
			ee.printStackTrace();
		}//练习：写代码实现所有文件的拷贝(通用拷贝，包括声音)
	}
}
