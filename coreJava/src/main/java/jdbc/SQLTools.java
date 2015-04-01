package jdbc;
import java.sql.*;
import java.io.*;
public class SQLTools
{
	
	static{
		try {
			String driverName="com.mysql.jdbc.Driver";
			Class.forName(driverName);//装载驱动
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	public static void main(String[] args) 
	{
		Connection con = null;
		while((con=getConn())==null){};
		process(con);
		JdbcUtil.close(null,null,con);
		System.out.println("再见,欢迎下次使用!");
	}
	private static Connection getConn(){
	    String url = prompt("请输入url:");
		String username = prompt("请输入用户名:");
		String pwd = prompt("请输入密码:");
		Connection con = null;
		try{
		   con = DriverManager.getConnection(url,username,pwd);
		   con.setAutoCommit(false);
		}catch(Exception e){
		   System.out.println(e.getMessage());
		}
		return con;
	}
	private static void process(Connection con){
	    boolean flag = true;
		while(flag){
		  String command = getCommand();
		  if("quit".equals(command)){
		     flag = false;
		  }else if("commit".equals(command)||"rollback".equals(command)){
			 processTran(con,command);
		  }else{
		     processSQL(con,command);
		  }
		}
	}
    private static String getCommand(){
	    String message = "SQL>";
		StringBuffer b = new StringBuffer();
		String command = "";
		int i = 0;
		while(!command.endsWith(";")){
		   if(++i>1) message=i+">";
		   b.append(" "+prompt(message));
		   command = b.toString().trim();
		}
		return command.substring(0,command.length()-1).trim();
	}
	private static void processSQL(Connection con , String sql){
	    PreparedStatement ps = null;
		ResultSet rs = null;
		try{
		   ps = con.prepareStatement(sql);
		   if(ps.execute()){
		      rs = ps.getResultSet();
			  JdbcUtil.printRs(rs);
		   }else{
		      int i = ps.getUpdateCount();
			  System.out.println("更新成功-"+i);
		   }
		}catch(Exception e){
		   e.printStackTrace();
		   try{
		      con.rollback();
		   }catch(Exception ex){
		      System.out.println(ex.getMessage());
		   }
		}finally{
		   JdbcUtil.close(rs,ps,null);
		}
	}
	private static String prompt(String message){
	   BufferedReader in = new BufferedReader(
		   new InputStreamReader(System.in));
	   System.out.print(message);
	   String input = "";
	   try{
	      input = in.readLine();
	   }catch(Exception e){
	      e.printStackTrace();
	   }
	   return input;
	}
	private static void processTran(Connection con , String command){
	   if(con==null) return;
	   try{
	      if("commit".equals(command)){
		     con.commit();
		  }else{
		     con.rollback();
		  }
	   }catch(Exception e){
	      e.printStackTrace();
	   }
	}
}
