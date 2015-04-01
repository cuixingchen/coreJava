package day13.tarena.com;
import java.io.File;
import java.io.FilenameFilter;
public class TestFile {
	public static void main(String[] args) {
//路径用相对路径，分隔符用/
		File f1 = new File("f:/aaa/");
		if(!f1.exists()){//如果没有
			f1.mkdirs();
		}
		try{
		    File.createTempFile("abc",".txt",f1);
		    System.out.println(f1);
//练习：只显示f1下面的所有文本文件，不显示目录和其他类型文件
		    /*String[] str = f1.list();
		    for(String ss : str){
		    	File f = new File(f1,ss);
		    	if(f.isFile() && ss.endsWith(".txt"))
		            System.out.println(ss);
		    }*/
		    
		    String[] str = f1.list(new FilenameFilter(){
				public boolean accept(File dir, String name) {
					return name.endsWith(".txt")||
					  name.endsWith(".java");
				}		    	
		    });
		    for(String ss : str){
		    	System.out.println(ss);
		    }
		    /*File[] ff = f1.listFiles();
		    for(File file : ff){
		    	if(file.isFile())
		    		System.out.println(file);
		    }*/
		}catch(Exception ee){
			ee.printStackTrace();
		}
	}

}
