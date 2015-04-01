package day14.tarena.com;
import java.util.Properties;
import java.io.FileInputStream;
public class TestProperties {
	public static void main(String[] args) {
		Properties p = new Properties();
		try{
		    FileInputStream fis = new 
		      FileInputStream("d:/db.properties");
		    p.load(fis);//加载配置文件到内存中
		    fis.close();
		    String url = p.getProperty("url");
		    String dri = p.getProperty("driver");
		    String user = p.getProperty("user");
		    user = new String(
		    	user.getBytes("ISO8859-1"),"GBK");
		    //按ISO8859-1拆开后按GBK重组
		    //有时候需要换下编码
		    System.out.println(url);
		    System.out.println(dri);
		    System.out.println(user);
		}catch(Exception ee){
			ee.printStackTrace();
		}
		
	}

}
