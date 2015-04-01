package day15.tarena.com;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
public class Regist {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
		String nameReg = "^[a-zA-Z0-9]{5,12}$";
		String passReg = "^[a-zA-Z0-9]{6,8}$";
		String emailReg = "^[A-Za-z0-9_]+@[A-Za-z0-9_]+(\\.com|\\.net)$";
		User u = null;
		List<User> list = new ArrayList<User>();
		try{
			while(true){
				System.out.println("请输入5-12位用户名：");
				String name = br.readLine();
				if(!name.matches(nameReg)) continue;
				System.out.println("请输入6-8位密码：");
				String pass = br.readLine();
				if(!pass.matches(passReg)) continue;
				System.out.println("请再次输入6-8位密码：");
				String pass1 = br.readLine();
				if(!pass.equals(pass1)) continue;
				System.out.println("请输入email：");
				String email = br.readLine();
				if(!email.matches(emailReg)) continue;
				u = new User(name,pass,email);
				break;
			}
		    br.close();	
		    System.out.println(u);
		    File f = new File("d:/reg.txt");
		    if(!f.exists())  f.createNewFile();
		    FileInputStream fis = new FileInputStream(f);
		    BufferedReader fbr = new BufferedReader(
					new InputStreamReader(fis));
		    while(true){
		    	String temp  = fbr.readLine();
		    	if(temp == null) break;
		    	String[] ss = temp.split(",");
		    	if(ss.length!=3) continue;
		    	User user = new User(ss[0],ss[1],ss[2]);
		    	list.add(user);
		    }
		    fbr.close();
		    if(list.contains(u)){
		    	System.out.println("用户已经存在");
		    }else{
		    	FileOutputStream fos = new 
		    	  FileOutputStream("d:/reg.txt",true);
		    	PrintStream ps = new PrintStream(fos);
		    	ps.println(u);
		    	ps.close();
		    	System.out.println("注册成功");
		    }
		}catch(Exception ee){
			ee.printStackTrace();
		}
	}
}
