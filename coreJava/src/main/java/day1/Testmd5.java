package day1;

import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;

public class Testmd5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File f=new File("d:/copy.txt");
		String md5=getFileMD5(f);
		System.out.println(md5);
		System.out.println("08CE1677FB024A896236CBF7C5A758CB".equalsIgnoreCase(md5));
		System.out.println("8ce1677fb024a896236cbf7c5a758cb".equalsIgnoreCase(md5));
		

	}
	
	public static String getFileMD5(File file) {
        if (!file.isFile()){
          return null;
        }
        MessageDigest digest = null;
        FileInputStream in=null;
        byte buffer[] = new byte[1024];
        int len;
        try {
          digest = MessageDigest.getInstance("MD5");
          in = new FileInputStream(file);
          while ((len = in.read(buffer, 0, 1024)) != -1) {
            digest.update(buffer, 0, len);
          }
          in.close();
        } catch (Exception e) {
          e.printStackTrace();
          return null;
        }
        BigInteger bigInt = new BigInteger(1, digest.digest());
        return bigInt.toString(16);
      }

}
