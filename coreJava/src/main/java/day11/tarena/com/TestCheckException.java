package day11.tarena.com;
import java.io.FileInputStream;//IO 读文件
import java.io.IOException;
public class TestCheckException {
	public static void main(String[] args) {
		try{
			System.out.println(1);
		    FileInputStream fis = //检测异常
			  new FileInputStream("c:\\aa.txt");
		    fis.close();
		    int a = 0;
		    a = 2/a;
		    System.out.println(2);
		}catch(IOException ee){
			System.out.println(3);
			ee.printStackTrace();
		}finally{
			System.out.println("必须执行");
			System.out.println(4);
		}
		System.out.println(5);
	}
}
