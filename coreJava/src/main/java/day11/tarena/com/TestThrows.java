package day11.tarena.com;
import java.io.FileInputStream;
import java.io.IOException;
public class TestThrows {
    public void test() throws IOException{
    	FileInputStream fis = 
    		new FileInputStream("c:\\aa.txt");
    	fis.close();
    }
	public static void main(String[] args) {
		TestThrows tt = new TestThrows();
		try{
		    tt.test();
		}catch(IOException ee){
			ee.printStackTrace();//打印异常的所有信息
		}
	}
}
class Test extends TestThrows{
	public void test() throws IOException,RuntimeException{
    	FileInputStream fis = 
    		new FileInputStream("c:\\aa.txt");
    	fis.close();
    }
}
