package day15.tarena.com;
import java.io.*;
public class TestSum {
	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			System.out.println("请输入文件名：");
			String name = br.readLine();
			FileOutputStream fos = new FileOutputStream(name);
			for(int i=0;;i++){
				File f = new File(name+i);
				if(!f.exists()) break;
				FileInputStream fis = new FileInputStream(f);
				byte[] b = new byte[(int)f.length()];
				fis.read(b);
				fos.write(b);
				fis.close();
			}
			fos.close();
			System.out.println("合并成功");
		}catch(Exception ee){
			ee.printStackTrace();
		}
	}
}
