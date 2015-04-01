package day15.tarena.com;
import java.io.*;
public class TestSplit {
	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			System.out.println("请输入文件名：");
			String name = br.readLine();
			System.out.println("请输入分割文件的大小：");
			String size = br.readLine();
			if(!size.matches("\\d+")){
				System.out.println("格式错误");
				return;
			}
			int num = Integer.parseInt(size);
			byte[] b = new byte[num];
			FileInputStream fis = new FileInputStream(name);
			for(int i=0;;i++){
				int n = fis.read(b);
				if(n == -1) break;
				FileOutputStream fos = new 
				 FileOutputStream(name+i);
				fos.write(b,0,n);
				fos.close();
			}
			fis.close();
			System.out.println("拆分成功");
		}catch(Exception ee){
			ee.printStackTrace();
		}
	}

}
