package day15.tarena.com;
import java.io.*;
public class TestSum {
	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			System.out.println("�������ļ�����");
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
			System.out.println("�ϲ��ɹ�");
		}catch(Exception ee){
			ee.printStackTrace();
		}
	}
}
