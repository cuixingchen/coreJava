package day14.tarena.com;
import java.util.Properties;
import java.io.FileInputStream;
public class TestProperties {
	public static void main(String[] args) {
		Properties p = new Properties();
		try{
		    FileInputStream fis = new 
		      FileInputStream("d:/db.properties");
		    p.load(fis);//���������ļ����ڴ���
		    fis.close();
		    String url = p.getProperty("url");
		    String dri = p.getProperty("driver");
		    String user = p.getProperty("user");
		    user = new String(
		    	user.getBytes("ISO8859-1"),"GBK");
		    //��ISO8859-1�𿪺�GBK����
		    //��ʱ����Ҫ���±���
		    System.out.println(url);
		    System.out.println(dri);
		    System.out.println(user);
		}catch(Exception ee){
			ee.printStackTrace();
		}
		
	}

}
